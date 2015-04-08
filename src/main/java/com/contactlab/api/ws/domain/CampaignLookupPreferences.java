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
 * <p>Java class for CampaignLookupPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignLookupPreferences">
 *   &lt;complexContent>
 *     &lt;extension base="{domain.ws.api.contactlab.com}LookupPreferences">
 *       &lt;sequence>
 *         &lt;element name="sortingBy" type="{domain.ws.api.contactlab.com}CampaignSortingOption"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignLookupPreferences", propOrder = {
    "sortingBy"
})
public class CampaignLookupPreferences
    extends LookupPreferences
{

    @XmlElement(required = true, defaultValue = "IDENTIFIER")
    protected CampaignSortingOption sortingBy;

    /**
     * Gets the value of the sortingBy property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSortingOption }
     *     
     */
    public CampaignSortingOption getSortingBy() {
        return sortingBy;
    }

    /**
     * Sets the value of the sortingBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSortingOption }
     *     
     */
    public void setSortingBy(CampaignSortingOption value) {
        this.sortingBy = value;
    }

}
