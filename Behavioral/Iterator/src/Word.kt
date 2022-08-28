import iterator.WordIterator
import part.Ending
import part.Prefix
import part.Root
import part.Suffix

class Word() : Iterable<WordPart>{
    private lateinit var root: Root
    private lateinit var prefix: Prefix
    private lateinit var suffix: Suffix
    private lateinit var ending: Ending
    private var count: Int = 0

    constructor(root: Root, prefix: Prefix, suffix: Suffix, ending: Ending) : this() {
        this.root = root
        this.prefix = prefix
        this.suffix = suffix
        this.ending = ending
        this.count = 4
    }

    constructor(root: Root, prefix: Prefix, suffix: Suffix) : this() {
        this.root = root
        this.prefix = prefix
        this.suffix = suffix
        this.count = 3
    }

    constructor(root: Root, prefix: Prefix) : this() {
        this.root = root
        this.prefix = prefix
        this.count = 2
    }

    constructor(root: Root) : this() {
        this.root = root
        this.count = 1
    }

    fun getRoot() : Root { return root }
    fun getPrefix() : Prefix { return prefix }
    fun getSuffix() : Suffix { return suffix }
    fun getEnding() : Ending { return ending }
    fun getCount() : Int { return count }

    fun hasRoot(): Boolean { return true }
    fun hasPrefix(): Boolean { return true }
    fun hasSuffix(): Boolean { return true }
    fun hasEnding(): Boolean { return true }

    override fun iterator(): Iterator<WordPart> { return WordIterator(this) }

}