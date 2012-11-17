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
    private StaticRuleset ruleset;

    public StaticGamepack(File gamepackDirectory) {
        this.gamepackDirectory = gamepackDirectory;

        rules = new File(gamepackDirectory, "rules.yml");
        properties = new File(gamepackDirectory, "properties.yml");

        unitModelsDir = new File(gamepackDirectory, "models" + File.separator + "units");
        buildingModelsDir = new File(gamepackDirectory, "models" + File.separator + "buildings");
        terrainTexturesDir = new File(gamepackDirectory, "textures" + File.separator + "terrain");

        ruleset = new StaticRuleset(this, rules);
        ruleset.load();
    }
}
