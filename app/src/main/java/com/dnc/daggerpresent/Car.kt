package com.dnc.daggerpresent

import android.util.Log
import javax.inject.Inject

/**
 * DaggerPresent
 * Car
 */
class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    companion object {
        private const val TAG = "DaggerCar"
    }

    fun drive() {
        Log.d(TAG, "I am driving")
    }

}