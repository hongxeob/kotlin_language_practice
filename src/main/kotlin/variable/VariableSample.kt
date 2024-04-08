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
        }
    }
}
