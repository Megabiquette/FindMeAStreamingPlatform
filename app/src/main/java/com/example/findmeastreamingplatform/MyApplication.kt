package com.example.findmeastreamingplatform

import android.app.Application
import android.content.Context

class MyApplication : Application() {

    companion object {
        fun getComponent(context: Context): MainComponent {
            return (context.applicationContext as MyApplication).component
        }
    }

    private lateinit var component: MainComponent

    private fun inject() {
        component = DaggerMainComponent.builder().build()
        component.inject(this)
    }
}