package kata

class RomanNumerals {
    companion object {
        fun convert(number: Int): String {
            return when (number) {
                0 -> ""
                in 1 .. 3 -> "I" + convert(number - 1)
                4 -> "IV"
                in 5..8 -> "V" + convert(number - 5)
                9 -> "IX"
                else -> "X" + convert(number - 10)
            }
        }
    }

}
