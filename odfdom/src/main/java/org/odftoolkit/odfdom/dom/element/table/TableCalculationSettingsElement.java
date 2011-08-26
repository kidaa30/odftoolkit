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
import org.odftoolkit.odfdom.dom.attribute.table.TableCaseSensitiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePrecisionAsShownAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSearchCriteriaMustApplyToWholeCellAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableAutomaticFindLabelsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseRegularExpressionsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseWildcardsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNullYearAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:calculation-settings}.
 *
 */
public class TableCalculationSettingsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "calculation-settings" );

	public static final String  DEFAULT_VALUE_TABLE_CASESENSITIVE_ATTRIBUTE = TableCaseSensitiveAttribute.DEFAULT_VALUE_TRUE;

	/**
	 * Create the instance of <code>TableCalculationSettingsElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableCalculationSettingsElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:calculation-settings}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> , See {@odf.attribute table:case-sensitive}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCaseSensitiveAttribute()
	{
		TableCaseSensitiveAttribute attr = (TableCaseSensitiveAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "case-sensitive" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DEFAULT_VALUE_TABLE_CASESENSITIVE_ATTRIBUTE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCaseSensitiveAttribute</code> , See {@odf.attribute table:case-sensitive}
	 *
	 * @param tableCaseSensitiveValue   The type is <code>String</code>
	 */
	public void setTableCaseSensitiveAttribute( String tableCaseSensitiveValue )
	{
		TableCaseSensitiveAttribute attr =  new TableCaseSensitiveAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableCaseSensitiveValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePrecisionAsShownAttribute</code> , See {@odf.attribute table:precision-as-shown}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTablePrecisionAsShownAttribute()
	{
		TablePrecisionAsShownAttribute attr = (TablePrecisionAsShownAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "precision-as-shown" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TablePrecisionAsShownAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePrecisionAsShownAttribute</code> , See {@odf.attribute table:precision-as-shown}
	 *
	 * @param tablePrecisionAsShownValue   The type is <code>Boolean</code>
	 */
	public void setTablePrecisionAsShownAttribute( Boolean tablePrecisionAsShownValue )
	{
		TablePrecisionAsShownAttribute attr =  new TablePrecisionAsShownAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tablePrecisionAsShownValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSearchCriteriaMustApplyToWholeCellAttribute</code> , See {@odf.attribute table:search-criteria-must-apply-to-whole-cell}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableSearchCriteriaMustApplyToWholeCellAttribute()
	{
		TableSearchCriteriaMustApplyToWholeCellAttribute attr = (TableSearchCriteriaMustApplyToWholeCellAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "search-criteria-must-apply-to-whole-cell" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableSearchCriteriaMustApplyToWholeCellAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSearchCriteriaMustApplyToWholeCellAttribute</code> , See {@odf.attribute table:search-criteria-must-apply-to-whole-cell}
	 *
	 * @param tableSearchCriteriaMustApplyToWholeCellValue   The type is <code>Boolean</code>
	 */
	public void setTableSearchCriteriaMustApplyToWholeCellAttribute( Boolean tableSearchCriteriaMustApplyToWholeCellValue )
	{
		TableSearchCriteriaMustApplyToWholeCellAttribute attr =  new TableSearchCriteriaMustApplyToWholeCellAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableSearchCriteriaMustApplyToWholeCellValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableAutomaticFindLabelsAttribute</code> , See {@odf.attribute table:automatic-find-labels}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableAutomaticFindLabelsAttribute()
	{
		TableAutomaticFindLabelsAttribute attr = (TableAutomaticFindLabelsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "automatic-find-labels" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableAutomaticFindLabelsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableAutomaticFindLabelsAttribute</code> , See {@odf.attribute table:automatic-find-labels}
	 *
	 * @param tableAutomaticFindLabelsValue   The type is <code>Boolean</code>
	 */
	public void setTableAutomaticFindLabelsAttribute( Boolean tableAutomaticFindLabelsValue )
	{
		TableAutomaticFindLabelsAttribute attr =  new TableAutomaticFindLabelsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableAutomaticFindLabelsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseRegularExpressionsAttribute</code> , See {@odf.attribute table:use-regular-expressions}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseRegularExpressionsAttribute()
	{
		TableUseRegularExpressionsAttribute attr = (TableUseRegularExpressionsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "use-regular-expressions" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseRegularExpressionsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseRegularExpressionsAttribute</code> , See {@odf.attribute table:use-regular-expressions}
	 *
	 * @param tableUseRegularExpressionsValue   The type is <code>Boolean</code>
	 */
	public void setTableUseRegularExpressionsAttribute( Boolean tableUseRegularExpressionsValue )
	{
		TableUseRegularExpressionsAttribute attr =  new TableUseRegularExpressionsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseRegularExpressionsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseWildcardsAttribute</code> , See {@odf.attribute table:use-wildcards}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseWildcardsAttribute()
	{
		TableUseWildcardsAttribute attr = (TableUseWildcardsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "use-wildcards" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseWildcardsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseWildcardsAttribute</code> , See {@odf.attribute table:use-wildcards}
	 *
	 * @param tableUseWildcardsValue   The type is <code>Boolean</code>
	 */
	public void setTableUseWildcardsAttribute( Boolean tableUseWildcardsValue )
	{
		TableUseWildcardsAttribute attr =  new TableUseWildcardsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseWildcardsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNullYearAttribute</code> , See {@odf.attribute table:null-year}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNullYearAttribute()
	{
		TableNullYearAttribute attr = (TableNullYearAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "null-year" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return Integer.valueOf( TableNullYearAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNullYearAttribute</code> , See {@odf.attribute table:null-year}
	 *
	 * @param tableNullYearValue   The type is <code>Integer</code>
	 */
	public void setTableNullYearAttribute( Integer tableNullYearValue )
	{
		TableNullYearAttribute attr =  new TableNullYearAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tableNullYearValue.intValue() );
	}

	/**
	 * Create child element {@odf.element table:null-date}.
	 *
	 * @return   return  the element {@odf.element table:null-date}
	 * DifferentQName 
	 */
	public TableNullDateElement newTableNullDateElement()
	{
		TableNullDateElement  tableNullDate = ((OdfFileDom)this.ownerDocument).newOdfElement(TableNullDateElement.class);
		this.appendChild( tableNullDate);
		return  tableNullDate;
	}                   
               
	/**
	 * Create child element {@odf.element table:iteration}.
	 *
	 * @return   return  the element {@odf.element table:iteration}
	 * DifferentQName 
	 */
	public TableIterationElement newTableIterationElement()
	{
		TableIterationElement  tableIteration = ((OdfFileDom)this.ownerDocument).newOdfElement(TableIterationElement.class);
		this.appendChild( tableIteration);
		return  tableIteration;
	}                   
               
}
