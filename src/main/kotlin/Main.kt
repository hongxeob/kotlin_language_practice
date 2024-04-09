package org.example

import java.util.*

fun main(array: Array<String>) = with(Scanner(System.`in`)) {
    val calculator = Calculator()
    val num1: Int
    val num2: Int

    println("숫자 두개 입력하세요.")

    try {
        num1 = nextInt()
        num2 = nextInt()
    } catch (e: InputMismatchException) {
        println("[ERROR] 타입 에러 = $e")
        return
    }

    println("\n===결과===")
    println("$num1 + $num2 = ${calculator.add(num1, num2)}")
    println("$num1 - $num2 = ${calculator.minus(num1, num2)}")
}
