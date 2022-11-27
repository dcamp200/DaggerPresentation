package com.dnc.daggerpresent

import dagger.Binds
import dagger.Module

/**
 * DaggerPresent
 * EngineModule
 */

@Module
abstract class EngineModule {

    @Binds
    abstract fun bindsEngine(engine: EVEngine): Engine

}