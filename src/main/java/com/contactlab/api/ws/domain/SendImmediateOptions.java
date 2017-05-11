/**
 * Copyright 2012-2015 ContactLab, Italy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.contactlab.api.ws.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendImmediateOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendImmediateOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccRecipients" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bccRecipients" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeDefaultAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customAttachments" type="{domain.ws.api.contactlab.com}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useUserPk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendImmediateOptions", propOrder = {
    "ccRecipients",
    "bccRecipients",
    "includeDefaultAttachments",
    "customAttachments",
    "useUserPk"
})
public class SendImmediateOptions {

    protected List<String> ccRecipients;
    protected List<String> bccRecipients;
    @XmlElement(defaultValue = "true")
    protected boolean includeDefaultAttachments;
    protected List<Attachment> customAttachments;
    @XmlElement(defaultValue = "false")
    protected Boolean useUserPk;

    /**
     * Gets the value of the ccRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCcRecipients() {
        if (ccRecipients == null) {
            ccRecipients = new ArrayList<String>();
        }
        return this.ccRecipients;
    }

    /**
     * Gets the value of the bccRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bccRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBccRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBccRecipients() {
        if (bccRecipients == null) {
            bccRecipients = new ArrayList<String>();
        }
        return this.bccRecipients;
    }

    /**
     * Gets the value of the includeDefaultAttachments property.
     * 
     */
    public boolean isIncludeDefaultAttachments() {
        return includeDefaultAttachments;
    }

    /**
     * Sets the value of the includeDefaultAttachments property.
     * 
     */
    public void setIncludeDefaultAttachments(boolean value) {
        this.includeDefaultAttachments = value;
    }

    /**
     * Gets the value of the customAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getCustomAttachments() {
        if (customAttachments == null) {
            customAttachments = new ArrayList<Attachment>();
        }
        return this.customAttachments;
    }

    /**
     * Gets the value of the useUserPk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseUserPk() {
        return useUserPk;
    }

    /**
     * Sets the value of the useUserPk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseUserPk(Boolean value) {
        this.useUserPk = value;
    }

}
