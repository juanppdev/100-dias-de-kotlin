package com.mundocode.dragonball.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mundocode.dragonball.viewmodels.DragonBallCharactersViewModel
import com.mundocode.dragonball.views.InicioView

@Composable
fun NavManager(viewModel: DragonBallCharactersViewModel) {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = "Inicio"
    ) {
        composable("Inicio") {
            InicioView(navController, viewModel)
        }
    }
}