package com.example.findmeastreamingplatform.search.data

import com.example.findmeastreamingplatform.search.data.models.Suggestion

class SearchRepository {
    fun loadSuggestions(): List<Suggestion> {
        val suggestions: List<Suggestion> = listOf(
            Suggestion("1", "The Dark Knight", "", "Il fait peur.", 9.0),
            Suggestion("2", "Douze hommes en colère", "", "Ils sont pas contents.", 8.9),
            Suggestion("3", "Le Parrain", "", "Il parraine.",9.2),
            Suggestion("4", "Les Evadés", "", "Des évadés s'évadent.", 9.3),
            )
        return suggestions
    }
}