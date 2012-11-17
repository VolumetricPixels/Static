package com.volumetricpixels.staticapi.game;

import java.util.List;

import org.spout.api.geo.World;

/**
 * Represents a game
 * 
 * Each game has its own a world and a gamepack
 */
public interface Game {
    /**
     * Gets the players in this game
     * 
     * @return A List of names of the players in this game
     */
    public List<String> getPlayers();

    /**
     * Gets the world for this game
     * 
     * @return The World this game is in
     */
    public World getWorld();

    /**
     * Gets the name of the World this game is in
     * 
     * @return The name of this game's world
     */
    public String getWorldName();

    /**
     * Gets the gamepack being used in this game
     * 
     * @return This game's active gamepack
     */
    public Gamepack getGamepack();
}
