import strategy.CocaCola
import strategy.HamburgerStrategy

fun main(){

    val johny = Johny()
    johny.eating(HamburgerStrategy())
    johny.eating(HamburgerStrategy())
    johny.eating(CocaCola())

}