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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charset" type="{domain.ws.api.contactlab.com}charset" minOccurs="0"/>
 *         &lt;element name="identifiers" type="{domain.ws.api.contactlab.com}LookupIdentifiers" minOccurs="0"/>
 *         &lt;element name="alias" type="{domain.ws.api.contactlab.com}LookupField" minOccurs="0"/>
 *         &lt;element name="messageIdentifiers" type="{domain.ws.api.contactlab.com}LookupIdentifiers" minOccurs="0"/>
 *         &lt;element name="startDate" type="{domain.ws.api.contactlab.com}LookupDate" minOccurs="0"/>
 *         &lt;element name="status" type="{domain.ws.api.contactlab.com}deliveryStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{domain.ws.api.contactlab.com}CampaignType" minOccurs="0"/>
 *         &lt;element name="deferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sourceFilters" type="{domain.ws.api.contactlab.com}LookupIdentifiers" minOccurs="0"/>
 *         &lt;element name="name" type="{domain.ws.api.contactlab.com}LookupField" minOccurs="0"/>
 *         &lt;element name="subject" type="{domain.ws.api.contactlab.com}LookupField" minOccurs="0"/>
 *         &lt;element name="note" type="{domain.ws.api.contactlab.com}LookupNote" minOccurs="0"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="triggerable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="matchingMode" type="{domain.ws.api.contactlab.com}AttributeMatchingMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignAttributes", propOrder = {
    "charset",
    "identifiers",
    "alias",
    "messageIdentifiers",
    "startDate",
    "status",
    "type",
    "deferred",
    "sourceFilters",
    "name",
    "subject",
    "note",
    "categoryId",
    "parentId",
    "triggerable"
})
public class CampaignAttributes {

    protected Charset charset;
    protected LookupIdentifiers identifiers;
    protected LookupField alias;
    protected LookupIdentifiers messageIdentifiers;
    protected LookupDate startDate;
    protected DeliveryStatus status;
    protected CampaignType type;
    protected Boolean deferred;
    protected LookupIdentifiers sourceFilters;
    protected LookupField name;
    protected LookupField subject;
    protected LookupNote note;
    protected Integer categoryId;
    protected Integer parentId;
    protected Boolean triggerable;
    @XmlAttribute
    protected AttributeMatchingMode matchingMode;

    /**
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link Charset }
     *     
     */
    public Charset getCharset() {
        return charset;
    }

    /**
     * Sets the value of the charset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charset }
     *     
     */
    public void setCharset(Charset value) {
        this.charset = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link LookupIdentifiers }
     *     
     */
    public LookupIdentifiers getIdentifiers() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupIdentifiers }
     *     
     */
    public void setIdentifiers(LookupIdentifiers value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link LookupField }
     *     
     */
    public LookupField getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupField }
     *     
     */
    public void setAlias(LookupField value) {
        this.alias = value;
    }

    /**
     * Gets the value of the messageIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link LookupIdentifiers }
     *     
     */
    public LookupIdentifiers getMessageIdentifiers() {
        return messageIdentifiers;
    }

    /**
     * Sets the value of the messageIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupIdentifiers }
     *     
     */
    public void setMessageIdentifiers(LookupIdentifiers value) {
        this.messageIdentifiers = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link LookupDate }
     *     
     */
    public LookupDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupDate }
     *     
     */
    public void setStartDate(LookupDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatus }
     *     
     */
    public DeliveryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatus }
     *     
     */
    public void setStatus(DeliveryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignType }
     *     
     */
    public CampaignType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignType }
     *     
     */
    public void setType(CampaignType value) {
        this.type = value;
    }

    /**
     * Gets the value of the deferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferred() {
        return deferred;
    }

    /**
     * Sets the value of the deferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferred(Boolean value) {
        this.deferred = value;
    }

    /**
     * Gets the value of the sourceFilters property.
     * 
     * @return
     *     possible object is
     *     {@link LookupIdentifiers }
     *     
     */
    public LookupIdentifiers getSourceFilters() {
        return sourceFilters;
    }

    /**
     * Sets the value of the sourceFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupIdentifiers }
     *     
     */
    public void setSourceFilters(LookupIdentifiers value) {
        this.sourceFilters = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link LookupField }
     *     
     */
    public LookupField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupField }
     *     
     */
    public void setName(LookupField value) {
        this.name = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link LookupField }
     *     
     */
    public LookupField getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupField }
     *     
     */
    public void setSubject(LookupField value) {
        this.subject = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link LookupNote }
     *     
     */
    public LookupNote getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupNote }
     *     
     */
    public void setNote(LookupNote value) {
        this.note = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryId(Integer value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the triggerable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTriggerable() {
        return triggerable;
    }

    /**
     * Sets the value of the triggerable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTriggerable(Boolean value) {
        this.triggerable = value;
    }

    /**
     * Gets the value of the matchingMode property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeMatchingMode }
     *     
     */
    public AttributeMatchingMode getMatchingMode() {
        return matchingMode;
    }

    /**
     * Sets the value of the matchingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeMatchingMode }
     *     
     */
    public void setMatchingMode(AttributeMatchingMode value) {
        this.matchingMode = value;
    }

}
