/*
 * Copyright 2009-11 www.scribble.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.scribble.monitor.export;

import org.scribble.common.module.DefaultModuleContext;
import org.scribble.common.module.ModuleContext;
import org.scribble.common.module.ModuleLoader;
import org.scribble.model.local.LProtocolDefinition;
import org.scribble.monitor.model.SessionType;

/**
 * This class exports a local protocol definition to a monitor model.
 *
 */
public class MonitorExporter {

	/**
	 * This method returns the session type associated with the supplied protocol.
	 * 
	 * @param protocol The local protocol
	 * @param loader The module loader
	 * @return The session type
	 */
	public SessionType getSessionType(LProtocolDefinition protocol, ModuleLoader loader) {
		SessionType ret=new SessionType();
		
		ModuleContext context=new DefaultModuleContext(null, protocol.getModule(),
							loader, null);
		
		NodeExporter ne=NodeExporterFactory.getNodeExporter(protocol.getBlock());
		
		if (ne != null) {
			ne.export(context, new ExportState(), protocol.getBlock(), ret);
		}
		
		return (ret);
	}
	
}