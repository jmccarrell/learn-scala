/**
  * compute area
  * @param: r radius
  */
def area(r: Double): Double = {
  val pi = 355.0 / 113.0
  assert(r > 0, "radius must be > zero")
  return 2 * pi * r
}
area(2)
area(-2)

def area(r: String): Double = {
  val pi = 355.0 / 113.0
  assert(r.size > 0, "radius must not be empty")
  return 2 * pi * r.toInt
}
area("2")
assert(area(2.0) == area("2"))

/**
  * recursively print 5 to 50 by fives
  */
@annotation.tailrec
def byFives(start: Int = 0, end: Int = 0, step: Int = 5): Unit = {
  if (start > end) { return }
  println(start)
  byFives(start + step, end, step)
}
byFives(5, 50, 5)


/** 
  * convert millisecs to a time value
  */
def millisToString(t: Long): String = {
  null
}
