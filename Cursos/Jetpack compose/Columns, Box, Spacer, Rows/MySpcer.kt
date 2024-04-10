package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySpcer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}