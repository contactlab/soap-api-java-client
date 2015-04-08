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
import com.contactlab.api.ws.TrackableLink;


/**
 * <p>Java class for PushLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PushLink">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.api.contactlab.com/}trackableLink">
 *       &lt;sequence>
 *         &lt;element name="shorten" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushLink", propOrder = {
    "shorten"
})
public class PushLink
    extends TrackableLink
{

    protected boolean shorten;

    /**
     * Gets the value of the shorten property.
     * 
     */
    public boolean isShorten() {
        return shorten;
    }

    /**
     * Sets the value of the shorten property.
     * 
     */
    public void setShorten(boolean value) {
        this.shorten = value;
    }

}
