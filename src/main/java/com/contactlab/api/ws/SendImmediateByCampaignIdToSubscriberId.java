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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.contactlab.api.ws.domain.SendImmediateOptions;


/**
 * <p>Java class for sendImmediateByCampaignIdToSubscriberId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendImmediateByCampaignIdToSubscriberId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sendImmediateOptions" type="{domain.ws.api.contactlab.com}SendImmediateOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendImmediateByCampaignIdToSubscriberId", propOrder = {
    "apiKey",
    "userKey",
    "campaignId",
    "sourceId",
    "subscriberId",
    "sendImmediateOptions"
})
public class SendImmediateByCampaignIdToSubscriberId {

    protected String apiKey;
    protected String userKey;
    protected int campaignId;
    protected int sourceId;
    protected long subscriberId;
    protected SendImmediateOptions sendImmediateOptions;

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
     * Gets the value of the campaignId property.
     * 
     */
    public int getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     */
    public void setCampaignId(int value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     */
    public int getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     */
    public void setSourceId(int value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     */
    public long getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     */
    public void setSubscriberId(long value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the sendImmediateOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SendImmediateOptions }
     *     
     */
    public SendImmediateOptions getSendImmediateOptions() {
        return sendImmediateOptions;
    }

    /**
     * Sets the value of the sendImmediateOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendImmediateOptions }
     *     
     */
    public void setSendImmediateOptions(SendImmediateOptions value) {
        this.sendImmediateOptions = value;
    }

}
