/*
 * Copyright 2012 Decebal Suiu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with
 * the License. You may obtain a copy of the License in the LICENSE file, or at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package ro.fortsoft.wicket.dashboard.web;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author Decebal Suiu
 */
public class DashboardEvent {

	public enum EventType {
		WIDGET_ADDED,
		WIDGET_REMOVED,
		WIDGETS_SORTED;
	}
	
	private final AjaxRequestTarget target;
	private final EventType type;
	private final Object detail;

	public DashboardEvent(AjaxRequestTarget target, EventType type, Object detail) {
		this.type = type;
		this.detail = detail;
		this.target = target;
	}

	public AjaxRequestTarget getTarget() {
		return target;
	}

	public EventType getType() {
		return type;
	}

	public Object getDetail() {
		return detail;
	}

}
