package com.volumetricpixels.staticrts.api;

import com.volumetricpixels.staticrts.api.game.GameManager;

/**
 * A static class for access to Static's API
 *
 * (See what I did there?)
 */
public final class Static {
    private static StaticImpl plugin = null;
    private static GameManager manager = null;

    public static StaticImpl getPlugin() {
        return plugin;
    }

    public static GameManager getGameManager() {
        return manager;
    }

    public static void setStatic(StaticImpl impl) {
        if (plugin != null || impl == null) {
            return;
        }

        plugin = impl;
        manager = impl.getGameManager();
    }
}
