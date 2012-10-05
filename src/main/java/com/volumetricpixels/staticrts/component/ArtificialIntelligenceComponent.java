package com.volumetricpixels.staticrts.component;

import org.spout.api.component.components.EntityComponent;

import com.volumetricpixels.staticrts.game.StaticGame;

public class ArtificialIntelligenceComponent extends EntityComponent {
    private StaticGame game;

    public ArtificialIntelligenceComponent(StaticGame game) {
        this.game = game;
    }

    @Override
    public void onTick(float dt) {
        // TODO: Handle controlling the AI to make it execute actions based on
        // player actions etc...
    }

    public StaticGame getGame() {
        return game;
    }
}
