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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleVerticalAlignAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleColorAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element style:column-sep}.
 *
 */
public class StyleColumnSepElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.STYLE, "column-sep" );

	/**
	 * The value set of {@odf.attribute style:vertical-align}.
	 */
	 public enum StyleVerticalAlignAttributeValue {
	 
	 BOTTOM( StyleVerticalAlignAttribute.Value.BOTTOM.toString() ), MIDDLE( StyleVerticalAlignAttribute.Value.MIDDLE.toString() ), TOP( StyleVerticalAlignAttribute.Value.TOP.toString() );
              
		private String mValue;
	 	
		StyleVerticalAlignAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static StyleVerticalAlignAttributeValue enumValueOf( String value )
	    {
	        for( StyleVerticalAlignAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}

	/**
	 * Create the instance of <code>StyleColumnSepElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleColumnSepElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:column-sep}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  StyleColumnSepElement}
	 *
     * @param styleWidthAttributeValue  The mandatory attribute {@odf.attribute  style:width}"
     *
	 */
	public void init(String styleWidthAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleStyleAttribute</code> , See {@odf.attribute style:style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleStyleAttribute()
	{
		StyleStyleAttribute attr = (StyleStyleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "style" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StyleStyleAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleStyleAttribute</code> , See {@odf.attribute style:style}
	 *
	 * @param styleStyleValue   The type is <code>String</code>
	 */
	public void setStyleStyleAttribute( String styleStyleValue )
	{
		StyleStyleAttribute attr =  new StyleStyleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleStyleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleWidthAttribute</code> , See {@odf.attribute style:width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleWidthAttribute()
	{
		StyleWidthAttribute attr = (StyleWidthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "width" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleWidthAttribute</code> , See {@odf.attribute style:width}
	 *
	 * @param styleWidthValue   The type is <code>String</code>
	 */
	public void setStyleWidthAttribute( String styleWidthValue )
	{
		StyleWidthAttribute attr =  new StyleWidthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleWidthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleHeightAttribute</code> , See {@odf.attribute style:height}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleHeightAttribute()
	{
		StyleHeightAttribute attr = (StyleHeightAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "height" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StyleHeightAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleHeightAttribute</code> , See {@odf.attribute style:height}
	 *
	 * @param styleHeightValue   The type is <code>String</code>
	 */
	public void setStyleHeightAttribute( String styleHeightValue )
	{
		StyleHeightAttribute attr =  new StyleHeightAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleHeightValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleVerticalAlignAttribute</code> , See {@odf.attribute style:vertical-align}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleVerticalAlignAttribute()
	{
		StyleVerticalAlignAttribute attr = (StyleVerticalAlignAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "vertical-align" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StyleVerticalAlignAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleVerticalAlignAttribute</code> , See {@odf.attribute style:vertical-align}
	 *
	 * @param styleVerticalAlignValue   The type is <code>String</code>
	 */
	public void setStyleVerticalAlignAttribute( String styleVerticalAlignValue )
	{
		StyleVerticalAlignAttribute attr =  new StyleVerticalAlignAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleVerticalAlignValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleColorAttribute</code> , See {@odf.attribute style:color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleColorAttribute()
	{
		StyleColorAttribute attr = (StyleColorAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "color" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StyleColorAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleColorAttribute</code> , See {@odf.attribute style:color}
	 *
	 * @param styleColorValue   The type is <code>String</code>
	 */
	public void setStyleColorAttribute( String styleColorValue )
	{
		StyleColorAttribute attr =  new StyleColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleColorValue );
	}

}
