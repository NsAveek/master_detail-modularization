package com.example.feature.primary.master.di

import android.content.Context
import aveek.core.network.INetworkModuleDependencies
import com.example.feature.primary.master.HomeFragment
import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.data.PixabayHomeRepository
import dagger.BindsInstance
import dagger.Component

/*
* In order to use DI in Feature Module, we can not use Hilt for the time being. Use Dagger instead
*
 */
/*
@Component(dependencies = [INetworkModuleDependencies::class], modules = [HomeFragmentRepositoryModule::class, HomeFragmentBaseModule::class])
interface HomeFragmentComponent {

    fun inject(fragment : HomeFragment)

    @Component.Builder
    interface Builder{
        fun context(@BindsInstance context : Context) : Builder
        fun appDependencies(homeModuleDependencies : INetworkModuleDependencies)
        fun build() : HomeFragmentComponent
    }
}*/
