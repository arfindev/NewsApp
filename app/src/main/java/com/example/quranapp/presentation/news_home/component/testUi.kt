package com.example.quranapp.presentation.news_home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quranapp.domain.model.NewsData
import com.example.quranapp.presentation.news_home.NewsListViewModel

@Composable
fun TestUi(
    newsData: NewsData
) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = newsData.title)
    }
    
}

@Composable
fun TestApp(
    viewModel: NewsListViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    
    LazyColumn{
        items(state.NewsList){
            TestUi(newsData = it)
        }
    }
    
    
}