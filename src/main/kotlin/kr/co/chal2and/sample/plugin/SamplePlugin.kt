package kr.co.chal2and.sample.plugin

import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin :JavaPlugin() {
    override fun onEnable() {
        logger.info("Blue Marble Game to start!" + ChatColor.AQUA)
    }

    override fun onDisable() {
        logger.info("Blue Marble Game to stop!" + ChatColor.AQUA)
    }
}