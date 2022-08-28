import state.Gaseous
import state.Liquid
import state.Solid
import state.WaterActivity

class Water (private val waterActivity: WaterActivity) {

    fun changeWaterActivity() : WaterActivity{
        return when(waterActivity) {
            is Gaseous -> return Liquid.getInstance()
            is Solid -> return Gaseous.getInstance()
            is Liquid -> return Solid.getInstance()
            else -> Liquid()
        }
    }
}