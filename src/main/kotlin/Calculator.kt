package org.example

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        if (num1 == 0 || num2 == 0) {
            throw IllegalArgumentException("Division by zero")
        }

        return num1 / num2
    }

}
