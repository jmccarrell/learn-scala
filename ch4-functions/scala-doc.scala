/**
  * recursively compute x to the y power
  * @param x: base
  * @param y: power to raise base to
  */  
@annotation.tailrec
def power(x: Int, y: Int, t: Int = 1): Long = {
  if (y < 1) t
  else power(x, y-1, x*t)
}
power(2, 16)
