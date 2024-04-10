package com.mundocode.jetpackcomposecatalogo

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun MyTextFieldState(name: String, onValueChange: (String) -> Unit) {
    TextField(value = name, onValueChange = onValueChange)
}