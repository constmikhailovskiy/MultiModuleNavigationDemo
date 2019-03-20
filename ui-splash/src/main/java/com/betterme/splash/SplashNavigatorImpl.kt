package com.betterme.splash

import androidx.navigation.NavController
import com.betterme.di.scope.FragmentScope
import javax.inject.Inject

@FragmentScope
interface SplashNavigator {
    fun bindNavController(navController: NavController)
    fun unbindNavController()
    fun navigateToOnboarding()
}

class SplashNavigatorImpl @Inject constructor() : SplashNavigator {

    private var navController: NavController? = null

    override fun bindNavController(navController: NavController) {
        this.navController = navController
    }

    override fun unbindNavController() {
        this.navController = null
    }

    override fun navigateToOnboarding() {
        navController?.navigate(SplashFragmentDirections.showOnboarding())
    }
}