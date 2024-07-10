package kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RomanNumeralsTest {

    @Test
    fun `should convert 1 to 'I'`() {
        RomanNumerals.convert(1) shouldBe "I"
    }

    @Test
    fun `should convert 2 to 'II'`() {
        RomanNumerals.convert(2) shouldBe "II"
    }
}
