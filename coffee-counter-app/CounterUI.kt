package com.example.coffeecounter

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterUI(
    count: Int,
    onIncrement: () -> Unit,
    onReset: () -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Tazas: $count",
            fontSize = 26.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row {

            Button(onClick = onIncrement) {
                Text("Añadir taza ☕")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = onReset) {
                Text("Reiniciar")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (count >= 10) {
            Text(
                text = "¡Demasiada cafeína!",
                color = Color.Red,
                fontSize = 18.sp
            )
        }
    }
}