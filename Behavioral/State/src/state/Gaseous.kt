package state

class Gaseous : WaterActivity {
    companion object {
        private var gaseousInstance: Gaseous? = null

        fun getInstance(): Gaseous {
            if (gaseousInstance == null) {
                gaseousInstance = Gaseous()
            }
            return gaseousInstance as Gaseous
        }
    }

    override fun execute() {
        println("activated gaseous state")
    }
}