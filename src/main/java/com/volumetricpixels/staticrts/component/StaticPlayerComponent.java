package com.volumetricpixels.staticrts.component;

import org.spout.api.component.components.EntityComponent;

import com.volumetricpixels.staticrts.game.StaticGame;

public class StaticPlayerComponent extends EntityComponent {
    private String playerTag;
    private StaticGame currentGame;
    private boolean isInGame;

    public StaticPlayerComponent(String playerName) {
        this.playerTag = playerName;
    }

    public boolean isInGame() {
        return isInGame;
    }

    public StaticGame getGame() {
        return currentGame;
    }

    public StaticPlayerComponent joinGame(StaticGame game) {
        currentGame = game;

        if (game == null) {
            isInGame = false;
        } else {
            isInGame = true;
        }

        game.handleGameJoin(playerTag);

        return this;
    }

    public StaticPlayerComponent quitGame() {
        currentGame.handleGameQuit(playerTag);

        return this;
    }
}
