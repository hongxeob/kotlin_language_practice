package org.example.variable

class VariableSample {

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {
            val name = "String"
            val org = "Hongseob"
            var age = 12
            val isTrue: Boolean = false

            age = 15

            println("name = $name")
            println("org = $org")
            println("age = $age")
            println("isTrue = $isTrue")
            println("isTrue= $isTrue")

            val msgType = 1
            val msg = if (msgType == 1) "안녕" else "잘가"
            println("msg = $msg")

            val inputType = 2
            val msgType2 = "2"

            fun checkType(type: Int) = if (type == 1) 1 else -1

            when (inputType) {
                1 -> println("1")
                2, 3 -> println("2 Or 3")
                else -> println("not")
            }

            when (inputType) {
                checkType(inputType) -> println("OK")
                else -> println("Not Ok")
            }



        }
    }
}
