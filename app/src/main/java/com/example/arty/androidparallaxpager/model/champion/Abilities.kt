package com.example.arty.androidparallaxpager.model.champion

import android.support.annotation.StringRes
import com.example.arty.androidparallaxpager.R

enum class Abilities(@StringRes val nameRes: Int)  {
    VASTAYAN_GRACE(R.string.vastayan_grace),  ORB_OF_DECEPTION(R.string.orb_of_deception), FOX_FIRE(R.string.fox_fire), CHARM(R.string.charm), SPIRIT_RUSH(R.string.spirit_rush),
    NOXIOUS_SLIPSTREAM(R.string.noxious_slipstream), POISON_TRAIL(R.string.poison_trail), MEGA_ADHESIVE(R.string.mega_adhesive), FLING(R.string.fling), INSANITY_POTION(R.string.insanity_potion),
    VOID_SHIFT(R.string.void_shift), CALL_OF_THE_VOID(R.string.call_of_the_void), VOID_SWARM(R.string.void_swarm), MALEFIC_VISIONS(R.string.malefic_visions), NETHER_GRASP(R.string.nether_grasp)
}