package org.example

import java.util.*

fun main(array: Array<String>) = with(Scanner(System.`in`)) {
    val calculator = Calculator()
    val num1: Int
    val num2: Int

    println("숫자 두개 입력하세요.")

    val inputNumber1 = InputNumber(nextLine())
    val inputNumber2 = InputNumber(nextLine())



    println("\n===결과===")
    println("$inputNumber1 + $inputNumber2 = ${calculator.add(inputNumber1, inputNumber2)}")
    println("$inputNumber1 - $inputNumber2 = ${calculator.minus(inputNumber1, inputNumber2)}")
}
