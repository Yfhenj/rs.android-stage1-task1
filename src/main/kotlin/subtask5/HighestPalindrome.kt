package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val str = StringBuilder(digitString)
        var counter = 0
        for (i in 0 until digitString.length / 2)
            if (digitString[i] != digitString[digitString.length - i - 1]) counter++
        var over = k - counter
        val result = if (over >= 0) {
            for (i in 0..digitString.length / 2) {
                if (over > 1 && str[i] != '9') {
                    if (str[i] != '9') {
                        if (str[i] == str[str.length - i - 1]) over -= 2 else over--
                        str[i] = '9'
                        str[str.length - i - 1] = '9'
                    }
                } else if (str[i] != str[str.length - i - 1]) {
                    if (over == 1 && str[i] != '9') {
                        str[i] = '9'
                        str[str.length - i - 1] = '9'
                        over--
                    } else if (str[i] > str[str.length - i - 1]) str[str.length - i - 1] = str[i]
                    else str[i] = str[str.length - i - 1]
                }
            }
            if (str.length % 2 == 1 && over > 0) str[(str.length - 1) / 2] = '9'
            str.toString()
        } else "-1"
        return result
    }
}
