package com.example.quranapp.domain.model

import com.example.quranapp.data.remote.dto.Source
import com.google.gson.annotations.SerializedName

data class NewsData(
    @SerializedName("author")
    val author: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("source")
    val source: Source,
    @SerializedName("title")
    val title: String,
    @SerializedName("urlToImage")
    val urlToImage: String,
)
