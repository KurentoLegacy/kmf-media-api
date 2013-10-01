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

import static com.kurento.kms.thrift.api.UriEndPointTypeConstants.SET_URI;

import com.kurento.kmf.media.internal.ProvidesMediaCommand;

@ProvidesMediaCommand(type = SET_URI, resultClass = VoidCommandResult.class)
public class SetUriCommand extends StringCommand {

	public SetUriCommand(String uri) {
		super(SET_URI, uri);
	}

}