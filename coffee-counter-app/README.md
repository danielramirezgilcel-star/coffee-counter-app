# Coffee Counter App

## Descripción
Aplicación desarrollada en Kotlin utilizando Jetpack Compose que permite llevar un conteo de tazas de café consumidas.

## Funcionalidad
- Contador que inicia en 0
- Botón "Añadir taza" que incrementa el contador
- Botón "Reiniciar" que regresa el contador a 0
- Mensaje de advertencia al alcanzar o superar 10 tazas:
  **"¡Demasiada cafeína!"** (mostrado en color rojo)

## Conceptos aplicados
- State en Compose (`mutableStateOf`)
- `remember` para persistencia de estado
- State Hoisting (separación de lógica y UI)
- Composables reutilizables
- Condicionales en Kotlin

## Estructura del código
- `MainActivity.kt` → Punto de entrada de la aplicación
- `CounterScreen.kt` → Manejo del estado (State Hoisting)
- `CounterUI.kt` → Interfaz de usuario (sin estado)

## Tecnologías utilizadas
- Kotlin
- Jetpack Compose

## Nota
Este repositorio contiene únicamente el código fuente principal de la aplicación, enfocado en la implementación de la interfaz y la lógica solicitada.