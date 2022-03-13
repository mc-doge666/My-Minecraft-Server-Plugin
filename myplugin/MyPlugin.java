package com.doge.myplugin;

import com.doge.myplugin.event.ChatEvent;
import com.doge.myplugin.event.PlayerJoin;
import com.doge.myplugin.event.command;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        System.out.println("[doge]插件已加载");
        getCommand("nick").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        System.out.println("[doge]插件已卸载");
    }
}
