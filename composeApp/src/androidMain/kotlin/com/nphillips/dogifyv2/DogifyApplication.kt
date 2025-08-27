package com.nphillips.dogifyv2

import android.app.Application
import com.nphillips.dogifyv2.di.initKoin

class DogifyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}