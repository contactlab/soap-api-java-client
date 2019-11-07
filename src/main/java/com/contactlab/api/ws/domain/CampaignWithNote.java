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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignWithNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignWithNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaign" type="{domain.ws.api.contactlab.com}Campaign" minOccurs="0"/>
 *         &lt;element name="campaignNote" type="{domain.ws.api.contactlab.com}CampaignNote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignWithNote", propOrder = {
    "campaign",
    "campaignNote"
})
public class CampaignWithNote {

    protected Campaign campaign;
    protected CampaignNote campaignNote;

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
     * Gets the value of the campaignNote property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignNote }
     *     
     */
    public CampaignNote getCampaignNote() {
        return campaignNote;
    }

    /**
     * Sets the value of the campaignNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignNote }
     *     
     */
    public void setCampaignNote(CampaignNote value) {
        this.campaignNote = value;
    }

}
