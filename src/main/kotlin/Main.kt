package org.example

import java.util.*

fun main(array: Array<String>) = with(Scanner(System.`in`)) {
    val calculator = Calculator()

    println("숫자 두개 입력하세요.")
    val num1 = nextInt()
    val num2 = nextInt()

    println("\n===결과===")
    println("$num1 + $num2 = ${calculator.add(num1, num2)}")
    println("$num1 - $num2 = ${calculator.minus(num1, num2)}")
}
