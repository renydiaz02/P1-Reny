package edu.ucne.p1_reny.ui

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrokenImage
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.twotone.Save
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.p1_reny.utils.isNumeric

@Composable
fun RegistroScreen(
    viewModel : RegistroViewModel = hiltViewModel(),
    navHost: NavHostController
) {

    var primeraError by remember {
        mutableStateOf(false)
    }

    var segundoError by remember {
        mutableStateOf(false)
    }
    var terceraError by remember {
        mutableStateOf(false)
    }

    val contexto = LocalContext.current


    Scaffold(
        topBar= {
            TopAppBar(
                title = {
                    Text(
                        text = "Registro de Entidades"
                    )
                }
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    primeraError = viewModel.primera.isBlank()
                    segundoError = viewModel.segunda.isBlank()
                    terceraError = viewModel.tercera.equals("0.0")

                    if(!primeraError && !segundoError && !terceraError){
                        if(isNumeric(viewModel.tercera.toString()) == false){
                            Toast.makeText(contexto, "Digite el monto de manera correcta", Toast.LENGTH_LONG).show();
                        }
                        else if(viewModel.tercera.toFloat() > 0){
                            viewModel.Guardar()
                            Toast.makeText(contexto, "La entidad se guardó correctamente", Toast.LENGTH_LONG).show()
                            navHost.navigateUp()
                        }else{
                            Toast.makeText(contexto, "El monto no puede ser menor o igual a cero", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            )
            {
                Icon(imageVector = Icons.TwoTone.Save, contentDescription = null)
            }
        }

    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            OutlinedTextField(
                value = viewModel.primera,
                onValueChange = {viewModel.primera = it},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Primera")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.BrokenImage,
                        contentDescription = null)
                },
                isError = primeraError
            )
            ValidacionText(estado = primeraError)

            Spacer(modifier = Modifier.height(40.dp))

            OutlinedTextField(
                value = viewModel.segunda,
                onValueChange = {viewModel.segunda = it},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Segunda")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null)
                },
                isError = segundoError
            )

            ValidacionText(estado = segundoError)
            Spacer(modifier = Modifier.height(40.dp))
            OutlinedTextField(
                value = viewModel.tercera.toString(),
                onValueChange = {viewModel.tercera = it.toDouble()},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Monto")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null)
                },
                isError = terceraError,
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    keyboardType = KeyboardType.Number
                )
            )

            ValidacionText(estado = terceraError)
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}