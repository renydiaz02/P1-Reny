package edu.ucne.p1_reny.data

import edu.ucne.p1_reny.data.dao.ArticulosDao
import edu.ucne.p1_reny.model.Articulos
import kotlinx.coroutines.flow.Flow


import javax.inject.Inject


class ArticulosRepository @Inject constructor(
     val articulosDao: ArticulosDao
){
    suspend fun insertar(articulos: Articulos){
        articulosDao.insertar(articulos = articulos)
    }

    suspend fun eliminar(articulos: Articulos){
        articulosDao.eliminar(articulos = articulos)
    }

    suspend fun buscar(articulosid: Int): Flow<Articulos> {
        return articulosDao.buscar(articulosid)
    }
     fun getList() : Flow<List<Articulos>>  {
         return articulosDao.getlist()
     }

}