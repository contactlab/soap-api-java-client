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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deliveryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERRUPTED"/>
 *     &lt;enumeration value="DEAD"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="FINISHED"/>
 *     &lt;enumeration value="WAITING"/>
 *     &lt;enumeration value="ALMOST_READY"/>
 *     &lt;enumeration value="PERIODIC"/>
 *     &lt;enumeration value="HIDDEN"/>
 *     &lt;enumeration value="TRIGGERED"/>
 *     &lt;enumeration value="SPLIT_RUNNING"/>
 *     &lt;enumeration value="MASTER_REMOVE"/>
 *     &lt;enumeration value="CLOSING"/>
 *     &lt;enumeration value="IMMEDIATE"/>
 *     &lt;enumeration value="SMARTRELAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deliveryStatus")
@XmlEnum
public enum DeliveryStatus {

    INTERRUPTED,
    DEAD,
    FAILED,
    NEW,
    READY,
    RUNNING,
    FINISHED,
    WAITING,
    ALMOST_READY,
    PERIODIC,
    HIDDEN,
    TRIGGERED,
    SPLIT_RUNNING,
    MASTER_REMOVE,
    CLOSING,
    IMMEDIATE,
    SMARTRELAY;

    public String value() {
        return name();
    }

    public static DeliveryStatus fromValue(String v) {
        return valueOf(v);
    }

}
