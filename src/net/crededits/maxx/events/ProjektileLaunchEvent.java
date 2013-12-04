package net.crededits.maxx.events;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ProjektileLaunchEvent implements Listener{
	
	@EventHandler
	public void onProjektLaunch(ProjectileLaunchEvent event) {
		Projectile projectile = event.getEntity();
	
		if(projectile instanceof EnderPearl) {
			event.setCancelled(true);
		} else if(projectile instanceof EnderSignal);
        event.setCancelled(true);
	}
	

}
