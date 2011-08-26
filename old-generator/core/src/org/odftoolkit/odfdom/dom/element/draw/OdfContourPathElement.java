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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<draw:contour-path>".
 */
public abstract class OdfContourPathElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "contour-path" );

    public OdfContourPathElement( OdfFileDom _aOwnerDoc )
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
    public void init(Boolean _aRecreateOnEdit, Integer _aViewbox, String _aD)
    {
        setRecreateOnEdit( _aRecreateOnEdit );
        setViewbox( _aViewbox );
        setD( _aD );
    }

    /**
     * Get value of attribute "draw:recreate-on-edit".
     */
    public Boolean getRecreateOnEdit()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "recreate-on-edit" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:recreate-on-edit".
     */
    public void setRecreateOnEdit( Boolean _aRecreateOnEdit )
    {                    
        String aStringVal = OdfBoolean.toString( _aRecreateOnEdit );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "recreate-on-edit" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ) );
    }

    /**
     * Set value of attribute "svg:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "svg:height".
     */
    public String getHeight()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ) );
    }

    /**
     * Set value of attribute "svg:height".
     */
    public void setHeight( String _aHeight )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ), _aHeight );
    }

    /**
     * Get value of attribute "svg:viewBox".
     */
    public Integer getViewbox()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SVG, "viewBox" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "svg:viewBox".
     */
    public void setViewbox( Integer _aViewbox )
    {                    
        String aStringVal = Integer.toString( _aViewbox );
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "viewBox" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:d".
     */
    public String getD()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "d" ) );
    }

    /**
     * Set value of attribute "svg:d".
     */
    public void setD( String _aD )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "d" ), _aD );
    }

}
