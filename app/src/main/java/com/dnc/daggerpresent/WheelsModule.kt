package com.dnc.daggerpresent

import dagger.Module
import dagger.Provides

/**
 * DaggerPresent
 * WheelsModule
 */

@Module
class WheelsModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideRims() = Rims()

        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.infate()
            return tires
        }

        @JvmStatic
        @Provides
        fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
    }
}