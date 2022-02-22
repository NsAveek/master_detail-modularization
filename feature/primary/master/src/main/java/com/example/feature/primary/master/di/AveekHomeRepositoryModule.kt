package com.example.feature.primary.master.di

import com.example.feature.primary.master.api.AveekHomeDataService
import com.example.feature.primary.master.data.AveekHomeDataSource
import com.example.feature.primary.master.data.AveekHomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
object AveekHomeRepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideHomeDataSource(
        service: AveekHomeDataService
    ): AveekHomeDataSource {
        return AveekHomeDataSource(service)
    }

    @Provides
    @ViewModelScoped
    fun provideHomeDataRepository(
        dataSource: AveekHomeDataSource
    ): AveekHomeRepository {
        return AveekHomeRepository(dataSource)
    }
}