package kata

import io.kotest.matchers.shouldBe
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
        ).map { (decimal, expected) ->
            dynamicTest("$decimal $expected") {
                RomanNumerals.convert(decimal) shouldBe expected
            }
        }
}
