package com.betterme.onboarding

import androidx.navigation.fragment.NavHostFragment
import javax.inject.Inject

class OnboardingNavigator @Inject constructor(private val fragment: OnboardingFragment) {

    fun navigateToForMe() {
        NavHostFragment.findNavController(fragment).navigate(OnboardingFragmentDirections.showForMe())
    }
}