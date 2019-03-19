package com.betterme.onboarding

import com.betterme.uicore.BasePresenter
import javax.inject.Inject

class OnboardingPresenter @Inject constructor(
    private val navigator: OnboardingNavigator
) : BasePresenter<OnboardingView>() {

    fun goToForMe() {
        navigator.navigateToForMe()
    }
}
