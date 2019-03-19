package com.betterme.navigationdemo.di

import com.betterme.navigationdemo.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class, ActivityModule::class, AndroidSupportInjectionModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun appModule(appModule: AppModule): Builder

        fun build(): AppComponent
    }

    override fun inject(application: App)
}