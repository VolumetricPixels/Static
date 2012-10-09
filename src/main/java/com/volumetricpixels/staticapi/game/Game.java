package com.volumetricpixels.staticapi.game;

import java.util.List;

import org.spout.api.geo.World;


public interface Game {
    public List<String> getPlayers();

    public World getWorld();

    public String getWorldName();

    public Gamepack getGamepack();
}
