package com.dnc.daggerpresent

import dagger.Component

/**
 * DaggerPresent
 * CarComponent
 */

@Component(modules = [WheelsModule::class, EngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}