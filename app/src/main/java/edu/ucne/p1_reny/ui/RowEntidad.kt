package edu.ucne.p1_reny.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import edu.ucne.p1_reny.model.Entidad

@Composable
fun RowEntidad(
    entidad: Entidad
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth().height(30.dp).padding(2.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = entidad.primera)
            Text(text = entidad.segundo.toString(),
                style = MaterialTheme.typography.h5
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(text = entidad.tercera.toString(),
                style = MaterialTheme.typography.caption
            )
        }
    }
}