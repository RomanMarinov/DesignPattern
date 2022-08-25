package factory

import Hamburger.Beef
import Hamburger.Hamburger
import Roll.Chicken
import Roll.Roll
import Roll.Shrimp


class KFCFactory : FastFoodFactory {
    override fun createHamburger() : Hamburger {
        return Beef()
    }

    override fun createRoll() : Roll {
        return Chicken()
    }
}