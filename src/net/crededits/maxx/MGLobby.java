package net.crededits.maxx;

import net.crededits.maxx.commands.hideCommand;
import net.crededits.maxx.commands.premiumCommand;
import net.crededits.maxx.commands.supertoolsCommand;
import net.crededits.maxx.events.JoinEvent;
import net.crededits.maxx.events.PlayerBucketEvent;
import net.crededits.maxx.events.PlayerChatEvent;
import net.crededits.maxx.events.PlayerDropEvent;
import net.crededits.maxx.events.PlayerInteractEntityEvent;
import net.crededits.maxx.events.PlayerInteractEvent;
import net.crededits.maxx.events.PlayerMoveEvent;
import net.crededits.maxx.events.ProjektileLaunchEvent;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MGLobby extends JavaPlugin{

    @Override
    public void onDisable() {
    	System.out.println("MGLobby Disabled");
    }
   
    
    @Override
    public void onEnable(){
        loadConfiguration();
        
        System.out.println("MGLobby Enabled");
        
        
        getCommand("hide").setExecutor(new hideCommand(this));
        getCommand("ST").setExecutor(new supertoolsCommand(this));
        getCommand("hulk").setExecutor(new premiumCommand(this));    
       
        PluginManager pl = getServer().getPluginManager();
        
        pl.registerEvents(new JoinEvent(this), this);
        pl.registerEvents(new PlayerInteractEntityEvent(), this);
        pl.registerEvents(new PlayerInteractEvent(), this);
        pl.registerEvents(new PlayerMoveEvent(), this);
        pl.registerEvents(new PlayerDropEvent(), this);
        pl.registerEvents(new PlayerBucketEvent(), this);
        pl.registerEvents(new PlayerChatEvent(this), this);
        pl.registerEvents(new ProjektileLaunchEvent(), this);
    }
 
    public void loadConfiguration(){
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }
	
	
	
	
	
	
}
