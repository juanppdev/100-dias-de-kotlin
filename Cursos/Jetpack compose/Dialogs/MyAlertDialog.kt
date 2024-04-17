package com.mundocode.jetpackcomposecatalogo

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun MyAlertDialog(
    show: Boolean,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if(show) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            title = { Text(text = "Titulo") },
            text = { Text(text = "Hola, Soy una descripcion") },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "ConfirmButton")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "DismissButton")
                }
            }
        )
    }
}