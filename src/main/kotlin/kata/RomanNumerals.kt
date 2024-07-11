package kata

class RomanNumerals {

    companion object {

        fun convert(number: Int): String {
            return when (number) {
                0 -> ""
                1 -> "I"
                2 -> "I" + convert(number - 1)
                3 -> "I" + convert(number - 1)
                4 -> "IV"
                5 -> "V"
                6 -> "V" + convert(number - 5)
                7 -> "V" + convert(number - 5)
                8 -> "V" + convert(number - 5)
                9 -> "IX"
                10 -> "X"
                11 -> "X" + convert(number - 10)
                12 -> "X" + convert(number - 10)
                13 -> "X" + convert(number - 10)
                14 -> "X" + convert(number - 10)
                15 -> "X" + convert(number - 10)
                16 -> "X" + convert(number - 10)
                17 -> "X" + convert(number - 10)
                18 -> "X" + convert(number - 10)
                19 -> "X" + convert(number - 10)
                20 -> "X" + convert(number - 10)
                21 -> "X" + convert(number - 10)
                22 -> "X" + convert(number - 10)
                23 -> "X" + convert(number - 10)
                24 -> "X" + convert(number - 10)
                25 -> "X" + convert(number - 10)
                26 -> "X" + convert(number - 10)
                in 27 .. 38 -> "X" + convert(number - 10)
                39 -> "XXXIX"
                in 40 .. 48 -> "XL" + convert(number - 40)
                else -> "IL"
            }
        }
    }
}
