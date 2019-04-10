package com.example.arty.androidparallaxpager.bindings

import android.databinding.BindingAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.arty.androidparallaxpager.R
import com.example.arty.androidparallaxpager.model.champion.Champion
import com.example.arty.androidparallaxpager.model.champion.Stat
import java.text.DecimalFormat

@BindingAdapter("charClass")
fun setCharClass(textView: TextView, char: Champion?) {
    char?.types?.let { classes ->
        val res = classes.map { next -> textView.context.getString(next.nameRes) }
        textView.text = res.joinToString(", ")
    }
}

@BindingAdapter("charBackground")
fun setCharBackground(imageView: ImageView, char: Champion?) {
    char?.assets?.let { assets ->
        imageView.setImageResource(assets.backgroundRes)
    }
}

@BindingAdapter("charOverlay")
fun setCharOverlay(imageView: ImageView, char: Champion?) {
    char?.assets?.let { assets ->
        imageView.setImageResource(assets.characterRes)
    }
}

@BindingAdapter("statName")
fun setStatName(textView: TextView, stat: Stat?) {
    stat?.name?.let { name ->
        textView.text = name
    }
}

@BindingAdapter("statValue")
fun setStatValue(textView: TextView, stat: Stat?) {
    stat?.let { stat ->
        val startValue = DecimalFormat("#.##").format(stat.startValue)
        val incPerLevelValue = DecimalFormat("#.##").format(stat.incPerLevel)
        textView.text = textView.context.getString(R.string.stat_description, startValue, incPerLevelValue)
    }
}