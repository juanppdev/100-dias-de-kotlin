package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyRadioButtonList() {
    var selected by remember {
        mutableStateOf("Juan")
    }

    Column(Modifier.fillMaxWidth()) {
        Row() {
            RadioButton(selected = selected == "Juan", onClick = { selected = "Juan" })
            Text(text = "Juan")
        }
        Row() {
            RadioButton(selected = selected == "David", onClick = { selected = "David" })
            Text(text = "David")
        }
        Row() {
            RadioButton(selected = selected == "Pepe", onClick = { selected = "Pepe" })
            Text(text = "Pepe")
        }
        Row() {
            RadioButton(selected = selected == "Laura", onClick = { selected = "Laura" })
            Text(text = "Laura")
        }
    }
}

@Composable
fun MyRadioButtonListWithState(name: String, OnItemSelected: (String) -> Unit) {

    /* Este selected se pone en el MainActivity
     var selected by remember {
        mutableStateOf("Juan")
    }
    */

    Column(Modifier.fillMaxWidth()) {
        Row() {
            RadioButton(selected = name == "Juan", onClick = { OnItemSelected("Juan") })
            Text(text = "Juan")
        }
        Row() {
            RadioButton(selected = name == "David", onClick = { OnItemSelected("David") })
            Text(text = "David")
        }
        Row() {
            RadioButton(selected = name == "Pepe", onClick = { OnItemSelected("Pepe") })
            Text(text = "Pepe")
        }
        Row() {
            RadioButton(selected = name == "Laura", onClick = { OnItemSelected("Laura") })
            Text(text = "Laura")
        }
    }
}