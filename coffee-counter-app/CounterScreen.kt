package com.example.coffeecounter

import androidx.compose.runtime.*

@Composable
fun CounterScreen() {

    var count by remember { mutableStateOf(0) }

    CounterUI(
        count = count,
        onIncrement = { count++ },
        onReset = { count = 0 }
    )
}