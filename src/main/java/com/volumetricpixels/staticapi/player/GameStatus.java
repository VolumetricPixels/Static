/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticapi.player;

import org.spout.api.component.type.EntityComponent;
import org.spout.api.entity.Player;

import com.volumetricpixels.staticapi.game.Game;

public class GameStatus extends EntityComponent {
    private String player;
    private Game game;
    private boolean inGame;

    @Override
    public void onAttached() {
        if (getOwner() instanceof Player) {
            player = ((Player) getOwner()).getName();
        } else {
            throw new IllegalStateException("Cannot attach GameStatus component to non-player Entity!");
        }
    }

    public String getPlayerName() {
        return player;
    }

    public Game getGame() {
        return game;
    }

    public boolean inGame() {
        return inGame;
    }

    public void onJoin(Game game) {
        if (game != null) {
            this.game = game;
            inGame = true;
        }
    }

    public void onQuit() {
        game = null;
        inGame = false;
    }
}
