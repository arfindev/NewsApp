package com.example.quranapp.domain.use_case

import com.example.quranapp.common.Resource
import com.example.quranapp.data.remote.dto.toNewsData
import com.example.quranapp.domain.model.NewsData
import com.example.quranapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class NewsListUseCase @Inject constructor(private val repository: NewsRepository) {

    operator fun invoke(): Flow<Resource<List<NewsData>>> = flow {
        try {
            emit(Resource.Loading())
            val news = repository.getAllNews().map { it.toNewsData() }
            emit(Resource.Success<List<NewsData>>(news))
        } catch (e: HttpException) {
            emit(Resource.Error<List<NewsData>>(e.localizedMessage ?: "An unknown error occurred"))

        } catch (e: IOException) {
            emit(Resource.Error<List<NewsData>>("Could not reach the server. Check your internet connection"))

        }
    }

}