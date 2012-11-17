package com.volumetricpixels.staticrts;

import org.spout.api.entity.Player;
import org.spout.api.event.EventHandler;
import org.spout.api.event.Listener;
import org.spout.api.event.Order;
import org.spout.api.event.entity.EntityTeleportEvent;
import org.spout.api.event.player.PlayerInteractEvent;
import org.spout.api.event.player.PlayerInteractEvent.Action;
import org.spout.api.event.player.PlayerJoinEvent;

import com.volumetricpixels.staticrts.component.StaticPlayer;
import com.volumetricpixels.staticrts.server.StaticServerConfiguration;

public class StaticListener implements Listener {
    @EventHandler(order = Order.LATEST_IGNORE_CANCELLED)
    public void handleInteractions(PlayerInteractEvent e) {
        if (e.getPlayer().hasExact(StaticPlayer.class)) {
            StaticPlayer spc = e.getPlayer().get(StaticPlayer.class);

            if (spc.isInGame() == false) {
                return;
            }
        } else {
            return;
        }

        Action a = e.getAction();

        switch (a) {
            case LEFT_CLICK:
                // TODO: Unit/Building selections
            case RIGHT_CLICK:
                // TODO: Actions
            default:
                break;
        }
    }

    @EventHandler(order = Order.LATEST_IGNORE_CANCELLED)
    public void handlePlayerComponent(PlayerJoinEvent e) {
        if (StaticServerConfiguration.STATIC_WORLDS.getStringList().contains(e.getPlayer().getWorld().getName())) {
            e.getPlayer().add(StaticPlayer.class);
        }
    }

    @EventHandler(order = Order.LATEST_IGNORE_CANCELLED)
    public void handleWorldChange(EntityTeleportEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (StaticServerConfiguration.STATIC_WORLDS.getStringList().contains(event.getTo().getWorld().getName())) {
                if (!player.hasExact(StaticPlayer.class)) {
                    player.add(StaticPlayer.class);
                }
            } else {
                if (player.hasExact(StaticPlayer.class)) {
                    player.detach(StaticPlayer.class);
                }
            }
        }
    }
}
