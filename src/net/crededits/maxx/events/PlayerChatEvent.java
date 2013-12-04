package net.crededits.maxx.events;

import net.crededits.maxx.MGLobby;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerChatEvent implements Listener{
	private static MGLobby plugin;
	public PlayerChatEvent(MGLobby instance) {
        this.plugin = instance;
    }
	
	@EventHandler
	public void onPlayerChat(org.bukkit.event.player.AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
    	String msg = event.getMessage();
        if(player.hasPermission("MGLobby.premium")) {
        	event.setFormat(ChatColor.AQUA + "[Premium]" + ChatColor.GOLD + player.getName() + msg );
        } else if(player.hasPermission("MGLobby.youtuber")) {
        	event.setFormat(ChatColor.DARK_PURPLE + "[Youtuber]" + ChatColor.GOLD + player.getName() + msg );	
        } else if(player.hasPermission("MGLobby.staff") || player.isOp()) {
        	event.setFormat(ChatColor.RED + "[Staff]" + ChatColor.GOLD + player.getName() + msg );	
        } else if(plugin.getConfig().getBoolean("Config.ShowDevelopers")) {
        	String name = player.getName();
        	if(name == "atur0057" ||name == "blueshadow1998") {
            	event.setFormat(ChatColor.DARK_GREEN + "[Developer]" + ChatColor.GOLD + player.getName() + msg );	

        	}
        }
	}
	
	

}
