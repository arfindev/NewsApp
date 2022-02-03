package com.example.quranapp.data.remote

import com.example.quranapp.data.remote.dto.NewsDto
import retrofit2.http.GET

interface NewsApi {
    @GET("/everything?q=apple&from=2022-02-01&to=2022-02-01&sortBy=popularity&apiKey=435ef6b3a2f349d4a4539b5629374739")
    suspend fun getAppleNews():List<NewsDto>
}