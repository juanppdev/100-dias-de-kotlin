package com.mundocode.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mundocode.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MySuperText("")
                }
            }
        }
    }
}

@Preview(
    name = "Preview 1",
    //heightDp = 50,
    //widthDp = 200,
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MyTextSuperText() {
    MySuperText("Juanppdev")
}


@Composable
fun MySuperText(name: String) {
    Text(
        text = "Esto es un ejemplo. ${name}",
        modifier = Modifier
            //.height(50.dp)
            //.width(200.dp)
            //.fillMaxHeight()
            //.fillMaxWidth()
            .fillMaxSize() // Contien ambos Height y Width
            .padding(20.dp)
            // Padding tiene: Start, Top, End, Bottom
            .clickable{}
    )
}