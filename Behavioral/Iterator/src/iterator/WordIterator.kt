package iterator

import Word
import WordPart
import java.util.*


class WordIterator(
    private val word: Word,
    private var count: Int = word.getCount()
) : Iterator<WordPart> {

    override fun hasNext(): Boolean {
        return when(count) {
            1 -> return word.hasRoot() || word.hasPrefix() || word.hasSuffix() || word.hasEnding()
            2 -> return word.hasRoot() || word.hasPrefix() || word.hasSuffix()
            3 -> return word.hasRoot() || word.hasPrefix()
            4 -> return word.hasRoot()
            else -> false
        }
    }

    override fun next(): WordPart {
        return try {
            when (count) {
                4 -> word.getEnding()
                3 -> word.getSuffix()
                2 -> word.getPrefix()
                1 -> word.getRoot()
                else -> throw NoSuchElementException("No more elements in this word!")
            }
        } finally {
            count--
        }
    }

}