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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.contactlab.api.ws.domain.AuthToken;


/**
 * <p>Java class for addSelectionSubscribers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addSelectionSubscribers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{domain.ws.api.contactlab.com}AuthToken" minOccurs="0"/>
 *         &lt;element name="selectionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recipientIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSelectionSubscribers", propOrder = {
    "token",
    "selectionId",
    "isTest",
    "recipientIds"
})
public class AddSelectionSubscribers {

    protected AuthToken token;
    protected int selectionId;
    protected boolean isTest;
    @XmlElement(type = Integer.class)
    protected List<Integer> recipientIds;

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
     * Gets the value of the selectionId property.
     * 
     */
    public int getSelectionId() {
        return selectionId;
    }

    /**
     * Sets the value of the selectionId property.
     * 
     */
    public void setSelectionId(int value) {
        this.selectionId = value;
    }

    /**
     * Gets the value of the isTest property.
     * 
     */
    public boolean isIsTest() {
        return isTest;
    }

    /**
     * Sets the value of the isTest property.
     * 
     */
    public void setIsTest(boolean value) {
        this.isTest = value;
    }

    /**
     * Gets the value of the recipientIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getRecipientIds() {
        if (recipientIds == null) {
            recipientIds = new ArrayList<Integer>();
        }
        return this.recipientIds;
    }

}
