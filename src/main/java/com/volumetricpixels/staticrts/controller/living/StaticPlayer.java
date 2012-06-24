/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.controller.living;

import org.spout.api.player.Player;

public class StaticPlayer {
	
	private Player spoutPlayer;
	
	private boolean isPlayingFP = false;
	
	public Player getSpoutController() {
		return spoutPlayer;
	}
	
	/**
	 * Players can play in First Person as a hero
	 * This method checks whether the player is
	 * @return Whether the player is in First Person
	 */
	public boolean isPlayingAsHero() {
		return isPlayingFP;
	}
	
}
