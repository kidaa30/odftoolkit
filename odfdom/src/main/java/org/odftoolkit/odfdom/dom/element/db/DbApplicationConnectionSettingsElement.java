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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsTableNameLengthLimitedAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbEnableSql92CheckAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbAppendTableAliasNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbIgnoreDriverPrivilegesAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbBooleanComparisonModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbUseCatalogAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbMaxRowCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbSuppressVersionColumnsAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element db:application-connection-settings}.
 *
 */
public class DbApplicationConnectionSettingsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DB, "application-connection-settings" );


	/**
	 * Create the instance of <code>DbApplicationConnectionSettingsElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbApplicationConnectionSettingsElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:application-connection-settings}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbIsTableNameLengthLimitedAttribute</code> , See {@odf.attribute db:is-table-name-length-limited}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbIsTableNameLengthLimitedAttribute()
	{
		DbIsTableNameLengthLimitedAttribute attr = (DbIsTableNameLengthLimitedAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "is-table-name-length-limited" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbIsTableNameLengthLimitedAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbIsTableNameLengthLimitedAttribute</code> , See {@odf.attribute db:is-table-name-length-limited}
	 *
	 * @param dbIsTableNameLengthLimitedValue   The type is <code>Boolean</code>
	 */
	public void setDbIsTableNameLengthLimitedAttribute( Boolean dbIsTableNameLengthLimitedValue )
	{
		DbIsTableNameLengthLimitedAttribute attr =  new DbIsTableNameLengthLimitedAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbIsTableNameLengthLimitedValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbEnableSql92CheckAttribute</code> , See {@odf.attribute db:enable-sql92-check}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbEnableSql92CheckAttribute()
	{
		DbEnableSql92CheckAttribute attr = (DbEnableSql92CheckAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "enable-sql92-check" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbEnableSql92CheckAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbEnableSql92CheckAttribute</code> , See {@odf.attribute db:enable-sql92-check}
	 *
	 * @param dbEnableSql92CheckValue   The type is <code>Boolean</code>
	 */
	public void setDbEnableSql92CheckAttribute( Boolean dbEnableSql92CheckValue )
	{
		DbEnableSql92CheckAttribute attr =  new DbEnableSql92CheckAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbEnableSql92CheckValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbAppendTableAliasNameAttribute</code> , See {@odf.attribute db:append-table-alias-name}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbAppendTableAliasNameAttribute()
	{
		DbAppendTableAliasNameAttribute attr = (DbAppendTableAliasNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "append-table-alias-name" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbAppendTableAliasNameAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbAppendTableAliasNameAttribute</code> , See {@odf.attribute db:append-table-alias-name}
	 *
	 * @param dbAppendTableAliasNameValue   The type is <code>Boolean</code>
	 */
	public void setDbAppendTableAliasNameAttribute( Boolean dbAppendTableAliasNameValue )
	{
		DbAppendTableAliasNameAttribute attr =  new DbAppendTableAliasNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbAppendTableAliasNameValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbIgnoreDriverPrivilegesAttribute</code> , See {@odf.attribute db:ignore-driver-privileges}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbIgnoreDriverPrivilegesAttribute()
	{
		DbIgnoreDriverPrivilegesAttribute attr = (DbIgnoreDriverPrivilegesAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "ignore-driver-privileges" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbIgnoreDriverPrivilegesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbIgnoreDriverPrivilegesAttribute</code> , See {@odf.attribute db:ignore-driver-privileges}
	 *
	 * @param dbIgnoreDriverPrivilegesValue   The type is <code>Boolean</code>
	 */
	public void setDbIgnoreDriverPrivilegesAttribute( Boolean dbIgnoreDriverPrivilegesValue )
	{
		DbIgnoreDriverPrivilegesAttribute attr =  new DbIgnoreDriverPrivilegesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbIgnoreDriverPrivilegesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbBooleanComparisonModeAttribute</code> , See {@odf.attribute db:boolean-comparison-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbBooleanComparisonModeAttribute()
	{
		DbBooleanComparisonModeAttribute attr = (DbBooleanComparisonModeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "boolean-comparison-mode" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DbBooleanComparisonModeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbBooleanComparisonModeAttribute</code> , See {@odf.attribute db:boolean-comparison-mode}
	 *
	 * @param dbBooleanComparisonModeValue   The type is <code>String</code>
	 */
	public void setDbBooleanComparisonModeAttribute( String dbBooleanComparisonModeValue )
	{
		DbBooleanComparisonModeAttribute attr =  new DbBooleanComparisonModeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbBooleanComparisonModeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbUseCatalogAttribute</code> , See {@odf.attribute db:use-catalog}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbUseCatalogAttribute()
	{
		DbUseCatalogAttribute attr = (DbUseCatalogAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "use-catalog" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbUseCatalogAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbUseCatalogAttribute</code> , See {@odf.attribute db:use-catalog}
	 *
	 * @param dbUseCatalogValue   The type is <code>Boolean</code>
	 */
	public void setDbUseCatalogAttribute( Boolean dbUseCatalogValue )
	{
		DbUseCatalogAttribute attr =  new DbUseCatalogAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbUseCatalogValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbMaxRowCountAttribute</code> , See {@odf.attribute db:max-row-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDbMaxRowCountAttribute()
	{
		DbMaxRowCountAttribute attr = (DbMaxRowCountAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "max-row-count" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbMaxRowCountAttribute</code> , See {@odf.attribute db:max-row-count}
	 *
	 * @param dbMaxRowCountValue   The type is <code>Integer</code>
	 */
	public void setDbMaxRowCountAttribute( Integer dbMaxRowCountValue )
	{
		DbMaxRowCountAttribute attr =  new DbMaxRowCountAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( dbMaxRowCountValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbSuppressVersionColumnsAttribute</code> , See {@odf.attribute db:suppress-version-columns}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbSuppressVersionColumnsAttribute()
	{
		DbSuppressVersionColumnsAttribute attr = (DbSuppressVersionColumnsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "suppress-version-columns" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbSuppressVersionColumnsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbSuppressVersionColumnsAttribute</code> , See {@odf.attribute db:suppress-version-columns}
	 *
	 * @param dbSuppressVersionColumnsValue   The type is <code>Boolean</code>
	 */
	public void setDbSuppressVersionColumnsAttribute( Boolean dbSuppressVersionColumnsValue )
	{
		DbSuppressVersionColumnsAttribute attr =  new DbSuppressVersionColumnsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbSuppressVersionColumnsValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element db:table-filter}.
	 *
	 * @return   return  the element {@odf.element db:table-filter}
	 * DifferentQName 
	 */
	public DbTableFilterElement newDbTableFilterElement()
	{
		DbTableFilterElement  dbTableFilter = ((OdfFileDom)this.ownerDocument).newOdfElement(DbTableFilterElement.class);
		this.appendChild( dbTableFilter);
		return  dbTableFilter;
	}                   
               
	/**
	 * Create child element {@odf.element db:table-type-filter}.
	 *
	 * @return   return  the element {@odf.element db:table-type-filter}
	 * DifferentQName 
	 */
	public DbTableTypeFilterElement newDbTableTypeFilterElement()
	{
		DbTableTypeFilterElement  dbTableTypeFilter = ((OdfFileDom)this.ownerDocument).newOdfElement(DbTableTypeFilterElement.class);
		this.appendChild( dbTableTypeFilter);
		return  dbTableTypeFilter;
	}                   
               
	/**
	 * Create child element {@odf.element db:data-source-settings}.
	 *
	 * @return   return  the element {@odf.element db:data-source-settings}
	 * DifferentQName 
	 */
	public DbDataSourceSettingsElement newDbDataSourceSettingsElement()
	{
		DbDataSourceSettingsElement  dbDataSourceSettings = ((OdfFileDom)this.ownerDocument).newOdfElement(DbDataSourceSettingsElement.class);
		this.appendChild( dbDataSourceSettings);
		return  dbDataSourceSettings;
	}                   
               
}
