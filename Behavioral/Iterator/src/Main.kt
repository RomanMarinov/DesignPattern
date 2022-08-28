import part.Ending
import part.Prefix
import part.Root
import part.Suffix

fun main(){

    val root = Root("беж")
    val prefix = Prefix("пере")
    val suffix = Suffix("к")
    val ending = Ending("а")

    val word = Word(root = root, prefix = prefix, suffix = suffix, ending = ending)

    val wordIterator = word.iterator()
    while (wordIterator.hasNext()){
        val part = wordIterator.next()
        println("${part.javaClass}=" + part.getWordPart())
    }

}