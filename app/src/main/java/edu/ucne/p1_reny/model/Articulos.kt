package edu.ucne.p1_reny.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulos")
data class Articulos(
    @PrimaryKey(autoGenerate = true)
    val ArticulosID: Int = 0,
    val Descripcion: String,
    val Marca: String,
    val Existencia: Double
)