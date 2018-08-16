package example

import scala.concurrent._, duration._
import core.Weather

object Hello extends App {
  val w = Await.result(Weather.weather, 10.seconds)
  println(s"Hello.  the weather in San Jose is $w.")
  Weather.http.close()
}
