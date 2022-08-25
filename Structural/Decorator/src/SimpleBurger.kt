open class SimpleBurger : Burger {

    private val meatCutlet = 1
    private val cheese = 2

    override fun meatCutlet(): Int {
        return meatCutlet
    }

    override fun cheese(): Int {
        return cheese
    }
}