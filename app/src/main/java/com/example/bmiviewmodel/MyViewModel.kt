package com.example.bmiviewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var weight by mutableFloatStateOf(0f)
    var height by mutableFloatStateOf(0f)
    var bmi by mutableFloatStateOf(0f)

    fun calculateBMI() {
        bmi = if (weight > 0 && height > 0) {
            weight / (height * height)
        } else {
            0f
        }
    }
}
