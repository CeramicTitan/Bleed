package com.chasechocolate.bleed;

import java.util.EnumMap;
import java.util.Map;

import me.chasechocolate.bleed.ascii.Ascii;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.chasechocolate.bleed.monsters.listener.MonsterListener;
import com.chasechocolate.bleed.monsters.methods.Monster_Methods;

public class Bleed extends JavaPlugin {
    public Map<EntityType, Integer> enumMap = new EnumMap<EntityType, Integer>(EntityType.class);
    public Monster_Methods methods = new Monster_Methods(this);
    private MonsterListener mListener = null;
    public boolean enabled;


    @Override
    public void onEnable() {
	mListener = new MonsterListener(this);
	PluginManager pm = getServer().getPluginManager();
	pm.registerEvents(mListener, this);
	enabled = true;
	log("Enabled!");
	log("Currently developed by:");
	for(String line:Ascii.getTitan()) {
	    getServer().getConsoleSender().sendMessage(line);
	}
	try {
	    loadConfig();
	} catch (Exception e) {
	    getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED+ "Something bad has happened. Report this immediately");
	}
	enumMap.put(EntityType.HORSE, getConfig().getInt("horse.particle"));
	enumMap.put(EntityType.ZOMBIE, getConfig().getInt("zombie.particle"));
	enumMap.put(EntityType.ENDERMAN, getConfig().getInt("enderman.particle"));
	enumMap.put(EntityType.CREEPER, getConfig().getInt("creeper.particle"));
	enumMap.put(EntityType.BLAZE, getConfig().getInt("blaze.particle"));
	enumMap.put(EntityType.SLIME, getConfig().getInt("slime.particle"));
	enumMap.put(EntityType.CAVE_SPIDER,getConfig().getInt("cavespider.particle"));
	enumMap.put(EntityType.SPIDER, getConfig().getInt("spider.particle"));
	enumMap.put(EntityType.SKELETON, getConfig().getInt("skeleton.particle"));
	enumMap.put(EntityType.SILVERFISH,getConfig().getInt("silverfish.particle"));
	enumMap.put(EntityType.WITCH, getConfig().getInt("witch.particle"));
	enumMap.put(EntityType.WOLF, getConfig().getInt("wolf.particle"));
	enumMap.put(EntityType.COW, getConfig().getInt("cow.particle"));
	enumMap.put(EntityType.CHICKEN, getConfig().getInt("chicken.particle"));
	enumMap.put(EntityType.VILLAGER, getConfig().getInt("villager.particle"));
	enumMap.put(EntityType.OCELOT, getConfig().getInt("ocelot.particle"));
	enumMap.put(EntityType.BAT, getConfig().getInt("bat.particle"));
	enumMap.put(EntityType.MUSHROOM_COW,getConfig().getInt("mooshroom.particle"));
	enumMap.put(EntityType.SQUID, getConfig().getInt("squid.particle"));
	enumMap.put(EntityType.PIG, getConfig().getInt("pig.particle"));
	enumMap.put(EntityType.SHEEP, getConfig().getInt("sheep.particle"));
	enumMap.put(EntityType.ENDER_DRAGON,getConfig().getInt("enderdragon.particle"));
	enumMap.put(EntityType.WITHER, getConfig().getInt("witherboss.particle"));
	enumMap.put(EntityType.GIANT, getConfig().getInt("giant.particle"));
	enumMap.put(EntityType.GHAST, getConfig().getInt("ghast.particle"));
	enumMap.put(EntityType.IRON_GOLEM,getConfig().getInt("irongolem.particle"));
	enumMap.put(EntityType.SNOWMAN, getConfig().getInt("snowgolem.particle"));
	enumMap.put(EntityType.PLAYER, getConfig().getInt("player.particle"));

    }

    @Override
    public void onDisable() {
	log("Disabled!");
	enumMap.clear();
    }

    public void log(String msg) {
	System.out.println("[Bleed] " + msg);
    }

    public void loadConfig() {
	getConfig().addDefault("zombie.enable", true);
	getConfig().addDefault("zombie.particle", 1);
	getConfig().addDefault("enderman.enable", true);
	getConfig().addDefault("enderman.particle", 2);
	getConfig().addDefault("creeper.enable", true);
	getConfig().addDefault("creeper.particle", 3);
	getConfig().addDefault("blaze.enable", true);
	getConfig().addDefault("blaze.particle", 4);
	getConfig().addDefault("slime.enable", true);
	getConfig().addDefault("slime.particle", 5);
	getConfig().addDefault("cavespider.enable", true);
	getConfig().addDefault("cavespider.particle", 7);
	getConfig().addDefault("spider.enable", true);
	getConfig().addDefault("spider.particle", 9);
	getConfig().addDefault("skeleton.enable", true);
	getConfig().addDefault("skeleton.particle", 12);
	getConfig().addDefault("silverfish.enable", true);
	getConfig().addDefault("silverfish.particle", 13);
	getConfig().addDefault("witch.enable", true);
	getConfig().addDefault("witch.particle", 14);
	getConfig().addDefault("wolf.enable", true);
	getConfig().addDefault("wolf.particle", 15);
	getConfig().addDefault("cow.enable", true);
	getConfig().addDefault("cow.particle", 16);
	getConfig().addDefault("chicken.enable", true);
	getConfig().addDefault("chicken.particle", 17);
	getConfig().addDefault("villager.enable", true);
	getConfig().addDefault("villager.particle", 18);
	getConfig().addDefault("ocelot.enable", true);
	getConfig().addDefault("ocelot.particle", 19);
	getConfig().addDefault("bat.enable", true);
	getConfig().addDefault("bat.particle", 20);
	getConfig().addDefault("mooshroom.enable", true);
	getConfig().addDefault("mooshroom.particle", 21);
	getConfig().addDefault("squid.enable", true);
	getConfig().addDefault("squid.particle", 22);
	getConfig().addDefault("pig.enable", true);
	getConfig().addDefault("pig.particle", 23);
	getConfig().addDefault("sheep.enable", true);
	getConfig().addDefault("sheep.particle", 24);
	getConfig().addDefault("enderdragon.enable", false);
	getConfig().addDefault("enderdragon.particle", 25);
	getConfig().addDefault("witherboss.enable", false);
	getConfig().addDefault("witherboss.particle", 24);
	getConfig().addDefault("giant.enable", false);
	getConfig().addDefault("giant.particle", 41);
	getConfig().addDefault("ghast.enable", false);
	getConfig().addDefault("ghast.particle", 42);
	getConfig().addDefault("irongolem.enable", true);
	getConfig().addDefault("irongolem.particle", 44);
	getConfig().addDefault("snowman.enable", true);
	getConfig().addDefault("snowman.particle", 45);
	getConfig().addDefault("horse.enable", true);
	getConfig().addDefault("horse.particle", 46);
	getConfig().addDefault("player.enable", true);
	getConfig().addDefault("player.particle", 55);
	getConfig().options().copyDefaults(true);
	saveConfig();
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel,String[] args){
	if(cmd.getName().equalsIgnoreCase("bleed")){
	    if(args.length == 1){
		if(sender instanceof Player){
		    Player p = (Player)sender;
		    if(p.hasPermission("bleed.toggle")){
			if(args[0].equalsIgnoreCase("toggle")){
			    toggle(p);
			    return true;
			}else if(args[0].equalsIgnoreCase("status")){
			    p.sendMessage(status());
			    return true;
			}
		    }
		}
	    }else{	
		return false;
	    }

	}

	return false;

    }

    private void toggle(CommandSender sender) {
	if (mListener == null) {
	    mListener = new MonsterListener(this);
	    getServer().getPluginManager().registerEvents(mListener, this);
	    enabled = true;
	    sender.sendMessage(ChatColor.DARK_RED+"["+ChatColor.RED+"Bleed"+ChatColor.DARK_RED+"] "+ChatColor.DARK_AQUA+"Bleed is now enabled!");
	} else {
	    HandlerList.unregisterAll(mListener);
	    mListener = null;
	    enabled = false;
	    sender.sendMessage(ChatColor.DARK_RED+"["+ChatColor.RED+"Bleed"+ChatColor.DARK_RED+"] "+ChatColor.DARK_GRAY+"Bleed is now disabled!");
	}
    }
    public String status() {
	return enabled ? ChatColor.DARK_RED+"["+ChatColor.RED+"Bleed"+ChatColor.DARK_RED+"] "+ChatColor.DARK_AQUA+"Bleed is enabled!" : ChatColor.DARK_RED+"["+ChatColor.RED+"Bleed"+ChatColor.DARK_RED+"] "+ChatColor.DARK_GRAY+"Bleed is disabled!";
    }

}