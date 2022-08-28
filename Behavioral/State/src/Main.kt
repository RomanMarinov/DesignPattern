import state.Liquid
import state.WaterActivity

fun main(){

    var liquid : WaterActivity = Liquid.getInstance()
    while (true) {
        liquid.execute()
        liquid = Water(liquid).changeWaterActivity()
    }
}