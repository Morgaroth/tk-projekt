
object test {

  class A

  class B extends A

  class C extends A

  class E[T] {
    def doB[typ <: T](elem: typ) = elem

    def doC[typ <: T](elem: typ) = elem
  }

  def apply(): Unit = {
    val elemOfTypeB = new B()
    val elemOfTypeC = new C()

    val resultOfGenericB: B = new E().doB(elemOfTypeB)
    val resultOfGenericC: C = new E().doC(elemOfTypeC)
  }


}
