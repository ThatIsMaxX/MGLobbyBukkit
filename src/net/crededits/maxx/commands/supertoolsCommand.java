package net.crededits.maxx.commands;

import java.util.ArrayList;
import java.util.List;

import net.crededits.maxx.MGLobby;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class supertoolsCommand implements CommandExecutor  {

	public supertoolsCommand(MGLobby plugin) {
	}
	   public List<String> invisible = new ArrayList<String>();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
	 
	    
		Player player =(Player)sender;
		
		if(args[0].equalsIgnoreCase("bow")) {
			if(player.getItemInHand().getType() == Material.BOW) {
				player.getItemInHand().addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5000);
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "You need a bow in your hand to do that!");
			return true;
			} 
		} else if(args[0].equalsIgnoreCase("sword")){
			if(player.getItemInHand().getType() == Material.DIAMOND_SWORD) {
				
			
			player.getItemInHand().addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5000);
			return true;
			} else {
				player.sendMessage(ChatColor.RED + "You need a Diamond Sword in your Hand");
			return true;
			}
		} else {
			player.sendMessage(ChatColor.RED + "Unknown argument");
		}
		
		
		
		
		
		
		
		return false;
		

	
	
	
	}
}