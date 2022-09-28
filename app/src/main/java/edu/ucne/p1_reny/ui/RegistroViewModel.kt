package edu.ucne.p1_reny.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistroViewModel @Inject constructor(

): ViewModel()
{
    //ESTO SIRVE PARA PODER COMUNICARTE CON LA VENTANA
    val nombre by mutableStateOf("")
    var primera by mutableStateOf("")
    var segunda by mutableStateOf("")
    var tercera by mutableStateOf(0.0)

    /*val registros by repository.getList()
    private set*/

    fun Guardar(){
        viewModelScope.launch {
            //repositorio.Insertar(ENTRAR TODOS LOS DATOS EN CONSTRUCTOR NUEVO)
        }
    }

}

