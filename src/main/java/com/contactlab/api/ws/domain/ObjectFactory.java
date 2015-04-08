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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.contactlab.api.ws.MobileApplication;
import com.contactlab.api.ws.PushTemplateEnvelope;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.contactlab.api.ws.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PushTemplateEnvelope_QNAME = new QName("domain.ws.api.contactlab.com", "PushTemplateEnvelope");
    private final static QName _PushTemplate_QNAME = new QName("domain.ws.api.contactlab.com", "PushTemplate");
    private final static QName _MobileApplication_QNAME = new QName("domain.ws.api.contactlab.com", "MobileApplication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.contactlab.api.ws.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubscriberSources }
     * 
     */
    public SubscriberSources createSubscriberSources() {
        return new SubscriberSources();
    }

    /**
     * Create an instance of {@link APNsMobileApplicationCertificate.Components.Entry }
     * 
     */
    public APNsMobileApplicationCertificate.Components.Entry createAPNsMobileApplicationCertificateComponentsEntry() {
        return new APNsMobileApplicationCertificate.Components.Entry();
    }

    /**
     * Create an instance of {@link CampaignLookupPreferences }
     * 
     */
    public CampaignLookupPreferences createCampaignLookupPreferences() {
        return new CampaignLookupPreferences();
    }

    /**
     * Create an instance of {@link APNsMobileApplicationCertificate }
     * 
     */
    public APNsMobileApplicationCertificate createAPNsMobileApplicationCertificate() {
        return new APNsMobileApplicationCertificate();
    }

    /**
     * Create an instance of {@link AuthToken }
     * 
     */
    public AuthToken createAuthToken() {
        return new AuthToken();
    }

    /**
     * Create an instance of {@link SubscriberAttribute }
     * 
     */
    public SubscriberAttribute createSubscriberAttribute() {
        return new SubscriberAttribute();
    }

    /**
     * Create an instance of {@link SubscriberSource }
     * 
     */
    public SubscriberSource createSubscriberSource() {
        return new SubscriberSource();
    }

    /**
     * Create an instance of {@link Campaigns }
     * 
     */
    public Campaigns createCampaigns() {
        return new Campaigns();
    }

    /**
     * Create an instance of {@link APNsPushTemplate.Variants.Entry }
     * 
     */
    public APNsPushTemplate.Variants.Entry createAPNsPushTemplateVariantsEntry() {
        return new APNsPushTemplate.Variants.Entry();
    }

    /**
     * Create an instance of {@link TrackedLinks }
     * 
     */
    public TrackedLinks createTrackedLinks() {
        return new TrackedLinks();
    }

    /**
     * Create an instance of {@link APNsPushTemplate }
     * 
     */
    public APNsPushTemplate createAPNsPushTemplate() {
        return new APNsPushTemplate();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link SubscriberSourceFilter }
     * 
     */
    public SubscriberSourceFilter createSubscriberSourceFilter() {
        return new SubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link APNsPushTemplate.Variants }
     * 
     */
    public APNsPushTemplate.Variants createAPNsPushTemplateVariants() {
        return new APNsPushTemplate.Variants();
    }

    /**
     * Create an instance of {@link SubscriberSourceFilters }
     * 
     */
    public SubscriberSourceFilters createSubscriberSourceFilters() {
        return new SubscriberSourceFilters();
    }

    /**
     * Create an instance of {@link Recipients }
     * 
     */
    public Recipients createRecipients() {
        return new Recipients();
    }

    /**
     * Create an instance of {@link CampaignNotes }
     * 
     */
    public CampaignNotes createCampaignNotes() {
        return new CampaignNotes();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link GCMsMobileApplicationCertificate.Components.Entry }
     * 
     */
    public GCMsMobileApplicationCertificate.Components.Entry createGCMsMobileApplicationCertificateComponentsEntry() {
        return new GCMsMobileApplicationCertificate.Components.Entry();
    }

    /**
     * Create an instance of {@link CampaignFeedback }
     * 
     */
    public CampaignFeedback createCampaignFeedback() {
        return new CampaignFeedback();
    }

    /**
     * Create an instance of {@link MobileApplicationCertificateAssignment }
     * 
     */
    public MobileApplicationCertificateAssignment createMobileApplicationCertificateAssignment() {
        return new MobileApplicationCertificateAssignment();
    }

    /**
     * Create an instance of {@link GCMsMobileApplicationCertificate }
     * 
     */
    public GCMsMobileApplicationCertificate createGCMsMobileApplicationCertificate() {
        return new GCMsMobileApplicationCertificate();
    }

    /**
     * Create an instance of {@link XMLDeliveryInfos }
     * 
     */
    public XMLDeliveryInfos createXMLDeliveryInfos() {
        return new XMLDeliveryInfos();
    }

    /**
     * Create an instance of {@link BounceDetail }
     * 
     */
    public BounceDetail createBounceDetail() {
        return new BounceDetail();
    }

    /**
     * Create an instance of {@link GCMsMobileApplicationCertificate.Components }
     * 
     */
    public GCMsMobileApplicationCertificate.Components createGCMsMobileApplicationCertificateComponents() {
        return new GCMsMobileApplicationCertificate.Components();
    }

    /**
     * Create an instance of {@link EmailMessage }
     * 
     */
    public EmailMessage createEmailMessage() {
        return new EmailMessage();
    }

    /**
     * Create an instance of {@link LookupPreferences }
     * 
     */
    public LookupPreferences createLookupPreferences() {
        return new LookupPreferences();
    }

    /**
     * Create an instance of {@link MessageModels }
     * 
     */
    public MessageModels createMessageModels() {
        return new MessageModels();
    }

    /**
     * Create an instance of {@link Subscribers }
     * 
     */
    public Subscribers createSubscribers() {
        return new Subscribers();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link SubscriberSourceField }
     * 
     */
    public SubscriberSourceField createSubscriberSourceField() {
        return new SubscriberSourceField();
    }

    /**
     * Create an instance of {@link PushMessage }
     * 
     */
    public PushMessage createPushMessage() {
        return new PushMessage();
    }

    /**
     * Create an instance of {@link TrackedLink }
     * 
     */
    public TrackedLink createTrackedLink() {
        return new TrackedLink();
    }

    /**
     * Create an instance of {@link CampaignNote }
     * 
     */
    public CampaignNote createCampaignNote() {
        return new CampaignNote();
    }

    /**
     * Create an instance of {@link APNsMobileApplicationCertificate.Components }
     * 
     */
    public APNsMobileApplicationCertificate.Components createAPNsMobileApplicationCertificateComponents() {
        return new APNsMobileApplicationCertificate.Components();
    }

    /**
     * Create an instance of {@link TextMessage }
     * 
     */
    public TextMessage createTextMessage() {
        return new TextMessage();
    }

    /**
     * Create an instance of {@link PushLink }
     * 
     */
    public PushLink createPushLink() {
        return new PushLink();
    }

    /**
     * Create an instance of {@link CommunicationCategory }
     * 
     */
    public CommunicationCategory createCommunicationCategory() {
        return new CommunicationCategory();
    }

    /**
     * Create an instance of {@link FaxMessage }
     * 
     */
    public FaxMessage createFaxMessage() {
        return new FaxMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushTemplateEnvelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "domain.ws.api.contactlab.com", name = "PushTemplateEnvelope")
    public JAXBElement<PushTemplateEnvelope> createPushTemplateEnvelope(PushTemplateEnvelope value) {
        return new JAXBElement<PushTemplateEnvelope>(_PushTemplateEnvelope_QNAME, PushTemplateEnvelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "domain.ws.api.contactlab.com", name = "PushTemplate")
    public JAXBElement<Object> createPushTemplate(Object value) {
        return new JAXBElement<Object>(_PushTemplate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "domain.ws.api.contactlab.com", name = "MobileApplication")
    public JAXBElement<MobileApplication> createMobileApplication(MobileApplication value) {
        return new JAXBElement<MobileApplication>(_MobileApplication_QNAME, MobileApplication.class, null, value);
    }

}
