package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = arrayListOf<String>()
        for (i in inputString.withIndex()) {
            if (i.value == '(' || i.value == '[' || i.value == '<') {
                val closingElement = when (i.value) {
                    '(' -> ')'
                    '[' -> ']'
                    else -> '>'
                }
                var nestedBracketLevel = 0
                for (j in i.index + 1 until inputString.length) {
                    if (inputString[j] == i.value) nestedBracketLevel++
                    if (inputString[j] == closingElement) {
                        if (nestedBracketLevel == 0) {
                            result.add(inputString.substring(i.index + 1 until j))
                            break
                        } else nestedBracketLevel--
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
