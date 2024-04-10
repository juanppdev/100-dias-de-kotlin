package com.mundocode.jetpackcomposecatalogo

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun MyTextFieldAdvance() {

    var myText by remember { mutableStateOf("") }

    /*
        TextField(
        value = myText,
        onValueChange = { myText = it },
        label = { Text(text = "Introduce tu Nombre") })
    */

    TextField(
        value = myText,
        onValueChange = {
            myText =
                if (it.contains("a")) {
                    it.replace("a", "")
                } else {
                    it
                }
        },
        label = { Text(text = "Introduce tu Nombre") })

}