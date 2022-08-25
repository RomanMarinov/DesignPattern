class DoubleBurger(private val simpleBurger: SimpleBurger) : SimpleBurger() {

    override fun meatCutlet(): Int {
        return simpleBurger.meatCutlet() + 1
    }

    override fun cheese(): Int {
        return simpleBurger.cheese() + 2
    }
}