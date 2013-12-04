package net.crededits.maxx.commands;

import java.io.IOException;

import net.crededits.maxx.MGLobby;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.ibex.nestedvm.util.Seekable.File;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class premiumCommand implements CommandExecutor, Listener  {
	private static MGLobby plugin;
	public premiumCommand(MGLobby instance) {
        this.plugin = instance;
    }

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if(sender.isOp()){
			Player player =(Player)sender;
	    if(args.length == 0) {
	    	player.playSound(player.getLocation(), Sound.FIZZ, 1, 0);
	    	player.sendMessage(ChatColor.GRAY + "[" + ChatColor.AQUA + "MGLobby" + ChatColor.GRAY + "]" + ChatColor.RED + "Please do /premium <name>");
	    } else if (args.length == 1) {
	    	
	    }
	    
			    
		
		

	
		}
		return true;
	
	}
	
			
	
}