package com.simplymerlin.missile

import org.bukkit.Material
import org.bukkit.util.Vector

enum class MissileType(val offset: Vector, val material: Material) {

    RED_GUARDIAN(Vector(-2f, -5.5f, 4f), Material.GUARDIAN_SPAWN_EGG),
    RED_LIGHTNING(Vector(-0.5f, -6f, 5f), Material.OCELOT_SPAWN_EGG),
    RED_JUGGERNAUT(Vector(-0.5f, -6.5f, 4f), Material.GHAST_SPAWN_EGG),
    RED_SHIELDBUSTER(Vector(-0.5f, -6.5f, 4f), Material.WITCH_SPAWN_EGG),
    RED_TOMAHAWK(Vector(0f, -6f, 4f), Material.CREEPER_SPAWN_EGG),

    GREEN_GUARDIAN(Vector(-1f, -5.5f, -11f), Material.GUARDIAN_SPAWN_EGG),
    GREEN_LIGHTNING(Vector(-0.5f, -6f, -13f), Material.OCELOT_SPAWN_EGG),
    GREEN_JUGGERNAUT(Vector(-0.5f, -6.5f, -14f), Material.GHAST_SPAWN_EGG),
    GREEN_SHIELDBUSTER(Vector(-0.5f, -6.5f, -18f), Material.WITCH_SPAWN_EGG),
    GREEN_TOMAHAWK(Vector(0f, -6f, -16f), Material.CREEPER_SPAWN_EGG),

}