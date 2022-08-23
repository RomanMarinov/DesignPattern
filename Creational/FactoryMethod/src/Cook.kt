class Cook {
    fun createDish(dishType: String) : Cooking? {
        return when(dishType) {
            Potatoes.dishType -> Potatoes()
            Tomatoes.dishType -> Tomatoes()
            else -> null
        }
    }
}