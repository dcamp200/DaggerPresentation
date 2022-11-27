package com.dnc.daggerpresent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dnc.daggerpresent.di.DaggerCarComponent
import com.dnc.daggerpresent.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.create().inject(this)

        car1.drive()
        car2.drive()
    }
}