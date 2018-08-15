val status = 500
val message = status match {
  case 200 =>
    "ok"
  case 400 => {
    println("ERROR - services called incorrectly.")
    "error"
  }
  case 500 => {
    println("ERROR - server internal error.")
    "error"
  }
}
