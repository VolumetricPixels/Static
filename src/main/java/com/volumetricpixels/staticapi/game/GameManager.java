package com.volumetricpixels.staticapi.game;

import java.util.List;

public interface GameManager {
    List<Game> getGames();

    List<String> getGameWorlds();

    boolean isServer();
}
