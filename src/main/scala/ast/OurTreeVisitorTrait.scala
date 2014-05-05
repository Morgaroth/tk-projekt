package ast

import parser.RegularsParser._
import scala.collection.JavaConverters._

trait OurTreeVisitorTrait extends OurAbstractTreeVisitorTrait with LoggableTreeVisitor {
  override def visitStart(ctx: StartContext): Regex =
    visitRegex(ctx.regex())

  override def visitRegex(ctx: RegexContext): Regex =
    Regex(ctx.simple_regex().asScala.map(visitSimple_regex))

  override def visitSimple_regex(ctx: Simple_regexContext): SimpleRegex =
    SimpleRegex(ctx.basic_regex().asScala.map(visitBasic_regex))

  override def visitBasic_regex(ctx: Basic_regexContext): BasicRegex = {
    val notNulls = List(ctx.star(), ctx.plus(), ctx.elementary_regex(), ctx.one_or_none()).filter(_ != null)
    assert(notNulls.size == 1, "WTF, not one not null?")
    BasicRegex(notNulls.head.accept(this))
  }

  override def visitPlus(ctx: PlusContext): OneOrMore =
    OneOrMore(visitElementary_regex(ctx.elementary_regex()))

  override def visitStar(ctx: StarContext): ZeroOrMore =
    ZeroOrMore(visitElementary_regex(ctx.elementary_regex()))

  override def visitOne_or_none(ctx: One_or_noneContext): ZeroOrOne =
    ZeroOrOne(visitElementary_regex(ctx.elementary_regex()))

  override def visitElementary_regex(ctx: Elementary_regexContext): ElementaryRegex = {
    val notNulls = List(ctx.any(), ctx.group(), ctx.eos(), ctx.character(), ctx.set()).filter(_ != null)
    assert(notNulls.size == 1, "WTF, not one not null?")
    ElementaryRegex(notNulls.head.accept(this))
  }

  override def visitGroup(ctx: GroupContext): ASTNode =
    visitRegex(ctx.regex())

  override def visitAny(ctx: AnyContext): ASTNode = Any()

  override def visitEos(ctx: EosContext): ASTNode = End()

  override def visitSet(ctx: SetContext): ASTNode =
    if (ctx.negative_set() != null && ctx.positive_set() == null) {
      Set(visitNegative_set(ctx.negative_set()))
    } else if (ctx.positive_set() != null && ctx.negative_set() == null) {
      Set(visitPositive_set(ctx.positive_set()))
    } else {
      throw new WTFException
    }

  override def visitPositive_set(ctx: Positive_setContext): PositiveSet =
    PositiveSet(visitSet_items(ctx.set_items()))

  override def visitNegative_set(ctx: Negative_setContext): NegativeSet =
    NegativeSet(visitSet_items(ctx.set_items()))

  override def visitSet_items(ctx: Set_itemsContext): SetItems =
    SetItems(ctx.set_item.asScala.map(visitSet_item))

  override def visitSet_item(ctx: Set_itemContext): SetItem =
    if (ctx.range() != null && ctx.character() == null) {
      SetItem(visitRange(ctx.range()))
    } else if (ctx.character() != null && ctx.range() == null) {
      SetItem(visitCharacter(ctx.character()))
    } else {
      throw new WTFException
    }

  override def visitCharacter(ctx: CharacterContext): ASTNode =
    if (ctx.metacharacter() != null && ctx.nonmetacharacter() == null) {
      ctx.metacharacter().accept(this)
    } else if (ctx.metacharacter() == null && ctx.nonmetacharacter() != null) {
      ctx.nonmetacharacter().accept(this)
    } else {
      throw new WTFException
    }

  override def visitRange(ctx: RangeContext): Range =
    Range(visitNonmetacharacter(ctx.nonmetacharacter(0)), visitNonmetacharacter(ctx.nonmetacharacter(1)))

  override def visitMetacharacter(ctx: MetacharacterContext): Meta = {
    assert(ctx.METACHARACTER().getSymbol.getText.length == 1, "not one symbol!")
    Meta(ctx.METACHARACTER().getSymbol.getText.charAt(0))
  }

  override def visitNonmetacharacter(ctx: NonmetacharacterContext): NonMeta = {
    assert(ctx.ANONMETACHARACTER().getSymbol.getText.length == 1, "not one symbol!")
    NonMeta(ctx.ANONMETACHARACTER().getSymbol.getText.charAt(0))
  }
}