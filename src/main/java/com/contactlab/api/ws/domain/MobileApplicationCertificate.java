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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MobileApplicationCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileApplicationCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="versionBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insertedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="authorizedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authorizedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pushEndpointType" type="{domain.ws.api.contactlab.com}PushEndpointType" minOccurs="0"/>
 *         &lt;element name="mobileApplicationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignments" type="{domain.ws.api.contactlab.com}MobileApplicationCertificateAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileApplicationCertificate", propOrder = {
    "id",
    "code",
    "ownerCustomerId",
    "active",
    "versionBy",
    "insertedAt",
    "lastModifiedAt",
    "authorized",
    "authorizedOn",
    "authorizedBy",
    "pushEndpointType",
    "mobileApplicationCode",
    "assignments"
})
@XmlSeeAlso({
    GCMsMobileApplicationCertificate.class,
    APNsMobileApplicationCertificate.class
})
public abstract class MobileApplicationCertificate {

    protected int id;
    protected String code;
    protected int ownerCustomerId;
    protected boolean active;
    protected int versionBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insertedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedAt;
    protected boolean authorized;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizedOn;
    protected Integer authorizedBy;
    protected PushEndpointType pushEndpointType;
    protected String mobileApplicationCode;
    @XmlElement(nillable = true)
    protected List<MobileApplicationCertificateAssignment> assignments;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the ownerCustomerId property.
     * 
     */
    public int getOwnerCustomerId() {
        return ownerCustomerId;
    }

    /**
     * Sets the value of the ownerCustomerId property.
     * 
     */
    public void setOwnerCustomerId(int value) {
        this.ownerCustomerId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the versionBy property.
     * 
     */
    public int getVersionBy() {
        return versionBy;
    }

    /**
     * Sets the value of the versionBy property.
     * 
     */
    public void setVersionBy(int value) {
        this.versionBy = value;
    }

    /**
     * Gets the value of the insertedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsertedAt() {
        return insertedAt;
    }

    /**
     * Sets the value of the insertedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsertedAt(XMLGregorianCalendar value) {
        this.insertedAt = value;
    }

    /**
     * Gets the value of the lastModifiedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedAt() {
        return lastModifiedAt;
    }

    /**
     * Sets the value of the lastModifiedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedAt(XMLGregorianCalendar value) {
        this.lastModifiedAt = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     */
    public boolean isAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     */
    public void setAuthorized(boolean value) {
        this.authorized = value;
    }

    /**
     * Gets the value of the authorizedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizedOn() {
        return authorizedOn;
    }

    /**
     * Sets the value of the authorizedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizedOn(XMLGregorianCalendar value) {
        this.authorizedOn = value;
    }

    /**
     * Gets the value of the authorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorizedBy(Integer value) {
        this.authorizedBy = value;
    }

    /**
     * Gets the value of the pushEndpointType property.
     * 
     * @return
     *     possible object is
     *     {@link PushEndpointType }
     *     
     */
    public PushEndpointType getPushEndpointType() {
        return pushEndpointType;
    }

    /**
     * Sets the value of the pushEndpointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PushEndpointType }
     *     
     */
    public void setPushEndpointType(PushEndpointType value) {
        this.pushEndpointType = value;
    }

    /**
     * Gets the value of the mobileApplicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileApplicationCode() {
        return mobileApplicationCode;
    }

    /**
     * Sets the value of the mobileApplicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileApplicationCode(String value) {
        this.mobileApplicationCode = value;
    }

    /**
     * Gets the value of the assignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileApplicationCertificateAssignment }
     * 
     * 
     */
    public List<MobileApplicationCertificateAssignment> getAssignments() {
        if (assignments == null) {
            assignments = new ArrayList<MobileApplicationCertificateAssignment>();
        }
        return this.assignments;
    }

}
