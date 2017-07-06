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

    private final static QName _MobileApplication_QNAME = new QName("domain.ws.api.contactlab.com", "MobileApplication");
    private final static QName _PushTemplateEnvelope_QNAME = new QName("domain.ws.api.contactlab.com", "PushTemplateEnvelope");
    private final static QName _PushTemplate_QNAME = new QName("domain.ws.api.contactlab.com", "PushTemplate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.contactlab.api.ws.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link SubscriberAttribute }
     * 
     */
    public SubscriberAttribute createSubscriberAttribute() {
        return new SubscriberAttribute();
    }

    /**
     * Create an instance of {@link ActivityDetails }
     * 
     */
    public ActivityDetails createActivityDetails() {
        return new ActivityDetails();
    }

    /**
     * Create an instance of {@link APNsPushTemplate.Variants.Entry }
     * 
     */
    public APNsPushTemplate.Variants.Entry createAPNsPushTemplateVariantsEntry() {
        return new APNsPushTemplate.Variants.Entry();
    }

    /**
     * Create an instance of {@link BounceDetail }
     * 
     */
    public BounceDetail createBounceDetail() {
        return new BounceDetail();
    }

    /**
     * Create an instance of {@link APNsMobileApplicationCertificate.Components }
     * 
     */
    public APNsMobileApplicationCertificate.Components createAPNsMobileApplicationCertificateComponents() {
        return new APNsMobileApplicationCertificate.Components();
    }

    /**
     * Create an instance of {@link CampaignLookupPreferences }
     * 
     */
    public CampaignLookupPreferences createCampaignLookupPreferences() {
        return new CampaignLookupPreferences();
    }

    /**
     * Create an instance of {@link DeliverySplitConfig }
     * 
     */
    public DeliverySplitConfig createDeliverySplitConfig() {
        return new DeliverySplitConfig();
    }

    /**
     * Create an instance of {@link PushNotificationMessage }
     * 
     */
    public PushNotificationMessage createPushNotificationMessage() {
        return new PushNotificationMessage();
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link PageBuilderPage }
     * 
     */
    public PageBuilderPage createPageBuilderPage() {
        return new PageBuilderPage();
    }

    /**
     * Create an instance of {@link MobileApplicationCertificateAssignment }
     * 
     */
    public MobileApplicationCertificateAssignment createMobileApplicationCertificateAssignment() {
        return new MobileApplicationCertificateAssignment();
    }

    /**
     * Create an instance of {@link CampaignFeedback }
     * 
     */
    public CampaignFeedback createCampaignFeedback() {
        return new CampaignFeedback();
    }

    /**
     * Create an instance of {@link SubscriberSourceFilter }
     * 
     */
    public SubscriberSourceFilter createSubscriberSourceFilter() {
        return new SubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link Recipients }
     * 
     */
    public Recipients createRecipients() {
        return new Recipients();
    }

    /**
     * Create an instance of {@link APNsMobileApplicationCertificate.Components.Entry }
     * 
     */
    public APNsMobileApplicationCertificate.Components.Entry createAPNsMobileApplicationCertificateComponentsEntry() {
        return new APNsMobileApplicationCertificate.Components.Entry();
    }

    /**
     * Create an instance of {@link PushEndPointEntry }
     * 
     */
    public PushEndPointEntry createPushEndPointEntry() {
        return new PushEndPointEntry();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link LookupField }
     * 
     */
    public LookupField createLookupField() {
        return new LookupField();
    }

    /**
     * Create an instance of {@link SendImmediateOptions }
     * 
     */
    public SendImmediateOptions createSendImmediateOptions() {
        return new SendImmediateOptions();
    }

    /**
     * Create an instance of {@link LookupDate }
     * 
     */
    public LookupDate createLookupDate() {
        return new LookupDate();
    }

    /**
     * Create an instance of {@link LookupIdentifiers }
     * 
     */
    public LookupIdentifiers createLookupIdentifiers() {
        return new LookupIdentifiers();
    }

    /**
     * Create an instance of {@link SubscriberAttributeFilter }
     * 
     */
    public SubscriberAttributeFilter createSubscriberAttributeFilter() {
        return new SubscriberAttributeFilter();
    }

    /**
     * Create an instance of {@link LookupNote }
     * 
     */
    public LookupNote createLookupNote() {
        return new LookupNote();
    }

    /**
     * Create an instance of {@link MessageModels }
     * 
     */
    public MessageModels createMessageModels() {
        return new MessageModels();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link TextMessage }
     * 
     */
    public TextMessage createTextMessage() {
        return new TextMessage();
    }

    /**
     * Create an instance of {@link PageBuilderPages }
     * 
     */
    public PageBuilderPages createPageBuilderPages() {
        return new PageBuilderPages();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link Campaigns }
     * 
     */
    public Campaigns createCampaigns() {
        return new Campaigns();
    }

    /**
     * Create an instance of {@link APNsPushTemplate }
     * 
     */
    public APNsPushTemplate createAPNsPushTemplate() {
        return new APNsPushTemplate();
    }

    /**
     * Create an instance of {@link SubscriberSourceDescription }
     * 
     */
    public SubscriberSourceDescription createSubscriberSourceDescription() {
        return new SubscriberSourceDescription();
    }

    /**
     * Create an instance of {@link Sorting }
     * 
     */
    public Sorting createSorting() {
        return new Sorting();
    }

    /**
     * Create an instance of {@link FieldDescription }
     * 
     */
    public FieldDescription createFieldDescription() {
        return new FieldDescription();
    }

    /**
     * Create an instance of {@link Subscribers }
     * 
     */
    public Subscribers createSubscribers() {
        return new Subscribers();
    }

    /**
     * Create an instance of {@link Subscriptions }
     * 
     */
    public Subscriptions createSubscriptions() {
        return new Subscriptions();
    }

    /**
     * Create an instance of {@link GCMsMobileApplicationCertificate.Components.Entry }
     * 
     */
    public GCMsMobileApplicationCertificate.Components.Entry createGCMsMobileApplicationCertificateComponentsEntry() {
        return new GCMsMobileApplicationCertificate.Components.Entry();
    }

    /**
     * Create an instance of {@link CampaignAttributes }
     * 
     */
    public CampaignAttributes createCampaignAttributes() {
        return new CampaignAttributes();
    }

    /**
     * Create an instance of {@link TrackedLink }
     * 
     */
    public TrackedLink createTrackedLink() {
        return new TrackedLink();
    }

    /**
     * Create an instance of {@link CommunicationCategory }
     * 
     */
    public CommunicationCategory createCommunicationCategory() {
        return new CommunicationCategory();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link PageBuilderTemplates }
     * 
     */
    public PageBuilderTemplates createPageBuilderTemplates() {
        return new PageBuilderTemplates();
    }

    /**
     * Create an instance of {@link DeliveryFeedback }
     * 
     */
    public DeliveryFeedback createDeliveryFeedback() {
        return new DeliveryFeedback();
    }

    /**
     * Create an instance of {@link DetailedRequestStatus }
     * 
     */
    public DetailedRequestStatus createDetailedRequestStatus() {
        return new DetailedRequestStatus();
    }

    /**
     * Create an instance of {@link SubscriberSourceField }
     * 
     */
    public SubscriberSourceField createSubscriberSourceField() {
        return new SubscriberSourceField();
    }

    /**
     * Create an instance of {@link ListAttributeValues }
     * 
     */
    public ListAttributeValues createListAttributeValues() {
        return new ListAttributeValues();
    }

    /**
     * Create an instance of {@link SubscriberSources }
     * 
     */
    public SubscriberSources createSubscriberSources() {
        return new SubscriberSources();
    }

    /**
     * Create an instance of {@link APNsMobileApplicationCertificate }
     * 
     */
    public APNsMobileApplicationCertificate createAPNsMobileApplicationCertificate() {
        return new APNsMobileApplicationCertificate();
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
     * Create an instance of {@link CampaignNote }
     * 
     */
    public CampaignNote createCampaignNote() {
        return new CampaignNote();
    }

    /**
     * Create an instance of {@link APNsPushTemplate.Variants }
     * 
     */
    public APNsPushTemplate.Variants createAPNsPushTemplateVariants() {
        return new APNsPushTemplate.Variants();
    }

    /**
     * Create an instance of {@link SubscriberSource }
     * 
     */
    public SubscriberSource createSubscriberSource() {
        return new SubscriberSource();
    }

    /**
     * Create an instance of {@link GCMsMobileApplicationCertificate }
     * 
     */
    public GCMsMobileApplicationCertificate createGCMsMobileApplicationCertificate() {
        return new GCMsMobileApplicationCertificate();
    }

    /**
     * Create an instance of {@link SplitTestCampaign }
     * 
     */
    public SplitTestCampaign createSplitTestCampaign() {
        return new SplitTestCampaign();
    }

    /**
     * Create an instance of {@link PageBuilderTemplate }
     * 
     */
    public PageBuilderTemplate createPageBuilderTemplate() {
        return new PageBuilderTemplate();
    }

    /**
     * Create an instance of {@link AuthToken }
     * 
     */
    public AuthToken createAuthToken() {
        return new AuthToken();
    }

    /**
     * Create an instance of {@link IndexDescription }
     * 
     */
    public IndexDescription createIndexDescription() {
        return new IndexDescription();
    }

    /**
     * Create an instance of {@link FaxMessage }
     * 
     */
    public FaxMessage createFaxMessage() {
        return new FaxMessage();
    }

    /**
     * Create an instance of {@link PushMessage }
     * 
     */
    public PushMessage createPushMessage() {
        return new PushMessage();
    }

    /**
     * Create an instance of {@link XMLDeliveryInfos }
     * 
     */
    public XMLDeliveryInfos createXMLDeliveryInfos() {
        return new XMLDeliveryInfos();
    }

    /**
     * Create an instance of {@link LookupPreferences }
     * 
     */
    public LookupPreferences createLookupPreferences() {
        return new LookupPreferences();
    }

    /**
     * Create an instance of {@link TrackedLinks }
     * 
     */
    public TrackedLinks createTrackedLinks() {
        return new TrackedLinks();
    }

    /**
     * Create an instance of {@link SubscriptionAttributes }
     * 
     */
    public SubscriptionAttributes createSubscriptionAttributes() {
        return new SubscriptionAttributes();
    }

    /**
     * Create an instance of {@link SubscriberSourceFilters }
     * 
     */
    public SubscriberSourceFilters createSubscriberSourceFilters() {
        return new SubscriberSourceFilters();
    }

    /**
     * Create an instance of {@link PushLink }
     * 
     */
    public PushLink createPushLink() {
        return new PushLink();
    }

    /**
     * Create an instance of {@link CampaignNotes }
     * 
     */
    public CampaignNotes createCampaignNotes() {
        return new CampaignNotes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "domain.ws.api.contactlab.com", name = "MobileApplication")
    public JAXBElement<MobileApplication> createMobileApplication(MobileApplication value) {
        return new JAXBElement<MobileApplication>(_MobileApplication_QNAME, MobileApplication.class, null, value);
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

}
