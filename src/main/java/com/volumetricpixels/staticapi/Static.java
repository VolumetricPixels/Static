package com.volumetricpixels.staticapi;

import org.spout.api.plugin.Plugin;

import com.volumetricpixels.staticapi.game.GameManager;

/**
 * A static class for access to the Static API
 * 
 * (See what I did there?)
 */
public final class Static {
    private static StaticImpl plugin = null;

    public static StaticImpl getPlugin() {
        return plugin;
    }

    public static GameManager getGameManager() {
        return getPlugin().getGameManager();
    }

    public static boolean isServer() {
        return getGameManager().isServer();
    }

    public static boolean isClient() {
        return !isServer();
    }

    public static void setStatic(StaticImpl impl) {
        if (plugin != null || impl == null || !(impl instanceof Plugin)) {
            return;
        }

        plugin = impl;
    }

    private Static() {
        throw new UnsupportedOperationException();
    }
}
