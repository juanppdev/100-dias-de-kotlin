package com.mundocode.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mundocode.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyTextFieldOutline()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldOutline() {

    var myText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        modifier = Modifier.padding(24.dp),
        label = { Text(text = "Introduce tu Nombre") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Magenta,
            unfocusedBorderColor = Color.Blue
        )
    )

}

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

@Composable
fun MyTextField() {
    var myText by remember { mutableStateOf("") }
    TextField(value = myText, onValueChange = { myText = it })
}

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

@Composable
fun MyStateExample() {

    var counter by rememberSaveable { mutableStateOf(0) }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido puldado ${counter} veces")
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        MySpcer(size = 30)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun MySpcer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}

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

@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween
    ) {
        //Text(text = "Ejemplo 1", modifier = Modifier.background(Color.Red).weight(1f))
        //Text(text = "Ejemplo 1", modifier = Modifier.background(Color.Red))
        //Text(text = "Ejemplo 2", modifier = Modifier.background(Color.Black))
        //Text(text = "Ejemplo 3", modifier = Modifier.background(Color.Cyan))
        Text(
            text = "Ejemplo 4", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 4", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 4", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        // Con el wight te lo proporciona todo
    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = "Esto es un ejemplo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCatalogoTheme {
        MyTextFieldOutline()
    }
}