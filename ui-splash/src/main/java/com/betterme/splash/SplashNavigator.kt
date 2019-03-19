package com.betterme.splash

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.betterme.di.scope.FragmentScope
import javax.inject.Inject

@FragmentScope
class SplashNavigator @Inject constructor(
    private val fragment: Fragment
) {

    fun navigateToOnboarding() {
        NavHostFragment.findNavController(fragment).navigate(SplashFragmentDirections.showOnboarding())
    }
}