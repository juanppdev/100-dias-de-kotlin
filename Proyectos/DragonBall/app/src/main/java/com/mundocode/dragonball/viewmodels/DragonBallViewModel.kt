package com.mundocode.dragonball.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mundocode.dragonball.models.DragonBallLista
import com.mundocode.dragonball.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DragonBallViewModel: ViewModel() {

    private val _Personajes = MutableStateFlow<List<DragonBallLista>>(emptyList())
    val personajes = _Personajes.asStateFlow()

    init {
        obtenerPersonajes()
    }

    private fun obtenerPersonajes() {
        viewModelScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main) {
                val response = RetrofitClient.retrofit.obtenerPersonajes()
                _Personajes.value = response.body()?.ListItems ?: emptyList()
            }
        }
    }

}