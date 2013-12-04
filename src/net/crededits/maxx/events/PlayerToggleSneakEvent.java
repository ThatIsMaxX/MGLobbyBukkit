package net.crededits.maxx.events;

import net.crededits.maxx.MGLobby;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerToggleSneakEvent implements Listener {
    private MGLobby plugin;
    public PlayerToggleSneakEvent(MGLobby instance){
    	this.plugin = instance;
    }
	@EventHandler
    public void onPlayerToggleSneakEvent(org.bukkit.event.player.PlayerToggleSneakEvent event) {
      final Player player = event.getPlayer();
      if(player.isSneaking()) {
	
	    player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 1));
	    final int exp = (int) player.getExp();
	    while(exp > 0){
           Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable() {
			
			@Override
			public void run() {
				
				player.setExp(exp -1);
			}
		}, 20L);

	    }
	    } else {
	    	int xp = (int) player.getExp();
	    	while(xp <  17) {
	    	    player.setExp(xp + 1);
				Bukkit.getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable() {
					
					@Override
					public void run() {
				    	int xp = (int) player.getExp();
						player.setExp(xp + 1);
					}
				}, 20);
	    	}
	
      }
	}
	
	
	
	
}
