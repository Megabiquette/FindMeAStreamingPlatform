package com.example.findmeastreamingplatform

import com.example.findmeastreamingplatform.search.injection.SearchComponent
import com.example.findmeastreamingplatform.search.injection.SearchModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface MainComponent {
    fun inject(application: MyApplication)
    fun plus(searchModule: SearchModule): SearchComponent
}