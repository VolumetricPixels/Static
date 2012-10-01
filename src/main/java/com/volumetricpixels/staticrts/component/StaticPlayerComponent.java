package com.volumetricpixels.staticrts.component;

import org.spout.api.component.components.EntityComponent;

import com.volumetricpixels.staticrts.game.Game;

public class StaticPlayerComponent extends EntityComponent {
    private String playerTag;
    private Game currentGame;
    private boolean isInGame;

    public StaticPlayerComponent(String playerName) {
        this.playerTag = playerName;
    }

    public boolean isInGame() {
        return isInGame;
    }

    public Game getGame() {
        return currentGame;
    }

    public StaticPlayerComponent joinGame(Game game) {
        currentGame = game;

        if (game == null) {
            isInGame = false;
        } else {
            isInGame = true;
        }

        game.handleGameJoin(playerTag);

        return this;
    }

    public void quitGame() {
        currentGame.handleGameQuit(playerTag);
    }
}
