package com.example.feature.primary.master.di.modules

import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.data.AveekHomeDataSource
import com.example.feature.primary.master.data.PixabayHomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(FragmentComponent::class)
@Module
object HomeFragmentRepositoryModule {
    @Provides
    @FragmentScoped
    fun provideHomeDataSource(
        service: PixabayHomeDataService
    ): AveekHomeDataSource {
        return AveekHomeDataSource(service)
    }

    @Provides
    @FragmentScoped
    fun provideHomeDataRepository(
        service: PixabayHomeDataService,
        dataSource: AveekHomeDataSource
    ): PixabayHomeRepository {
        return PixabayHomeRepository(service,dataSource)
    }
}