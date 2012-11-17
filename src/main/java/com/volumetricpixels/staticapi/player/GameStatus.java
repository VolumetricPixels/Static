/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticapi.player;

import com.volumetricpixels.staticapi.game.Game;

public class GameStatus {
    private String player;
    private Game game;
    private int score;
    private boolean inGame;

    public GameStatus(String player) {
        this.player = player;
    }

    public String getPlayerName() {
        return player;
    }

    public Game getGame() {
        return game;
    }

    public int getScore() {
        return score;
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
