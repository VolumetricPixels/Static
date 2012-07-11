/*
  * This file is a part of a compilation by Kohle F. (http://mrkohle.com).
  * 
  * This project is licensed under the Creative Commons Attribution-ShareAlike License. (http://creativecommons.org/licenses/by-sa/3.0/)
  * 
  * This file was created on Jul 11, 2012 at 6:32:46 PM
*/
package com.volumetricpixels.staticrts.protocol.msg;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.spout.api.protocol.Message;
import org.spout.api.util.SpoutToStringStyle;

/*
 * TODO
 * Finish KickMessage
 */
public class KickMessage extends Message {

	private String reason;

	public KickMessage(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, SpoutToStringStyle.INSTANCE).append("reason", reason).toString();
	}

	
}
