package com.dnc.daggerpresent

import dagger.Component

/**
 * DaggerPresent
 * CarComponent
 */

@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}