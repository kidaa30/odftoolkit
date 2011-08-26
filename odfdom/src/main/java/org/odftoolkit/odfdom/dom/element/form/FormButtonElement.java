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

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.form.FormNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormControlImplementationAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xforms.XformsBindAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormButtonTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDisabledAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormLabelAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormImageDataAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormPrintableAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabStopAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTargetFrameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormImagePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormImageAlignAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormRepeatAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDelayForRepeatAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDefaultButtonAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormToggleAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormFocusOnClickAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormXformsSubmissionAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element form:button}.
 *
 */
public class FormButtonElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.FORM, "button" );


	/**
	 * Create the instance of <code>FormButtonElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FormButtonElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element form:button}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  FormButtonElement}
	 *
     * @param formIdAttributeValue  The mandatory attribute {@odf.attribute  form:id}"
     * @param xmlIdAttributeValue  The mandatory attribute {@odf.attribute  xml:id}"
     *
	 */
	public void init(String formIdAttributeValue, String xmlIdAttributeValue)
	{
		setFormIdAttribute( formIdAttributeValue );
		setXmlIdAttribute( xmlIdAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormNameAttribute()
	{
		FormNameAttribute attr = (FormNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @param formNameValue   The type is <code>String</code>
	 */
	public void setFormNameAttribute( String formNameValue )
	{
		FormNameAttribute attr =  new FormNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormControlImplementationAttribute()
	{
		FormControlImplementationAttribute attr = (FormControlImplementationAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "control-implementation" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @param formControlImplementationValue   The type is <code>String</code>
	 */
	public void setFormControlImplementationAttribute( String formControlImplementationValue )
	{
		FormControlImplementationAttribute attr =  new FormControlImplementationAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formControlImplementationValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormIdAttribute()
	{
		FormIdAttribute attr = (FormIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @param formIdValue   The type is <code>String</code>
	 */
	public void setFormIdAttribute( String formIdValue )
	{
		FormIdAttribute attr =  new FormIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formIdValue );
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
	 * Receives the value of the ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXformsBindAttribute()
	{
		XformsBindAttribute attr = (XformsBindAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XFORMS), "bind" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @param xformsBindValue   The type is <code>String</code>
	 */
	public void setXformsBindAttribute( String xformsBindValue )
	{
		XformsBindAttribute attr =  new XformsBindAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xformsBindValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormButtonTypeAttribute</code> , See {@odf.attribute form:button-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormButtonTypeAttribute()
	{
		FormButtonTypeAttribute attr = (FormButtonTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "button-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return FormButtonTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormButtonTypeAttribute</code> , See {@odf.attribute form:button-type}
	 *
	 * @param formButtonTypeValue   The type is <code>String</code>
	 */
	public void setFormButtonTypeAttribute( String formButtonTypeValue )
	{
		FormButtonTypeAttribute attr =  new FormButtonTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formButtonTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDisabledAttribute</code> , See {@odf.attribute form:disabled}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormDisabledAttribute()
	{
		FormDisabledAttribute attr = (FormDisabledAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "disabled" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormDisabledAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDisabledAttribute</code> , See {@odf.attribute form:disabled}
	 *
	 * @param formDisabledValue   The type is <code>Boolean</code>
	 */
	public void setFormDisabledAttribute( Boolean formDisabledValue )
	{
		FormDisabledAttribute attr =  new FormDisabledAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formDisabledValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormLabelAttribute</code> , See {@odf.attribute form:label}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormLabelAttribute()
	{
		FormLabelAttribute attr = (FormLabelAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "label" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormLabelAttribute</code> , See {@odf.attribute form:label}
	 *
	 * @param formLabelValue   The type is <code>String</code>
	 */
	public void setFormLabelAttribute( String formLabelValue )
	{
		FormLabelAttribute attr =  new FormLabelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formLabelValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormImageDataAttribute</code> , See {@odf.attribute form:image-data}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormImageDataAttribute()
	{
		FormImageDataAttribute attr = (FormImageDataAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "image-data" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormImageDataAttribute</code> , See {@odf.attribute form:image-data}
	 *
	 * @param formImageDataValue   The type is <code>String</code>
	 */
	public void setFormImageDataAttribute( String formImageDataValue )
	{
		FormImageDataAttribute attr =  new FormImageDataAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formImageDataValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormPrintableAttribute</code> , See {@odf.attribute form:printable}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormPrintableAttribute()
	{
		FormPrintableAttribute attr = (FormPrintableAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "printable" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormPrintableAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormPrintableAttribute</code> , See {@odf.attribute form:printable}
	 *
	 * @param formPrintableValue   The type is <code>Boolean</code>
	 */
	public void setFormPrintableAttribute( Boolean formPrintableValue )
	{
		FormPrintableAttribute attr =  new FormPrintableAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formPrintableValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See {@odf.attribute form:tab-index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getFormTabIndexAttribute()
	{
		FormTabIndexAttribute attr = (FormTabIndexAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "tab-index" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return Integer.valueOf( FormTabIndexAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See {@odf.attribute form:tab-index}
	 *
	 * @param formTabIndexValue   The type is <code>Integer</code>
	 */
	public void setFormTabIndexAttribute( Integer formTabIndexValue )
	{
		FormTabIndexAttribute attr =  new FormTabIndexAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( formTabIndexValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTabStopAttribute</code> , See {@odf.attribute form:tab-stop}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormTabStopAttribute()
	{
		FormTabStopAttribute attr = (FormTabStopAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "tab-stop" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormTabStopAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTabStopAttribute</code> , See {@odf.attribute form:tab-stop}
	 *
	 * @param formTabStopValue   The type is <code>Boolean</code>
	 */
	public void setFormTabStopAttribute( Boolean formTabStopValue )
	{
		FormTabStopAttribute attr =  new FormTabStopAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formTabStopValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeTargetFrameAttribute</code> , See {@odf.attribute office:target-frame}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeTargetFrameAttribute()
	{
		OfficeTargetFrameAttribute attr = (OfficeTargetFrameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "target-frame" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return OfficeTargetFrameAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeTargetFrameAttribute</code> , See {@odf.attribute office:target-frame}
	 *
	 * @param officeTargetFrameValue   The type is <code>String</code>
	 */
	public void setOfficeTargetFrameAttribute( String officeTargetFrameValue )
	{
		OfficeTargetFrameAttribute attr =  new OfficeTargetFrameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeTargetFrameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute()
	{
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "href" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute( String xlinkHrefValue )
	{
		XlinkHrefAttribute attr =  new XlinkHrefAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkHrefValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTitleAttribute</code> , See {@odf.attribute form:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormTitleAttribute()
	{
		FormTitleAttribute attr = (FormTitleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "title" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTitleAttribute</code> , See {@odf.attribute form:title}
	 *
	 * @param formTitleValue   The type is <code>String</code>
	 */
	public void setFormTitleAttribute( String formTitleValue )
	{
		FormTitleAttribute attr =  new FormTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormValueAttribute</code> , See {@odf.attribute form:value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormValueAttribute()
	{
		FormValueAttribute attr = (FormValueAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "value" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormValueAttribute</code> , See {@odf.attribute form:value}
	 *
	 * @param formValueValue   The type is <code>String</code>
	 */
	public void setFormValueAttribute( String formValueValue )
	{
		FormValueAttribute attr =  new FormValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formValueValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormImagePositionAttribute</code> , See {@odf.attribute form:image-position}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormImagePositionAttribute()
	{
		FormImagePositionAttribute attr = (FormImagePositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "image-position" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return FormImagePositionAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormImagePositionAttribute</code> , See {@odf.attribute form:image-position}
	 *
	 * @param formImagePositionValue   The type is <code>String</code>
	 */
	public void setFormImagePositionAttribute( String formImagePositionValue )
	{
		FormImagePositionAttribute attr =  new FormImagePositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formImagePositionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormImageAlignAttribute</code> , See {@odf.attribute form:image-align}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormImageAlignAttribute()
	{
		FormImageAlignAttribute attr = (FormImageAlignAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "image-align" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return FormImageAlignAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormImageAlignAttribute</code> , See {@odf.attribute form:image-align}
	 *
	 * @param formImageAlignValue   The type is <code>String</code>
	 */
	public void setFormImageAlignAttribute( String formImageAlignValue )
	{
		FormImageAlignAttribute attr =  new FormImageAlignAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formImageAlignValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormRepeatAttribute</code> , See {@odf.attribute form:repeat}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormRepeatAttribute()
	{
		FormRepeatAttribute attr = (FormRepeatAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "repeat" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormRepeatAttribute</code> , See {@odf.attribute form:repeat}
	 *
	 * @param formRepeatValue   The type is <code>Boolean</code>
	 */
	public void setFormRepeatAttribute( Boolean formRepeatValue )
	{
		FormRepeatAttribute attr =  new FormRepeatAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formRepeatValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDelayForRepeatAttribute</code> , See {@odf.attribute form:delay-for-repeat}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormDelayForRepeatAttribute()
	{
		FormDelayForRepeatAttribute attr = (FormDelayForRepeatAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "delay-for-repeat" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return FormDelayForRepeatAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDelayForRepeatAttribute</code> , See {@odf.attribute form:delay-for-repeat}
	 *
	 * @param formDelayForRepeatValue   The type is <code>String</code>
	 */
	public void setFormDelayForRepeatAttribute( String formDelayForRepeatValue )
	{
		FormDelayForRepeatAttribute attr =  new FormDelayForRepeatAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formDelayForRepeatValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDefaultButtonAttribute</code> , See {@odf.attribute form:default-button}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormDefaultButtonAttribute()
	{
		FormDefaultButtonAttribute attr = (FormDefaultButtonAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "default-button" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormDefaultButtonAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDefaultButtonAttribute</code> , See {@odf.attribute form:default-button}
	 *
	 * @param formDefaultButtonValue   The type is <code>Boolean</code>
	 */
	public void setFormDefaultButtonAttribute( Boolean formDefaultButtonValue )
	{
		FormDefaultButtonAttribute attr =  new FormDefaultButtonAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formDefaultButtonValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormToggleAttribute</code> , See {@odf.attribute form:toggle}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormToggleAttribute()
	{
		FormToggleAttribute attr = (FormToggleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "toggle" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormToggleAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormToggleAttribute</code> , See {@odf.attribute form:toggle}
	 *
	 * @param formToggleValue   The type is <code>Boolean</code>
	 */
	public void setFormToggleAttribute( Boolean formToggleValue )
	{
		FormToggleAttribute attr =  new FormToggleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formToggleValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormFocusOnClickAttribute</code> , See {@odf.attribute form:focus-on-click}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormFocusOnClickAttribute()
	{
		FormFocusOnClickAttribute attr = (FormFocusOnClickAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "focus-on-click" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormFocusOnClickAttribute</code> , See {@odf.attribute form:focus-on-click}
	 *
	 * @param formFocusOnClickValue   The type is <code>Boolean</code>
	 */
	public void setFormFocusOnClickAttribute( Boolean formFocusOnClickValue )
	{
		FormFocusOnClickAttribute attr =  new FormFocusOnClickAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formFocusOnClickValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormXformsSubmissionAttribute</code> , See {@odf.attribute form:xforms-submission}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormXformsSubmissionAttribute()
	{
		FormXformsSubmissionAttribute attr = (FormXformsSubmissionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "xforms-submission" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormXformsSubmissionAttribute</code> , See {@odf.attribute form:xforms-submission}
	 *
	 * @param formXformsSubmissionValue   The type is <code>String</code>
	 */
	public void setFormXformsSubmissionAttribute( String formXformsSubmissionValue )
	{
		FormXformsSubmissionAttribute attr =  new FormXformsSubmissionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formXformsSubmissionValue );
	}

	/**
	 * Create child element {@odf.element form:properties}.
	 *
	 * @return   return  the element {@odf.element form:properties}
	 * DifferentQName 
	 */
	public FormPropertiesElement newFormPropertiesElement()
	{
		FormPropertiesElement  formProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(FormPropertiesElement.class);
		this.appendChild( formProperties);
		return  formProperties;
	}                   
               
	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return   return  the element {@odf.element office:event-listeners}
	 * DifferentQName 
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement()
	{
		OfficeEventListenersElement  officeEventListeners = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild( officeEventListeners);
		return  officeEventListeners;
	}                   
               
}
