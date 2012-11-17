/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.server;

import java.util.ArrayList;

import org.spout.api.Spout;
import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.ConfigurationHolder;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;

public class StaticServerConfiguration extends ConfigurationHolderConfiguration {
    public static final ConfigurationHolder STATIC_WORLDS = new ConfigurationHolder(new ArrayList<String>(), "General", "Game-Worlds");

    public StaticServerConfiguration() {
        super(new YamlConfiguration(Spout.getPluginManager().getPlugin("Static").getDataFolder()));
    }

    @Override
    public void load() throws ConfigurationException {
        super.load();
        super.save();

        setWritesDefaults(true);
    }

    @Override
    public void save() throws ConfigurationException {
        super.save();
    }
}
