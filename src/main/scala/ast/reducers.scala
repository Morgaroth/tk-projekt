package ast

object Reducer {
  implicit def wrapToReducer(list: List[ASTNode]) = new Reducer(list)
}

class Reducer(list: List[ASTNode]) {

  private def reducePrv(list: List[ASTNode]): List[ASTNode] = {
    println(s"reducing $list")
    import ast.FixedRepeting.INFINITY
    list match {
      // ========================================================================================
      // * reducers with *
      case (f@ZeroOrMore(firstElem)) :: (secondElem: ASTNode) :: tail if firstElem.equals(secondElem) =>
        val more = OneOrMore(secondElem)
        println(s"executed ${f.toRegex} & ${secondElem.toRegex} => ${more.toRegex}")
        reducePrv(more :: tail)
      case (f@ZeroOrMore(firstElem)) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@ZeroOrMore(firstElem)) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(s :: tail)
      case (f@ZeroOrMore(firstElem)) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@ZeroOrMore(firstElem)) :: (s@FixedRepeting(secondElem, min, _)) :: tail if firstElem.equals(secondElem) =>
        val n = min match {
          case 0 => f
          case 1 => OneOrMore(firstElem)
          case _ => FixedRepeting(firstElem, min, FixedRepeting.INFINITY)
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (firstElem: ASTNode) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val more = OneOrMore(firstElem)
        println(s"executed ${firstElem.toRegex} & ${s.toRegex} => ${more.toRegex}")
        reducePrv(more :: tail)

      // ========================================================================================
      // reducers with +
      case (f@OneOrMore(firstElem)) :: (secondElem: ASTNode) :: tail if firstElem.equals(secondElem) =>
        val n = FixedRepeting(firstElem, 2)
        println(s"executed ${f.toRegex} & ${secondElem.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (f@OneOrMore(firstElem)) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@OneOrMore(firstElem)) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val n = FixedRepeting(firstElem, 2)
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (f@OneOrMore(firstElem)) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${f.toRegex}")
        reducePrv(f :: tail)
      case (f@OneOrMore(firstElem)) :: (s@FixedRepeting(secondElem, min, _)) :: tail if firstElem.equals(secondElem) =>
        val n = min match {
          case 0 => f
          case _ => FixedRepeting(firstElem, min + 1, FixedRepeting.INFINITY)
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (firstElem: ASTNode) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val more = FixedRepeting(firstElem, 2)
        println(s"executed ${firstElem.toRegex} & ${s.toRegex} => ${more.toRegex}")
        reducePrv(more :: tail)

      // ========================================================================================
      // reducers with ?
      case (f@ZeroOrOne(firstElem)) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${s.toRegex}")
        reducePrv(s :: tail)
      case (f@ZeroOrOne(firstElem)) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${s.toRegex}")
        reducePrv(s :: tail)
      case (f@ZeroOrOne(firstElem)) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val n = FixedRepeting(firstElem, 0, 2)
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (f@ZeroOrOne(firstElem)) :: (s@FixedRepeting(secondElem, min, max)) :: tail if firstElem.equals(secondElem) =>
        val n = (min, max) match {
          case (0, 0) => f
          case (1, INFINITY) => OneOrMore(firstElem)
          case (0, INFINITY) => ZeroOrMore(firstElem)
          case (_, INFINITY) => s
          case (_, _) => FixedRepeting(firstElem, min, max + 1)
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (f@FixedRepeting(firstElem, min1, max1)) :: (s@FixedRepeting(secondElem, min2, max2)) :: tail if firstElem.equals(secondElem) =>
        val n = (max1, max2) match {
          case (_, INFINITY) | (INFINITY, _) =>
            min1 + min2 match {
              case 0 => ZeroOrMore(firstElem)
              case 1 => OneOrMore(firstElem)
              case number => FixedRepeting(firstElem, number)
            }
          case (_, _) => FixedRepeting(firstElem, min1 + min2, max1 + max2)
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (firstElem: ASTNode) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val more = FixedRepeting(firstElem, 2)
        println(s"executed ${firstElem.toRegex} & ${s.toRegex} => ${more.toRegex}")
        reducePrv(more :: tail)

      // ========================================================================================
      // reducers with {}
      case (f@FixedRepeting(firstElem, min, _)) :: (s@ZeroOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val n = min match {
          case 1 => OneOrMore(firstElem)
          case number if number > 1 => FixedRepeting(firstElem, min, FixedRepeting.INFINITY)
          case _ => s
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (f@FixedRepeting(firstElem, min, _)) :: (s@OneOrMore(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val n = min match {
          case 0 => s
          case number if number > 0 => FixedRepeting(firstElem, min + 1, FixedRepeting.INFINITY)
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (f@FixedRepeting(firstElem, min, max)) :: (s@ZeroOrOne(secondElem)) :: tail if firstElem.equals(secondElem) =>
        val n = (min, max) match {
          case (0, 0) => s
          case (1, 1) => FixedRepeting(firstElem, 1, 2)
          case (0, INFINITY) => ZeroOrMore(firstElem)
          case (1, INFINITY) => OneOrMore(firstElem)
          case (_, INFINITY) => f
          case (_, _) => FixedRepeting(firstElem, min, max + 1)
        }
        println(s"executed ${f.toRegex} & ${s.toRegex} => ${n.toRegex}")
        reducePrv(n :: tail)
      case (firstElem: ASTNode) :: (s@FixedRepeting(secondElem, min, _)) :: tail if firstElem.equals(secondElem) =>
        val more = FixedRepeting(firstElem, 2)
        println(s"executed ${firstElem.toRegex} & ${s.toRegex} => ${more.toRegex}")
        reducePrv(more :: tail)

      // ========================================================================================
      // defaults
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