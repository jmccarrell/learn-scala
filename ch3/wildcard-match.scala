val message = "unauthorized"
val status = message match {
  case "Ok" => 200
  case _ => {
    println(s"Could not parse $message")
    -1
  }
}
