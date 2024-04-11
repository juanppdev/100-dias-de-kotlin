package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun OutlinedButton() {

    var enable by rememberSaveable { mutableStateOf(true) }

    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        OutlinedButton(
            onClick = { enable = false },
            enabled = enable,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta,
                contentColor = Color.Blue,
                disabledContainerColor = Color.Cyan,
                disabledContentColor = Color.Red
            )
            ) {
            Text(text = "Hola")
        }
    }
}