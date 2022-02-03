package com.example.quranapp.presentation.news_home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.quranapp.R
import com.example.quranapp.domain.model.NewsData

@Composable
fun NewsListColumn(
    newsData: NewsData,
) {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Latest News", style = MaterialTheme.typography.body1)
        IconButton(
            onClick = {
                //To Get Latest News
            },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_24),
                contentDescription = "Get Latest News"
            )
        }


    }

}