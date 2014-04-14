package runner

import parser.{RegularsLexer, RegularsParser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}


object Runner {

  def main(args: Array[String]) {
    val expr = """[a-d]+((e*)|(f+))"""

    val tokens = new CommonTokenStream(new RegularsLexer(new ANTLRInputStream(expr)))

    val parser = new RegularsParser(tokens)
    val acc = parser.start().accept(_)
    acc()
  }
}
