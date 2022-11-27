package com.dnc.daggerpresent

import android.util.Log
import javax.inject.Inject

/**
 * DaggerPresent
 * ICEEngine
 * TODO: Add a class comment
 *
 */
class ICEEngine @Inject constructor(): Engine {
    override fun start() {
        Log.d(TAG, "ICE Engine started.")
    }
}