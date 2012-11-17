/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.game.gamepack;

import java.io.File;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.yaml.YamlConfiguration;

public class StaticGamepackRuleset {
    private StaticGamepack gamepack;
    private File rulesFile;

    private int winningScore = -1; // -1 = unlimited
    private int timeLimitMins = -1; // -1 = unlimited
    private boolean dynamicTerrain = false;

    protected StaticGamepackRuleset(StaticGamepack gamepack, File rulesFile) {
        this.gamepack = gamepack;
        this.rulesFile = rulesFile;
    }

    public StaticGamepack getGamepack() {
        return gamepack;
    }

    public int getWinningScore() {
        return winningScore;
    }

    public int getTimeLimit() {
        return timeLimitMins;
    }

    public boolean isDynamicTerrain() {
        return dynamicTerrain;
    }

    public void load() {
        YamlConfiguration conf = new YamlConfiguration(rulesFile);

        try {
            conf.load();
            conf.setWritesDefaults(true);
        } catch (ConfigurationException e) {
            return;
        }

        winningScore = conf.getNode("winning-score").getInt(-1);
        timeLimitMins = conf.getNode("time-limit").getInt(-1);
        dynamicTerrain = conf.getNode("dynamic-terrain").getBoolean(false);

        try {
            conf.save();
        } catch (ConfigurationException ignore) {
        }
    }
}
