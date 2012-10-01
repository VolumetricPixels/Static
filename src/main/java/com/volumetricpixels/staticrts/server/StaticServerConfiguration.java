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

        this.setWritesDefaults(true);
    }

    @Override
    public void save() throws ConfigurationException {
        super.save();
    }
}
