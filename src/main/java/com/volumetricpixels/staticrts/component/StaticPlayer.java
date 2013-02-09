/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.component;

import org.spout.api.component.type.EntityComponent;
import org.spout.api.entity.Player;

import com.volumetricpixels.staticapi.game.Game;
import com.volumetricpixels.staticapi.player.GameStatus;

import com.volumetricpixels.staticrts.game.StaticGame;

public class StaticPlayer extends EntityComponent {
    private String playerName;
    private GameStatus gameStatusComponent;

    public StaticPlayer() {
    }

    @Override
    public void onAttached() {
        if (getOwner() instanceof Player) {
            Player player = (Player) getOwner();
            playerName = player.getName();
            gameStatusComponent = player.has(GameStatus.class) ? player.get(GameStatus.class) : player.add(GameStatus.class);
        } else {
            throw new IllegalStateException("Cannot attach a StaticPlayer component to a non-player Entity!");
        }
    }

    public boolean isInGame() {
        return gameStatusComponent.inGame();
    }

    public Game getGame() {
        return gameStatusComponent.getGame();
    }

    public StaticPlayer joinGame(StaticGame game) {
        if (game == null) {
            throw new IllegalArgumentException("Cannot join a null game!");
        }

        gameStatusComponent.onJoin(game);
        game.handleGameJoin(playerName);
        return this;
    }

    public StaticPlayer quitGame() {
        ((StaticGame) getGame()).handleGameQuit(playerName);
        gameStatusComponent.onQuit();
        return this;
    }
}
