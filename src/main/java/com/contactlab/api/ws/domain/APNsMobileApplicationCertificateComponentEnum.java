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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APNsMobileApplicationCertificateComponentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APNsMobileApplicationCertificateComponentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CERTIFICATE"/>
 *     &lt;enumeration value="CRYPTOGRAPHIC_KEY"/>
 *     &lt;enumeration value="P12_PATH"/>
 *     &lt;enumeration value="P12_CONTENT"/>
 *     &lt;enumeration value="P12_PASSWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APNsMobileApplicationCertificateComponentEnum")
@XmlEnum
public enum APNsMobileApplicationCertificateComponentEnum {

    CERTIFICATE("CERTIFICATE"),
    CRYPTOGRAPHIC_KEY("CRYPTOGRAPHIC_KEY"),
    @XmlEnumValue("P12_PATH")
    P_12_PATH("P12_PATH"),
    @XmlEnumValue("P12_CONTENT")
    P_12_CONTENT("P12_CONTENT"),
    @XmlEnumValue("P12_PASSWD")
    P_12_PASSWD("P12_PASSWD");
    private final String value;

    APNsMobileApplicationCertificateComponentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APNsMobileApplicationCertificateComponentEnum fromValue(String v) {
        for (APNsMobileApplicationCertificateComponentEnum c: APNsMobileApplicationCertificateComponentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
