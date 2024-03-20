package com.mundocode.dragonball.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.mundocode.dragonball.models.DragonBallLista
import androidx.compose.material3.Card
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items

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
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Column {
            InicioImagen(imagen = personaje.image)
        }
    }
}

@Composable
fun InicioImagen(imagen: String) {
    val imagen = rememberAsyncImagePainter(model = imagen)
    Image(
        painter = imagen,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
    )
}