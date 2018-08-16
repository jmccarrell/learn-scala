// at its simplest, a function has syntax:
//  def <identifier> = <expression>
def hi = "Jeff"

// one can explicitly declare the function type:
//  def <identifier>
def hi: String = "Jefé"

// with parameters:
//  def <identifier>(<identifier>: type[, ... ]): <type> = <expression>
def mult(x: Int = 0, y: Int): Int = x * y

// a procedure doesn't define a return value, or rather, defines Unit as the return value
def logd(d: Double): Unit = println(f"got value: ${d}%.2f")
logd(355.0/113)

// the 'functions' above look just like values.
//  use explicit () if you want to declare a function.
def hi(): String = "functional Jefé"


// one can pass the results of an expression-block to a single parameter function.
//  syntax:
//  <function identifier> <expression-block>
def toCelcius(farenheit: Double): Double = {
  return (farenheit - 32) * 5.0 / 9.0
}
// evaluates to true
toCelcius(212) == toCelcius { (100 * 9.0 / 5.0) + 32 }

// recursive functions, with optimized tail recursion

// recursively compute x to the y power
@annotation.tailrec
def power(x: Int, y: Int, t: Int = 1): Long = {
  if (y < 1) t
  else power(x, y-1, x*t)
}
power(2, 16)

// NB. the simple defn will fail the tailrec annotation
// @annotation.tailrec
// def powerfails(x: Int, y: Int): Long = {
//   if (y >= 1) x * powerfails(x, y-1)
//   else 1
// }
// fails with:
// simple-funcs.scala:14: error: could not optimize @tailrec annotated method powerfails: it contains a recursive call not in tail position
//   if (y >= 1) x * powerfails(x, y-1)
//                 ^

// specify a default value for function parameters
//  def <identifier>(<identifier>: type = value[, ... ]): <type> = <expression>

// varargs params. can only be one, and must appear after any non-varargs.
def sumInts(vals: Int*): Int = {
  var total = 0
  for (i <- vals) total += i
  total
}
sumInts(10, 42, 100)
sumInts()
