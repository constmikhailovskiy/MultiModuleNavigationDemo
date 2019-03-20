package com.betterme.splash

import com.betterme.di.scope.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
interface SplashModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashDependenciesModule::class])
    fun contributeSplashFragment(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashDependenciesModule::class])
    fun contributeNewSplashFragment(): NewSplashFragment
}

@Module
class SplashDependenciesModule {

    @Provides
    @FragmentScope
    fun provideSplashNavigator(): SplashNavigator = SplashNavigatorImpl()
}