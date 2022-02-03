package com.example.quranapp.presentation.news_home.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.quranapp.R
import com.example.quranapp.domain.model.NewsData

@Composable
fun NewsListItem(
    newsData: NewsData,
) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp), shape = RoundedCornerShape(20.dp)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = newsData.source.name)
            Text(text = newsData.publishedAt)
        }
        Spacer(modifier = Modifier.height(200.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), horizontalArrangement = Arrangement.Start) {
            Text(text = newsData.title,
                overflow = TextOverflow.Visible,
                style = MaterialTheme.typography.h3)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            IconButton(
                onClick = {
                    //Comment Icon
                },
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.comment),
                    contentDescription = "comment section"
                )
            }
            IconButton(
                onClick = {
                    //bookmark icon
                },
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = "Bookmark"
                )
            }
            Spacer(modifier = Modifier.width(50.dp))
            IconButton(
                onClick = {
                    //share icon
                },
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "share"
                )
            }

        }
    }
}
