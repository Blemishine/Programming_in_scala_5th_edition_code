package chapter02

@main def m5(args: String*) = {
  var i = 0;
  while (i < args.length) {
    if (i != 0) {
      print(" ")
    }
    print(args(i))
    i += 1
  }
  println()
}
