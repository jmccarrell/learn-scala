import java.time._

object CubeCalculator extends App {
  def cube(x: Int) = {
    x * x * x
  }

  def parseDate(ts: Long): String = {
    val ld: LocalDateTime = LocalDateTime.now()

    // val stream = new java.io.ByteArrayOutputStream()
    // Console.withErr(stream) {
    //   //all printlns in this block will be redirected
    //   println("" + ld)
    // }

    ld + ""
  }
}
