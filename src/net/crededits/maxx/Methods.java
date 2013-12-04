package net.crededits.maxx;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class Methods {

	 public static void enableVanish(Player player) {
	        for (Player other : Bukkit.getServer().getOnlinePlayers()) {
	            other.hidePlayer(player);
	            player.hidePlayer(other);
	        }

	    }
	
	 public static void disableVanish(Player player) {
	        for (Player other : Bukkit.getServer().getOnlinePlayers()) {
	            other.showPlayer(player);
	            player.showPlayer(other);
	        }

	    }
	
	
	public static void mfEffect(Player player,Location location,World world,Effect effect) {
		    world.playEffect(location, effect, 5);
	}
	
	
	
	
}
