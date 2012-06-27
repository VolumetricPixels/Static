/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.controller;

import org.spout.api.entity.component.Controller;
import org.spout.api.entity.component.controller.type.EmptyConstructorControllerType;
import org.spout.api.protocol.EntityProtocol;

import com.volumetricpixels.staticrts.StaticPlugin;
import com.volumetricpixels.staticrts.controller.living.unit.air.GenericHelicopterUnit;
import com.volumetricpixels.staticrts.controller.living.unit.air.GenericPlaneUnit;
import com.volumetricpixels.staticrts.controller.living.unit.air.GenericSpaceshipUnit;
import com.volumetricpixels.staticrts.controller.living.unit.land.GenericInfantryUnit;
import com.volumetricpixels.staticrts.controller.living.unit.land.GenericVehicleUnit;
import com.volumetricpixels.staticrts.controller.living.unit.water.GenericBoatUnit;

public class StaticControllerType extends EmptyConstructorControllerType {
	
	// TODO: Create protocol for different Generic types to change the last argument from null
	public static final StaticControllerType INFANTRY = new StaticControllerType(1, GenericInfantryUnit.class, "Infantry", null);
	public static final StaticControllerType VEHICLE = new StaticControllerType(2, GenericVehicleUnit.class, "Vehicle", null);
	public static final StaticControllerType PLANE = new StaticControllerType(3, GenericPlaneUnit.class, "Plane", null);
	public static final StaticControllerType HELICOPTER = new StaticControllerType(4, GenericHelicopterUnit.class, "Helicopter", null);
	public static final StaticControllerType SPACESHIP = new StaticControllerType(5, GenericSpaceshipUnit.class, "Spaceship", null);
	public static final StaticControllerType BOAT = new StaticControllerType(6, GenericBoatUnit.class, "Boat", null);
	
	private final int id;

	public StaticControllerType(final int id, Class<? extends Controller> controller, String name, EntityProtocol protocol) {
	    super(controller, name);
	    this.id = id;
	    if (protocol != null) {
			this.setEntityProtocol(StaticPlugin.PROTOCOL_ID, protocol);
		}
    }
	
	public final int getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return getClass().getName() + " {id = " + this.getID() + " , name = " + this.getName() + "}";
	}
	
}
