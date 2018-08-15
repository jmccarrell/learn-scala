// fails: val powersOf2 = for (i <- 0 to 8) ( yield 1 << i )
// pow2.scala:1: error: illegal start of simple expression
// val powersOf2 = for (i <- 0 to 8) ( yield 1 << i )
//                                     ^
var powersOf2 = for (i <- 0 to 8) yield 1 << i
// use value binding in the for loop
var p2 = for (i <- 0 to 8; pow = 1 << i) yield pow
