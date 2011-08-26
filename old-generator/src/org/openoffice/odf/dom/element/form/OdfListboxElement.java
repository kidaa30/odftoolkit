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

package org.openoffice.odf.dom.element.form;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfId;
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.OdfNonNegativeInteger;
import org.openoffice.odf.dom.type.form.OdfListSourceType;


/**
 * ODF DOM Element implementation for element "<form:listbox>".
 */
public abstract class OdfListboxElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.FORM, "listbox" );

    public OdfListboxElement( OdfFileDom _aOwnerDoc )
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
     * Get value of attribute "form:bound-column".
     */
    public String getBoundColumn()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "bound-column" ) );
    }

    /**
     * Set value of attribute "form:bound-column".
     */
    public void setBoundColumn( String _aBoundColumn )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "bound-column" ), _aBoundColumn );
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
     * Get value of attribute "form:multiple".
     */
    public Boolean getMultiple()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "multiple" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:multiple".
     */
    public void setMultiple( Boolean _aMultiple )
    {                    
        String aStringVal = OdfBoolean.toString( _aMultiple );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "multiple" ), aStringVal );
    }

    /**
     * Get value of attribute "form:xforms-list-source".
     */
    public String getXformsListSource()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "xforms-list-source" ) );
    }

    /**
     * Set value of attribute "form:xforms-list-source".
     */
    public void setXformsListSource( String _aXformsListSource )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "xforms-list-source" ), _aXformsListSource );
    }

}