package com.mundocode.jetpackcomposecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.mundocode.jetpackcomposecatalogo.model.Routes

@Composable
fun Screen1(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "Pantalla 1",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Pantalla2.route) })
    }
}

@Composable
fun Screen2(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(
            text = "Pantalla 2",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Pantalla3.route) })
    }
}

@Composable
fun Screen3(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {
        Text(
            text = "Pantalla 3",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Pantalla4.createRoute(25)) })
    }
}

@Composable
fun Screen4(navController: NavHostController, age: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(
            text = "Tengo $age años",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Pantalla5.createRoute("Juanppdev")) })
    }
}

@Composable
fun Screen5(navController: NavHostController, name: String?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(text = "Me llamo $name", modifier = Modifier.align(Alignment.Center))
    }
}