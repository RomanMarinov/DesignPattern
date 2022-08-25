fun main(){

    val simpleBurger = SimpleBurger()
    println("простой бургер -> котлета=${simpleBurger.meatCutlet()} шт., сыр=${simpleBurger.cheese()} шт.")

    val doubleBurger = DoubleBurger(simpleBurger)
    println("двойной бургер -> котлета=${doubleBurger.meatCutlet()} шт., сыр=${doubleBurger.cheese()} шт.")
}