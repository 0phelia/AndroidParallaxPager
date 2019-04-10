package com.example.arty.androidparallaxpager

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.support.constraint.ConstraintSet
import android.support.transition.AutoTransition
import android.support.transition.TransitionManager
import android.widget.FrameLayout
import android.widget.ImageButton
import com.example.arty.androidparallaxpager.databinding.ItemPageBinding
import com.example.arty.androidparallaxpager.databinding.ItemPropBinding
import com.example.arty.androidparallaxpager.model.champion.Champion

class PageAdapter(val characterData: List<Champion>) : PagerAdapter() {

    var setCollapsed =  ConstraintSet()
    var setExpanded =  ConstraintSet()

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun getCount(): Int = characterData.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = ItemPageBinding.inflate(LayoutInflater.from(container.context), container, false)

        bindView(binding, characterData[position])
        populateStats(binding, characterData[position], container.context)
        setupTransitionAnimation(binding.constraintLayout, binding.bgCard, binding.btnClose)

        container.addView(binding.root)
        return binding.root
    }

    private fun setupTransitionAnimation(constraintLayout: ConstraintLayout, bgCard: FrameLayout, btnClose: ImageButton) {

        val transition = AutoTransition().apply {
            duration = 250
            ordering = AutoTransition.ORDERING_TOGETHER
        }

        setCollapsed.clone(constraintLayout)
        setExpanded.clone(constraintLayout.context, R.layout.item_page_expanded)

        bgCard.setOnClickListener {
            TransitionManager.beginDelayedTransition(constraintLayout, transition)
            setExpanded.applyTo(constraintLayout)
        }

        btnClose.setOnClickListener {
            TransitionManager.beginDelayedTransition(constraintLayout, transition)
            setCollapsed.applyTo(constraintLayout)
        }
    }

    private fun populateStats(binding: ItemPageBinding, character: Champion, context: Context) {
        character.stats.forEach { stat ->
            val prop = ItemPropBinding.inflate(LayoutInflater.from(context))
            prop.stat = stat
            binding.perksContainer.addView(prop.root)
        }
    }

    private fun bindView(binding: ItemPageBinding, char: Champion) {
        binding.apply {
            character = char
            bgCard.clipToOutline = true
        }
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}