package com.example.feature.primary.master.di




import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.data.AveekCoreDataService
import com.example.feature.primary.master.ui.ImagesAdapter
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@InstallIn(ActivityRetainedComponent::class)
@Module
object HomeFragmentBaseModule {

    @Provides
    fun provideLogger (): ILogger = LoggerHomeFragment()

//    @Provides
//    fun provideConstants(): ConstantsClass {
//        return ConstantsClass()
//    }

    @Provides
    @ActivityRetainedScoped
    fun adapter () : ImagesAdapter{
        return ImagesAdapter()
    }

    @Provides
    @ActivityRetainedScoped
    fun appServiceProvider(retrofit: Retrofit): PixabayHomeDataService {
        return retrofit.create(PixabayHomeDataService::class.java)
    }

    // TODO : Get the instance from the network module

    @Provides
    @ActivityRetainedScoped
    fun provideRetrofitInstance(): Retrofit {
        val logger = HttpLoggingInterceptor()
        logger.level = HttpLoggingInterceptor.Level.BASIC

        val clientBuilder = OkHttpClient.Builder()
            .addInterceptor(logger)
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
//            .addInterceptor(TokenInterceptor(sharedPreferences))
            .build()
        val gson = GsonBuilder()
            .setLenient()
            .create()
        return Retrofit.Builder()
            .baseUrl(AveekCoreDataService.BASE_URL)
            .client(clientBuilder)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }
}