package com.betterme.splash

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_splash.*
import javax.inject.Inject

class SplashFragment : Fragment(), SplashView {

    @Inject
    lateinit var presenter: SplashPresenter
    @Inject
    lateinit var navigator: SplashNavigator

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigator.bindNavController(findNavController(view))

        presenter.bind(this)

        btnNext.setOnClickListener {
            presenter.goToOnboarding()
        }
    }

    override fun onDestroyView() {
        presenter.unbind()
        navigator.unbindNavController()

        super.onDestroyView()
    }
}