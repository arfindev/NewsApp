package com.example.quranapp.data.remote.dto


import com.example.quranapp.domain.model.NewsData
import com.google.gson.annotations.SerializedName

data class NewsDto(
    @SerializedName("author")
    val author: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("source")
    val source: Source,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlToImage")
    val urlToImage: String,
)

fun NewsDto.toNewsData(): NewsData {
    return NewsData(
        author = author,
        content = content,
        publishedAt = publishedAt,
        source = source,
        urlToImage = urlToImage,
        title = title
    )
}