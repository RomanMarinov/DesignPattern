package state

class Liquid : WaterActivity {

    companion object{
        private var liquidInstance: Liquid? = null
        fun getInstance() : Liquid {
            if (liquidInstance == null) {
                liquidInstance = Liquid()
            }
            return liquidInstance as Liquid
        }
    }

    override fun execute() {
        println("activated liquid state")
    }
}