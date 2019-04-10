package com.example.arty.androidparallaxpager

import com.example.arty.androidparallaxpager.model.champion.*

object ChampionFactory {

    fun getCharacters(): List<Champion> {
        return listOf(getAhri(), getSinged(), getMalzahar())
    }

    private fun getAhri(): Champion {
        return Champion("Ahri",
                Assets(R.drawable.back_ahri, R.drawable.over_ahri, 0xFFA41151.toInt()),
                listOf(Type.MAGE),
                listOf(Abilities.VASTAYAN_GRACE, Abilities.ORB_OF_DECEPTION, Abilities.FOX_FIRE, Abilities.CHARM, Abilities.SPIRIT_RUSH),
                listOf(Stat.Mana(334f, 45f),
                        Stat.Armor(20.88f, 3.5f),
                        Stat.AttackSpeed(0.668f, 2f),
                        Stat.AttackDamage(53.04f, 3f))
        )
    }

    private fun getSinged(): Champion {
        return Champion("Singed",
                Assets(R.drawable.back_singed, R.drawable.over_singed, 0xFF389B44.toInt()),
                listOf(Type.MAGE, Type.FIGHTER),
                listOf(Abilities.NOXIOUS_SLIPSTREAM, Abilities.POISON_TRAIL, Abilities.MEGA_ADHESIVE, Abilities.FLING, Abilities.INSANITY_POTION),
                listOf(Stat.Mana(21f, 12f),
                        Stat.Armor(21f, 12f),
                        Stat.AttackSpeed(21f, 12f),
                        Stat.AttackDamage(21f, 12f))
        )
    }

    private fun getMalzahar(): Champion {
        return Champion("Malzahar",
                Assets(R.drawable.back_malzahar, R.drawable.over_malzahar, 0xFF5637E0.toInt()),
                listOf(Type.ASSASIN, Type.MAGE),
                listOf(Abilities.VOID_SHIFT, Abilities.CALL_OF_THE_VOID, Abilities.VOID_SWARM, Abilities.MALEFIC_VISIONS, Abilities.NETHER_GRASP),
                listOf(Stat.Mana(21f, 12f),
                        Stat.Armor(21f, 12f),
                        Stat.AttackSpeed(21f, 12f),
                        Stat.AttackDamage(21f, 12f))
        )
    }

}