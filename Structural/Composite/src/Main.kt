fun main(){

    val meat: Eating = Meat()
    meat.eat()

    val salad: Eating = Salad()
    salad.eat()

    val cheese: Eating = Cheese()
    cheese.eat()

    val eat1 = Hamburger(meat, salad)
    eat1.eat()

    val eat2 = Hamburger(eat1, Meat(), Salad(), cheese)
    eat2.eat()
}