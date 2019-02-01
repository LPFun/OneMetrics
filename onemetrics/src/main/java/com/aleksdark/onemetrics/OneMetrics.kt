package com.aleksdark.onemetrics

import android.app.Application
import android.content.Context
import com.onesignal.OneSignal
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig

class OneMetrics {
    companion object {
        fun init(app : Application, API_KEY: String){
            initMetrics(API_KEY, app)
            initOneSignal(app.applicationContext)
        }

        private fun initOneSignal(context: Context){
            OneSignal.startInit(context)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        }

        private fun initMetrics(API_KEY: String, app: Application) {
            val config = YandexMetricaConfig.newConfigBuilder(API_KEY).build()
            YandexMetrica.activate(app.applicationContext, config)
            YandexMetrica.enableActivityAutoTracking(app)
        }
    }
}