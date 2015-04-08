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
 * <p>Java class for MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="MS_WORD"/>
 *     &lt;enumeration value="MS_EXCEL"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="BINARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MimeType")
@XmlEnum
public enum MimeType {

    TIFF,
    MS_WORD,
    MS_EXCEL,
    PDF,
    CSV,
    TXT,
    GIF,
    JPEG,
    PNG,
    BINARY;

    public String value() {
        return name();
    }

    public static MimeType fromValue(String v) {
        return valueOf(v);
    }

}
