/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts;

import java.net.InetSocketAddress;

import org.spout.api.Engine;
import org.spout.api.Server;
import org.spout.api.entity.component.controller.type.ControllerType;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.plugin.Platform;

import com.volumetricpixels.staticrts.config.StaticConfiguration;
import com.volumetricpixels.staticrts.protocol.StaticProtocol;

/**
 * Static Plugin
 */
public class StaticPlugin extends CommonPlugin {
	
	public static final int PROTOCOL_ID = ControllerType.getProtocolId("com.volumetricpixels.staticrts.protocol");

	private final StaticManager manager;
	private StaticConfiguration config;
	
	private Engine e;
	private int port = 25565;
	
	public StaticPlugin() {
		// Initialize variables that don't require the plugin to be enabled
		i = this;
		this.manager = new StaticManager(this);
	}

	@Override
    public void onEnable() {
		// Initialize variables that need Spout method calls
	    this.config = new StaticConfiguration(this.getDataFolder());
	    this.e = this.getEngine();
	    
	    if (e.getPlatform() == Platform.SERVER || e.getPlatform() == Platform.PROXY) {
	        String[] split = e.getAddress().split(":");
            if (split.length > 1) {
                try {
                    port = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    getLogger().warning(split[1] + " is not a valid port number! Defaulting to " + port + "!");
                }
            }

            ((Server) e).bind(new InetSocketAddress(split[0], port), new StaticProtocol());
	    }
    }

	@Override
    public void onDisable() {
	    
    }
	
	/**
	 * Gets the Static Manager
	 * @return The StaticManager
	 */
	public StaticManager getManager() {
		return manager;
	}
	
	/**
	 * Gets the Static Configuration
	 * @return The StaticConfiguration
	 */
	public StaticConfiguration getConfig() {
		return config;
	}
	
	private static StaticPlugin i;
	
	public static StaticPlugin getInstance() {
		return i;
	}

}
