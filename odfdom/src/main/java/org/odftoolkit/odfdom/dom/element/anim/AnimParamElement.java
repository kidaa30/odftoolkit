/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimValueAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element anim:param}.
 *
 */
public class AnimParamElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.ANIM, "param" );


	/**
	 * Create the instance of <code>AnimParamElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public AnimParamElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element anim:param}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  AnimParamElement}
	 *
     * @param animNameAttributeValue  The mandatory attribute {@odf.attribute  anim:name}"
     * @param animValueAttributeValue  The mandatory attribute {@odf.attribute  anim:value}"
     *
	 */
	public void init(String animNameAttributeValue, String animValueAttributeValue)
	{
		setAnimNameAttribute( animNameAttributeValue );
		setAnimValueAttribute( animValueAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>AnimNameAttribute</code> , See {@odf.attribute anim:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAnimNameAttribute()
	{
		AnimNameAttribute attr = (AnimNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.ANIM), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>AnimNameAttribute</code> , See {@odf.attribute anim:name}
	 *
	 * @param animNameValue   The type is <code>String</code>
	 */
	public void setAnimNameAttribute( String animNameValue )
	{
		AnimNameAttribute attr =  new AnimNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( animNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>AnimValueAttribute</code> , See {@odf.attribute anim:value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAnimValueAttribute()
	{
		AnimValueAttribute attr = (AnimValueAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.ANIM), "value" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>AnimValueAttribute</code> , See {@odf.attribute anim:value}
	 *
	 * @param animValueValue   The type is <code>String</code>
	 */
	public void setAnimValueAttribute( String animValueValue )
	{
		AnimValueAttribute attr =  new AnimValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( animValueValue );
	}

}
