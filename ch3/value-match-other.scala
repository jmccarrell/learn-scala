val message = "Ok"
val status = message match {
  case "kO" => 200
  case other => {
    println(s"could not match $other")
    -1
  }
}
