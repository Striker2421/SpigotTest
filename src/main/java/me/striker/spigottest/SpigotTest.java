package me.striker.spigottest;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotTest extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("#Blessed!!! Your plugin started");

    }

    @Override
    public void onDisable() {
        System.out.println("#Suffering :( Your plugin was disabled");
    }
}
