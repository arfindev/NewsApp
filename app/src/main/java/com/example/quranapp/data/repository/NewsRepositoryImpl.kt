package com.example.quranapp.data.repository

import com.example.quranapp.data.remote.NewsApi
import com.example.quranapp.data.remote.dto.NewsDto
import com.example.quranapp.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val api: NewsApi,

    ) : NewsRepository {
    override suspend fun getAllNews(): List<NewsDto> {
       return api.getAppleNews()
    }
}