package runner

import parser.{RegularsLexer, RegularsParser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import ast._


object Runner {

  def simplifier(node: ASTNode): ASTNode = {
    def reduceList(elems: List[ASTNode]) = {
      import Reducer._
      elems.map(simplifier).reduceItself
    }
    node match {
      //agregaty
      case Regex(m) =>
        // regex jest zbiorem alternatyw, więc redukujemy po alternatywach
        println(s"reduce Regex $m")
        import AlternativeReducer._
        Regex(m.map(simplifier).reduceAlternatives)
      case SimpleRegex(m) =>
        println(s"simplifying SimpleRegex { $m }")
        val reduced: List[ASTNode] = reduceList(m)
        if (reduced.size == 1)
          reduced.head
        else
          SimpleRegex(reduced)
      case SetItems(items) => SetItems(reduceList(items))
      //dekoratory
      case Set(elem) => Set(simplifier(elem))
      case PositiveSet(items) => PositiveSet(simplifier(items))
      case NegativeSet(items) => NegativeSet(simplifier(items))
      case ZeroOrMore(elem) => ZeroOrMore(simplifier(elem))
      case ZeroOrOne(elem) => ZeroOrOne(simplifier(elem))
      case OneOrMore(elem) => OneOrMore(simplifier(elem))
      case l => l
    }
  }

  def simple(regex: String) = {
    val tokens = new CommonTokenStream(new RegularsLexer(new ANTLRInputStream(regex)))
    val parser = new RegularsParser(tokens)
    val visitor = new OurTreeVisitorTrait with LoggableTreeVisitor
    val tree: ASTNode = parser.start().accept(visitor)
    println(tree)
    println(tree.toRegex)
    val result: ASTNode = simplifier(tree)
    result
  }

  def main(args: Array[String]) {
    args.toList match {
      case elem :: tail =>
        //        val a = elem.replace( '""", """\""")
        val a = elem
        val result = simple(a)
        println(result + " dupa")
        println(result.toRegex + " dupa2")
      case _ => println("nie podano argumentów")
    }
  }
}

/*

 */