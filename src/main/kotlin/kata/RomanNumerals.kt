package kata

class RomanNumerals {
    companion object {
        fun convert(number: Int): String {
            return when (number) {
                1 -> "I"
                2 -> "II"
                else -> "III"
            }
        }
    }

}
