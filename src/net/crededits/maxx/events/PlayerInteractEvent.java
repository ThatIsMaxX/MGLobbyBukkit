package net.crededits.maxx.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractEvent implements Listener{
	
	
	@EventHandler(priority=EventPriority.HIGH)
	public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent event){
	    Player p = event.getPlayer();
	    if(event.getAction().equals(Action.RIGHT_CLICK_AIR)){
	        if(p.getItemInHand().getType() == Material.EYE_OF_ENDER){
	    
	        	
	     for (Player other : Bukkit.getServer().getOnlinePlayers()) {
            other.hidePlayer(p);
            p.hidePlayer(other);
            
        	Inventory inventory = p.getInventory();
        	inventory.setItem(8, new ItemStack(Material.ENDER_PEARL, 1));
            
        }
	    
	        }  else if(p.getItemInHand().getType() == Material.ENDER_PEARL){	       	  
	        	        for (Player other : Bukkit.getServer().getOnlinePlayers()) {
	       	            other.showPlayer(p);
	       	            p.showPlayer(other);
	       	         Inventory inventory = p.getInventory();
	       	         inventory.setItem(8, new ItemStack(Material.EYE_OF_ENDER, 1));
	       	        }
	        } else if(p.getItemInHand().getType() == Material.GOLD_AXE) {
	        	p.launchProjectile(EnderPearl.class);
	        }
	        } else {
	        	
	        }
	    }
	}

