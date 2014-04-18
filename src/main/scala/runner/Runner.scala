package runner

import parser.{RegularsLexer, RegularsParser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import ast.{ASTNode, LoggableTreeVisitor, OurTreeVisitorTrait}


object Runner {

  def simplifier(tree : ASTNode) {
    tree match {
        case ast.Regex(e) => {
            var a = 0;
            val tab = e.toArray;
            val tabSize = tab.length -2;
            for(a <- 0 to tabSize){
                println(tab(a) equals tab(a+1));
            }
        }
        case _ => println("dupa")
    }
  }

  def main(args: Array[String]) {
    val expr = """a*|a*a"""
    //val expr = """(((c+(c+(a(b+b))a))+c)+ac)"""
    val tokens = new CommonTokenStream(new RegularsLexer(new ANTLRInputStream(expr)))

    val parser = new RegularsParser(tokens)
    val visitor = new OurTreeVisitorTrait with LoggableTreeVisitor
    val tree: ASTNode = parser.start().accept(visitor)
    //println(tree)

    simplifier(tree)

  }
}
