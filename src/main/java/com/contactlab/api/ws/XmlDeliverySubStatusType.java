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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmlDeliverySubStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xmlDeliverySubStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELIVERY_STARTED"/>
 *     &lt;enumeration value="DELIVERY_FINISHED"/>
 *     &lt;enumeration value="RECIPIENTS_ADDED"/>
 *     &lt;enumeration value="RECIPIENTS_UPLOAD_STARTED"/>
 *     &lt;enumeration value="RECIPIENTS_UPLOAD_FINISHED"/>
 *     &lt;enumeration value="SEMAPHORE_FOUND"/>
 *     &lt;enumeration value="SEMAPHORE_DELETED"/>
 *     &lt;enumeration value="XML_CONFIGURATION_FILE_FOUND"/>
 *     &lt;enumeration value="XMLD_CONFIGURATION_ERROR"/>
 *     &lt;enumeration value="API_COMMUNICATION_ERROR"/>
 *     &lt;enumeration value="XML_ERROR"/>
 *     &lt;enumeration value="SERVER_COMMUNICATION_ERROR"/>
 *     &lt;enumeration value="GENERIC_ERROR"/>
 *     &lt;enumeration value="DELIVERY_ID"/>
 *     &lt;enumeration value="DELIVERY_ID_TEST"/>
 *     &lt;enumeration value="DELIVERY_CONTENT"/>
 *     &lt;enumeration value="DOWNLOAD_XML_COMPLETED"/>
 *     &lt;enumeration value="DOWNLOAD_CSV_ZIP_COMPLETED"/>
 *     &lt;enumeration value="USER_REQUESTING"/>
 *     &lt;enumeration value="QUALIFIER_ID"/>
 *     &lt;enumeration value="QUALIFIER_TEST_ID"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xmlDeliverySubStatusType")
@XmlEnum
public enum XmlDeliverySubStatusType {

    DELIVERY_STARTED,
    DELIVERY_FINISHED,
    RECIPIENTS_ADDED,
    RECIPIENTS_UPLOAD_STARTED,
    RECIPIENTS_UPLOAD_FINISHED,
    SEMAPHORE_FOUND,
    SEMAPHORE_DELETED,
    XML_CONFIGURATION_FILE_FOUND,
    XMLD_CONFIGURATION_ERROR,
    API_COMMUNICATION_ERROR,
    XML_ERROR,
    SERVER_COMMUNICATION_ERROR,
    GENERIC_ERROR,
    DELIVERY_ID,
    DELIVERY_ID_TEST,
    DELIVERY_CONTENT,
    DOWNLOAD_XML_COMPLETED,
    DOWNLOAD_CSV_ZIP_COMPLETED,
    USER_REQUESTING,
    QUALIFIER_ID,
    QUALIFIER_TEST_ID,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static XmlDeliverySubStatusType fromValue(String v) {
        return valueOf(v);
    }

}
