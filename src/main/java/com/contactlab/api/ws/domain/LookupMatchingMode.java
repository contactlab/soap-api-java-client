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
 * <p>Java class for LookupMatchingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LookupMatchingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="IS_NULL"/>
 *     &lt;enumeration value="IS_NOT_NULL"/>
 *     &lt;enumeration value="GREATER"/>
 *     &lt;enumeration value="GREATER_EQUALS"/>
 *     &lt;enumeration value="LESS"/>
 *     &lt;enumeration value="LESS_EQUALS"/>
 *     &lt;enumeration value="NOT_LIKE"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NOT_IN"/>
 *     &lt;enumeration value="DIFFERENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LookupMatchingMode")
@XmlEnum
public enum LookupMatchingMode {

    EQUALS,
    LIKE,
    IS_NULL,
    IS_NOT_NULL,
    GREATER,
    GREATER_EQUALS,
    LESS,
    LESS_EQUALS,
    NOT_LIKE,
    IN,
    NOT_IN,
    DIFFERENT;

    public String value() {
        return name();
    }

    public static LookupMatchingMode fromValue(String v) {
        return valueOf(v);
    }

}
