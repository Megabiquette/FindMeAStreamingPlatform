package com.example.findmeastreamingplatform.search.injection

import com.example.findmeastreamingplatform.search.view.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [SearchModule::class])
interface SearchComponent {
    fun inject(mainActivity: MainActivity)
}