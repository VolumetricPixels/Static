/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.protocol;

import org.spout.api.protocol.Message;
import org.spout.api.protocol.Protocol;

public class StaticProtocol extends Protocol {

	public StaticProtocol() {
	    super("Static", new StaticCodecLookupService(), new StaticHandlerLookupService());
    }

	@Override
	public Message getChatMessage(Object... arg0) {
		// TODO Add messages
		return null;
	}

	@Override
	public Message getIntroductionMessage(String arg0) {
		// TODO Add messages
		return null;
	}

	@Override
	public Message getKickMessage(Object... arg0) {
		// TODO Add messages
		//StaticStyleHandler & Chat needs to be implemented, KickMessage needs to be finished
		//return new KickMessage(ChatStyle.stringify(StaticStyleHandler.ID, message));
		return null;
	}
	
}