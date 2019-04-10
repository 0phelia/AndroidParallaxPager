package com.example.arty.androidparallaxpager.model.champion

import android.support.annotation.StringRes
import com.example.arty.androidparallaxpager.R

enum class Type(@StringRes val nameRes: Int) {
    MAGE(R.string.class_name_mage),
    TANK(R.string.class_name_tank),
    FIGHTER(R.string.class_name_fighter),
    ASSASIN(R.string.class_name_assasin)
}