package com.chasechocolate.bleed.packets;

import java.lang.reflect.Method;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerUtil {


    public static void sendPacket(Player player, Object packet){
	Method sendPacket = ReflectionUtil.getMethod(ReflectionUtil.getNMSClass("PlayerConnection"), "sendPacket", ReflectionUtil.getNMSClass("Packet"));
	Object playerConnection = getPlayerConnection(player);

	try {
	    sendPacket.invoke(playerConnection, packet);
	} catch (Exception e) {
	    Bukkit.getLogger().warning("Failed to retrieve the PlayerConnection of: " + player.getName());
	}
    }

    public static Object playerToEntityPlayer(Player player){
	Method getHandle = ReflectionUtil.getMethod(player.getClass(), "getHandle");
	try {
	    return getHandle.invoke(player);
	} catch (Exception e) {
	    Bukkit.getLogger().warning("Failed retrieve the NMS Player-Object of:" + player.getName());
	    return null;
	}
    }

    public static Object getPlayerConnection(Player player){
	Object connection = ReflectionUtil.getField(ReflectionUtil.getNMSClass("EntityPlayer"), "playerConnection", playerToEntityPlayer(player));
	return connection;
    }

    public static Object getNetworkManager(Player player) {
	try {
	    return ReflectionUtil.getField(getPlayerConnection(player).getClass(), "networkManager").get(getPlayerConnection(player));
	} catch (IllegalAccessException e) {
	    Bukkit.getLogger().warning("Failed to get the NetworkManager of player: " + player.getName());
	    return null;
	}
    }


}
