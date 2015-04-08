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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charset" type="{domain.ws.api.contactlab.com}charset" minOccurs="0"/>
 *         &lt;element name="modelIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipients" type="{domain.ws.api.contactlab.com}Recipients"/>
 *         &lt;element name="sender" type="{domain.ws.api.contactlab.com}Sender"/>
 *         &lt;element name="prefAttachmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minAttachmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxAttachmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="communicationCategoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "charset",
    "modelIdentifier",
    "modelName",
    "modelDescription",
    "recipients",
    "sender",
    "prefAttachmentCount",
    "minAttachmentCount",
    "maxAttachmentCount",
    "communicationCategoryIdentifier"
})
@XmlSeeAlso({
    TextMessage.class,
    EmailMessage.class,
    FaxMessage.class,
    PushMessage.class
})
public abstract class Message {

    protected Charset charset;
    protected Integer modelIdentifier;
    protected String modelName;
    protected String modelDescription;
    @XmlElement(required = true)
    protected Recipients recipients;
    @XmlElement(required = true)
    protected Sender sender;
    @XmlElement(defaultValue = "0")
    protected int prefAttachmentCount;
    @XmlElement(defaultValue = "0")
    protected int minAttachmentCount;
    @XmlElement(defaultValue = "10")
    protected int maxAttachmentCount;
    protected Integer communicationCategoryIdentifier;

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
     * Gets the value of the modelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModelIdentifier() {
        return modelIdentifier;
    }

    /**
     * Sets the value of the modelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModelIdentifier(Integer value) {
        this.modelIdentifier = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the modelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * Sets the value of the modelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescription(String value) {
        this.modelDescription = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link Recipients }
     *     
     */
    public Recipients getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipients }
     *     
     */
    public void setRecipients(Recipients value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the prefAttachmentCount property.
     * 
     */
    public int getPrefAttachmentCount() {
        return prefAttachmentCount;
    }

    /**
     * Sets the value of the prefAttachmentCount property.
     * 
     */
    public void setPrefAttachmentCount(int value) {
        this.prefAttachmentCount = value;
    }

    /**
     * Gets the value of the minAttachmentCount property.
     * 
     */
    public int getMinAttachmentCount() {
        return minAttachmentCount;
    }

    /**
     * Sets the value of the minAttachmentCount property.
     * 
     */
    public void setMinAttachmentCount(int value) {
        this.minAttachmentCount = value;
    }

    /**
     * Gets the value of the maxAttachmentCount property.
     * 
     */
    public int getMaxAttachmentCount() {
        return maxAttachmentCount;
    }

    /**
     * Sets the value of the maxAttachmentCount property.
     * 
     */
    public void setMaxAttachmentCount(int value) {
        this.maxAttachmentCount = value;
    }

    /**
     * Gets the value of the communicationCategoryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommunicationCategoryIdentifier() {
        return communicationCategoryIdentifier;
    }

    /**
     * Sets the value of the communicationCategoryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommunicationCategoryIdentifier(Integer value) {
        this.communicationCategoryIdentifier = value;
    }

}
