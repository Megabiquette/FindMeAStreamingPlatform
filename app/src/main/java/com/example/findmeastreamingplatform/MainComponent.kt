package com.example.findmeastreamingplatform

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface MainComponent {
    fun inject(application: MyApplication)
}