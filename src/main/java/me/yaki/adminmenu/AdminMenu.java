package me.yaki.adminmenu;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminMenu extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("panel").setExecutor(new ISPOLNIZHELANIE());
        Bukkit.getPluginManager().registerEvents(new Event(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
