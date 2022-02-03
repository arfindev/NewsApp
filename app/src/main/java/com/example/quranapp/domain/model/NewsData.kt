package com.example.quranapp.domain.model

import com.example.quranapp.data.remote.dto.Source

data class NewsData(
    val author: String,
    val content: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val urlToImage: String,
)
