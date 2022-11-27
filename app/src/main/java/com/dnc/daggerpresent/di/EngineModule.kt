package com.dnc.daggerpresent.di

import com.dnc.daggerpresent.model.EVEngine
import com.dnc.daggerpresent.model.Engine
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