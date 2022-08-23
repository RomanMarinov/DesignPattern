fun main() {

    val myClass1 = SingletonClass.getInstance(5)
    val myClass2 = SingletonClass.getInstance(3)

    println("myClass1.hashCode()=${myClass1.hashCode()}")
    println("myClass2.hashCode()=${myClass2.hashCode()}")
    println("myClass1.num=${myClass1.num}")
}