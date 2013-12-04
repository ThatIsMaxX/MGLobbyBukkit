package net.crededits.maxx.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerMoveEvent implements Listener{
	
	@EventHandler
	public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if(player.isFlying()) {
			
			
			
		}
	}
	
	

}
