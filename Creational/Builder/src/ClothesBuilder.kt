abstract class ClothesBuilder {

    protected val clothes: Clothes = Clothes()

    fun getResult() : Clothes {
        return clothes
    }

    abstract fun buildSewingTreads(color: String)
    abstract fun buildTextile(material: String)
    abstract fun buildSewingButtons(material: String)

}