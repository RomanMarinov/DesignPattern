fun main() {

    val builder = Builder()
    builder.buildSewingTreads("red")
//        builder.buildTextile("cotton")
    builder.buildSewingButtons("tree")
    val blazer = builder.getResult()

    println(blazer)
}