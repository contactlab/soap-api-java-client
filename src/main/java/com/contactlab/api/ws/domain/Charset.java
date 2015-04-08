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
 * <p>Java class for charset.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="charset">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cp1252"/>
 *     &lt;enumeration value="ISO_8859_15"/>
 *     &lt;enumeration value="ISO_8859_1"/>
 *     &lt;enumeration value="SHIFT_JIS"/>
 *     &lt;enumeration value="UTF_8"/>
 *     &lt;enumeration value="UTF_16"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "charset")
@XmlEnum
public enum Charset {

    @XmlEnumValue("Cp1252")
    CP_1252("Cp1252"),
    ISO_8859_15("ISO_8859_15"),
    ISO_8859_1("ISO_8859_1"),
    SHIFT_JIS("SHIFT_JIS"),
    UTF_8("UTF_8"),
    UTF_16("UTF_16");
    private final String value;

    Charset(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Charset fromValue(String v) {
        for (Charset c: Charset.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
