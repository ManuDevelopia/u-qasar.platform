package eu.uqasar.web.components;

/*
 * #%L
 * U-QASAR
 * %%
 * Copyright (C) 2012 - 2015 U-QASAR Consortium
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.model.Model;

/**
 *
 * 
 */
public class DisplayNoneBehavior extends AttributeModifier {

	/**
	 * 
	 */
	private static final long serialVersionUID = -331499280670815711L;

	/**
	 * 
	 */
	public DisplayNoneBehavior() {
		super("style", Model.of("display: none"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.wicket.behavior.Behavior#isTemporary(org.apache.wicket.Component
	 * )
	 */
	@Override
	public boolean isTemporary(Component component) {
		return true;
	}

}
