package com.chasechocolate.bleed.monsters.listener;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import com.chasechocolate.bleed.Bleed;
import com.chasechocolate.bleed.monsters.methods.MonsterMethods;

public class MonsterListener implements Listener {

    private MonsterMethods methods;
    private final Bleed plugin;

    public MonsterListener(Bleed plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMonsterDamage(EntityDamageEvent event) {
	if(event.isCancelled()){
	    return;
	}
	if(event.getEntity() instanceof Player){
	    Player p = (Player)event.getEntity();
	    if(p.getGameMode()==GameMode.CREATIVE){
		return;
	    }
	}
	if(event.getEntity().getLocation().getBlock().isLiquid()){
	    return;
	}
	methods = new MonsterMethods(plugin);
	switch (event.getEntity().getType()) {

	case HORSE:
	    methods.horseEffect(event.getEntity());
	    break;
	case PLAYER:
	    methods.playerEffect(event.getEntity());
	    break;
	case SKELETON:
	    methods.skeletonEffect(event.getEntity());
	    break;
	case BAT:
	    methods.batEffect(event.getEntity());
	    break;
	case ENDERMAN:
	    methods.endermanEffect(event.getEntity());
	    break;
	case ZOMBIE:
	    methods.zombieEffect(event.getEntity());
	    break;
	case IRON_GOLEM:
	    methods.irongolemEffect(event.getEntity());
	    break;
	case SNOWMAN:
	    methods.snowmanEffect(event.getEntity());
	    break;
	case SQUID:
	    methods.squidEffect(event.getEntity());
	    break;
	case SPIDER:
	    methods.spiderEffect(event.getEntity());
	    break;
	case SHEEP:
	    methods.sheepEffect(event.getEntity());
	    break;
	case CAVE_SPIDER:
	    methods.cavespiderEffect(event.getEntity());
	    break;
	case GHAST:
	    methods.ghastEffect(event.getEntity());
	    break;
	case GIANT:
	    methods.giantEffect(event.getEntity());
	    break;
	case ENDER_DRAGON:
	    methods.enderdragonEffect(event.getEntity());
	    break;
	case BLAZE:
	    methods.blazeEffect(event.getEntity());
	    break;
	case PIG:
	    methods.pigEffect(event.getEntity());
	    break;
	case SILVERFISH:
	    methods.silverfishEffect(event.getEntity());
	    break;
	case MUSHROOM_COW:
	    methods.mooshroomEffect(event.getEntity());
	    break;
	case OCELOT:
	    methods.ocelotEffect(event.getEntity());
	    break;
	case CREEPER:
	    methods.creeperEffect(event.getEntity());
	    break;
	case WITHER:
	    methods.witherbossEffect(event.getEntity());
	    break;
	case CHICKEN:
	    methods.chickenEffect(event.getEntity());
	    break;
	case COW:
	    methods.cowEffect(event.getEntity());
	    break;
	case VILLAGER:
	    methods.villagerEffect(event.getEntity());
	    break;
	case SLIME:
	    methods.slimeEffect(event.getEntity());
	    break;

	default:
	    plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED+ "Animal has not being registered!");
	    plugin.getLogger().log(Level.SEVERE,"Animal: "+ String.valueOf(event.getEntityType().toString()));
	    break;

	}
    }
}
