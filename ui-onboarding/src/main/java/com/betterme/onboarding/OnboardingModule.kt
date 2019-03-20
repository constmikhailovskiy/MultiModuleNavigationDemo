package com.betterme.onboarding

import androidx.fragment.app.Fragment
import com.betterme.di.scope.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface OnboardingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [OnboardingBindModule::class])
    fun contributeOnboardingFragment(): OnboardingFragment
}

@Module
abstract class OnboardingBindModule {

    @Binds
    abstract fun bindOnboardingFragment(onboardingFragment: OnboardingFragment): Fragment
}
