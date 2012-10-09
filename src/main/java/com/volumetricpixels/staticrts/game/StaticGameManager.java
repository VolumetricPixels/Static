package com.volumetricpixels.staticrts.game;

import java.util.ArrayList;
import java.util.List;

import com.volumetricpixels.staticapi.game.Game;
import com.volumetricpixels.staticapi.game.GameManager;
import com.volumetricpixels.staticrts.server.StaticServerConfiguration;

public class StaticGameManager implements GameManager {
    private List<Game> games = new ArrayList<Game>();

    @Override
    public List<Game> getGames() {
        return games;
    }

    @Override
    public List<String> getGameWorlds() {
        return StaticServerConfiguration.STATIC_WORLDS.getStringList();
    }
}
