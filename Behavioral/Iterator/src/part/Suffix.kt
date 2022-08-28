package part

import WordPart

class Suffix(private val part: String) : WordPart {
    override fun getWordPart(): String { return part }
}