package com.doge.myplugin.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        String player = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.GREEN + "欢迎" + player + "加入服务器!");
    }
}
