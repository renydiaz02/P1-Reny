package edu.ucne.p1_reny.data

import edu.ucne.p1_reny.data.dao.ArticulosDao
import edu.ucne.p1_reny.model.Articulos
import kotlinx.coroutines.flow.Flow


import javax.inject.Inject


class ArticulosRepository @Inject constructor(
     val db: EntidadDb
){
    suspend fun insertar(articulos: Articulos){
       db. articulosDao.insertar(articulos = articulos)
    }

    suspend fun eliminar(articulos: Articulos){
        db.articulosDao.eliminar(articulos = articulos)
    }

    suspend fun buscar(articulosid: Int): Flow<Articulos> {
        return db.articulosDao.buscar(articulosid)
    }
     fun getList() : Flow<List<Articulos>>  {
         return db.articulosDao.getlist()
     }

}