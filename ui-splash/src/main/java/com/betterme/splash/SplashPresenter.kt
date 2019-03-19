package com.betterme.splash

import com.betterme.uicore.BasePresenter
import javax.inject.Inject

class SplashPresenter @Inject constructor(
    private val navigator: SplashNavigator
) : BasePresenter<SplashView>() {

    fun goToOnboarding() {
        navigator.navigateToOnboarding()
    }
}