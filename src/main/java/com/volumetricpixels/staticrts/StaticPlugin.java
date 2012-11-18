/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts;

import org.spout.api.Spout;
import org.spout.api.exception.ConfigurationException;
import org.spout.api.plugin.CommonPlugin;
import org.spout.api.plugin.Platform;

import com.volumetricpixels.staticapi.Static;
import com.volumetricpixels.staticapi.StaticImpl;
import com.volumetricpixels.staticapi.game.GameManager;

import com.volumetricpixels.staticrts.game.StaticGameManager;
import com.volumetricpixels.staticrts.server.StaticServerConfiguration;
import com.volumetricpixels.staticrts.server.StaticServerListener;

public final class StaticPlugin extends CommonPlugin implements StaticImpl {
    private static boolean server = false;
    private static boolean client = false;

    // Server things
    private StaticServerConfiguration config;
    private StaticGameManager gameManager;

    @Override
    public void onLoad() {
        gameManager = new StaticGameManager();

        Platform p = Spout.getPlatform();
        if (p == Platform.SERVER || p == Platform.PROXY) {
            server = true;

            // Load config
            config = new StaticServerConfiguration();

            try {
                config.load();
            } catch (ConfigurationException e) {
                e.printStackTrace();
            }
        } else if (p == Platform.CLIENT) {
            client = true;
        }

        gameManager.setIsServer(server);

        Static.setStatic(this);
    }

    @Override
    public void onEnable() {
        if (server) {
            Spout.getEventManager().registerEvents(new StaticServerListener(), this);

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
