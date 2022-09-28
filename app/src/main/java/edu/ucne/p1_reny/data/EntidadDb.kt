package edu.ucne.p1_reny.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.p1_reny.Entidad

@Database(
    entities = [
        Entidad :: class
    ],
    exportSchema = false,
    version = 1
)
abstract class EntidadDb : RoomDatabase (){
}