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

package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinExponentDigitsAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberDecimalPlacesAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberMinIntegerDigitsAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberGroupingAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element number:scientific-number}.
 *
 */
public class NumberScientificNumberElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.NUMBER, "scientific-number" );


	/**
	 * Create the instance of <code>NumberScientificNumberElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberScientificNumberElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:scientific-number}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinExponentDigitsAttribute</code> , See {@odf.attribute number:min-exponent-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinExponentDigitsAttribute()
	{
		NumberMinExponentDigitsAttribute attr = (NumberMinExponentDigitsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "min-exponent-digits" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinExponentDigitsAttribute</code> , See {@odf.attribute number:min-exponent-digits}
	 *
	 * @param numberMinExponentDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinExponentDigitsAttribute( Integer numberMinExponentDigitsValue )
	{
		NumberMinExponentDigitsAttribute attr =  new NumberMinExponentDigitsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( numberMinExponentDigitsValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> , See {@odf.attribute number:decimal-places}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberDecimalPlacesAttribute()
	{
		NumberDecimalPlacesAttribute attr = (NumberDecimalPlacesAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "decimal-places" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> , See {@odf.attribute number:decimal-places}
	 *
	 * @param numberDecimalPlacesValue   The type is <code>Integer</code>
	 */
	public void setNumberDecimalPlacesAttribute( Integer numberDecimalPlacesValue )
	{
		NumberDecimalPlacesAttribute attr =  new NumberDecimalPlacesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( numberDecimalPlacesValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code> , See {@odf.attribute number:min-integer-digits}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberMinIntegerDigitsAttribute()
	{
		NumberMinIntegerDigitsAttribute attr = (NumberMinIntegerDigitsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "min-integer-digits" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberMinIntegerDigitsAttribute</code> , See {@odf.attribute number:min-integer-digits}
	 *
	 * @param numberMinIntegerDigitsValue   The type is <code>Integer</code>
	 */
	public void setNumberMinIntegerDigitsAttribute( Integer numberMinIntegerDigitsValue )
	{
		NumberMinIntegerDigitsAttribute attr =  new NumberMinIntegerDigitsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( numberMinIntegerDigitsValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See {@odf.attribute number:grouping}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getNumberGroupingAttribute()
	{
		NumberGroupingAttribute attr = (NumberGroupingAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "grouping" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( NumberGroupingAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberGroupingAttribute</code> , See {@odf.attribute number:grouping}
	 *
	 * @param numberGroupingValue   The type is <code>Boolean</code>
	 */
	public void setNumberGroupingAttribute( Boolean numberGroupingValue )
	{
		NumberGroupingAttribute attr =  new NumberGroupingAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( numberGroupingValue.booleanValue() );
	}

}
