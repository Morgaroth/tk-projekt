package ast

sealed abstract class ASTNode

case class Regex() extends ASTNode

case class SimpleRegex() extends ASTNode

//itd
