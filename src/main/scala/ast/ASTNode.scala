package ast

sealed abstract class ASTNode

// Agregaty

case class Regex(items: Seq[SimpleRegex]) extends ASTNode

case class SimpleRegex(items: Seq[BasicRegex]) extends ASTNode

case class BasicRegex(elem: ASTNode) extends ASTNode

//modyfikatory

case class ZeroOrMore(elem: ElementaryRegex) extends ASTNode

case class OneOrMore(elem: ElementaryRegex) extends ASTNode

case class ZeroOrOne(elem: ElementaryRegex) extends ASTNode

//

case class ElementaryRegex(elem: ASTNode) extends ASTNode

case class Group() extends ASTNode

case class Any() extends ASTNode

case class End() extends ASTNode

case class Set(set: ASTNode) extends ASTNode

case class PositiveSet(set: SetItems) extends ASTNode

case class NegativeSet(set: SetItems) extends ASTNode

case class SetItems(items: Seq[SetItem]) extends ASTNode

case class SetItem(item: ASTNode) extends ASTNode

case class Range(beg: NonMeta, end: NonMeta) extends ASTNode

case class Character(char: Char) extends ASTNode

case class Meta(character: Char) extends ASTNode

case class NonMeta(character: Char) extends ASTNode

//itd
