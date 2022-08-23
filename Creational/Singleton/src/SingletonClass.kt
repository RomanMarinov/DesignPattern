class SingletonClass private constructor(val num: Int) {
    companion object {
        private var myClass: SingletonClass? = null
        fun getInstance(num: Int): SingletonClass {
            if (myClass == null) {
                myClass = SingletonClass(num)
            }
            return myClass as SingletonClass
        }
    }
}