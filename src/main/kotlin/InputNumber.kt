package org.example

class InputNumber(input: String) {
    val num: Int

    init {
        try {
            this.num = input.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("[ERROR] 숫자만 입력해주세요.")
        }
    }
}
