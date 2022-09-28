package edu.ucne.p1_reny.utils

sealed class Screen (val route :String){
    object RegistroScreen : Screen("Registro")
    object ConsultaScreen : Screen("Consulta")
}