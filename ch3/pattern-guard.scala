// val response = null
// val response = "foo"
val m = response match {
  case response if response != null => response
  case _ => {
    println(s"Error: null response; converting to empty string")
    ""
  }
}
