package com.volumetricpixels.staticapi;

import org.spout.api.plugin.CommonPlugin;

import com.volumetricpixels.staticapi.game.GameManager;

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
        if (plugin != null || impl == null || !(impl instanceof CommonPlugin)) {
            return;
        }

        plugin = impl;
        manager = impl.getGameManager();
    }
}
