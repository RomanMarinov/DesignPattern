class Tomatoes : Cooking {

    companion object {
        const val dishType = "tomatoes"
    }

    override fun cut() {
        println("томаты нарезаны")
    }

    override fun heat() {
        println("томаты разогреты")
    }
}