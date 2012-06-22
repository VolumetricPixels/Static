/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.controller.living;

import com.volumetricpixels.staticrts.controller.StaticActionController;
import com.volumetricpixels.staticrts.controller.StaticControllerType;

public abstract class Living extends StaticActionController {

	protected Living(StaticControllerType type) {
	    super(type);
    }
	
	@Override
	public void onAttached() {
		super.onAttached();
	}
	
	@Override
	public void onTick(float dt) {
		// TODO: Process things on tick
	}
	
}
