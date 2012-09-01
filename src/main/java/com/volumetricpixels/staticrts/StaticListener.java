package com.volumetricpixels.staticrts;

import org.spout.api.event.EventHandler;
import org.spout.api.event.Listener;
import org.spout.api.event.Order;
import org.spout.api.event.player.PlayerJoinEvent;

import com.volumetricpixels.staticrts.controller.StaticPlayerController;
import com.volumetricpixels.staticrts.server.StaticServerConfiguration;

public class StaticListener implements Listener {
    @EventHandler(order = Order.LATEST_IGNORE_CANCELLED)
    public void onPlayerJoin(PlayerJoinEvent e) {
        if (StaticServerConfiguration.STATIC_WORLDS.getStringList().contains(e.getPlayer().getWorld().getName())) {
            e.getPlayer().setController(new StaticPlayerController());
        }
    }
}
