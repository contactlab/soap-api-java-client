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
 * <p>Java class for SubscriberAttributeFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAttributeFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="lookupMatchingMode" type="{domain.ws.api.contactlab.com}LookupMatchingMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAttributeFilter", propOrder = {
    "attributeName",
    "attributeValue",
    "lookupMatchingMode"
})
public class SubscriberAttributeFilter {

    @XmlElement(required = true)
    protected String attributeName;
    @XmlElement(required = true)
    protected Object attributeValue;
    @XmlElement(required = true, defaultValue = "EQUALS")
    protected LookupMatchingMode lookupMatchingMode;

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the attributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributeValue(Object value) {
        this.attributeValue = value;
    }

    /**
     * Gets the value of the lookupMatchingMode property.
     * 
     * @return
     *     possible object is
     *     {@link LookupMatchingMode }
     *     
     */
    public LookupMatchingMode getLookupMatchingMode() {
        return lookupMatchingMode;
    }

    /**
     * Sets the value of the lookupMatchingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupMatchingMode }
     *     
     */
    public void setLookupMatchingMode(LookupMatchingMode value) {
        this.lookupMatchingMode = value;
    }

}
