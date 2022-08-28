package state

class Solid : WaterActivity {

    companion object{
        private var solidInstance: Solid? = null

        fun getInstance() : Solid {
            if (solidInstance == null) { solidInstance = Solid() }
            return solidInstance as Solid
        }
    }

    override fun execute() {
        println("activated solid state")
    }
}