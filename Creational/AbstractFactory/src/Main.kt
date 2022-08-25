import Hamburger.Hamburger
import Roll.Roll
import factory.FastFoodFactory
import factory.MacDonaldsFactory

fun main(){

    val hamburger: Hamburger = getFactory().createHamburger()
    val roll: Roll = getFactory().createRoll()

    hamburger.standardSize()
    hamburger.doubleSize()
    roll.spicy()
    roll.sweet()
}

fun getFactory() : FastFoodFactory {
    return MacDonaldsFactory()
}

