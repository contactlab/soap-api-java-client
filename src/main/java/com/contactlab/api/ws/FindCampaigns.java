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
import com.contactlab.api.ws.domain.AuthToken;
import com.contactlab.api.ws.domain.CampaignLookupPreferences;
import com.contactlab.api.ws.domain.Channel;


/**
 * <p>Java class for findCampaigns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCampaigns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{domain.ws.api.contactlab.com}AuthToken" minOccurs="0"/>
 *         &lt;element name="channel" type="{domain.ws.api.contactlab.com}channel" minOccurs="0"/>
 *         &lt;element name="lookupPrefs" type="{domain.ws.api.contactlab.com}CampaignLookupPreferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCampaigns", propOrder = {
    "token",
    "channel",
    "lookupPrefs"
})
public class FindCampaigns {

    protected AuthToken token;
    protected Channel channel;
    protected CampaignLookupPreferences lookupPrefs;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link AuthToken }
     *     
     */
    public AuthToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthToken }
     *     
     */
    public void setToken(AuthToken value) {
        this.token = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the lookupPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignLookupPreferences }
     *     
     */
    public CampaignLookupPreferences getLookupPrefs() {
        return lookupPrefs;
    }

    /**
     * Sets the value of the lookupPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignLookupPreferences }
     *     
     */
    public void setLookupPrefs(CampaignLookupPreferences value) {
        this.lookupPrefs = value;
    }

}
