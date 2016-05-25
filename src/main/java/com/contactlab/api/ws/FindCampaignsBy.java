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
import com.contactlab.api.ws.domain.AuthToken;
import com.contactlab.api.ws.domain.CampaignAttributes;
import com.contactlab.api.ws.domain.Channel;
import com.contactlab.api.ws.domain.Pagination;


/**
 * <p>Java class for findCampaignsBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCampaignsBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{domain.ws.api.contactlab.com}AuthToken" minOccurs="0"/>
 *         &lt;element name="channel" type="{domain.ws.api.contactlab.com}channel" minOccurs="0"/>
 *         &lt;element name="campaignAttributes" type="{domain.ws.api.contactlab.com}CampaignAttributes" minOccurs="0"/>
 *         &lt;element name="selectedAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pagination" type="{domain.ws.api.contactlab.com}Pagination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCampaignsBy", propOrder = {
    "token",
    "channel",
    "campaignAttributes",
    "selectedAttributes",
    "pagination"
})
public class FindCampaignsBy {

    protected AuthToken token;
    protected Channel channel;
    protected CampaignAttributes campaignAttributes;
    protected List<String> selectedAttributes;
    protected Pagination pagination;

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
     * Gets the value of the campaignAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAttributes }
     *     
     */
    public CampaignAttributes getCampaignAttributes() {
        return campaignAttributes;
    }

    /**
     * Sets the value of the campaignAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAttributes }
     *     
     */
    public void setCampaignAttributes(CampaignAttributes value) {
        this.campaignAttributes = value;
    }

    /**
     * Gets the value of the selectedAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedAttributes() {
        if (selectedAttributes == null) {
            selectedAttributes = new ArrayList<String>();
        }
        return this.selectedAttributes;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPagination(Pagination value) {
        this.pagination = value;
    }

}
