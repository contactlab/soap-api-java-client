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
 * <p>Java class for EmailMessageUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailMessageUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{domain.ws.api.contactlab.com}MessageUpdate">
 *       &lt;sequence>
 *         &lt;element name="senderUpdate" type="{domain.ws.api.contactlab.com}SenderUpdate" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://ws.api.contactlab.com/}stringValueHolderWS" minOccurs="0"/>
 *         &lt;element name="htmlContent" type="{http://ws.api.contactlab.com/}stringValueHolderWS" minOccurs="0"/>
 *         &lt;element name="textContent" type="{http://ws.api.contactlab.com/}stringValueHolderWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailMessageUpdate", propOrder = {
    "senderUpdate",
    "subject",
    "htmlContent",
    "textContent"
})
public class EmailMessageUpdate
    extends MessageUpdate
{

    protected SenderUpdate senderUpdate;
    protected StringValueHolderWS subject;
    protected StringValueHolderWS htmlContent;
    protected StringValueHolderWS textContent;

    /**
     * Gets the value of the senderUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link SenderUpdate }
     *     
     */
    public SenderUpdate getSenderUpdate() {
        return senderUpdate;
    }

    /**
     * Sets the value of the senderUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderUpdate }
     *     
     */
    public void setSenderUpdate(SenderUpdate value) {
        this.senderUpdate = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link StringValueHolderWS }
     *     
     */
    public StringValueHolderWS getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValueHolderWS }
     *     
     */
    public void setSubject(StringValueHolderWS value) {
        this.subject = value;
    }

    /**
     * Gets the value of the htmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link StringValueHolderWS }
     *     
     */
    public StringValueHolderWS getHtmlContent() {
        return htmlContent;
    }

    /**
     * Sets the value of the htmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValueHolderWS }
     *     
     */
    public void setHtmlContent(StringValueHolderWS value) {
        this.htmlContent = value;
    }

    /**
     * Gets the value of the textContent property.
     * 
     * @return
     *     possible object is
     *     {@link StringValueHolderWS }
     *     
     */
    public StringValueHolderWS getTextContent() {
        return textContent;
    }

    /**
     * Sets the value of the textContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringValueHolderWS }
     *     
     */
    public void setTextContent(StringValueHolderWS value) {
        this.textContent = value;
    }

}
