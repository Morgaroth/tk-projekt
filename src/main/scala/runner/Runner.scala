package runner

import parser.{RegularsLexer, RegularsParser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import ast.{ASTNode, LoggableTreeVisitor, OurTreeVisitorTrait}
import ast._

object Runner {

  def simplifier(tree : ASTNode) : ASTNode = {
    tree match {
        case Regex(m) => {
            val newSeq = m.map(x => simplifier(x).asInstanceOf[SimpleRegex]).distinct;
            Regex(newSeq)
        }
        case SimpleRegex(m) => {
            val newSeq = m.map(x => simplifier(x).asInstanceOf[BasicRegex]);
            val newSeqArray = m.toArray;
            val newSeqArraySize = m.length - 2;
            val a = 0;

            val li = List();

            for(a <- 0 to newSeqArraySize){
                if(newSeqArray(a) equals newSeqArray(a+1)){
                    newSeqArray(a) match {
                        case BasicRegex(ZeroOrMore(e)) =>
                        case _ => li = li:::List(newSeqArray(a));
                    }
                }else{
                    li:::List(newSeqArray(a));
                }
            }
            if(m.toArray.length > 1){
                SimpleRegex(li.toSeq)
            }else{
                SimpleRegex(newSeq)
            }
        }
        case _ => tree
    }
  }

  def main(args: Array[String]) {
    val expr = """a*a*"""
    //val expr = """(((c+(c+(a(b+b))a))+c)+ac)"""
    val tokens = new CommonTokenStream(new RegularsLexer(new ANTLRInputStream(expr)))

    val parser = new RegularsParser(tokens)
    val visitor = new OurTreeVisitorTrait with LoggableTreeVisitor
    val tree: ASTNode = parser.start().accept(visitor)
    //println(tree)
    //simplifier(tree)
    println(simplifier(tree))

  }
}
