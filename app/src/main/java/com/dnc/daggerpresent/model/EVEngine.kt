package com.dnc.daggerpresent.model

import android.util.Log
import javax.inject.Inject

/**
 * DaggerPresent
 * EVEngine
 * TODO: Add a class comment
 *
 */
class EVEngine @Inject constructor(): Engine {
    override fun start() {
        Log.d(TAG,"EVEngine started.")
    }
}