import org.example.InputNumber
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

internal class InputNumberTest {

    @ValueSource(strings = ["asd", "sdf3", "$$$"])
    @ParameterizedTest
    @DisplayName("입력값 숫자가 아닐 경우 에러 발생")
    fun validateNumber(input: String) {

        val exception = assertThrows<IllegalArgumentException> { InputNumber(input) }

        assertEquals("[ERROR] 숫자만 입력해주세요.", exception.message)
    }
}
