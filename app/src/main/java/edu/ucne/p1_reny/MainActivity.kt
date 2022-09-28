package edu.ucne.p1_reny

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import edu.ucne.p1_reny.ui.ConsultaScreen
import edu.ucne.p1_reny.ui.RegistroScreen
import edu.ucne.p1_reny.ui.theme.P1RenyTheme
import edu.ucne.p1_reny.utils.Screen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P1RenyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Examen()
                }
            }
        }
    }
}

@Composable
fun Examen() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaScreen.route){
        composable(Screen.ConsultaScreen.route){
            ConsultaScreen(navHostController = navHostController)
        }
        composable(Screen.RegistroScreen.route){
            RegistroScreen(navHost = navHostController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    P1RenyTheme {
        Examen()
    }
}