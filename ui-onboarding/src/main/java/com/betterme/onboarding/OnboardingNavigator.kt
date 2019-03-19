package com.betterme.onboarding

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.betterme.di.scope.FragmentScope
import javax.inject.Inject

@FragmentScope
class OnboardingNavigator @Inject constructor(
    private val fragment: Fragment
) {

    fun navigateToForMe() {
        NavHostFragment.findNavController(fragment).navigate(OnboardingFragmentDirections.showForMe())
    }
}