package net.crededits.maxx.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerDropEvent implements Listener{
	
	@EventHandler
	public void onPlayerMove(org.bukkit.event.player.PlayerDropItemEvent event) {
		Player player = event.getPlayer();
		if(player.hasPermission("MGLobby.dropItem")) {
			event.setCancelled(false);
		} else {
			event.setCancelled(true);
		}
	}
	
	

}
