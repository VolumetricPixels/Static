/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.component;

import org.spout.api.component.components.EntityComponent;

import com.volumetricpixels.staticrts.game.StaticGame;

public class StaticAI extends EntityComponent {
    private StaticGame game;
    private boolean shouldExecuteActions = true;

    public StaticAI() {
    }

    @Override
    public void onAttached() {
    }

    @Override
    public void onTick(float dt) {
        if (shouldExecuteActions) {
            // TODO: Handle controlling the AI to make it execute actions
        }
    }

    public void setGame(StaticGame game) {
        this.game = game;
    }

    public void remove() {
        shouldExecuteActions = false;
        game = null;
        getOwner().remove();
    }

    public StaticGame getGame() {
        return game;
    }
}
