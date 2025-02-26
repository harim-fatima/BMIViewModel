package com.example.bmiviewmodel

import androidx.compose.runtime.*

class MyViewModel {
    var bmi by mutableStateOf(0)

    fun calculateBMI(weight: Int, height: Int) {
        bmi = weight / (height * height)
    }

}