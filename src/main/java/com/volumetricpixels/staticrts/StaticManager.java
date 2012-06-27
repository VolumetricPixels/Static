/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts;

import com.volumetricpixels.staticrts.config.StaticConfiguration;

/**
 * Manages Static
 * 
 * Constructor default because should only
 * be called in StaticPlugin.java
 */
public class StaticManager {
	
	private StaticPlugin plugin;
	
	StaticManager(StaticPlugin plugin) {
		this.plugin = plugin;
	}
	
	StaticManager initialize() {
		return this;
	}
	
	public StaticConfiguration getConfig() {
		return getPlugin().getConfig();
	}
	
	public StaticPlugin getPlugin() {
		return plugin;
	}
	
}
