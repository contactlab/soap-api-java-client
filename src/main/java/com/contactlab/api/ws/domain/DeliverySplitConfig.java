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
import javax.xml.bind.annotation.XmlType;
import com.contactlab.api.ws.DeliverySplitType;
import com.contactlab.api.ws.WinningCriterion;


/**
 * <p>Java class for DeliverySplitConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverySplitConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testWinningCriterion" type="{http://ws.api.contactlab.com/}winningCriterion" minOccurs="0"/>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="splits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="splitType" type="{http://ws.api.contactlab.com/}deliverySplitType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverySplitConfig", propOrder = {
    "splitPercent",
    "testWinningCriterion",
    "deliveryId",
    "splits",
    "splitType"
})
public class DeliverySplitConfig {

    protected Integer splitPercent;
    protected WinningCriterion testWinningCriterion;
    protected Integer deliveryId;
    protected int splits;
    @XmlElement(required = true)
    protected DeliverySplitType splitType;

    /**
     * Gets the value of the splitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSplitPercent() {
        return splitPercent;
    }

    /**
     * Sets the value of the splitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSplitPercent(Integer value) {
        this.splitPercent = value;
    }

    /**
     * Gets the value of the testWinningCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link WinningCriterion }
     *     
     */
    public WinningCriterion getTestWinningCriterion() {
        return testWinningCriterion;
    }

    /**
     * Sets the value of the testWinningCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinningCriterion }
     *     
     */
    public void setTestWinningCriterion(WinningCriterion value) {
        this.testWinningCriterion = value;
    }

    /**
     * Gets the value of the deliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryId(Integer value) {
        this.deliveryId = value;
    }

    /**
     * Gets the value of the splits property.
     * 
     */
    public int getSplits() {
        return splits;
    }

    /**
     * Sets the value of the splits property.
     * 
     */
    public void setSplits(int value) {
        this.splits = value;
    }

    /**
     * Gets the value of the splitType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverySplitType }
     *     
     */
    public DeliverySplitType getSplitType() {
        return splitType;
    }

    /**
     * Sets the value of the splitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverySplitType }
     *     
     */
    public void setSplitType(DeliverySplitType value) {
        this.splitType = value;
    }

}
