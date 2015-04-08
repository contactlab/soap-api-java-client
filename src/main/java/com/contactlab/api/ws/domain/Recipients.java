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


/**
 * <p>Java class for Recipients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recipients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberSourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscriberSourceFilterIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipients", propOrder = {
    "subscriberSourceIdentifier",
    "subscriberSourceFilterIdentifier"
})
public class Recipients {

    protected int subscriberSourceIdentifier;
    @XmlElement(defaultValue = "0")
    protected Integer subscriberSourceFilterIdentifier;

    /**
     * Gets the value of the subscriberSourceIdentifier property.
     * 
     */
    public int getSubscriberSourceIdentifier() {
        return subscriberSourceIdentifier;
    }

    /**
     * Sets the value of the subscriberSourceIdentifier property.
     * 
     */
    public void setSubscriberSourceIdentifier(int value) {
        this.subscriberSourceIdentifier = value;
    }

    /**
     * Gets the value of the subscriberSourceFilterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriberSourceFilterIdentifier() {
        return subscriberSourceFilterIdentifier;
    }

    /**
     * Sets the value of the subscriberSourceFilterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriberSourceFilterIdentifier(Integer value) {
        this.subscriberSourceFilterIdentifier = value;
    }

}
