package net.crededits.maxx.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EntityDamageEvent implements Listener{
	
	@EventHandler
	public void onEntityDamage(org.bukkit.event.entity.EntityDamageEvent event) {
		event.setCancelled(true);
        
	}
	
	

}
