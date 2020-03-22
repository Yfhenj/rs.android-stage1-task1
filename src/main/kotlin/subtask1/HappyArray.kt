package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (!sadArray.isEmpty()) {
            var result = sadArray.clone()
            do {
                val length = result.size
                result = result.filterIndexed { index, i ->
                    if (index == 0 || index == result.size - 1) true
                    else i <= result[index - 1] + result[index + 1]
                }.toIntArray()
            } while (length != result.size)
            return result
        } else
            return intArrayOf()
    }
}
