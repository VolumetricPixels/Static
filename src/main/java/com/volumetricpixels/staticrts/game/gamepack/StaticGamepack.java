/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticrts.game.gamepack;

import java.io.File;

import com.volumetricpixels.staticapi.game.Gamepack;

/**
 * Represents a gamepack
 */
public class StaticGamepack implements Gamepack {
    // Main directory
    private final File gamepackDirectory;

    // Files
    private File rules;
    private File properties;

    // Directories
    private File unitModelsDir;
    private File buildingModelsDir;
    private File terrainTexturesDir;

    // Gamepack Modules
    private StaticGamepackRuleset ruleset;
    private StaticGamepackProperties propertyConfig;

    public StaticGamepack(File gamepackDir) {
        gamepackDirectory = gamepackDir;

        rules = new File(gamepackDirectory, "rules.yml");
        properties = new File(gamepackDirectory, "properties.yml");

        unitModelsDir = new File(gamepackDirectory, "models" + File.separator + "units");
        buildingModelsDir = new File(gamepackDirectory, "models" + File.separator + "buildings");
        terrainTexturesDir = new File(gamepackDirectory, "textures" + File.separator + "terrain");

        ruleset = new StaticGamepackRuleset(this, rules);
        ruleset.load();

        propertyConfig = new StaticGamepackProperties(this, properties);
        propertyConfig.load();
    }
}
