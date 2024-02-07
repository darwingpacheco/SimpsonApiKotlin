package com.example.simpsonapi.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simpsonapi.models.Personaje

class MainViewModel: ViewModel() {

    private var listaPersonajes = MutableLiveData<List<Personaje>>()
    val listaPersonajes: LiveData<List<Personaje>>() get() = listaPersonajes

}