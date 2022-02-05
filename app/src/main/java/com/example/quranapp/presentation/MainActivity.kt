package com.example.quranapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.quranapp.presentation.news_home.component.NewsListHomeScreen
import com.example.quranapp.presentation.news_home.component.TestApp
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           NewsListHomeScreen()
        }
    }
}


