package part

import WordPart

class Prefix(private val part: String) : WordPart {
    override fun getWordPart(): String { return part }
}