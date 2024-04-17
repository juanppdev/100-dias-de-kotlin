package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.TextButton
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun MyConfirmationDialog(
    show: Boolean,
    onDismiss: () -> Unit
) {
    if(show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                MyTitleDialog("Phone ringtone", modifier = Modifier.padding(24.dp))
                Divider(Modifier.fillMaxWidth(), 4.dp, Color.LightGray)
                var status by remember {
                    mutableStateOf("")
                }
                MyRadioButtonListWithState(status) { status = it }
                Divider(Modifier.fillMaxWidth(), 4.dp, Color.LightGray)
                Row(Modifier.align(Alignment.End).padding(8.dp)) {
                    TextButton(onClick = {  }) {
                        Text(text = "Cancel")
                    }
                    TextButton(onClick = {  }) {
                        Text(text = "Ok")
                    }
                }
            }
        }
    }
}