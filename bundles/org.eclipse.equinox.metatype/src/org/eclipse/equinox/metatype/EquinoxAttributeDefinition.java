/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.eclipse.equinox.metatype;

import org.osgi.service.metatype.AttributeDefinition;

/**
 * An {@link Extendable extendable} version of {@link AttributeDefinition 
 * attribute definition} allowing access to any {@link 
 * Extendable#getExtensionAttributes(String) extension attributes} provided by
 * third parties.
 * <p/>
 * For example, an Equinox attribute definition will contain all XML attributes
 * specified as part of the &lt;AD/&gt; element with namespaces other than the 
 * metatype namespace as extension attributes.
 * 
 * @since 1.2
 *
 */
public interface EquinoxAttributeDefinition extends AttributeDefinition, Extendable {
	/**
	 * Get the maximum value this attribute may hold as specified by the 
	 * optional "max" XML attribute of the &lt;AD&gt; element.
	 * 
	 * @return The maximum value this attribute may hold, or <code>null</code>
	 *         if unspecified.
	 */
	public String getMax();

	/**
	 * Get the minimum value this attribute may hold as specified by the 
	 * optional "min" XML attribute of the &lt;AD&gt; element.
	 * 
	 * @return The minimum value this attribute may hold, or <code>null</code>
	 *         if unspecified.
	 */
	public String getMin();
}
