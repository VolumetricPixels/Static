package com.volumetricpixels.staticrts.game;

import java.util.ArrayList;
import java.util.List;

import org.spout.api.Spout;
import org.spout.api.geo.World;

import com.volumetricpixels.staticrts.api.game.Game;
import com.volumetricpixels.staticrts.api.game.Gamepack;

/**
 * Represents a game
 */
public class StaticGame implements Game {
    private List<String> players = new ArrayList<String>();
    private String worldName;
    private Gamepack gamepack;

    public StaticGame(String worldName, Gamepack gamepack) {
        this.worldName = worldName;
        this.gamepack = gamepack;
    }

    @Override
    public List<String> getPlayers() {
        return players;
    }

    @Override
    public String getWorldName() {
        return worldName;
    }

    @Override
    public World getWorld() {
        return Spout.getEngine().getWorld(worldName);
    }

    @Override
    public Gamepack getGamepack() {
        return gamepack;
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
