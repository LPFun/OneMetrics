package com.aleksdark.myapplication

import android.app.Application
import com.aleksdark.onemetrics.OneMetrics

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        OneMetrics.init(this, "")
    }
}