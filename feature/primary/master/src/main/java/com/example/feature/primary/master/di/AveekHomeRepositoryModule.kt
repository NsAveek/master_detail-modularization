package com.example.feature.primary.master.di

import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.data.AveekHomeDataSource
import com.example.feature.primary.master.data.PixabayHomeRepository
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
        service: PixabayHomeDataService
    ): AveekHomeDataSource {
        return AveekHomeDataSource(service)
    }

    @Provides
    @ViewModelScoped
    fun provideHomeDataRepository(
        service: PixabayHomeDataService,
        dataSource: AveekHomeDataSource
    ): PixabayHomeRepository {
        return PixabayHomeRepository(service,dataSource)
    }
}