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

package com.contactlab.api.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.contactlab.api.ws.domain.Attachment;
import com.contactlab.api.ws.domain.Campaign;


/**
 * <p>Java class for sendImmediateMessageSIdCDataCA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendImmediateMessageSIdCDataCA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaign" type="{domain.ws.api.contactlab.com}Campaign" minOccurs="0"/>
 *         &lt;element name="sourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeDefaultAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="attachments" type="{domain.ws.api.contactlab.com}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendImmediateMessageSIdCDataCA", propOrder = {
    "apiKey",
    "userKey",
    "campaign",
    "sourceIdentifier",
    "subscriberIdentifier",
    "includeDefaultAttachments",
    "attachments"
})
public class SendImmediateMessageSIdCDataCA {

    protected String apiKey;
    protected String userKey;
    protected Campaign campaign;
    protected int sourceIdentifier;
    protected int subscriberIdentifier;
    protected boolean includeDefaultAttachments;
    protected List<Attachment> attachments;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the userKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * Sets the value of the userKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserKey(String value) {
        this.userKey = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link Campaign }
     *     
     */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Campaign }
     *     
     */
    public void setCampaign(Campaign value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the sourceIdentifier property.
     * 
     */
    public int getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     * 
     */
    public void setSourceIdentifier(int value) {
        this.sourceIdentifier = value;
    }

    /**
     * Gets the value of the subscriberIdentifier property.
     * 
     */
    public int getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    /**
     * Sets the value of the subscriberIdentifier property.
     * 
     */
    public void setSubscriberIdentifier(int value) {
        this.subscriberIdentifier = value;
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
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

}
