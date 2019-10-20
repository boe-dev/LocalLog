package dev.boe.locallog

import android.app.Application
import dev.five_star.localloglibrary.LocalLog
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(LocalLog(filesDir))
    }

}