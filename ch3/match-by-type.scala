// fails:
// match-by-type.scala:16: error: scrutinee is incompatible with pattern type;
//  found   : Int
//  required: String
//   case y: Int => s"${x}i"
//           ^
val x: Int = 71361
val y: String = x.toString
y match {
  case y: String => s"'x'"
  case y: Int => s"${x}i"
}
