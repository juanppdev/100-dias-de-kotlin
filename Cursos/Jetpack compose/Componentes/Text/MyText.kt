package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Este es un ejemplo")
        Text(text = "Esto es un eejemplo", color = Color.Blue)
        Text(text = "Esto es un eejemplo", fontWeight = FontWeight.ExtraBold)
        Text(text = "Esto es un eejemplo", fontWeight = FontWeight.Light)
        Text(text = "Esto es un eejemplo", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(text = "Esto es un eejemplo", fontFamily = FontFamily.Cursive)
        Text(
            text = "Esto es un eejemplo",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(text = "Esto es un eejemplo", textDecoration = TextDecoration.LineThrough)
        Text(
            text = "Esto es un eejemplo",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "Esto es un eejemplo",
            style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.Underline,
                        TextDecoration.LineThrough
                    )
                )
            )
        )
        Text(text = "Este es un ejemplo", fontSize = 30.sp)
    }
}