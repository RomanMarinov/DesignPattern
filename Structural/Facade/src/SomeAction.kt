class SomeAction {

    fun search(nums: IntArray) : Int{
        var count = 0

        for (item in nums) {
            if (item % 2 == 0) { count ++ }
        }
        return count
    }
}