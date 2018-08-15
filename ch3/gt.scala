// given a double amount, write an expr to return "greater", "same" or "less" compared to 0
val a = -23
val comp = a match {
  case s if a > 0 => "greater"
  case s if a == 0 => "same"
  case _ => "less"
}
