package xyz.arion2000.spigot;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.arion2000.spigot.commands.FlyCommand;
import xyz.arion2000.spigot.commands.GmCommand;
import xyz.arion2000.spigot.commands.HealCommand;
import xyz.arion2000.spigot.commands.TestCommand;
import xyz.arion2000.spigot.listeners.BlockListeners;
import xyz.arion2000.spigot.listeners.ConnectionListeners;

public final class Experimente extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("hallo").setExecutor(new TestCommand());
        getCommand("gm").setExecutor(new GmCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("heal").setExecutor(new HealCommand());

        final PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ConnectionListeners(), this);
        pluginManager.registerEvents(new BlockListeners(), this);
    }

    @Override
    public void onDisable() {
        // leer
    }
}
