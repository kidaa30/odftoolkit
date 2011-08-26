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

package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationNodeTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresetIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresetSubTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresetClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationMasterElementAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationGroupIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilEndsyncAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilBeginAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilEndAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilDurAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRepeatDurAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRepeatCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRestartAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilRestartDefaultAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilFillAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilFillDefaultAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAccelerateAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilDecelerateAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilAutoReverseAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element anim:seq}.
 *
 */
public class AnimSeqElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.ANIM, "seq" );


	/**
	 * Create the instance of <code>AnimSeqElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public AnimSeqElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element anim:seq}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationNodeTypeAttribute</code> , See {@odf.attribute presentation:node-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationNodeTypeAttribute()
	{
		PresentationNodeTypeAttribute attr = (PresentationNodeTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "node-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return PresentationNodeTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationNodeTypeAttribute</code> , See {@odf.attribute presentation:node-type}
	 *
	 * @param presentationNodeTypeValue   The type is <code>String</code>
	 */
	public void setPresentationNodeTypeAttribute( String presentationNodeTypeValue )
	{
		PresentationNodeTypeAttribute attr =  new PresentationNodeTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationNodeTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresetIdAttribute</code> , See {@odf.attribute presentation:preset-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresetIdAttribute()
	{
		PresentationPresetIdAttribute attr = (PresentationPresetIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "preset-id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresetIdAttribute</code> , See {@odf.attribute presentation:preset-id}
	 *
	 * @param presentationPresetIdValue   The type is <code>String</code>
	 */
	public void setPresentationPresetIdAttribute( String presentationPresetIdValue )
	{
		PresentationPresetIdAttribute attr =  new PresentationPresetIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPresetIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresetSubTypeAttribute</code> , See {@odf.attribute presentation:preset-sub-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresetSubTypeAttribute()
	{
		PresentationPresetSubTypeAttribute attr = (PresentationPresetSubTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "preset-sub-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresetSubTypeAttribute</code> , See {@odf.attribute presentation:preset-sub-type}
	 *
	 * @param presentationPresetSubTypeValue   The type is <code>String</code>
	 */
	public void setPresentationPresetSubTypeAttribute( String presentationPresetSubTypeValue )
	{
		PresentationPresetSubTypeAttribute attr =  new PresentationPresetSubTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPresetSubTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresetClassAttribute</code> , See {@odf.attribute presentation:preset-class}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresetClassAttribute()
	{
		PresentationPresetClassAttribute attr = (PresentationPresetClassAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "preset-class" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return PresentationPresetClassAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresetClassAttribute</code> , See {@odf.attribute presentation:preset-class}
	 *
	 * @param presentationPresetClassValue   The type is <code>String</code>
	 */
	public void setPresentationPresetClassAttribute( String presentationPresetClassValue )
	{
		PresentationPresetClassAttribute attr =  new PresentationPresetClassAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPresetClassValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationMasterElementAttribute</code> , See {@odf.attribute presentation:master-element}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationMasterElementAttribute()
	{
		PresentationMasterElementAttribute attr = (PresentationMasterElementAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "master-element" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationMasterElementAttribute</code> , See {@odf.attribute presentation:master-element}
	 *
	 * @param presentationMasterElementValue   The type is <code>String</code>
	 */
	public void setPresentationMasterElementAttribute( String presentationMasterElementValue )
	{
		PresentationMasterElementAttribute attr =  new PresentationMasterElementAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationMasterElementValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationGroupIdAttribute</code> , See {@odf.attribute presentation:group-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationGroupIdAttribute()
	{
		PresentationGroupIdAttribute attr = (PresentationGroupIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "group-id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationGroupIdAttribute</code> , See {@odf.attribute presentation:group-id}
	 *
	 * @param presentationGroupIdValue   The type is <code>String</code>
	 */
	public void setPresentationGroupIdAttribute( String presentationGroupIdValue )
	{
		PresentationGroupIdAttribute attr =  new PresentationGroupIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationGroupIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>AnimIdAttribute</code> , See {@odf.attribute anim:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAnimIdAttribute()
	{
		AnimIdAttribute attr = (AnimIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.ANIM), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>AnimIdAttribute</code> , See {@odf.attribute anim:id}
	 *
	 * @param animIdValue   The type is <code>String</code>
	 */
	public void setAnimIdAttribute( String animIdValue )
	{
		AnimIdAttribute attr =  new AnimIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( animIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilEndsyncAttribute</code> , See {@odf.attribute smil:endsync}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilEndsyncAttribute()
	{
		SmilEndsyncAttribute attr = (SmilEndsyncAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "endsync" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilEndsyncAttribute</code> , See {@odf.attribute smil:endsync}
	 *
	 * @param smilEndsyncValue   The type is <code>String</code>
	 */
	public void setSmilEndsyncAttribute( String smilEndsyncValue )
	{
		SmilEndsyncAttribute attr =  new SmilEndsyncAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilEndsyncValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilBeginAttribute</code> , See {@odf.attribute smil:begin}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilBeginAttribute()
	{
		SmilBeginAttribute attr = (SmilBeginAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "begin" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilBeginAttribute</code> , See {@odf.attribute smil:begin}
	 *
	 * @param smilBeginValue   The type is <code>String</code>
	 */
	public void setSmilBeginAttribute( String smilBeginValue )
	{
		SmilBeginAttribute attr =  new SmilBeginAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilBeginValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilEndAttribute</code> , See {@odf.attribute smil:end}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilEndAttribute()
	{
		SmilEndAttribute attr = (SmilEndAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "end" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilEndAttribute</code> , See {@odf.attribute smil:end}
	 *
	 * @param smilEndValue   The type is <code>String</code>
	 */
	public void setSmilEndAttribute( String smilEndValue )
	{
		SmilEndAttribute attr =  new SmilEndAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilEndValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilDurAttribute</code> , See {@odf.attribute smil:dur}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilDurAttribute()
	{
		SmilDurAttribute attr = (SmilDurAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "dur" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilDurAttribute</code> , See {@odf.attribute smil:dur}
	 *
	 * @param smilDurValue   The type is <code>String</code>
	 */
	public void setSmilDurAttribute( String smilDurValue )
	{
		SmilDurAttribute attr =  new SmilDurAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilDurValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilRepeatDurAttribute</code> , See {@odf.attribute smil:repeatDur}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilRepeatDurAttribute()
	{
		SmilRepeatDurAttribute attr = (SmilRepeatDurAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "repeatDur" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilRepeatDurAttribute</code> , See {@odf.attribute smil:repeatDur}
	 *
	 * @param smilRepeatDurValue   The type is <code>String</code>
	 */
	public void setSmilRepeatDurAttribute( String smilRepeatDurValue )
	{
		SmilRepeatDurAttribute attr =  new SmilRepeatDurAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilRepeatDurValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilRepeatCountAttribute</code> , See {@odf.attribute smil:repeatCount}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilRepeatCountAttribute()
	{
		SmilRepeatCountAttribute attr = (SmilRepeatCountAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "repeatCount" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilRepeatCountAttribute</code> , See {@odf.attribute smil:repeatCount}
	 *
	 * @param smilRepeatCountValue   The type is <code>String</code>
	 */
	public void setSmilRepeatCountAttribute( String smilRepeatCountValue )
	{
		SmilRepeatCountAttribute attr =  new SmilRepeatCountAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilRepeatCountValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilRestartAttribute</code> , See {@odf.attribute smil:restart}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilRestartAttribute()
	{
		SmilRestartAttribute attr = (SmilRestartAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "restart" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return SmilRestartAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilRestartAttribute</code> , See {@odf.attribute smil:restart}
	 *
	 * @param smilRestartValue   The type is <code>String</code>
	 */
	public void setSmilRestartAttribute( String smilRestartValue )
	{
		SmilRestartAttribute attr =  new SmilRestartAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilRestartValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilRestartDefaultAttribute</code> , See {@odf.attribute smil:restartDefault}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilRestartDefaultAttribute()
	{
		SmilRestartDefaultAttribute attr = (SmilRestartDefaultAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "restartDefault" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return SmilRestartDefaultAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilRestartDefaultAttribute</code> , See {@odf.attribute smil:restartDefault}
	 *
	 * @param smilRestartDefaultValue   The type is <code>String</code>
	 */
	public void setSmilRestartDefaultAttribute( String smilRestartDefaultValue )
	{
		SmilRestartDefaultAttribute attr =  new SmilRestartDefaultAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilRestartDefaultValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilFillAttribute</code> , See {@odf.attribute smil:fill}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilFillAttribute()
	{
		SmilFillAttribute attr = (SmilFillAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "fill" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilFillAttribute</code> , See {@odf.attribute smil:fill}
	 *
	 * @param smilFillValue   The type is <code>String</code>
	 */
	public void setSmilFillAttribute( String smilFillValue )
	{
		SmilFillAttribute attr =  new SmilFillAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilFillValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilFillDefaultAttribute</code> , See {@odf.attribute smil:fillDefault}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilFillDefaultAttribute()
	{
		SmilFillDefaultAttribute attr = (SmilFillDefaultAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "fillDefault" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilFillDefaultAttribute</code> , See {@odf.attribute smil:fillDefault}
	 *
	 * @param smilFillDefaultValue   The type is <code>String</code>
	 */
	public void setSmilFillDefaultAttribute( String smilFillDefaultValue )
	{
		SmilFillDefaultAttribute attr =  new SmilFillDefaultAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilFillDefaultValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilAccelerateAttribute</code> , See {@odf.attribute smil:accelerate}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getSmilAccelerateAttribute()
	{
		SmilAccelerateAttribute attr = (SmilAccelerateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "accelerate" ) );
		if( attr != null ){
			return Double.valueOf( attr.doubleValue() );
		}
		return Double.valueOf( SmilAccelerateAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilAccelerateAttribute</code> , See {@odf.attribute smil:accelerate}
	 *
	 * @param smilAccelerateValue   The type is <code>Double</code>
	 */
	public void setSmilAccelerateAttribute( Double smilAccelerateValue )
	{
		SmilAccelerateAttribute attr =  new SmilAccelerateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setDoubleValue( smilAccelerateValue.doubleValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilDecelerateAttribute</code> , See {@odf.attribute smil:decelerate}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getSmilDecelerateAttribute()
	{
		SmilDecelerateAttribute attr = (SmilDecelerateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "decelerate" ) );
		if( attr != null ){
			return Double.valueOf( attr.doubleValue() );
		}
		return Double.valueOf( SmilDecelerateAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilDecelerateAttribute</code> , See {@odf.attribute smil:decelerate}
	 *
	 * @param smilDecelerateValue   The type is <code>Double</code>
	 */
	public void setSmilDecelerateAttribute( Double smilDecelerateValue )
	{
		SmilDecelerateAttribute attr =  new SmilDecelerateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setDoubleValue( smilDecelerateValue.doubleValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilAutoReverseAttribute</code> , See {@odf.attribute smil:autoReverse}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getSmilAutoReverseAttribute()
	{
		SmilAutoReverseAttribute attr = (SmilAutoReverseAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "autoReverse" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( SmilAutoReverseAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilAutoReverseAttribute</code> , See {@odf.attribute smil:autoReverse}
	 *
	 * @param smilAutoReverseValue   The type is <code>Boolean</code>
	 */
	public void setSmilAutoReverseAttribute( Boolean smilAutoReverseValue )
	{
		SmilAutoReverseAttribute attr =  new SmilAutoReverseAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( smilAutoReverseValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element anim:animate}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:animate}
	 * DifferentQName 
	 */
    
	public AnimAnimateElement newAnimAnimateElement(String smilAttributeNameAttributeValue)
	{
		AnimAnimateElement  animAnimate = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateElement.class);
		animAnimate.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animAnimate);
		return  animAnimate;      
	}
    
	/**
	 * Create child element {@odf.element anim:set}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:set}
	 * DifferentQName 
	 */
    
	public AnimSetElement newAnimSetElement(String smilAttributeNameAttributeValue)
	{
		AnimSetElement  animSet = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimSetElement.class);
		animSet.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animSet);
		return  animSet;      
	}
    
	/**
	 * Create child element {@odf.element anim:animateMotion}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:animateMotion}
	 * DifferentQName 
	 */
    
	public AnimAnimateMotionElement newAnimAnimateMotionElement(String smilAttributeNameAttributeValue)
	{
		AnimAnimateMotionElement  animAnimateMotion = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateMotionElement.class);
		animAnimateMotion.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animAnimateMotion);
		return  animAnimateMotion;      
	}
    
	/**
	 * Create child element {@odf.element anim:animateColor}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @return   return  the element {@odf.element anim:animateColor}
	 * DifferentQName 
	 */
    
	public AnimAnimateColorElement newAnimAnimateColorElement(String smilAttributeNameAttributeValue)
	{
		AnimAnimateColorElement  animAnimateColor = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateColorElement.class);
		animAnimateColor.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		this.appendChild( animAnimateColor);
		return  animAnimateColor;      
	}
    
	/**
	 * Create child element {@odf.element anim:animateTransform}.
	 *
     * @param smilAttributeNameAttributeValue  the <code>String</code> value of <code>SmilAttributeNameAttribute</code>, see {@odf.attribute  smil:attributeName} at specification
	 * @param svgTypeAttributeValue  the <code>String</code> value of <code>SvgTypeAttribute</code>, see {@odf.attribute  svg:type} at specification
	 * @return   return  the element {@odf.element anim:animateTransform}
	 * DifferentQName 
	 */
    
	public AnimAnimateTransformElement newAnimAnimateTransformElement(String smilAttributeNameAttributeValue, String svgTypeAttributeValue)
	{
		AnimAnimateTransformElement  animAnimateTransform = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAnimateTransformElement.class);
		animAnimateTransform.setSmilAttributeNameAttribute( smilAttributeNameAttributeValue );
		animAnimateTransform.setSvgTypeAttribute( svgTypeAttributeValue );
		this.appendChild( animAnimateTransform);
		return  animAnimateTransform;      
	}
    
	/**
	 * Create child element {@odf.element anim:transitionFilter}.
	 *
     * @param smilTypeAttributeValue  the <code>String</code> value of <code>SmilTypeAttribute</code>, see {@odf.attribute  smil:type} at specification
	 * @return   return  the element {@odf.element anim:transitionFilter}
	 * DifferentQName 
	 */
    
	public AnimTransitionFilterElement newAnimTransitionFilterElement(String smilTypeAttributeValue)
	{
		AnimTransitionFilterElement  animTransitionFilter = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimTransitionFilterElement.class);
		animTransitionFilter.setSmilTypeAttribute( smilTypeAttributeValue );
		this.appendChild( animTransitionFilter);
		return  animTransitionFilter;      
	}
    
	/**
	 * Create child element {@odf.element anim:par}.
	 *
	 * @return   return  the element {@odf.element anim:par}
	 * DifferentQName 
	 */
	public AnimParElement newAnimParElement()
	{
		AnimParElement  animPar = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimParElement.class);
		this.appendChild( animPar);
		return  animPar;
	}                   
               
	/**
	 * Create child element {@odf.element anim:seq}.
	 *
	 * @return   return  the element {@odf.element anim:seq}
	 * DifferentQName 
	 */
	public AnimSeqElement newAnimSeqElement()
	{
		AnimSeqElement  animSeq = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimSeqElement.class);
		this.appendChild( animSeq);
		return  animSeq;
	}                   
               
	/**
	 * Create child element {@odf.element anim:iterate}.
	 *
	 * @return   return  the element {@odf.element anim:iterate}
	 * DifferentQName 
	 */
	public AnimIterateElement newAnimIterateElement()
	{
		AnimIterateElement  animIterate = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimIterateElement.class);
		this.appendChild( animIterate);
		return  animIterate;
	}                   
               
	/**
	 * Create child element {@odf.element anim:audio}.
	 *
	 * @return   return  the element {@odf.element anim:audio}
	 * DifferentQName 
	 */
	public AnimAudioElement newAnimAudioElement()
	{
		AnimAudioElement  animAudio = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimAudioElement.class);
		this.appendChild( animAudio);
		return  animAudio;
	}                   
               
	/**
	 * Create child element {@odf.element anim:command}.
	 *
     * @param animCommandAttributeValue  the <code>String</code> value of <code>AnimCommandAttribute</code>, see {@odf.attribute  anim:command} at specification
	 * @return   return  the element {@odf.element anim:command}
	 * DifferentQName 
	 */
    
	public AnimCommandElement newAnimCommandElement(String animCommandAttributeValue)
	{
		AnimCommandElement  animCommand = ((OdfFileDom)this.ownerDocument).newOdfElement(AnimCommandElement.class);
		animCommand.setAnimCommandAttribute( animCommandAttributeValue );
		this.appendChild( animCommand);
		return  animCommand;      
	}
    
}
