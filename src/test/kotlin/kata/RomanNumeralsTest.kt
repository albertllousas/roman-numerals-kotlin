package kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class RomanNumeralsTest {

    @TestFactory
    fun `should convert decimals to roman numerals`() =
        listOf(
            Pair(1, "I"),
            Pair(2, "II"),
            Pair(3, "III"),
            Pair(4, "IV"),
            Pair(5, "V"),
            Pair(6, "VI"),
            Pair(7, "VII"),
            Pair(8, "VIII"),
            Pair(9, "IX"),
            Pair(10, "X"),
            Pair(11, "XI"),
            Pair(14, "XIV"),
            Pair(15, "XV"),
            Pair(19, "XIX"),
            Pair(20, "XX"),
            Pair(37, "XXXVII"),
            Pair(39, "XXXIX"),
            Pair(40, "XL"),
            Pair(41, "XLI"),
            Pair(49, "IL"),
        ).map { (decimal, expected) ->
            dynamicTest("$decimal $expected") {
                RomanNumerals.convert(decimal) shouldBe expected
            }
        }


    @Disabled
    @TestFactory
    fun `should convert roman numerals to decimals`() =
        listOf(
            Pair("I", 1),
//            Pair("II", 2),
//            Pair("III", 3),
//            Pair("IV", 4),
//            Pair("V", 5),
//            Pair("VI", 6),
//            Pair("VII", 7),
//            Pair("VIII", 8),
//            Pair("IX", 9),
//            Pair( "X", 10),
//            Pair( "XI", 11),
//            Pair( "XIV", 14),
//            Pair( "XV", 15),
//            Pair( "XIX", 19),
//            Pair( "XX", 20),
//            Pair( "XXXVII", 37),
//            Pair( "XXXIX", 39),
//            Pair( "XL", 40),
//            Pair( "XLI", 41),
//            Pair( "IL", 49),
        ).map { (romanNumeral, expected) ->
            dynamicTest("$romanNumeral $expected") {
                RomanNumerals.convert(romanNumeral) shouldBe expected
            }
        }
}
