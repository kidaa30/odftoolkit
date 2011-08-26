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

package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.form.OdfListSourceType;


/**
 * ODF DOM Element implementation for element "<form:combobox>".
 */
public abstract class OdfComboboxElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.FORM, "combobox" );

    public OdfComboboxElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aId)
    {
        setId( _aId );
    }

    /**
     * Get value of attribute "form:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ) );
    }

    /**
     * Set value of attribute "form:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ), _aName );
    }

    /**
     * Get value of attribute "form:control-implementation".
     */
    public String getControlImplementation()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ) );
    }

    /**
     * Set value of attribute "form:control-implementation".
     */
    public void setControlImplementation( String _aControlImplementation )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ), _aControlImplementation );
    }

    /**
     * Get value of attribute "form:id".
     */
    public String getId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:id".
     */
    public void setId( String _aId )
    {                    
        String aStringVal = OdfId.toString( _aId );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "xforms:bind".
     */
    public String getBind()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ) );
    }

    /**
     * Set value of attribute "xforms:bind".
     */
    public void setBind( String _aBind )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ), _aBind );
    }

    /**
     * Get value of attribute "form:current-value".
     */
    public String getCurrentValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "current-value" ) );
    }

    /**
     * Set value of attribute "form:current-value".
     */
    public void setCurrentValue( String _aCurrentValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "current-value" ), _aCurrentValue );
    }

    /**
     * Get value of attribute "form:disabled".
     */
    public Boolean getDisabled()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:disabled".
     */
    public void setDisabled( Boolean _aDisabled )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisabled );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ), aStringVal );
    }

    /**
     * Get value of attribute "form:dropdown".
     */
    public Boolean getDropdown()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "dropdown" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:dropdown".
     */
    public void setDropdown( Boolean _aDropdown )
    {                    
        String aStringVal = OdfBoolean.toString( _aDropdown );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "dropdown" ), aStringVal );
    }

    /**
     * Get value of attribute "form:max-length".
     */
    public Integer getMaxLength()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-length" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:max-length".
     */
    public void setMaxLength( Integer _aMaxLength )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aMaxLength );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "max-length" ), aStringVal );
    }

    /**
     * Get value of attribute "form:printable".
     */
    public Boolean getPrintable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:printable".
     */
    public void setPrintable( Boolean _aPrintable )
    {                    
        String aStringVal = OdfBoolean.toString( _aPrintable );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ), aStringVal );
    }

    /**
     * Get value of attribute "form:readonly".
     */
    public Boolean getReadonly()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "readonly" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:readonly".
     */
    public void setReadonly( Boolean _aReadonly )
    {                    
        String aStringVal = OdfBoolean.toString( _aReadonly );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "readonly" ), aStringVal );
    }

    /**
     * Get value of attribute "form:size".
     */
    public Integer getSize()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "size" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:size".
     */
    public void setSize( Integer _aSize )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aSize );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "size" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-index".
     */
    public Integer getTabIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0";
        }

        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-index".
     */
    public void setTabIndex( Integer _aTabIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aTabIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-stop".
     */
    public Boolean getTabStop()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-stop".
     */
    public void setTabStop( Boolean _aTabStop )
    {                    
        String aStringVal = OdfBoolean.toString( _aTabStop );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ), aStringVal );
    }

    /**
     * Get value of attribute "form:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ) );
    }

    /**
     * Set value of attribute "form:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "form:value".
     */
    public String getValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ) );
    }

    /**
     * Set value of attribute "form:value".
     */
    public void setValue( String _aValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ), _aValue );
    }

    /**
     * Get value of attribute "form:convert-empty-to-null".
     */
    public Boolean getConvertEmptyToNull()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "convert-empty-to-null" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:convert-empty-to-null".
     */
    public void setConvertEmptyToNull( Boolean _aConvertEmptyToNull )
    {                    
        String aStringVal = OdfBoolean.toString( _aConvertEmptyToNull );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "convert-empty-to-null" ), aStringVal );
    }

    /**
     * Get value of attribute "form:data-field".
     */
    public String getDataField()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "data-field" ) );
    }

    /**
     * Set value of attribute "form:data-field".
     */
    public void setDataField( String _aDataField )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "data-field" ), _aDataField );
    }

    /**
     * Get value of attribute "form:list-source".
     */
    public String getListSource()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "list-source" ) );
    }

    /**
     * Set value of attribute "form:list-source".
     */
    public void setListSource( String _aListSource )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "list-source" ), _aListSource );
    }

    /**
     * Get value of attribute "form:list-source-type".
     */
    public OdfListSourceType getListSourceType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "list-source-type" ) );
        return OdfListSourceType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:list-source-type".
     */
    public void setListSourceType( OdfListSourceType _aListSourceType )
    {                    
        String aStringVal = OdfListSourceType.toString( _aListSourceType );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "list-source-type" ), aStringVal );
    }

    /**
     * Get value of attribute "form:auto-complete".
     */
    public Boolean getAutoComplete()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "auto-complete" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:auto-complete".
     */
    public void setAutoComplete( Boolean _aAutoComplete )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutoComplete );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "auto-complete" ), aStringVal );
    }

}
