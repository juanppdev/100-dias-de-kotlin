package com.mundocode.dragonball.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Card
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mundocode.dragonball.models.DragonBallLista

@ExperimentalMaterial3Api
@Composable
fun MainTopBar(
    titulo: String
) {
    TopAppBar(
        title = {
            Text(
                text = titulo,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Black
        )
    )
}

@Composable
fun CardPersonaje(
    personaje: DragonBallLista,
    onClick: () -> Unit
) {
    Card (
        colors = CardDefaults.cardColors(Color.Transparent),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, color = Color.Black),
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Column {
            InicioImagen(imagen = personaje.image, personaje.name)
        }
    }
}

@Composable
fun InicioImagen(imagen: String, texto: String) {
    val imagen = rememberAsyncImagePainter(model = imagen)

    Image(
        painter = imagen,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .width(300.dp)
            .height(550.dp)

    )
    Text(
        text = texto,
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.End,
        color = Color.Black
    )
}