package com.example.quranapp.data.remote

import com.example.quranapp.common.Constant.API_KEY
import com.example.quranapp.data.remote.dto.NewsDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("/v2/everything")
    suspend fun getAppleNews(
        @Query("q")
        getAppleNews: String = "apple",
        @Query("apiKey")
        apiKey: String = API_KEY,
    ): List<NewsDto>
}