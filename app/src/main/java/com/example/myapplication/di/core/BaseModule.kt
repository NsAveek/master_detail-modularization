package com.personal.hilt.di.modules.core

import com.example.myapplication.api.NSDataService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.example.myapplication.data.NSDataRepository
import nbl.core.network.AveekServiceModule
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [DatabaseModule::class, AveekServiceModule::class])
object BaseModule {
   /* @Provides
    @Singleton
    fun provideCatsDataRepository(service: NSDataService,
                                  database: CatsDatabase) : NSDataRepository {
        return NSDataRepository(service, database)
    }*/
}