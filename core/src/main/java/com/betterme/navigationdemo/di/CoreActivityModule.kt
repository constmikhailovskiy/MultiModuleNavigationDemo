package com.betterme.navigationdemo.di

import com.betterme.di.scope.ActivityScope
import com.betterme.navigationdemo.MainActivity
import com.betterme.onboarding.OnboardingModule
import com.betterme.splash.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface CoreActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SplashModule::class, OnboardingModule::class])
    fun contributeMainActivity(): MainActivity
}