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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableIdAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:dependency}.
 *
 */
public class TableDependencyElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "dependency" );


	/**
	 * Create the instance of <code>TableDependencyElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDependencyElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:dependency}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableDependencyElement}
	 *
     * @param tableIdAttributeValue  The mandatory attribute {@odf.attribute  table:id}"
     *
	 */
	public void init(String tableIdAttributeValue)
	{
		setTableIdAttribute( tableIdAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIdAttribute</code> , See {@odf.attribute table:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableIdAttribute()
	{
		TableIdAttribute attr = (TableIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIdAttribute</code> , See {@odf.attribute table:id}
	 *
	 * @param tableIdValue   The type is <code>String</code>
	 */
	public void setTableIdAttribute( String tableIdValue )
	{
		TableIdAttribute attr =  new TableIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableIdValue );
	}

}
