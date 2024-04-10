package org.example

class Calculator {

    fun add(inputNumber1: InputNumber, inputNumber2: InputNumber): Int {
        return inputNumber1.num + inputNumber2.num
    }

    fun minus(inputNumber1: InputNumber, inputNumber2: InputNumber): Int {
        return inputNumber1.num - inputNumber2.num
    }

    fun multiply(inputNumber1: InputNumber, inputNumber2: InputNumber): Int {
        return inputNumber1.num * inputNumber2.num
    }

    fun divide(inputNumber1: InputNumber, inputNumber2: InputNumber): Int {
        if (inputNumber1.num == 0 || inputNumber2.num == 0) {
            throw IllegalArgumentException("Division by zero")
        }

        return inputNumber1.num / inputNumber2.num
    }

}
