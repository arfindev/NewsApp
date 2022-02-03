package com.example.quranapp.presentation.news_home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.quranapp.common.Resource
import com.example.quranapp.domain.use_case.NewsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsListViewModel @Inject constructor(
    private val useCase: NewsListUseCase,
) : ViewModel() {
    private val _state = mutableStateOf(NewsState())
    val state: State<NewsState> = _state

    fun getAllNewsList() {
        useCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = NewsState(NewsList = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = NewsState(error = result.message ?: "An unknown error occurred")
                }
                is Resource.Loading -> {
                    _state.value = NewsState(isLoading = true)
                }
            }

        }
    }


}