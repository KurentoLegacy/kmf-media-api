/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.kurento.kmf.media.commands.internal;

import com.kurento.kmf.media.commands.MediaCommandResult;
import com.kurento.kms.thrift.api.Params;

public abstract class AbstractMediaCommandResult implements MediaCommandResult {

	/**
	 * Deserializes a command result obtained form the media server.
	 * Implementations of this class are responsible for the correct
	 * deserialization, since each command returns a different type of result.
	 * 
	 * @param result
	 *            The result form the command. This is a thrift
	 *            {@link com.kurento.kms.thrift.api.Params} structure
	 */
	public abstract void deserializeCommandResult(Params result);

}