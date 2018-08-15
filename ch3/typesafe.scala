// write a expr to print the ints from 1 to 100.  print 'type' for mulitples of 3; 'safe' for mults of 5
//  'typesafe' for mults of 15.
for (j <- 1 to 100) {
  j match { 
    case j if j % 15 == 0 => println("typesafe")
    case j if j % 5 == 0 => println("safe")
    case j if j % 3 == 0 => println("type")
    case _ => println(j)
  }
}
