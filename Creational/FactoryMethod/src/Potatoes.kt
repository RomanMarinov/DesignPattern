class Potatoes : Cooking {

    companion object {
        const val dishType = "potatoes"
    }

    override fun cut() {
        println("картошка нарезана")
    }

    override fun heat() {
        println("картошка разогрета")
    }
}