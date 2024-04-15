package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyDivider() {
    Divider(Modifier.fillMaxWidth().padding(16.dp), color = Color.Red)
}