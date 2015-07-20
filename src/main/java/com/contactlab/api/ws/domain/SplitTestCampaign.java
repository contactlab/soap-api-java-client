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
 * <p>Java class for SplitTestCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitTestCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitTestId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="splitTestConfiguration" type="{domain.ws.api.contactlab.com}DeliverySplitConfig"/>
 *         &lt;element name="campaigns" type="{domain.ws.api.contactlab.com}Campaign" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitTestCampaign", propOrder = {
    "splitTestId",
    "label",
    "splitTestConfiguration",
    "campaigns"
})
public class SplitTestCampaign {

    protected Integer splitTestId;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected DeliverySplitConfig splitTestConfiguration;
    @XmlElement(required = true)
    protected List<Campaign> campaigns;

    /**
     * Gets the value of the splitTestId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSplitTestId() {
        return splitTestId;
    }

    /**
     * Sets the value of the splitTestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSplitTestId(Integer value) {
        this.splitTestId = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the splitTestConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverySplitConfig }
     *     
     */
    public DeliverySplitConfig getSplitTestConfiguration() {
        return splitTestConfiguration;
    }

    /**
     * Sets the value of the splitTestConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverySplitConfig }
     *     
     */
    public void setSplitTestConfiguration(DeliverySplitConfig value) {
        this.splitTestConfiguration = value;
    }

    /**
     * Gets the value of the campaigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Campaign }
     * 
     * 
     */
    public List<Campaign> getCampaigns() {
        if (campaigns == null) {
            campaigns = new ArrayList<Campaign>();
        }
        return this.campaigns;
    }

}
