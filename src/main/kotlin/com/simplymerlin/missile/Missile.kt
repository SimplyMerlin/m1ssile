package com.simplymerlin.missile

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin

class Missile : JavaPlugin(), Listener {

	override fun onEnable() {
		logger.info("Hello World!")
		Bukkit.getPluginManager().registerEvents(this, this)
	}

	@EventHandler
	fun onClick(event: PlayerInteractEvent) {
		if (event.action != Action.RIGHT_CLICK_BLOCK) return
		if (!event.action.isRightClick) return
		val point = event.clickedBlock?.location ?: return
		println("X: $point")
		point.add(event.blockFace.direction)
		println("A: $point")
		point.add(MissileType.RED_SHIELDBUSTER.offset)
		println("B: $point")
		point.block.type = Material.RED_WOOL
	}

}