package com.volumetricpixels.staticrts.game.gamepack;

import java.io.File;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.yaml.YamlConfiguration;

public class StaticGamepackProperties {
    private StaticGamepack gamepack;
    private File propertiesFile;

    // TODO: Properties

    public StaticGamepackProperties(StaticGamepack gamepack, File propertiesFile) {
        this.gamepack = gamepack;
        this.propertiesFile = propertiesFile;
    }

    public StaticGamepack getGamepack() {
        return gamepack;
    }

    public void load() {
        YamlConfiguration conf = new YamlConfiguration(propertiesFile);

        try {
            conf.load();
            conf.setWritesDefaults(true);
        } catch (ConfigurationException e) {
            return;
        }

        try {
            conf.save();
        } catch (ConfigurationException ignore) {
        }
    }
}
