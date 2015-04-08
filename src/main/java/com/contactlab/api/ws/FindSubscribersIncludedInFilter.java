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
import com.contactlab.api.ws.domain.LookupPreferences;


/**
 * <p>Java class for findSubscribersIncludedInFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findSubscribersIncludedInFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{domain.ws.api.contactlab.com}AuthToken" minOccurs="0"/>
 *         &lt;element name="sourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filterIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lookupPrefs" type="{domain.ws.api.contactlab.com}LookupPreferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSubscribersIncludedInFilter", propOrder = {
    "token",
    "sourceIdentifier",
    "filterIdentifier",
    "lookupPrefs"
})
public class FindSubscribersIncludedInFilter {

    protected AuthToken token;
    protected int sourceIdentifier;
    protected int filterIdentifier;
    protected LookupPreferences lookupPrefs;

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
     * Gets the value of the sourceIdentifier property.
     * 
     */
    public int getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     * 
     */
    public void setSourceIdentifier(int value) {
        this.sourceIdentifier = value;
    }

    /**
     * Gets the value of the filterIdentifier property.
     * 
     */
    public int getFilterIdentifier() {
        return filterIdentifier;
    }

    /**
     * Sets the value of the filterIdentifier property.
     * 
     */
    public void setFilterIdentifier(int value) {
        this.filterIdentifier = value;
    }

    /**
     * Gets the value of the lookupPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link LookupPreferences }
     *     
     */
    public LookupPreferences getLookupPrefs() {
        return lookupPrefs;
    }

    /**
     * Sets the value of the lookupPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupPreferences }
     *     
     */
    public void setLookupPrefs(LookupPreferences value) {
        this.lookupPrefs = value;
    }

}
