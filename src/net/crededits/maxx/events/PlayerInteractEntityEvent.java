package net.crededits.maxx.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerInteractEntityEvent implements Listener{

	
	
	@EventHandler
    public void onPlayerInteractEnity(org.bukkit.event.player.PlayerInteractEntityEvent event)
    {
    	Player player = event.getPlayer();
    	Entity ent = event.getRightClicked();

        if(ent instanceof Player){
        	
        	player.setPassenger(ent);
        }


    }




}
