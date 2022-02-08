package com.personal.hilt.di.modules.core

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {
    @Provides
    @Singleton
    fun provideCatsDao( database : CatsDatabase) : CatsDao{
        return database.catsDao()
    }
    @Provides
    @Singleton
    fun provideRemoteKeysDao(database : CatsDatabase) : RemoteKeysDao{
        return database.remoteKeysDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext : Context) : CatsDatabase{
        return Room.databaseBuilder(appContext.applicationContext,
            CatsDatabase::class.java, "cats.com.example.myapplication.db")
            .fallbackToDestructiveMigration() // so that we do not need to change the com.example.myapplication.db version
            .build()
    }
}