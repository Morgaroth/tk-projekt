package ast

sealed abstract class ASTNode {
  def toRegex: String = this.getClass.getSimpleName
}

// Agregaty

case class Regex(items: List[ASTNode]) extends ASTNode {
  //override def toString: String = if (items.nonEmpty) items.map(_.toString).reduce(_ + _) else ""
  override def toString: String = items.mkString("REGEX {", ",", "}")

  override def toRegex: String =
    if (items.nonEmpty)
      items.map(_.toRegex).reduce(_ + "|" + _)
    else ""
}

case class SimpleRegex(items: List[ASTNode]) extends ASTNode {
  override def toString: String = items.mkString("SIMPLE {", ",", "}")

  override def toRegex: String =
    if (items.nonEmpty) items.map(_.toRegex).reduce(_ + _) else ""
}

case class BasicRegex(elem: ASTNode) extends ASTNode {
  override def toRegex: String = elem.toRegex
}

//modyfikatory

case class ZeroOrMore(elem: ASTNode) extends ASTNode {
  override def toRegex: String = elem.toRegex + "*"
}

case class OneOrMore(elem: ASTNode) extends ASTNode {
  override def toRegex: String = elem.toRegex + "+"
}

case class ZeroOrOne(elem: ASTNode) extends ASTNode {
  override def toRegex: String = elem.toRegex + "?"
}

//

case class ElementaryRegex(elem: ASTNode) extends ASTNode {
  override def toRegex: String = elem.toRegex
}

case class Group() extends ASTNode

case class Any() extends ASTNode

case class End() extends ASTNode

case class Set(set: ASTNode) extends ASTNode

case class PositiveSet(set: ASTNode) extends ASTNode

case class NegativeSet(set: ASTNode) extends ASTNode

case class SetItems(items: List[ASTNode]) extends ASTNode

case class SetItem(item: ASTNode) extends ASTNode

case class Character(char: Char) extends ASTNode

case class Range(beg: NonMeta, end: NonMeta) extends ASTNode

case class Meta(character: Char) extends ASTNode {
  override def toRegex: String = "\"" + character.toString
}


case class NonMeta(character: Char) extends ASTNode {
  override def toRegex: String = character.toString
}

//itd
