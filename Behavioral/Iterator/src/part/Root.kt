package part

import WordPart

class Root (private val part: String) : WordPart {
    override fun getWordPart(): String { return part }
}