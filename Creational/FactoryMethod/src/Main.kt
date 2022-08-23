
import java.io.BufferedReader
import java.io.InputStreamReader


    fun main() {
        val dishType = getDishType()
        val cook = Cook()
        val dish = cook.createDish(dishType)

        dish?.let {
            it.cut()
            it.heat()
        }
    }

    fun getDishType() : String {
        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        val dishType = bufferedReader.readLine()
        bufferedReader.close()
        return dishType
    }



