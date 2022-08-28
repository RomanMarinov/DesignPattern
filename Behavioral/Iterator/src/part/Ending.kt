package part

import WordPart

class Ending(private val part: String) : WordPart {
    override fun getWordPart(): String { return part }
}