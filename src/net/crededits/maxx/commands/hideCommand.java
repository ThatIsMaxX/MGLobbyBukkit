package net.crededits.maxx.commands;

import java.util.ArrayList;
import java.util.List;

import net.crededits.maxx.MGLobby;
import net.crededits.maxx.Methods;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hideCommand implements CommandExecutor  {

	public hideCommand(MGLobby plugin) {
	}
	   public List<String> invisible = new ArrayList<String>();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
	 
	    
		Player player =(Player)sender;
		
        if(invisible.contains(player.getName())){
		
        Methods.disableVanish(player);
        invisible.remove(player.getName());
		return true;
		
	} else {
		Methods.enableVanish(player);
	    invisible.add(player.getName());
		
		
	}
		return false;
	}

}
