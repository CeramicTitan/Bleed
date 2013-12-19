package com.chasechocolate.bleed.packets;

public class Packet extends BasicWrapper {

    public Packet(String packetName) {
	super(packetName);
    }

    public void setField(String fieldName, Object value) {
	ReflectionUtil.setField(getHandle().getClass(), fieldName, getHandle(), value);
    }
}