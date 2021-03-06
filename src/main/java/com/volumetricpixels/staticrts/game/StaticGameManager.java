/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.game;

import java.util.ArrayList;
import java.util.List;

import com.volumetricpixels.staticapi.game.Game;
import com.volumetricpixels.staticapi.game.GameManager;

import com.volumetricpixels.staticrts.server.StaticServerConfiguration;

public class StaticGameManager implements GameManager {
    private List<Game> games = new ArrayList<Game>();
    private boolean server = false;

    @Override
    public List<Game> getGames() {
        return games;
    }

    @Override
    public List<String> getGameWorlds() {
        return StaticServerConfiguration.STATIC_WORLDS.getStringList();
    }

    @Override
    public boolean isServer() {
        return server;
    }

    public void setIsServer(boolean server) {
        this.server = server;
    }
}
