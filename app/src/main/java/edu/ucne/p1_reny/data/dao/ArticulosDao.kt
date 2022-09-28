package edu.ucne.p1_reny.data.dao

import androidx.room.*
import edu.ucne.p1_reny.model.Articulos
import kotlinx.coroutines.flow.Flow


@Dao
interface ArticulosDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertar(articulos: Articulos)

    @Delete
    suspend fun  eliminar(articulos: Articulos)

    @Query("SELECT * FROM Articulos WHERE ArticulosID = ArticulosID")
    fun buscar (articulos : Int): Flow <Articulos>

    @Query("SELECT * FROM Articulos ORDER BY ArticulosID = ArticulosID")
    fun getlist():Flow <List<Articulos>>

}