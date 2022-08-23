class Builder : ClothesBuilder() {
    override fun buildSewingTreads(color: String) {
        clothes.setSewingThreads(color)
    }

    override fun buildTextile(material: String) {
        clothes.setTextile(material)
    }

    override fun buildSewingButtons(material: String) {
        clothes.setSewingButtons(material)
    }
}