package com.example.findmeastreamingplatform.search.injection

import androidx.lifecycle.ViewModelProvider
import com.example.findmeastreamingplatform.ViewModelFactory
import com.example.findmeastreamingplatform.search.data.SearchRepository
import com.example.findmeastreamingplatform.search.domain.SearchInteractor
import com.example.findmeastreamingplatform.search.view.MainActivity
import com.example.findmeastreamingplatform.search.view.SearchViewModel
import dagger.Module
import dagger.Provides

@Module
class SearchModule(private val activity: MainActivity) {

    @Provides
    fun provideViewModel(interactor: SearchInteractor): SearchViewModel {
        val factory = ViewModelFactory {
            SearchViewModel(interactor)
        }
        return ViewModelProvider(activity, factory)[SearchViewModel::class.java]
    }

    @Provides
    fun provideInteractor(repository: SearchRepository): SearchInteractor {
        return SearchInteractor(repository)
    }

    @Provides
    fun provideRepository(): SearchRepository {
        return SearchRepository()
    }

}