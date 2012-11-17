/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012 VolumetricPixels <http://volumetricpixels.com>
 * Static is licensed under the VolumetricPixels License Version 1
 */
package com.volumetricpixels.staticapi.game;

import java.util.List;

public interface GameManager {
    List<Game> getGames();

    List<String> getGameWorlds();

    boolean isServer();
}
