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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookupPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="matchingMode" type="{domain.ws.api.contactlab.com}LookupMatchingMode"/>
 *         &lt;element name="sortingMode" type="{domain.ws.api.contactlab.com}LookupSortingMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupPreferences", propOrder = {
    "pageNumber",
    "matchingMode",
    "sortingMode"
})
@XmlSeeAlso({
    CampaignLookupPreferences.class
})
public class LookupPreferences {

    @XmlElement(defaultValue = "1")
    protected Integer pageNumber;
    @XmlElement(required = true, defaultValue = "EQUALS")
    protected LookupMatchingMode matchingMode;
    @XmlElement(required = true, defaultValue = "DESCENDING")
    protected LookupSortingMode sortingMode;

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the matchingMode property.
     * 
     * @return
     *     possible object is
     *     {@link LookupMatchingMode }
     *     
     */
    public LookupMatchingMode getMatchingMode() {
        return matchingMode;
    }

    /**
     * Sets the value of the matchingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupMatchingMode }
     *     
     */
    public void setMatchingMode(LookupMatchingMode value) {
        this.matchingMode = value;
    }

    /**
     * Gets the value of the sortingMode property.
     * 
     * @return
     *     possible object is
     *     {@link LookupSortingMode }
     *     
     */
    public LookupSortingMode getSortingMode() {
        return sortingMode;
    }

    /**
     * Sets the value of the sortingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupSortingMode }
     *     
     */
    public void setSortingMode(LookupSortingMode value) {
        this.sortingMode = value;
    }

}
