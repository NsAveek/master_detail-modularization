package com.example.feature.primary.master.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

//    @Provides
//    @ViewModelScoped
//    fun provideViewModelFactory(service: PixabayHomeDataService, dataSource: AveekHomeDataSource
//    ) : ViewModelProvider.Factory{
//        return ViewModelFactory(provideHomeDataRepository(service,dataSource))
//    }
}