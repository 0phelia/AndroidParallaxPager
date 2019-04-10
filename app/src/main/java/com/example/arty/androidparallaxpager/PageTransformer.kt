package com.example.arty.androidparallaxpager

import android.animation.ArgbEvaluator
import android.databinding.DataBindingUtil
import android.support.v4.view.ViewPager
import android.view.View
import com.example.arty.androidparallaxpager.databinding.ItemPageBinding

class PageTransformer(private val viewPager: ViewPager, private val cardAdapter: PageAdapter) :
        ViewPager.OnPageChangeListener,
        ViewPager.PageTransformer {

    private val argbEvaluator = ArgbEvaluator()

    init {
        viewPager.addOnPageChangeListener(this)
    }

    override fun transformPage(page: View, position: Float) {
        if (-1f < position && position < 1f) {
            val shiftSmall = position * viewPager.width / 3
            val shiftModerate = position * viewPager.width

            DataBindingUtil.getBinding<ItemPageBinding>(page)?.apply {
                tvCharacterName.translationX = shiftSmall
                perksContainer.translationX = shiftSmall
                tvCharacterClass.translationX = shiftSmall
                ivOverhangingChar.translationX = shiftModerate
            }
        }
    }

    override fun onPageScrolled(pos: Int, positionOffset: Float, positionOffsetPixels: Int) {
        cardAdapter.characterData.let {
            if (pos < it.size - 1) {
                val col1 = it[pos].assets.primaryColor
                val col2 = it[pos + 1].assets.primaryColor
                val color = argbEvaluator.evaluate(positionOffset, col1, col2) as Int
                viewPager.setBackgroundColor(color)
            }
        }
    }

    override fun onPageSelected(position: Int) {
        // do nothing
    }

    override fun onPageScrollStateChanged(state: Int) {
        // do nothing
    }
}