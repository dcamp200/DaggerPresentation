package com.dnc.daggerpresent

import android.util.Log
import javax.inject.Inject

/**
 * DaggerPresent
 * Car
 */
const val TAG = "DaggerCar"
class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {


    fun drive() {
        Log.d(TAG, "I am driving")
    }

}