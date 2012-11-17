/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.component;

import org.spout.api.component.components.EntityComponent;
import org.spout.api.entity.Player;

import com.volumetricpixels.staticapi.game.Game;
import com.volumetricpixels.staticapi.player.GameStatus;

import com.volumetricpixels.staticrts.game.StaticGame;

public class StaticPlayer extends EntityComponent {
    private String playerName;
    private GameStatus gameStatus;

    public StaticPlayer() {
    }

    @Override
    public void onAttached() {
        try {
            playerName = ((Player) getOwner()).getName();
        } catch (ClassCastException e) {
            throw new IllegalStateException("Cannot attach a StaticPlayer component to a non-player Entity!");
        }
    }

    public boolean isInGame() {
        return gameStatus.inGame();
    }

    public Game getGame() {
        return gameStatus.getGame();
    }

    public StaticPlayer joinGame(StaticGame game) {
        if (game == null) {
            throw new IllegalArgumentException("Cannot join a null game!");
        }

        gameStatus.onJoin(game);
        game.handleGameJoin(playerName);
        return this;
    }

    public StaticPlayer quitGame() {
        ((StaticGame) getGame()).handleGameQuit(playerName);
        gameStatus.onQuit();
        return this;
    }
}
