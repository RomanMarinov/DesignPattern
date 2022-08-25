package factory

import Hamburger.Hamburger
import Roll.Roll

interface FastFoodFactory {

    fun createHamburger() : Hamburger
    fun createRoll() : Roll
}