package com.example.quranapp.presentation.news_home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
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
                painter = painterResource(id = R.drawable.forwardicon),
                contentDescription = "Get Latest News"
            )
        }
    }
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start) {
        Image(painter = rememberImagePainter(data = newsData.urlToImage),
            contentDescription = "Image Thumbnail",
            modifier = Modifier.clip(RoundedCornerShape(20.dp)))
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = newsData.source.name, style = MaterialTheme.typography.body1)

        }


    }

}