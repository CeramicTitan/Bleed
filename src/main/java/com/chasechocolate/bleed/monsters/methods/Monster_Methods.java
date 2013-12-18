package com.chasechocolate.bleed.monsters.methods;

import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import com.chasechocolate.bleed.Bleed;

public class Monster_Methods {

    private final Bleed plugin;

    public Monster_Methods(Bleed plugin) {
	this.plugin = plugin;
    }
    public void horseEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.HORSE);
	if (plugin.getConfig().getBoolean("player.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: PLAYER");
	}
    }

    public void playerEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.PLAYER);
	if (plugin.getConfig().getBoolean("player.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: PLAYER");
	}
    }

    public void skeletonEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SKELETON);
	if (plugin.getConfig().getBoolean("skeleton.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SKELETON");
	}
    }

    public void zombieEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.ZOMBIE);
	if (plugin.getConfig().getBoolean("zombie.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: ZOMBIE");
	}
    }

    public void batEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.BAT);
	if (plugin.getConfig().getBoolean("bat.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: BAT");
	}
    }

    public void creeperEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.CREEPER);
	if (plugin.getConfig().getBoolean("creeper.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: CREEPER");
	}
    }

    public void endermanEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.ENDERMAN);
	if (plugin.getConfig().getBoolean("enderman.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: ENDERMAN");
	}
    }

    public void blazeEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.BLAZE);
	if (plugin.getConfig().getBoolean("blaze.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: BLAZE");
	}
    }

    public void slimeEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SLIME);
	if (plugin.getConfig().getBoolean("slime.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SLIME");
	}
    }

    public void cavespiderEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.CAVE_SPIDER);
	if (plugin.getConfig().getBoolean("cavespider.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: CAVE_SPIDER");
	}
    }

    public void spiderEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SPIDER);
	if (plugin.getConfig().getBoolean("spider.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SPIDER");
	}
    }

    public void silverfishEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SILVERFISH);
	if (plugin.getConfig().getBoolean("silverfish.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SILVERFISH");
	}
    }

    public void witchEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.WITCH);
	if (plugin.getConfig().getBoolean("witch.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: WITCH");
	}
    }

    public void wolfrEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.WOLF);
	if (plugin.getConfig().getBoolean("wolf.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: WOLF");
	}
    }

    public void witherbossEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.WITHER);
	if (plugin.getConfig().getBoolean("wither.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: WITHER");
	}
    }

    public void cowEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.COW);
	if (plugin.getConfig().getBoolean("cow.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: COW");
	}
    }

    public void chickenEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.CHICKEN);
	if (plugin.getConfig().getBoolean("chicken.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: CHICKEN");
	}
    }

    public void ocelotEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.OCELOT);
	if (plugin.getConfig().getBoolean("ocelot.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: OCELOT");
	}
    }

    public void mooshroomEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.MUSHROOM_COW);
	if (plugin.getConfig().getBoolean("mooshroom.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: MUSHROOM_COW");
	}
    }

    public void squidEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SQUID);
	if (plugin.getConfig().getBoolean("squid.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SQUID");
	}
    }

    public void pigEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.PIG);
	if (plugin.getConfig().getBoolean("pig.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: PIG");
	}
    }

    public void sheepEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SHEEP);
	if (plugin.getConfig().getBoolean("sheep.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SHEEP");
	}
    }

    public void enderdragonEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.ENDER_DRAGON);
	if (plugin.getConfig().getBoolean("enderdragon.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: ENDER_DRAGON");
	}
    }

    public void giantEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.GIANT);
	if (plugin.getConfig().getBoolean("giant.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: GIANT");
	}
    }

    public void ghastEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.GHAST);
	if (plugin.getConfig().getBoolean("ghast.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: GHAST");
	}
    }

    public void irongolemEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.IRON_GOLEM);
	if (plugin.getConfig().getBoolean("irongolem.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: IRON_GOLEM");
	}
    }
    //Also this formatting is fucked? 
    public void snowmanEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.SNOWMAN);
	if (plugin.getConfig().getBoolean("snowman.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: SNOWMAN");
	}
    }
    public void villagerEffect(Entity entity) {
	Integer m = plugin.enumMap.get(EntityType.VILLAGER);
	if (plugin.getConfig().getBoolean("villager.enable") && m != null) {
	    entity.getWorld().playEffect(entity.getLocation(),
		    Effect.STEP_SOUND, (int) m);
	    entity.playEffect(EntityEffect.HURT);
	} else if (m == null) {
	    plugin.getLogger().severe(
		    "[Bleed] enumMap is null. Please report this!");
	    plugin.getLogger().severe("[Bleed] EntityType: VILLAGER");
	}
    }

}
