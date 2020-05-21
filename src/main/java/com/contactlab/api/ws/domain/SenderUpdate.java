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
import com.contactlab.api.ws.StringValueHolderWS;


/**
 * <p>Java class for SenderUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://ws.api.contactlab.com/}stringValueHolderWS" minOccurs="0"/>
 *         &lt;element name="name" type="{http://ws.api.contactlab.com/}stringValueHolderWS" minOccurs="0"/>
 *         &lt;element name="replyTo" type="{http://ws.api.contactlab.com/}stringValueHolderWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderUpdate", propOrder = {
    "email",
    "name",
    "replyTo"
})
public class SenderUpdate {

    protected StringValueHolderWS email;
    protected StringValueHolderWS name;
    protected StringValueHolderWS replyTo;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link StringValueHolderWS }
     *     
     */
    public StringValueHolderWS getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValueHolderWS }
     *     
     */
    public void setEmail(StringValueHolderWS value) {
        this.email = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringValueHolderWS }
     *     
     */
    public StringValueHolderWS getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValueHolderWS }
     *     
     */
    public void setName(StringValueHolderWS value) {
        this.name = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link StringValueHolderWS }
     *     
     */
    public StringValueHolderWS getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValueHolderWS }
     *     
     */
    public void setReplyTo(StringValueHolderWS value) {
        this.replyTo = value;
    }

}
