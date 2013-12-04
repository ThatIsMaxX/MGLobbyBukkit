package net.crededits.maxx.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerBucketEvent implements Listener{
	
	@EventHandler
	public void onPlayerMove(org.bukkit.event.player.PlayerBucketFillEvent event) {
		Player player = event.getPlayer();
			if(!player.hasPermission("MGLobby.bucket")){
				event.setCancelled(true);
		} else if (player.hasPermission("MGLobby.bucket")){
			event.setCancelled(false);
		}
	}
	
	

}
