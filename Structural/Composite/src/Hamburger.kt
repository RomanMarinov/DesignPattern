class Hamburger(vararg children: Eating) : Eating {

    private var childrenFood: MutableList<Eating> = mutableListOf(*children)

    override fun eat() {
        println("create hamburger")
        for (child: Eating in childrenFood) {
            child.eat()
        }
    }

    fun add(child: Eating) { childrenFood.add(child) }
    fun remove(child: Eating) { childrenFood.remove(child) }
    fun getChild(position: Int) : Eating { return childrenFood[position]
    }
}