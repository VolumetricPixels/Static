/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.config;

import java.io.File;

import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;

/**
 * Static Configuration
 * Handles the config of Static
 */
public class StaticConfiguration extends ConfigurationHolderConfiguration {

	public StaticConfiguration(File dataFolder) {
	    super(new YamlConfiguration(new File(dataFolder, "config.yml")));
    }
	
}
