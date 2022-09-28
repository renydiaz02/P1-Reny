package edu.ucne.p1_reny.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.p1_reny.model.Articulos

@Database(
    entities = [
        Articulos :: class
    ],
    exportSchema = false,
    version = 2
)
abstract class EntidadDb : RoomDatabase (){
}