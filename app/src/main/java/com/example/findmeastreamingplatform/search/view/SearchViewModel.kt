package com.example.findmeastreamingplatform.search.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.findmeastreamingplatform.search.domain.SearchInteractor
import com.example.findmeastreamingplatform.search.view.models.SuggestionDisplayModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchViewModel(interactor: SearchInteractor) : ViewModel() {
    private val suggestionList = MutableLiveData<List<SuggestionDisplayModel>>()
    init {
        viewModelScope.launch(Dispatchers.IO){
            val suggestionResult = interactor.loadSuggestions()
            suggestionList.postValue(
                suggestionResult.map {
                    SuggestionDisplayModel(it.title, it.image, it.summary, it.rating.toString())
                }
            )
        }
    }

}