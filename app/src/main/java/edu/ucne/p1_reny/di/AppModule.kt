package edu.ucne.p1_reny.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.p1_reny.data.ArticulosRepository
import edu.ucne.p1_reny.data.EntidadDb
import edu.ucne.p1_reny.data.dao.ArticulosDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun ProvidesEntidadDb(@ApplicationContext context: Context):EntidadDb{
        val DATABASE_NAME = "EntidadDb"
        return Room.databaseBuilder(
            context,
            EntidadDb::class.java,
            DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

}