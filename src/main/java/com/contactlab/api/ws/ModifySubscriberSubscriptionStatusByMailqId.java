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


/**
 * <p>Java class for modifySubscriberSubscriptionStatusByMailqId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifySubscriberSubscriptionStatusByMailqId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{domain.ws.api.contactlab.com}AuthToken" minOccurs="0"/>
 *         &lt;element name="webFormCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mailqId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="isSubscribed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifySubscriberSubscriptionStatusByMailqId", propOrder = {
    "token",
    "webFormCode",
    "subscriberIdentifier",
    "mailqId",
    "isSubscribed"
})
public class ModifySubscriberSubscriptionStatusByMailqId {

    protected AuthToken token;
    protected String webFormCode;
    protected int subscriberIdentifier;
    protected long mailqId;
    protected boolean isSubscribed;

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
     * Gets the value of the webFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebFormCode() {
        return webFormCode;
    }

    /**
     * Sets the value of the webFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebFormCode(String value) {
        this.webFormCode = value;
    }

    /**
     * Gets the value of the subscriberIdentifier property.
     * 
     */
    public int getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    /**
     * Sets the value of the subscriberIdentifier property.
     * 
     */
    public void setSubscriberIdentifier(int value) {
        this.subscriberIdentifier = value;
    }

    /**
     * Gets the value of the mailqId property.
     * 
     */
    public long getMailqId() {
        return mailqId;
    }

    /**
     * Sets the value of the mailqId property.
     * 
     */
    public void setMailqId(long value) {
        this.mailqId = value;
    }

    /**
     * Gets the value of the isSubscribed property.
     * 
     */
    public boolean isIsSubscribed() {
        return isSubscribed;
    }

    /**
     * Sets the value of the isSubscribed property.
     * 
     */
    public void setIsSubscribed(boolean value) {
        this.isSubscribed = value;
    }

}
