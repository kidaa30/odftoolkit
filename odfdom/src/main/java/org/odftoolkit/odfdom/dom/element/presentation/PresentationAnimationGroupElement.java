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

package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;


/**
 * DOM implementation of OpenDocument element  {@odf.element presentation:animation-group}.
 *
 */
public class PresentationAnimationGroupElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.PRESENTATION, "animation-group" );


	/**
	 * Create the instance of <code>PresentationAnimationGroupElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public PresentationAnimationGroupElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element presentation:animation-group}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element presentation:show-shape}.
	 *
     * @param drawShapeIdAttributeValue  the <code>String</code> value of <code>DrawShapeIdAttribute</code>, see {@odf.attribute  draw:shape-id} at specification
	 * @return   return  the element {@odf.element presentation:show-shape}
	 * DifferentQName 
	 */
    
	public PresentationShowShapeElement newPresentationShowShapeElement(String drawShapeIdAttributeValue)
	{
		PresentationShowShapeElement  presentationShowShape = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationShowShapeElement.class);
		presentationShowShape.setDrawShapeIdAttribute( drawShapeIdAttributeValue );
		this.appendChild( presentationShowShape);
		return  presentationShowShape;      
	}
    
	/**
	 * Create child element {@odf.element presentation:show-text}.
	 *
     * @param drawShapeIdAttributeValue  the <code>String</code> value of <code>DrawShapeIdAttribute</code>, see {@odf.attribute  draw:shape-id} at specification
	 * @return   return  the element {@odf.element presentation:show-text}
	 * DifferentQName 
	 */
    
	public PresentationShowTextElement newPresentationShowTextElement(String drawShapeIdAttributeValue)
	{
		PresentationShowTextElement  presentationShowText = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationShowTextElement.class);
		presentationShowText.setDrawShapeIdAttribute( drawShapeIdAttributeValue );
		this.appendChild( presentationShowText);
		return  presentationShowText;      
	}
    
	/**
	 * Create child element {@odf.element presentation:hide-shape}.
	 *
     * @param drawShapeIdAttributeValue  the <code>String</code> value of <code>DrawShapeIdAttribute</code>, see {@odf.attribute  draw:shape-id} at specification
	 * @return   return  the element {@odf.element presentation:hide-shape}
	 * DifferentQName 
	 */
    
	public PresentationHideShapeElement newPresentationHideShapeElement(String drawShapeIdAttributeValue)
	{
		PresentationHideShapeElement  presentationHideShape = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationHideShapeElement.class);
		presentationHideShape.setDrawShapeIdAttribute( drawShapeIdAttributeValue );
		this.appendChild( presentationHideShape);
		return  presentationHideShape;      
	}
    
	/**
	 * Create child element {@odf.element presentation:hide-text}.
	 *
     * @param drawShapeIdAttributeValue  the <code>String</code> value of <code>DrawShapeIdAttribute</code>, see {@odf.attribute  draw:shape-id} at specification
	 * @return   return  the element {@odf.element presentation:hide-text}
	 * DifferentQName 
	 */
    
	public PresentationHideTextElement newPresentationHideTextElement(String drawShapeIdAttributeValue)
	{
		PresentationHideTextElement  presentationHideText = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationHideTextElement.class);
		presentationHideText.setDrawShapeIdAttribute( drawShapeIdAttributeValue );
		this.appendChild( presentationHideText);
		return  presentationHideText;      
	}
    
	/**
	 * Create child element {@odf.element presentation:dim}.
	 *
     * @param drawColorAttributeValue  the <code>String</code> value of <code>DrawColorAttribute</code>, see {@odf.attribute  draw:color} at specification
	 * @param drawShapeIdAttributeValue  the <code>String</code> value of <code>DrawShapeIdAttribute</code>, see {@odf.attribute  draw:shape-id} at specification
	 * @return   return  the element {@odf.element presentation:dim}
	 * DifferentQName 
	 */
    
	public PresentationDimElement newPresentationDimElement(String drawColorAttributeValue, String drawShapeIdAttributeValue)
	{
		PresentationDimElement  presentationDim = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationDimElement.class);
		presentationDim.setDrawColorAttribute( drawColorAttributeValue );
		presentationDim.setDrawShapeIdAttribute( drawShapeIdAttributeValue );
		this.appendChild( presentationDim);
		return  presentationDim;      
	}
    
	/**
	 * Create child element {@odf.element presentation:play}.
	 *
     * @param drawShapeIdAttributeValue  the <code>String</code> value of <code>DrawShapeIdAttribute</code>, see {@odf.attribute  draw:shape-id} at specification
	 * @return   return  the element {@odf.element presentation:play}
	 * DifferentQName 
	 */
    
	public PresentationPlayElement newPresentationPlayElement(String drawShapeIdAttributeValue)
	{
		PresentationPlayElement  presentationPlay = ((OdfFileDom)this.ownerDocument).newOdfElement(PresentationPlayElement.class);
		presentationPlay.setDrawShapeIdAttribute( drawShapeIdAttributeValue );
		this.appendChild( presentationPlay);
		return  presentationPlay;      
	}
    
}
