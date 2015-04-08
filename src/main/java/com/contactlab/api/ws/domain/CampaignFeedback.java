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
 * <p>Java class for CampaignFeedback complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignFeedback">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="campaignSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="views" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uniqueViews" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hiddenViews" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="webMailViews" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uniqueClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fblComplaints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tafClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uniqueTafClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="blacklistMatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listunsubscribe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temporaryBlacklistMatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unsubscribed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="updates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temporaryBlacklisted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="blacklisted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="trackingDetails" type="{domain.ws.api.contactlab.com}TrackedLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bounceDetails" type="{domain.ws.api.contactlab.com}BounceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignFeedback", propOrder = {
    "campaignIdentifier",
    "campaignSize",
    "views",
    "uniqueViews",
    "hiddenViews",
    "webMailViews",
    "clicks",
    "uniqueClicks",
    "bounces",
    "fblComplaints",
    "tafClicks",
    "uniqueTafClicks",
    "blacklistMatches",
    "listunsubscribe",
    "delivered",
    "cancelled",
    "temporaryBlacklistMatches",
    "errors",
    "unsubscribed",
    "updates",
    "temporaryBlacklisted",
    "blacklisted",
    "trackingDetails",
    "bounceDetails"
})
public class CampaignFeedback {

    protected Integer campaignIdentifier;
    protected Integer campaignSize;
    protected Integer views;
    protected Integer uniqueViews;
    protected Integer hiddenViews;
    protected Integer webMailViews;
    protected Integer clicks;
    protected Integer uniqueClicks;
    protected Integer bounces;
    protected Integer fblComplaints;
    protected Integer tafClicks;
    protected Integer uniqueTafClicks;
    protected Integer blacklistMatches;
    protected Integer listunsubscribe;
    protected Integer delivered;
    protected Integer cancelled;
    protected Integer temporaryBlacklistMatches;
    protected Integer errors;
    protected Integer unsubscribed;
    protected Integer updates;
    protected Integer temporaryBlacklisted;
    protected Integer blacklisted;
    @XmlElement(nillable = true)
    protected List<TrackedLink> trackingDetails;
    @XmlElement(nillable = true)
    protected List<BounceDetail> bounceDetails;

    /**
     * Gets the value of the campaignIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignIdentifier() {
        return campaignIdentifier;
    }

    /**
     * Sets the value of the campaignIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignIdentifier(Integer value) {
        this.campaignIdentifier = value;
    }

    /**
     * Gets the value of the campaignSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignSize() {
        return campaignSize;
    }

    /**
     * Sets the value of the campaignSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignSize(Integer value) {
        this.campaignSize = value;
    }

    /**
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViews(Integer value) {
        this.views = value;
    }

    /**
     * Gets the value of the uniqueViews property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueViews() {
        return uniqueViews;
    }

    /**
     * Sets the value of the uniqueViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueViews(Integer value) {
        this.uniqueViews = value;
    }

    /**
     * Gets the value of the hiddenViews property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHiddenViews() {
        return hiddenViews;
    }

    /**
     * Sets the value of the hiddenViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHiddenViews(Integer value) {
        this.hiddenViews = value;
    }

    /**
     * Gets the value of the webMailViews property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebMailViews() {
        return webMailViews;
    }

    /**
     * Sets the value of the webMailViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebMailViews(Integer value) {
        this.webMailViews = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClicks(Integer value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the uniqueClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueClicks() {
        return uniqueClicks;
    }

    /**
     * Sets the value of the uniqueClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueClicks(Integer value) {
        this.uniqueClicks = value;
    }

    /**
     * Gets the value of the bounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBounces() {
        return bounces;
    }

    /**
     * Sets the value of the bounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBounces(Integer value) {
        this.bounces = value;
    }

    /**
     * Gets the value of the fblComplaints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFblComplaints() {
        return fblComplaints;
    }

    /**
     * Sets the value of the fblComplaints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFblComplaints(Integer value) {
        this.fblComplaints = value;
    }

    /**
     * Gets the value of the tafClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTafClicks() {
        return tafClicks;
    }

    /**
     * Sets the value of the tafClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTafClicks(Integer value) {
        this.tafClicks = value;
    }

    /**
     * Gets the value of the uniqueTafClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueTafClicks() {
        return uniqueTafClicks;
    }

    /**
     * Sets the value of the uniqueTafClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueTafClicks(Integer value) {
        this.uniqueTafClicks = value;
    }

    /**
     * Gets the value of the blacklistMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlacklistMatches() {
        return blacklistMatches;
    }

    /**
     * Sets the value of the blacklistMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlacklistMatches(Integer value) {
        this.blacklistMatches = value;
    }

    /**
     * Gets the value of the listunsubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListunsubscribe() {
        return listunsubscribe;
    }

    /**
     * Sets the value of the listunsubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListunsubscribe(Integer value) {
        this.listunsubscribe = value;
    }

    /**
     * Gets the value of the delivered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelivered() {
        return delivered;
    }

    /**
     * Sets the value of the delivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelivered(Integer value) {
        this.delivered = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelled(Integer value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the temporaryBlacklistMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemporaryBlacklistMatches() {
        return temporaryBlacklistMatches;
    }

    /**
     * Sets the value of the temporaryBlacklistMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemporaryBlacklistMatches(Integer value) {
        this.temporaryBlacklistMatches = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrors(Integer value) {
        this.errors = value;
    }

    /**
     * Gets the value of the unsubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsubscribed() {
        return unsubscribed;
    }

    /**
     * Sets the value of the unsubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsubscribed(Integer value) {
        this.unsubscribed = value;
    }

    /**
     * Gets the value of the updates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpdates(Integer value) {
        this.updates = value;
    }

    /**
     * Gets the value of the temporaryBlacklisted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemporaryBlacklisted() {
        return temporaryBlacklisted;
    }

    /**
     * Sets the value of the temporaryBlacklisted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemporaryBlacklisted(Integer value) {
        this.temporaryBlacklisted = value;
    }

    /**
     * Gets the value of the blacklisted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlacklisted() {
        return blacklisted;
    }

    /**
     * Sets the value of the blacklisted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlacklisted(Integer value) {
        this.blacklisted = value;
    }

    /**
     * Gets the value of the trackingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackedLink }
     * 
     * 
     */
    public List<TrackedLink> getTrackingDetails() {
        if (trackingDetails == null) {
            trackingDetails = new ArrayList<TrackedLink>();
        }
        return this.trackingDetails;
    }

    /**
     * Gets the value of the bounceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bounceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBounceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BounceDetail }
     * 
     * 
     */
    public List<BounceDetail> getBounceDetails() {
        if (bounceDetails == null) {
            bounceDetails = new ArrayList<BounceDetail>();
        }
        return this.bounceDetails;
    }

}
