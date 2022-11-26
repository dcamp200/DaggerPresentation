package com.dnc.daggerpresent

import dagger.Component

/**
 * DaggerPresent
 * CarComponent
 * TODO: Add a class comment
 *
 */

@Component
interface CarComponent {

    fun getCar(): Car
}