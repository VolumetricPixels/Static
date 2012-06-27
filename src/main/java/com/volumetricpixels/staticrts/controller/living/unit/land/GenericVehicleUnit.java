/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.controller.living.unit.land;

import com.volumetricpixels.staticrts.controller.StaticControllerType;

// TODO: Possibly branch out more before generic for vehicles (E.G. military / road, etc)
public class GenericVehicleUnit extends LandUnit {

	public GenericVehicleUnit() {
	    super(StaticControllerType.VEHICLE);
    }
	
}
