package com.example.bin2dec

import kotlin.math.pow

fun main(args: Array<String>) {
    val number: String = if(args.isEmpty()){
        readLine().toString()
    } else args[0]

    val indexFail = number.indexOfFirst { char -> char != '1' && char != '0' }
    if(indexFail > -1) {
        println("\"${number[indexFail]}\" is not a valid digit")
        return
    }

    println(binaryToDecimal(number))

}


fun binaryToDecimal(binaryNumber: String): Int {
    var decimalNumber = 0

    for((index, char) in binaryNumber.reversed().withIndex()) {
        decimalNumber += (2.toDouble().pow(index.toDouble()) * Character.getNumericValue(char)).toInt()
    }
    return decimalNumber
}