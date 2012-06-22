/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.protocol.controller.living;

import com.volumetricpixels.staticrts.controller.living.Unit;
import com.volumetricpixels.staticrts.protocol.controller.BasicUnitProtocol;

public abstract class UnitProtocol extends BasicUnitProtocol {
	
	public static final UnitProtocol getProtocolFor(Unit u) {
		return null;
	}
	
}
