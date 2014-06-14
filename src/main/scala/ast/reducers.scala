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

  //  def reduceSimpleFront(listIn: List[ASTNode]): List[ASTNode] = {
  object Element {
    def unapply(elem: ASTNode) =
      elem match {
        case plus@OneOrMore(pIn) => Some((plus, pIn))
        case star@ZeroOrMore(sIn) => Some((star, sIn))
        case ask@ZeroOrOne(askIn) => Some((ask, askIn))
        case _ => None
      }
  }


  def reduceSimple(listIn: List[ASTNode]): List[ASTNode] =
    listIn match {
      case Nil => Nil
      case element :: restElements =>
        println(s"reduce simple elem $element with $restElements")
        element match {
          case Element(externalElem, internalElem) =>
            val (notAccepted, accepted) =
              restElements.span {
                case second if internalElem.equals(second) => false
                case _ => true
              }
            //accepted albo jest pusta, albo znalazło dobry element
            accepted match {
              case Nil =>
                element :: notAccepted
              case head :: tail =>
                println(s"executed ${element.toRegex} | ${head.toRegex} => ${internalElem.toRegex}")
                reduceSimple(externalElem :: notAccepted ::: tail)
            }
          case _ =>
            val (notAccepted, accepted) =
              restElements.span {
                case Element(_, internal) if element.equals(internal) => false
                case _ => true
              }
            //accepted albo jest pusta, albo znalazło dobry element
            accepted match {
              case Nil =>
                element :: notAccepted
              case head :: tail =>
                println(s"executed ${element.toRegex} | ${head.toRegex} => ${head.toRegex}")
                reduceSimple(head :: notAccepted ::: tail)
            }
        }
    }

  def reduce(list: List[ASTNode]): List[ASTNode] = {
    println(s"reducePRV $list")
    val result = list.distinct match {
      case Nil => Nil
      case head :: tail => head :: reduceSimple(tail)
    }
    reduceSimple(result)
  }

  def reduceAlternatives = reduce(list)
}