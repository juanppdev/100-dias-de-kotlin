package com.mundocode.dragonball.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.mundocode.dragonball.components.CardPersonaje
import com.mundocode.dragonball.components.MainTopBar
import com.mundocode.dragonball.viewmodels.DragonBallCharactersViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InicioView(
    navController: NavController,
    viewModel: DragonBallCharactersViewModel
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

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ContenidoInicioView(
    navController: NavController,
    viewModel: DragonBallCharactersViewModel,
    pad: PaddingValues
) {
    val personajes by viewModel.personajes.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(pad)
            .background(Color.Red)
    )  {
        item{
            HorizontalPager(
                count = personajes.size,
                state = rememberPagerState(),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) { page ->
                CardPersonaje(personaje = personajes[page]) {
                    // Acción al hacer clic en el personaje
                }
            }
        }
    }
}