package com.example.bmiviewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var bmi by mutableStateOf(0)

    fun calculateBMI(weight: Int, height: Int) {
        bmi = weight / (height * height)
    }

}