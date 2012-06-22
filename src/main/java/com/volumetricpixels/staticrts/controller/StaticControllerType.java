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

public class StaticControllerType extends EmptyConstructorControllerType {
	
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
