package com.volumetricpixels.staticrts;

import org.spout.api.Spout;
import org.spout.api.exception.ConfigurationException;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.plugin.Platform;

import com.volumetricpixels.staticrts.api.Static;
import com.volumetricpixels.staticrts.api.StaticImpl;
import com.volumetricpixels.staticrts.api.game.GameManager;
import com.volumetricpixels.staticrts.game.StaticGameManager;
import com.volumetricpixels.staticrts.server.StaticServerConfiguration;

public final class StaticPlugin extends CommonPlugin implements StaticImpl {
    private static boolean server = false;
    private static boolean client = false;

    private StaticServerConfiguration config;
    private StaticGameManager gameManager;

    @Override
    public void onLoad() {
        gameManager = new StaticGameManager();

        Static.setStatic(this);

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

    @Override
    public GameManager getGameManager() {
        return gameManager;
    }
}
