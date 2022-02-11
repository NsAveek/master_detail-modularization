package com.example.myapplication.di.module

import aveek.core.network.ConstantsClass
import com.example.myapplication.api.AveekHomeDataService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import retrofit2.Retrofit

@InstallIn(ActivityRetainedComponent::class)
@Module
object AveekHomeBaseModule {
    @Provides
    fun provideConstants(): ConstantsClass {
        return ConstantsClass()
    }
    @Provides
    @ActivityRetainedScoped
    fun appServiceProvider(retrofit: Retrofit): AveekHomeDataService {
        return retrofit.create(AveekHomeDataService::class.java)
    }
}