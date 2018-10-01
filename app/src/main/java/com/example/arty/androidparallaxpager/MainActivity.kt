package com.example.arty.androidparallaxpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.example.arty.androidparallaxpager.model.Character
import com.example.arty.androidparallaxpager.model.Stat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.vp_characters)

        val pagerAdapter = PageAdapter(getCharData())
        val pageTransformer = PageTransformer(viewPager, pagerAdapter)
        //pageTransformer.enableScaling(true)

        viewPager.adapter = pagerAdapter
        viewPager.setPageTransformer(false, pageTransformer)
        viewPager.offscreenPageLimit = 3
    }

    private fun getCharData(): List<Character> {
        return listOf(
                Character("Ahri",
                        R.drawable.back_ahri,
                        R.drawable.over_ahri,
                        0xFFA41151.toInt(),
                        listOf("Mage"),
                        stats = listOf(Stat("Abilities", "Vastayan Grace, Orb of Deception, Fox-Fire, Charm, Spirit Rush"),
                                Stat("Mana", "334 (+45 per level)"),
                                Stat("Armor", "20.88 (+3.5 per level)"),
                                Stat("Attack Speed", "0.668 (+2% per level)"),
                                Stat("Attack Damage", "53.04 (+3 per level)")
                        )
                ),

                Character("Singed",
                        R.drawable.back_singed,
                        R.drawable.over_singed,
                        0xFF389B44.toInt(),
                        listOf("Tank", "Fighter"),
                        stats = listOf(Stat("Abilities", "Noxious Slipstream, Poison Trail, Mega Adhesive, Fling, Insanity Potion"),
                                Stat("Mana", "334 (+45 per level)"),
                                Stat("Armor", "37 (+3.5 per level)"),
                                Stat("Attack Speed", "0.613 (+1.81% per level)"),
                                Stat("Attack Damage", "62.32 (+3.375 per level)")
                        )
                ),

                Character("Malzahar",
                        R.drawable.back_malzahar,
                        R.drawable.over_malzahar,
                        0xFF5637E0.toInt(),
                        listOf("Assassin", "Mage"),
                        stats = listOf(Stat("Abilities", "Void Shift, Call of the Void, Void Swarm, Malefic Visions, Nether Grasp"),
                                Stat("Mana", "334 (+45 per level)"),
                                Stat("Armor", "18 (+3.5 per level)"),
                                Stat("Attack Speed", "0.625 (+1.5% per level)"),
                                Stat("Attack Damage", "55 (+3 per level)")
                        )
                )
        )
    }
}
