package com.example.quranapp.presentation.news_home.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quranapp.presentation.news_home.NewsListViewModel

@Composable
fun NewsListHomeScreen(
    viewModel: NewsListViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)) {
            items(state.NewsList) {
                NewsListItem(newsData = it)
            }
        }
        LazyColumn(modifier = Modifier.wrapContentSize()){
            items(state.NewsList){
                NewsListColumn(newsData = it)
            }
        }
        if (state.isLoading){
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center), color = Color.Green)
        }
        if (state.error.isNotBlank()){
            Text(text = state.error, modifier = Modifier.align(Alignment.Center))
        }

    }


}