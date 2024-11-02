package winlyps.immediateRespawn

import org.bukkit.plugin.java.JavaPlugin

class ImmediateRespawn : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doImmediateRespawn", "true")
        }
        logger.info("ImmediateRespawn plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doImmediateRespawn", "false")
            logger.info("ImmediateRespawn plugin has been disabled.")
        }
    }
}