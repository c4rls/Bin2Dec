package com.example.bin2dec

import kotlin.math.pow


fun binaryToDecimal(binaryNumber: String): Int {
    var decimalNumber = 0

    for((index, char) in binaryNumber.reversed().withIndex()) {
        decimalNumber += (2.toDouble().pow(index.toDouble()) * Character.getNumericValue(char)).toInt()
    }
    return decimalNumber
}

fun validateInput(binaryNumber: String): Char? {
    val indexFail = binaryNumber.indexOfFirst { char -> char != '1' && char != '0' }
    if(indexFail > -1) return binaryNumber[indexFail]

    return null
}