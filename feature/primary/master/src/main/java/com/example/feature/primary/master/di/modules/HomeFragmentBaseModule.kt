package com.example.feature.primary.master.di.modules




import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.di.ILogger
import com.example.feature.primary.master.di.LoggerHomeFragment
import com.example.feature.primary.master.ui.ImagesAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import retrofit2.Retrofit

@InstallIn(ActivityRetainedComponent::class)
@Module
class HomeFragmentBaseModule{

    @Provides
    @ActivityRetainedScoped
    fun provideLogger(): ILogger = LoggerHomeFragment()

//    @Provides
//    fun provideConstants(): ConstantsClass {
//        return ConstantsClass()
//    }

    @Provides
    @ActivityRetainedScoped
    fun adapter(): ImagesAdapter {
        return ImagesAdapter()
    }

    @Provides
    @ActivityRetainedScoped
    fun appServiceProvider(retrofit: Retrofit): PixabayHomeDataService {
        return retrofit.create(PixabayHomeDataService::class.java)
    }

    // TODO : Get the instance from the network module

}