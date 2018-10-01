package com.example.arty.androidparallaxpager.model

data class Character(val title: String,
                     val backgroundRes: Int,
                     val characterRes: Int,
                     val primaryColor: Int,
                     val classes: List<String>,
                     val stats: List<Stat> = listOf())