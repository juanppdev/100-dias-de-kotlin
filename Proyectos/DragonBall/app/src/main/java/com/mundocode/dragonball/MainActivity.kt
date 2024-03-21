package com.mundocode.dragonball

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mundocode.dragonball.navigation.NavManager
import com.mundocode.dragonball.ui.theme.DragonBallTheme
import com.mundocode.dragonball.viewmodels.DragonBallCharactersViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: DragonBallCharactersViewModel by viewModels()

        setContent {
            DragonBallTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Aqui empieza el contenido
                    NavManager(viewModel = viewModel)
                }
            }
        }
    }
}

