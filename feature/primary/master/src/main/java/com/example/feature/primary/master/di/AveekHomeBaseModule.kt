package com.example.feature.primary.master.di

import aveek.core.network.ConstantsClass
import com.example.feature.primary.master.api.PixabayHomeDataService
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
    fun appServiceProvider(retrofit: Retrofit): PixabayHomeDataService {
        return retrofit.create(PixabayHomeDataService::class.java)
    }
}