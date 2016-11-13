package io.lyonix.rankmissions;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class RankMissions extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }
}
