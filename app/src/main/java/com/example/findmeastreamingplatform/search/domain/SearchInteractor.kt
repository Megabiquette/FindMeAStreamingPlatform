package com.example.findmeastreamingplatform.search.domain

import com.example.findmeastreamingplatform.search.data.SearchRepository
import com.example.findmeastreamingplatform.search.data.models.Suggestion

class SearchInteractor(private val repository: SearchRepository) {
    fun loadSuggestions(): List<Suggestion> {
        val suggestions = repository.loadSuggestions()
        return suggestions.sortedBy { it.rating }
    }
}