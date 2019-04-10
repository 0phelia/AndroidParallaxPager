package com.example.arty.androidparallaxpager.model.champion

data class Champion(val name: String,
                    val assets: Assets,
                    val types: List<Type>,
                    val abilities: List<Abilities>,
                    val stats: List<Stat> = listOf())