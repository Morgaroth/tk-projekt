package ast

import parser.RegularsParser._
import parser.RegularsBaseVisitor

class OurTreeVisitor[T] extends RegularsBaseVisitor[T] {
  override def visitGroup(ctx: GroupContext): T = super.visitGroup(ctx)

  override def visitPositive_set(ctx: Positive_setContext): T = super.visitPositive_set(ctx)

  override def visitAny(ctx: AnyContext): T = super.visitAny(ctx)

  override def visitStart(ctx: StartContext): T = super.visitStart(ctx)

  override def visitBasic_regex(ctx: Basic_regexContext): T = super.visitBasic_regex(ctx)

  override def visitEos(ctx: EosContext): T = super.visitEos(ctx)

  override def visitElementary_regex(ctx: Elementary_regexContext): T = super.visitElementary_regex(ctx)

  override def visitSet_item(ctx: Set_itemContext): T = super.visitSet_item(ctx)

  override def visitCharacter(ctx: CharacterContext): T = super.visitCharacter(ctx)

  override def visitNegative_set(ctx: Negative_setContext): T = super.visitNegative_set(ctx)

  override def visitSet_items(ctx: Set_itemsContext): T = super.visitSet_items(ctx)

  override def visitStar(ctx: StarContext): T = super.visitStar(ctx)

  override def visitSet(ctx: SetContext): T = super.visitSet(ctx)

  override def visitRegex(ctx: RegexContext): T = super.visitRegex(ctx)

  override def visitOne_or_none(ctx: One_or_noneContext): T = super.visitOne_or_none(ctx)

  override def visitSimple_regex(ctx: Simple_regexContext): T = super.visitSimple_regex(ctx)

  override def visitRange(ctx: RangeContext): T = super.visitRange(ctx)

  override def visitPlus(ctx: PlusContext): T = super.visitPlus(ctx)
}
