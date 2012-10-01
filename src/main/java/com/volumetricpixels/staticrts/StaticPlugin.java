package com.volumetricpixels.staticrts;

import org.spout.api.Spout;
import org.spout.api.exception.ConfigurationException;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.plugin.Platform;

import com.volumetricpixels.staticrts.server.StaticServerConfiguration;

public class StaticPlugin extends CommonPlugin {
    private static StaticPlugin instance;
    private static boolean server = false;
    private static boolean client = false;

    public StaticPlugin() {
        if (instance != null) {
            throw new IllegalStateException("A duplicate instance of StaticPlugin was created!");
        }
        instance = this;
    }

    private StaticServerConfiguration config;

    @Override
    public void onLoad() {
        Platform p = Spout.getPlatform();
        if (p == Platform.SERVER || p == Platform.PROXY) {
            server = true;
            // Load StaticConfiguration
            this.config = new StaticServerConfiguration();

            try {
                config.load();
            } catch (ConfigurationException e) {
                e.printStackTrace();
            }
        } else if (p == Platform.CLIENT) {
            client = true;
            // TODO: Client stuff?
        }
    }

    @Override
    public void onEnable() {
        if (server) {
            // TODO: Server stuff
        } else if (client) {
            // TODO: Client stuff
        }
    }

    @Override
    public void onDisable() {
        if (server) {
            // TODO: Server stuff
        } else if (client) {
            // TODO: Client stuff
        }
    }
}
