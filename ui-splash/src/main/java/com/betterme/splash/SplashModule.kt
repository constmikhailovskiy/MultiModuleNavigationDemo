package com.betterme.splash

import androidx.fragment.app.Fragment
import com.betterme.di.scope.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface SplashModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashBindModule::class])
    fun contributeSplashFragment(): SplashFragment
}

@Module
interface SplashBindModule {

    @Binds
    fun bindActivity(fragment: SplashFragment): Fragment
}
