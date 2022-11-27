package com.dnc.daggerpresent.model

import android.util.Log
import javax.inject.Inject

/**
 * DaggerPresent
 * Car
 */
const val TAG = "DaggerCar"
class Car @Inject constructor(val wheels: Wheels, val engine: Engine, var carDriver: CarDriver) {

    fun drive() {
        engine.start()
        Log.d(TAG, "${carDriver} is driving $this")
    }

}