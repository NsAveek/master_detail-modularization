package com.example.myapplication.di.viewmodelmodule

import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.api.NSDataService
import com.personal.hilt.di.modules.core.BaseModule.provideCatsDataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideViewModelFactory(service: NSDataService,
                                database: CatsDatabase
    ) : ViewModelProvider.Factory{
        return ViewModelFactory(provideCatsDataRepository(service,database))
    }
}