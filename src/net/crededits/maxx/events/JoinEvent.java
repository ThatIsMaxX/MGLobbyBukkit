package net.crededits.maxx.events;

import net.crededits.maxx.MGLobby;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class JoinEvent implements Listener {
	private static MGLobby plugin;
	public JoinEvent(MGLobby instance) {
        this.plugin = instance;
    }

   
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
    {
    	
    	Player p = event.getPlayer();
    	
    	
    	Inventory inventory = p.getInventory();
    	
    			
    	inventory.setItem(8, new ItemStack(Material.ENDER_PEARL));
        
    	
    	double x = plugin.getConfig().getInt("Config.SpawnLocation.spawnX");
    	double Y = plugin.getConfig().getInt("Config.SpawnLocation.spawnY");
    	double Z = plugin.getConfig().getInt("Config.SpawnLocation.spawnZ");
    	
        Location loc = new Location(p.getWorld(), x, Y, Z);
    	
    	
    	p.teleport(loc);
    	
    }
    

}
