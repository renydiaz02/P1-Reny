package edu.ucne.p1_reny.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Entidades")
data class Entidad(
    @PrimaryKey(autoGenerate = true)
    val idparcial: Int = 0,
    val primera: String,
    val segundo: String,
    val tercera: Double
)