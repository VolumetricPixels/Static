/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.controller.living.unit.hero;

import com.volumetricpixels.staticrts.controller.StaticControllerType;
import com.volumetricpixels.staticrts.controller.living.unit.Unit;

/**
 * Represents a Hero
 */
public abstract class Hero extends Unit {

	public Hero(StaticControllerType type) {
	    super(type);
    }
	
}
