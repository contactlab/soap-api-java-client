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
 * <p>Java class for winningCriterion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="winningCriterion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WINNING_CRITERION_BY_VIEW"/>
 *     &lt;enumeration value="WINNING_CRITERION_BY_CLICK"/>
 *     &lt;enumeration value="WINNING_CRITERION_BY_CTOR"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "winningCriterion")
@XmlEnum
public enum WinningCriterion {

    WINNING_CRITERION_BY_VIEW,
    WINNING_CRITERION_BY_CLICK,
    WINNING_CRITERION_BY_CTOR,
    NONE;

    public String value() {
        return name();
    }

    public static WinningCriterion fromValue(String v) {
        return valueOf(v);
    }

}
