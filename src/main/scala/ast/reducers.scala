package ast

object Reducer {
  implicit def wrapToReducer(list: List[ASTNode]) = new Reducer(list)
}

class Reducer(list: List[ASTNode]) {

  private def reducePrv(list: List[ASTNode]): List[ASTNode] = {
    println(s"reducing $list")
    list match {
      // * reducers
      case (f@ZeroOrMore(firstElem)) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@ZeroOrMore(firstElem)) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(s :: tail)
      case (f@ZeroOrMore(firstElem)) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (firstElem: ASTNode) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val more = OneOrMore(firstElem)
        println(s"executed ${firstElem.toRegex} & ${s.toRegex} => ${more.toRegex}")
        reducePrv(more :: tail)

      // + reducers

      case (f@OneOrMore(firstElem)) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@OneOrMore(firstElem)) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@OneOrMore(firstElem)) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)


      case head :: tail => head :: reducePrv(tail)
      case Nil => Nil
    }
  }

  def reduceItself = reducePrv(list)
}

object AlternativeReducer {
  implicit def wrapToAlternativeReducer(list: List[ASTNode]) = new AlternativeReducer(list)
}

class AlternativeReducer(list: List[ASTNode]) {

  private def reduceSimple(element: ASTNode, list: List[ASTNode]): List[ASTNode] =
    list match {
      case (s@ZeroOrMore(second)) :: tail if element.equals(second) =>
        val more: OneOrMore = OneOrMore(second)
        println(s"executed ${element.toRegex} & ${s.toRegex} => ${more.toRegex}")
        more :: reduceSimple(element, tail)
      case Nil => Nil
      case head :: tail => head :: reduceSimple(element, tail)
    }

  private def reduce(list: List[ASTNode]): List[ASTNode] =
    list match {
      case Nil => Nil
      case l => reduceSimple(l.head, reduce(l.tail))
    }

  def reduceAlternatives = reduce(list)
}