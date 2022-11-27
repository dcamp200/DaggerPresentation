package com.dnc.daggerpresent

import android.app.Application
import com.dnc.daggerpresent.di.CarComponent
import com.dnc.daggerpresent.di.DaggerCarComponent

/**
 * DaggerPresent
 * Dagger2CarApplication
 */
class Dagger2CarApplication: Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()

        carComponent = DaggerCarComponent.create()
    }
}