package com.example.quranapp.domain.repository

import com.example.quranapp.data.remote.dto.NewsDto

interface NewsRepository {
    suspend fun getAllNews(): List<NewsDto>
}