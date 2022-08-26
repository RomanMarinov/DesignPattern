package factory

import Hamburger.Hamburger
import Hamburger.Pork
import Roll.Roll
import Roll.Shrimp

class MacDonaldsFactory : FastFoodFactory {
    override fun createHamburger() : Hamburger {
        return Pork()
    }

    override fun createRoll() : Roll {
        return Shrimp()
    }
}