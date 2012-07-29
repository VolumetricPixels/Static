/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.protocol;

import org.spout.api.chat.ChatArguments;
import org.spout.api.command.Command;
import org.spout.api.protocol.Message;
import org.spout.api.protocol.Protocol;

public class StaticProtocol extends Protocol {

	public StaticProtocol() {
	    super("Static", new StaticCodecLookupService(), new StaticHandlerLookupService());
    }

    @Override
    public Message getIntroductionMessage(String string) {
        return null;
    }

    @Override
    public Message getKickMessage(ChatArguments chatargs) {
        return null;
    }

    @Override
    public Message getCommandMessage(Command arg0, ChatArguments arg1) {
        return null;
    }
	
}
