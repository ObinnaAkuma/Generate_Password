package com.example.generatepassword

import java.lang.StringBuilder

class GeneratePassword {
    private val lowercase = "abcdefghijklmnopgrstuvwxyz"
    private val uppercase = lowercase.uppercase()
    private val digits = "0123456789"
    private val symbols = "~!@#$%^&*()_+|,.;'"
    private val characters = "$lowercase$uppercase$digits$symbols"


    fun generatePass(length: Int): String{
        val sb = StringBuilder(length)
        for(x in 0 until length){
            val random = (characters.indices).random()
            sb.append(characters[random])
        }
        return sb.toString()
    }
}