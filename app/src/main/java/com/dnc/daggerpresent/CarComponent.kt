package com.dnc.daggerpresent

import dagger.Component

/**
 * DaggerPresent
 * CarComponent
 */

@Component
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}