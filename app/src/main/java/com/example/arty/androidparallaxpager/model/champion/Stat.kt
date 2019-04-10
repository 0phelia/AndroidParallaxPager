package com.example.arty.androidparallaxpager.model.champion

sealed class Stat(val name: String, val startValue: Float, val incPerLevel: Float) {
    class Mana(startValue: Float, incPerLevel: Float): Stat("Mana", startValue, incPerLevel)
    class Armor(startValue: Float, incPerLevel: Float): Stat("Armor", startValue, incPerLevel)
    class AttackSpeed(startValue: Float, incPerLevel: Float): Stat("Attack Speed", startValue, incPerLevel)
    class AttackDamage(startValue: Float, incPerLevel: Float): Stat("Attack Damage", startValue, incPerLevel)
}