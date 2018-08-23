class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("parseDate") {
    assert(CubeCalculator.parseDate(1000000L).size > 0)

    // fail(CubeCalculator.parseDate(1000000L))

    val stream = new java.io.ByteArrayOutputStream()
    Console.withErr(stream) {
      //all printlns in this block will be redirected
      println(CubeCalculator.parseDate(1000000L))
    }
  }
}
