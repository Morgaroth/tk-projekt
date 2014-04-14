package ast

import parser.RegularsParser._
import scala.collection.JavaConverters._

trait OurTreeVisitorTrait extends OurAbstractTreeVisitorTrait with LoggableTreeVisitor {
  override def visitGroup(ctx: GroupContext): ASTNode = super.visitGroup(ctx)


  override def visitAny(ctx: AnyContext): ASTNode = super.visitAny(ctx)

  override def visitStart(ctx: StartContext): ASTNode = super.visitStart(ctx)

  override def visitRegex(ctx: RegexContext): ASTNode = super.visitRegex(ctx)

  override def visitOne_or_none(ctx: One_or_noneContext): ASTNode = super.visitOne_or_none(ctx)

  override def visitSimple_regex(ctx: Simple_regexContext): ASTNode = super.visitSimple_regex(ctx)

  override def visitBasic_regex(ctx: Basic_regexContext): ASTNode = super.visitBasic_regex(ctx)

  override def visitEos(ctx: EosContext): ASTNode = super.visitEos(ctx)

  override def visitElementary_regex(ctx: Elementary_regexContext): ASTNode = super.visitElementary_regex(ctx)

  override def visitSet(ctx: SetContext): ASTNode = super.visitSet(ctx)

  override def visitPlus(ctx: PlusContext): ASTNode = super.visitPlus(ctx)

  override def visitStar(ctx: StarContext): ASTNode = super.visitStar(ctx)

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
