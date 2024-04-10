import org.example.Calculator
import org.example.InputNumber
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

@DisplayName("계산기 기능 테스트")
internal class CalculatorTest {

    @DisplayName("더하기")
    @ParameterizedTest
    @CsvSource("1:2:3", "56:27:83", delimiter = ':')
    fun addTest(num1: String, num2: String, expected: Int) {

        val calculator = Calculator()

        val actual = calculator.add(InputNumber(num1), InputNumber(num2))

        assertEquals(expected, actual)
    }

    @DisplayName("빼기")
    @ParameterizedTest
    @CsvSource("3:2:1", "83:27:56", delimiter = ':')
    fun minusTest(num1: String, num2: String, expected: Int) {
        val calculator = Calculator()

        val actual = calculator.minus(InputNumber(num1), InputNumber(num2))

        assertEquals(expected, actual)

    }
}
