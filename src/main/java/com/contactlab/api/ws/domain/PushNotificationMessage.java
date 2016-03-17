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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PushNotificationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{domain.ws.api.contactlab.com}Message">
 *       &lt;sequence>
 *         &lt;element name="endPoints" type="{domain.ws.api.contactlab.com}PushEndPointEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationMessage", propOrder = {
    "endPoints"
})
public class PushNotificationMessage
    extends Message
{

    protected List<PushEndPointEntry> endPoints;

    /**
     * Gets the value of the endPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PushEndPointEntry }
     * 
     * 
     */
    public List<PushEndPointEntry> getEndPoints() {
        if (endPoints == null) {
            endPoints = new ArrayList<PushEndPointEntry>();
        }
        return this.endPoints;
    }

}
