package com.doge.myplugin.event;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label,String[] args){
        sender.sendMessage(ChatColor.YELLOW + "[doge]" + ChatColor.GREEN + "Hi");
        return false;
    }
}
