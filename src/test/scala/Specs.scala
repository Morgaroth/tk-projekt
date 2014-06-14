import org.specs2.Specification
import runner.Runner

class Specs extends Specification {

  class A(left: String, right: String) {
    def m = Runner.simple(left).toRegex must beEqualTo(right)
  }

  implicit def checkTuple(x: String) = {
    val r = x.split( """\s*=>\s*""")
    new A(r(0).trim, r(1).trim)
  }

  override def is = s2"""
 This is a specification to check working of simplifier
 The regex should match
    a** => a*               $e1
    aa* => a+               $e2
    a*a => a+               $e20
    a*a* => a*              $e3
    aa+ => a{2,}            $e21
    a+a => a{2,}            ${"a+a => a{2,}".m}
    a+a+ => a{2,}           $e23
    a*a+ => a+              $e24
    a+a* => a+              $e25
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
    a+a{4,} => a{5,}        $e16
    a{4,}a+ => a{5,}        $e17
    a+a{4,5} => a{5,}       $e18
    a{4,5}a+ => a{5,}       $e19
    a+a{4} => a{5,}         $e26
    a{4}a+ => a{5,}         $e27
    a*a{4} => a{4,}         $e28
    a{4}a* => a{4,}         $e29
    a{0,}a* => a*           $e30
    a{1,}a* => a+           $e31
    a{0,}a+ => a+           $e32
    a*a{0,} => a*           $e33
    a*a{1,} => a+           $e34
    a+a{0,} => a+           $e35
    a{0,0}a? => a?          $e36
    a{0,1}a? => a{0,2}      $e37
    a{2,5}a? => a{2,6}      $e38
    a?a{0,0} => a?          $e39
    a?a{0,1} => a{0,2}      $e40
    a?a{2,5} => a{2,6}      $e41
    a?a* => a*              ${"a?a* => a*".m}
    a*a? => a*              ${"a*a? => a*".m}
    a?a+ => a+              ${"a?a+ => a+".m}
    a+a? => a+              ${"a+a? => a+ ".m}
    a?a? => a{0,2}          ${"a?a? => a{0,2}".m}
    a?a{0,} => a*           ${"a?a{0,} => a*".m}
    a?a{1,} => a+           ${"a?a{1,} => a+".m}
    a?a{2,} => a{2,}        ${"a?a{2,} => a{2,}".m}
    a?a{0,6} => a{0,7}      ${"a?a{0,6} => a{0,7}".m}
    a{0,}a? => a*           ${"a{0,}a? => a*".m}
    a{1,}a? => a+           ${"a{1,}a? => a+".m}
    a{2,}a? => a{2,}        ${"a{2,}a? => a{2,}".m}
    a{0,6}a? => a{0,7}      ${"a{0,6}a? => a{0,7}".m}
    a{0,}a{5,} => a{5,}     ${"a{0,}a{5,} => a{5,}".m}
    a{0,}a{6,10} => a{6,10} ${"a{0,}a{6,10} => a{6,}".m}
    a{5,}a{0,} => a{5,}     ${"a{5,}a{0,} => a{5,}".m}
    a{6,10}a{0,} => a{6,10} ${"a{6,10}a{0,} => a{6,}".m}
    a{4,7}a{2,5} => a{6,12} ${"a{4,7}a{2,5} => a{6,12}".m}
                            """

  /*
      (a| eps)* => a*         $e6
          a eps => a              $e11
          //  def e6 = //Runner.simple("a**").toRegex must beEqualTo("a*")
          //  def e11 = Runner.simple("a**").toRegex must beEqualTo("a*")
   */

  def check(left: String, right: String) = Runner.simple(left).toRegex must beEqualTo(right)

  def e1 = Runner.simple("a**").toRegex must beEqualTo("a*")

  def e2 = Runner.simple("aa*").toRegex must beEqualTo("a+")

  def e20 = Runner.simple("a*a").toRegex must beEqualTo("a+")

  def e3 = Runner.simple("a*a*").toRegex must beEqualTo("a*")

  def e21 = Runner.simple("aa+").toRegex must beEqualTo("a{2,}")

  def e22 = Runner.simple("a+a").toRegex must beEqualTo("a{2,}")

  def e23 = Runner.simple("a+a+").toRegex must beEqualTo("a{2,}")

  def e24 = Runner.simple("a*a+").toRegex must beEqualTo("a+")

  def e25 = Runner.simple("a+a*").toRegex must beEqualTo("a+")

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

  def e16 = Runner.simple("a+a{4,}").toRegex must beEqualTo("a{5,}")

  def e17 = Runner.simple("a{4,}a+").toRegex must beEqualTo("a{5,}")

  def e18 = Runner.simple("a+a{4,5}").toRegex must beEqualTo("a{5,}")

  def e19 = Runner.simple("a{4,5}a+").toRegex must beEqualTo("a{5,}")

  def e26 = Runner.simple("a+a{4}").toRegex must beEqualTo("a{5,}")

  def e27 = Runner.simple("a{4}a+").toRegex must beEqualTo("a{5,}")

  def e28 = Runner.simple("a*a{4}").toRegex must beEqualTo("a{4,}")

  def e29 = Runner.simple("a{4}a*").toRegex must beEqualTo("a{4,}")

  def e30 = Runner.simple("a{0,}a*").toRegex must beEqualTo("a*")

  def e31 = Runner.simple("a{1,}a*").toRegex must beEqualTo("a+")

  def e32 = Runner.simple("a{0,}a+").toRegex must beEqualTo("a+")

  def e33 = Runner.simple("a*a{0,}").toRegex must beEqualTo("a*")

  def e34 = Runner.simple("a*a{1,}").toRegex must beEqualTo("a+")

  def e35 = Runner.simple("a+a{0,}").toRegex must beEqualTo("a+")

  def e36 = Runner.simple("a{0,0}a?").toRegex must beEqualTo("a?")

  def e37 = Runner.simple("a{0,1}a?").toRegex must beEqualTo("a{0,2}")

  def e38 = Runner.simple("a{2,5}a?").toRegex must beEqualTo("a{2,6}")

  def e39 = Runner.simple("a?a{0,0}").toRegex must beEqualTo("a?")

  def e40 = Runner.simple("a?a{0,1}").toRegex must beEqualTo("a{0,2}")

  def e41 = Runner.simple("a?a{2,5}").toRegex must beEqualTo("a{2,6}")

}