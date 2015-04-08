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
 * <p>Java class for EmailMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{domain.ws.api.contactlab.com}Message">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="htmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredContent" type="{domain.ws.api.contactlab.com}PreferredContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailMessage", propOrder = {
    "subject",
    "htmlContent",
    "textContent",
    "preferredContent"
})
public class EmailMessage
    extends Message
{

    @XmlElement(defaultValue = "")
    protected String subject;
    @XmlElement(defaultValue = "")
    protected String htmlContent;
    @XmlElement(defaultValue = "")
    protected String textContent;
    @XmlElement(defaultValue = "BOTH")
    protected PreferredContent preferredContent;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the htmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * Sets the value of the htmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlContent(String value) {
        this.htmlContent = value;
    }

    /**
     * Gets the value of the textContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextContent() {
        return textContent;
    }

    /**
     * Sets the value of the textContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextContent(String value) {
        this.textContent = value;
    }

    /**
     * Gets the value of the preferredContent property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredContent }
     *     
     */
    public PreferredContent getPreferredContent() {
        return preferredContent;
    }

    /**
     * Sets the value of the preferredContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredContent }
     *     
     */
    public void setPreferredContent(PreferredContent value) {
        this.preferredContent = value;
    }

}
