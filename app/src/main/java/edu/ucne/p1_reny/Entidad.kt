package edu.ucne.p1_reny

import androidx.room.Entity

@Entity(tableName = "Entidades")
data class Entidad(
    val idparcial: Int = 0,
    val primera: String,
    val segundo: String,
    val tercera: Double
)