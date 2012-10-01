package com.volumetricpixels.staticrts.game;

import java.util.ArrayList;
import java.util.List;

import org.spout.api.Spout;
import org.spout.api.geo.World;

/**
 * Represents a game
 */
public class Game {
    private List<String> players = new ArrayList<String>();
    private String worldName;

    public Game(String worldName) {
        this.worldName = worldName;
    }

    public List<String> getPlayers() {
        return players;
    }

    public String getWorldName() {
        return worldName;
    }

    public World getWorld() {
        return Spout.getEngine().getWorld(worldName);
    }

    public boolean handleGameJoin(String playerName) {
        if (players.contains(playerName)) {
            return false;
        } else {
            players.add(playerName);
            return true;
        }
    }

    public boolean handleGameQuit(String playerName) {
        if (players.contains(playerName)) {
            players.remove(playerName);
            return true;
        } else {
            return false;
        }
    }
}
