package com.example.quranapp.presentation.news_home

import com.example.quranapp.domain.model.NewsData

data class NewsState(
    val isLoading: Boolean = false,
    val error: String = "",
    val NewsList: List<NewsData> = emptyList(),
)
