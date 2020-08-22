package core

import java.lang.IllegalArgumentException

class RomanNumber {

    companion object {
        fun parse(value: String): Int {
            var sum = 0
            var prev = 0
            value.toLowerCase().toCharArray().forEach {
                val actual = toInteger(it)
                sum += if (actual > prev) -prev else prev
                prev = actual
            }
            return sum + prev
        }

        private fun toInteger(singleValue: Char): Int =
                when (singleValue) {
                    'i' -> 1
                    'v' -> 5
                    'x' -> 10
                    'l' -> 50
                    'c' -> 100
                    'd' -> 500
                    'm' -> 1000
                    else -> throw IllegalArgumentException()
                }
    }
}