package com.mundocode.dragonball.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mundocode.dragonball.components.CardPersonaje
import com.mundocode.dragonball.components.MainTopBar
import com.mundocode.dragonball.viewmodels.DragonBallViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InicioView(
    navController: NavController,
    viewModel: DragonBallViewModel
) {
    Scaffold (
        topBar = {
            MainTopBar(titulo = "Api de Draggon Ball")
        }
    ) {
        ContenidoInicioView(
            navController = navController,
            viewModel = viewModel,
            pad = it
        )
    }
}

@Composable
fun ContenidoInicioView(
    navController: NavController,
    viewModel: DragonBallViewModel,
    pad: PaddingValues
) {
    val personajes by viewModel.personajes.collectAsState()

    LazyColumn(
        modifier = Modifier
            .padding(pad)
            .background(Color.Red)
    ) {
        items(personajes) {
            CardPersonaje(personaje = it) {  }
            Text(
                text = it.name,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 12.dp)
            )
        }
    }
}
