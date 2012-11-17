package com.volumetricpixels.staticrts.component;

import org.spout.api.component.components.EntityComponent;
import org.spout.api.entity.Player;

import com.volumetricpixels.staticrts.game.StaticGame;

public class StaticPlayer extends EntityComponent {
    private String playerName;
    private StaticGame currentGame;
    private boolean isInGame;

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
        return isInGame;
    }

    public StaticGame getGame() {
        return currentGame;
    }

    public StaticPlayer joinGame(StaticGame game) {
        if (game == null) {
            throw new IllegalArgumentException("Cannot join a null game!");
        }

        isInGame = true;
        currentGame = game;
        game.handleGameJoin(playerName);
        return this;
    }

    public StaticPlayer quitGame() {
        currentGame.handleGameQuit(playerName);
        return this;
    }
}
