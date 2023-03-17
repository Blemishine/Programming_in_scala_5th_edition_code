package chapter02

@main def m4(args: String*) = {
  var i = 0
  while i < args.length do
    if i != 0 then
      print(" ")
    print(args(i))
    i += 1
  println()
}
