package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyRow() {
    //Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
    //    Text(text = "Ejemplo 1")
    //    Text(text = "Ejemplo 2")
    //    Text(text = "Ejemplo 3")
    //}
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        //Text(text = "Ejemplo 1", modifier = Modifier.weight(1f))
        //Text(text = "Ejemplo 2", modifier = Modifier.weight(1f))
        //Text(text = "Ejemplo 3", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo 3", modifier = Modifier.width(100.dp))
    }
}