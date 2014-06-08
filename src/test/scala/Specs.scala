import org.specs2.Specification
import runner.Runner

class Specs extends Specification {
  override def is = s2"""

 This is a specification to check working of simplifier

 The regex should match
    a** => a*               $e1
    aa* => a+               $e2
    a*a* => a*              $e3
    a | a* => a*            $e4
    a* | a => a*            $e15
    a+ | a                  $e13
    a | a+                  $e14
    ab|ac => a(b|c)         $e5
    ac|bc => (a|b)c         $e6
    (aa|a)* => a*           $e7
    (a|b*)* => (a|b)*       $e8
    (a*b*c*)* => (a|b|c)*   $e9
    (a|(b|c)) => (a|b|c)    $e10
    a(bc)=>abc              $e11
    a|b|a => a|b            $e12
                                """

  /*
      (a| eps)* => a*         $e6
          a eps => a              $e11
          //  def e6 = //Runner.simple("a**").toRegex must beEqualTo("a*")
          //  def e11 = Runner.simple("a**").toRegex must beEqualTo("a*")
   */

  def e1 = Runner.simple("a**").toRegex must beEqualTo("a*")

  def e2 = Runner.simple("aa*").toRegex must beEqualTo("a+")

  def e3 = Runner.simple("a*a*").toRegex must beEqualTo("a*")

  def e4 = Runner.simple("a|a*").toRegex must beEqualTo("a*")

  def e15 = Runner.simple("a*|a").toRegex must beEqualTo("a*")

  def e13 = Runner.simple("a+|a").toRegex must beEqualTo("a+")

  def e14 = Runner.simple("a|a+").toRegex must beEqualTo("a+")

  def e5 = Runner.simple("ab|ac").toRegex must beEqualTo("a(b|c)")

  def e6 = Runner.simple("ac|bc").toRegex must beEqualTo("(a|b)c")

  def e7 = Runner.simple("(aa|a)*").toRegex must beEqualTo("a*")

  def e8 = Runner.simple("(a|b*)*").toRegex must beEqualTo("(a|b)*")

  def e9 = Runner.simple("(a*b*c*)*").toRegex must beEqualTo("(a|b|c)*")

  def e10 = Runner.simple("(a|(b|c))").toRegex must beEqualTo("(a|b|c)")

  def e11 = Runner.simple("a(bc)").toRegex must beEqualTo("abc")

  def e12 = Runner.simple("a|b|a").toRegex must beEqualTo("a|b")

}