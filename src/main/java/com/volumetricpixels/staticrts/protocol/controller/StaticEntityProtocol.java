/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.protocol.controller;

import org.spout.api.entity.Entity;
import org.spout.api.protocol.EntityProtocol;
import org.spout.api.protocol.Message;

/*
 * TODO
 * Finish EntityProtocol
 */
public class StaticEntityProtocol implements EntityProtocol {

	@Override
    public Message[] getDestroyMessage(Entity e) {
	    return null;
    }

	@Override
    public Message[] getSpawnMessage(Entity e) {
	    return null;
    }

	@Override
    public Message[] getUpdateMessage(Entity e) {
	    return null;
	}
	
}
