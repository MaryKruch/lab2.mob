fun main() {
    val k = 1000000 // Установить значение k
    findArmstrongNumbers(k)
}

fun findArmstrongNumbers(k: Int) {
    for (i in 1..k) {
        if (isArmstrongNumber(i)) {
            println(i)
        }
    }
}

fun isArmstrongNumber(number: Int): Boolean {
    var originalNumber = number
    var sum = 0
    val digits = number.toString().length

    while (originalNumber != 0) {
        val digit = originalNumber % 10
        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt()
        originalNumber /= 10
    }

    return sum == number
}