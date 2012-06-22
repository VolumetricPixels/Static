/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.protocol;

import org.spout.api.protocol.CodecLookupService;

public class StaticCodecLookupService extends CodecLookupService {
	
	public StaticCodecLookupService() {
		try {
			// TODO: bind everything
		} catch (Exception ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	
}
