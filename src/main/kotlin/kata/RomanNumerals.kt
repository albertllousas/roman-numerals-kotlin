package kata

class RomanNumerals {

    companion object {

        private val numbers =
            listOf(50 to "L", 49 to "IL", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")

        fun convert(number: Int): String =
            if (number > 0) {
                val (num, roman) = numbers.find { it.first <= number }!!
                roman + convert(number - num)
            } else {
                ""
            }


        fun convert(romanNumeral: String): Int {
            TODO()
        }
    }
}
