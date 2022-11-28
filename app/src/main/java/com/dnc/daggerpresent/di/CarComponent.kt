package com.dnc.daggerpresent.di

import com.dnc.daggerpresent.MainActivity
import com.dnc.daggerpresent.model.Car
import dagger.Component
import javax.inject.Singleton

/**
 * DaggerPresent
 * CarComponent
 */

@Singleton
@Component(modules = [WheelsModule::class, EngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)
}