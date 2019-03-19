package com.betterme.navigationdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = NavHostFragment.findNavController(mainNavigationFragment)
        NavigationUI.setupWithNavController(nav_view, navController)
        navController.addOnDestinationChangedListener(navListener)
    }

    override fun onDestroy() {
        navController.removeOnDestinationChangedListener(navListener)
        super.onDestroy()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingAndroidInjector

    private val navListener = NavController.OnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.fragmentForMe, R.id.fragmentFood -> {
                    nav_view.visibility = View.VISIBLE
                }
                else -> nav_view.visibility = View.GONE
            }
        }
}
