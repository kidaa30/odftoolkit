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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexScopeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRelativeTabStopPositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseSpreadsheetObjectsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseMathObjectsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseDrawObjectsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseChartObjectsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseOtherObjectsAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:object-index-source}.
 *
 */
public class TextObjectIndexSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "object-index-source" );


	/**
	 * Create the instance of <code>TextObjectIndexSourceElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextObjectIndexSourceElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:object-index-source}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIndexScopeAttribute()
	{
		TextIndexScopeAttribute attr = (TextIndexScopeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "index-scope" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TextIndexScopeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @param textIndexScopeValue   The type is <code>String</code>
	 */
	public void setTextIndexScopeAttribute( String textIndexScopeValue )
	{
		TextIndexScopeAttribute attr =  new TextIndexScopeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textIndexScopeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextRelativeTabStopPositionAttribute()
	{
		TextRelativeTabStopPositionAttribute attr = (TextRelativeTabStopPositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "relative-tab-stop-position" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextRelativeTabStopPositionAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @param textRelativeTabStopPositionValue   The type is <code>Boolean</code>
	 */
	public void setTextRelativeTabStopPositionAttribute( Boolean textRelativeTabStopPositionValue )
	{
		TextRelativeTabStopPositionAttribute attr =  new TextRelativeTabStopPositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textRelativeTabStopPositionValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseSpreadsheetObjectsAttribute</code> , See {@odf.attribute text:use-spreadsheet-objects}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseSpreadsheetObjectsAttribute()
	{
		TextUseSpreadsheetObjectsAttribute attr = (TextUseSpreadsheetObjectsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-spreadsheet-objects" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseSpreadsheetObjectsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseSpreadsheetObjectsAttribute</code> , See {@odf.attribute text:use-spreadsheet-objects}
	 *
	 * @param textUseSpreadsheetObjectsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseSpreadsheetObjectsAttribute( Boolean textUseSpreadsheetObjectsValue )
	{
		TextUseSpreadsheetObjectsAttribute attr =  new TextUseSpreadsheetObjectsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseSpreadsheetObjectsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseMathObjectsAttribute</code> , See {@odf.attribute text:use-math-objects}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseMathObjectsAttribute()
	{
		TextUseMathObjectsAttribute attr = (TextUseMathObjectsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-math-objects" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseMathObjectsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseMathObjectsAttribute</code> , See {@odf.attribute text:use-math-objects}
	 *
	 * @param textUseMathObjectsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseMathObjectsAttribute( Boolean textUseMathObjectsValue )
	{
		TextUseMathObjectsAttribute attr =  new TextUseMathObjectsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseMathObjectsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseDrawObjectsAttribute</code> , See {@odf.attribute text:use-draw-objects}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseDrawObjectsAttribute()
	{
		TextUseDrawObjectsAttribute attr = (TextUseDrawObjectsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-draw-objects" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseDrawObjectsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseDrawObjectsAttribute</code> , See {@odf.attribute text:use-draw-objects}
	 *
	 * @param textUseDrawObjectsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseDrawObjectsAttribute( Boolean textUseDrawObjectsValue )
	{
		TextUseDrawObjectsAttribute attr =  new TextUseDrawObjectsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseDrawObjectsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseChartObjectsAttribute</code> , See {@odf.attribute text:use-chart-objects}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseChartObjectsAttribute()
	{
		TextUseChartObjectsAttribute attr = (TextUseChartObjectsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-chart-objects" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseChartObjectsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseChartObjectsAttribute</code> , See {@odf.attribute text:use-chart-objects}
	 *
	 * @param textUseChartObjectsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseChartObjectsAttribute( Boolean textUseChartObjectsValue )
	{
		TextUseChartObjectsAttribute attr =  new TextUseChartObjectsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseChartObjectsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseOtherObjectsAttribute</code> , See {@odf.attribute text:use-other-objects}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseOtherObjectsAttribute()
	{
		TextUseOtherObjectsAttribute attr = (TextUseOtherObjectsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-other-objects" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseOtherObjectsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseOtherObjectsAttribute</code> , See {@odf.attribute text:use-other-objects}
	 *
	 * @param textUseOtherObjectsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseOtherObjectsAttribute( Boolean textUseOtherObjectsValue )
	{
		TextUseOtherObjectsAttribute attr =  new TextUseOtherObjectsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseOtherObjectsValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element text:index-title-template}.
	 *
	 * @return   return  the element {@odf.element text:index-title-template}
	 * DifferentQName 
	 */
	public TextIndexTitleTemplateElement newTextIndexTitleTemplateElement()
	{
		TextIndexTitleTemplateElement  textIndexTitleTemplate = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexTitleTemplateElement.class);
		this.appendChild( textIndexTitleTemplate);
		return  textIndexTitleTemplate;
	}                   
               
	/**
	 * Create child element {@odf.element text:object-index-entry-template}.
	 *
     * @param textStyleNameAttributeValue  the <code>String</code> value of <code>TextStyleNameAttribute</code>, see {@odf.attribute  text:style-name} at specification
	 * @return   return  the element {@odf.element text:object-index-entry-template}
	 * DifferentQName 
	 */
    
	public TextObjectIndexEntryTemplateElement newTextObjectIndexEntryTemplateElement(String textStyleNameAttributeValue)
	{
		TextObjectIndexEntryTemplateElement  textObjectIndexEntryTemplate = ((OdfFileDom)this.ownerDocument).newOdfElement(TextObjectIndexEntryTemplateElement.class);
		textObjectIndexEntryTemplate.setTextStyleNameAttribute( textStyleNameAttributeValue );
		this.appendChild( textObjectIndexEntryTemplate);
		return  textObjectIndexEntryTemplate;      
	}
    
}
