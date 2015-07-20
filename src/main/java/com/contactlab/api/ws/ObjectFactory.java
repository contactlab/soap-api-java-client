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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.contactlab.api.ws package. 
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

    private final static QName _FindMessagesInfoResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesInfoResponse");
    private final static QName _CancelCampaignResponse_QNAME = new QName("http://ws.api.contactlab.com/", "cancelCampaignResponse");
    private final static QName _SetCampaignRecurrency_QNAME = new QName("http://ws.api.contactlab.com/", "setCampaignRecurrency");
    private final static QName _FindFiltersBySubscriberSource_QNAME = new QName("http://ws.api.contactlab.com/", "findFiltersBySubscriberSource");
    private final static QName _SendImmediateMessageSidCidCAResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCidCAResponse");
    private final static QName _CreateMessageModelResponse_QNAME = new QName("http://ws.api.contactlab.com/", "createMessageModelResponse");
    private final static QName _SendImmediateMessageSidCidCA_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCidCA");
    private final static QName _CountSubscribersIncludedInFilter_QNAME = new QName("http://ws.api.contactlab.com/", "countSubscribersIncludedInFilter");
    private final static QName _SendImmediateByCampaignToSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignToSubscriberResponse");
    private final static QName _GetTrackedLinksResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getTrackedLinksResponse");
    private final static QName _GetSubscriberDataExchangeStatus_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberDataExchangeStatus");
    private final static QName _StartSubscriberDataExchangeResponse_QNAME = new QName("http://ws.api.contactlab.com/", "startSubscriberDataExchangeResponse");
    private final static QName _FindCampaignsByModel_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByModel");
    private final static QName _SendImmediateMessageSidCAl_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCAl");
    private final static QName _FindPeriodicCampaignsResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findPeriodicCampaignsResponse");
    private final static QName _SendImmediateByCampaignToSubscriberId_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignToSubscriberId");
    private final static QName _GetSubscriberSource_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberSource");
    private final static QName _SendImmediateByCampaignToSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignToSubscriber");
    private final static QName _FindCampaignsByNote_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByNote");
    private final static QName _FindMessageByCampaignId_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageByCampaignId");
    private final static QName _FindSubscribersResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findSubscribersResponse");
    private final static QName _FindCampaignsByStatusResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByStatusResponse");
    private final static QName _FindCampaignsByNoteResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByNoteResponse");
    private final static QName _InvalidateToken_QNAME = new QName("http://ws.api.contactlab.com/", "invalidateToken");
    private final static QName _AddAttachmentResponse_QNAME = new QName("http://ws.api.contactlab.com/", "addAttachmentResponse");
    private final static QName _GetCampaignFeedback_QNAME = new QName("http://ws.api.contactlab.com/", "getCampaignFeedback");
    private final static QName _GetTrackedLinks_QNAME = new QName("http://ws.api.contactlab.com/", "getTrackedLinks");
    private final static QName _CancelCampaign_QNAME = new QName("http://ws.api.contactlab.com/", "cancelCampaign");
    private final static QName _RequestCampaignFeedbackReport_QNAME = new QName("http://ws.api.contactlab.com/", "requestCampaignFeedbackReport");
    private final static QName _GetAvailableCommunicationCategories_QNAME = new QName("http://ws.api.contactlab.com/", "getAvailableCommunicationCategories");
    private final static QName _GetXMLDeliveries_QNAME = new QName("http://ws.api.contactlab.com/", "getXMLDeliveries");
    private final static QName _SendCampaign_QNAME = new QName("http://ws.api.contactlab.com/", "sendCampaign");
    private final static QName _GetEmptyPushTemplate_QNAME = new QName("http://ws.api.contactlab.com/", "getEmptyPushTemplate");
    private final static QName _PublishOnWebResponse_QNAME = new QName("http://ws.api.contactlab.com/", "publishOnWebResponse");
    private final static QName _FindMessageModelsResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageModelsResponse");
    private final static QName _SendImmediateByCampaignToSubscriberIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignToSubscriberIdResponse");
    private final static QName _FindSubscribersIncludedInFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findSubscribersIncludedInFilterResponse");
    private final static QName _GetSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberResponse");
    private final static QName _AddSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscriberResponse");
    private final static QName _ModifySubscriberSubscriptionStatusByMailqIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "modifySubscriberSubscriptionStatusByMailqIdResponse");
    private final static QName _FindCampaigns_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaigns");
    private final static QName _FindCampaignsByNameOrSubjectResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByNameOrSubjectResponse");
    private final static QName _AddSubscribers_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscribers");
    private final static QName _FindMessagesByChannel_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesByChannel");
    private final static QName _FindMessagesInfo_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesInfo");
    private final static QName _SendImmediateMessageSidCid_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCid");
    private final static QName _FindArchivedFiltersBySubscriberSource_QNAME = new QName("http://ws.api.contactlab.com/", "findArchivedFiltersBySubscriberSource");
    private final static QName _SendImmediateByCampaignAliasToSubscriberId_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignAliasToSubscriberId");
    private final static QName _AddAttachment_QNAME = new QName("http://ws.api.contactlab.com/", "addAttachment");
    private final static QName _UploadMediaContentResponse_QNAME = new QName("http://ws.api.contactlab.com/", "uploadMediaContentResponse");
    private final static QName _FindSubscriberSources_QNAME = new QName("http://ws.api.contactlab.com/", "findSubscriberSources");
    private final static QName _GetCampaignResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getCampaignResponse");
    private final static QName _RequestCampaignFeedbackReportResponse_QNAME = new QName("http://ws.api.contactlab.com/", "requestCampaignFeedbackReportResponse");
    private final static QName _FindMessageModelsBySubscriberSource_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageModelsBySubscriberSource");
    private final static QName _AddSubscriberSource_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscriberSource");
    private final static QName _FindMessages_QNAME = new QName("http://ws.api.contactlab.com/", "findMessages");
    private final static QName _SendImmediateMessageSIdCDataCA_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSIdCDataCA");
    private final static QName _SendImmediateMessageSIdCData_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSIdCData");
    private final static QName _SetCampaignRecurrencyResponse_QNAME = new QName("http://ws.api.contactlab.com/", "setCampaignRecurrencyResponse");
    private final static QName _GetMobileApplicationByCodeResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getMobileApplicationByCodeResponse");
    private final static QName _RemoveSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "removeSubscriberResponse");
    private final static QName _CreateMessageModel_QNAME = new QName("http://ws.api.contactlab.com/", "createMessageModel");
    private final static QName _GetXMLDeliveryTransitionsResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getXMLDeliveryTransitionsResponse");
    private final static QName _ReuseSubscriberSourceFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "reuseSubscriberSourceFilterResponse");
    private final static QName _FindMessageInfoByCampaignId_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageInfoByCampaignId");
    private final static QName _SendImmediateByCampaignAliasToSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignAliasToSubscriber");
    private final static QName _FindFiltersBySubscriberSourceResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findFiltersBySubscriberSourceResponse");
    private final static QName _AddSubscriberSourceFilter_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscriberSourceFilter");
    private final static QName _AddSubscribersResponse_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscribersResponse");
    private final static QName _FindMessageByCampaignIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageByCampaignIdResponse");
    private final static QName _FindMessagesByChannelResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesByChannelResponse");
    private final static QName _CountSubscribers_QNAME = new QName("http://ws.api.contactlab.com/", "countSubscribers");
    private final static QName _SendSplitTestResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendSplitTestResponse");
    private final static QName _FindMessagesResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesResponse");
    private final static QName _FindCampaignsSentBetweenResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsSentBetweenResponse");
    private final static QName _FindArchivedFiltersBySubscriberSourceResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findArchivedFiltersBySubscriberSourceResponse");
    private final static QName _AddCampaignNote_QNAME = new QName("http://ws.api.contactlab.com/", "addCampaignNote");
    private final static QName _FindNotesByCampaignResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findNotesByCampaignResponse");
    private final static QName _FindCampaignsResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsResponse");
    private final static QName _SendImmediateByCampaignIdToSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignIdToSubscriberResponse");
    private final static QName _UpdateSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "updateSubscriber");
    private final static QName _GetMobileApplicationByCode_QNAME = new QName("http://ws.api.contactlab.com/", "getMobileApplicationByCode");
    private final static QName _FindMessagesByCampaignNameResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesByCampaignNameResponse");
    private final static QName _SendImmediateMessageSDataCDataCA_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSDataCDataCA");
    private final static QName _FindMessageModels_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageModels");
    private final static QName _ArchiveSubscriberSourceFilter_QNAME = new QName("http://ws.api.contactlab.com/", "archiveSubscriberSourceFilter");
    private final static QName _GetMessageModelByIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getMessageModelByIdResponse");
    private final static QName _UploadMediaContent_QNAME = new QName("http://ws.api.contactlab.com/", "uploadMediaContent");
    private final static QName _GetCryptoKey_QNAME = new QName("http://ws.api.contactlab.com/", "getCryptoKey");
    private final static QName _FindMessagesInfoByChannelResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesInfoByChannelResponse");
    private final static QName _GetRequestStatusResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getRequestStatusResponse");
    private final static QName _GetSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriber");
    private final static QName _GetAttachmentByCampaignId_QNAME = new QName("http://ws.api.contactlab.com/", "getAttachmentByCampaignId");
    private final static QName _ArchiveSubscriberSourceFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "archiveSubscriberSourceFilterResponse");
    private final static QName _ModifySubscriberSubscriptionStatusResponse_QNAME = new QName("http://ws.api.contactlab.com/", "modifySubscriberSubscriptionStatusResponse");
    private final static QName _ModifySubscriberSubscriptionStatus_QNAME = new QName("http://ws.api.contactlab.com/", "modifySubscriberSubscriptionStatus");
    private final static QName _FindPeriodicCampaigns_QNAME = new QName("http://ws.api.contactlab.com/", "findPeriodicCampaigns");
    private final static QName _InvalidateTokenResponse_QNAME = new QName("http://ws.api.contactlab.com/", "invalidateTokenResponse");
    private final static QName _GetAttachmentByCampaignIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getAttachmentByCampaignIdResponse");
    private final static QName _UnmarshalPushTemplateEnvelope_QNAME = new QName("http://ws.api.contactlab.com/", "unmarshalPushTemplateEnvelope");
    private final static QName _SendSplitTestWinner_QNAME = new QName("http://ws.api.contactlab.com/", "sendSplitTestWinner");
    private final static QName _StartSubscriberDataExchange_QNAME = new QName("http://ws.api.contactlab.com/", "startSubscriberDataExchange");
    private final static QName _SendImmediateByCampaignIdToSubscriberId_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignIdToSubscriberId");
    private final static QName _SendSplitTestWinnerResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendSplitTestWinnerResponse");
    private final static QName _SendImmediateMessageSdataCAlCAResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSdataCAlCAResponse");
    private final static QName _AddSubscriberSourceFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscriberSourceFilterResponse");
    private final static QName _SendImmediateMessageSdataCAl_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSdataCAl");
    private final static QName _BorrowTokenResponse_QNAME = new QName("http://ws.api.contactlab.com/", "borrowTokenResponse");
    private final static QName _SendImmediateByCampaignAliasToSubscriberIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignAliasToSubscriberIdResponse");
    private final static QName _FindMessagesInfoByCampaignName_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesInfoByCampaignName");
    private final static QName _UpdateSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "updateSubscriberResponse");
    private final static QName _GetCampaignDeliveryStatusResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getCampaignDeliveryStatusResponse");
    private final static QName _FindCampaignsBySubscriberSourceFilter_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsBySubscriberSourceFilter");
    private final static QName _AddSubscriberSourceResponse_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscriberSourceResponse");
    private final static QName _SendImmediateByCampaignAliasToSubscriberResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignAliasToSubscriberResponse");
    private final static QName _CountSubscribersResponse_QNAME = new QName("http://ws.api.contactlab.com/", "countSubscribersResponse");
    private final static QName _FindTriggerableCampaigns_QNAME = new QName("http://ws.api.contactlab.com/", "findTriggerableCampaigns");
    private final static QName _CreateCampaign_QNAME = new QName("http://ws.api.contactlab.com/", "createCampaign");
    private final static QName _FindMessagesByCampaignName_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesByCampaignName");
    private final static QName _PublishOnWeb_QNAME = new QName("http://ws.api.contactlab.com/", "publishOnWeb");
    private final static QName _KeepaliveTokenResponse_QNAME = new QName("http://ws.api.contactlab.com/", "keepaliveTokenResponse");
    private final static QName _CountSubscribersIncludedInFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "countSubscribersIncludedInFilterResponse");
    private final static QName _AddSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "addSubscriber");
    private final static QName _GetSubscriberSourceResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberSourceResponse");
    private final static QName _TriggerDeliveryByAlias_QNAME = new QName("http://ws.api.contactlab.com/", "triggerDeliveryByAlias");
    private final static QName _SendImmediateMessageSidCidResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCidResponse");
    private final static QName _FindTriggerableCampaignsResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findTriggerableCampaignsResponse");
    private final static QName _KeepaliveToken_QNAME = new QName("http://ws.api.contactlab.com/", "keepaliveToken");
    private final static QName _SendImmediateMessage_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessage");
    private final static QName _GetArchivedSubscriberSourceFilter_QNAME = new QName("http://ws.api.contactlab.com/", "getArchivedSubscriberSourceFilter");
    private final static QName _SendImmediateMessageSidCAlResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCAlResponse");
    private final static QName _GetXMLDeliveriesResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getXMLDeliveriesResponse");
    private final static QName _SendImmediateMessageSidCAlCAResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCAlCAResponse");
    private final static QName _FindMessageModelsBySubscriberSourceResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageModelsBySubscriberSourceResponse");
    private final static QName _GetCampaignFeedbackResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getCampaignFeedbackResponse");
    private final static QName _SendImmediateMessageSIdCDataResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSIdCDataResponse");
    private final static QName _SendCampaignResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendCampaignResponse");
    private final static QName _FindCampaignsSentBetween_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsSentBetween");
    private final static QName _GetCryptoKeyResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getCryptoKeyResponse");
    private final static QName _FindCampaignsByNameOrSubject_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByNameOrSubject");
    private final static QName _TriggerDeliveryById_QNAME = new QName("http://ws.api.contactlab.com/", "triggerDeliveryById");
    private final static QName _GetRequestStatus_QNAME = new QName("http://ws.api.contactlab.com/", "getRequestStatus");
    private final static QName _GetSubscriberDataExchangeStatusResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberDataExchangeStatusResponse");
    private final static QName _CloneAndSendCampaign_QNAME = new QName("http://ws.api.contactlab.com/", "cloneAndSendCampaign");
    private final static QName _AddCampaignNoteResponse_QNAME = new QName("http://ws.api.contactlab.com/", "addCampaignNoteResponse");
    private final static QName _CloneAndSendCampaignResponse_QNAME = new QName("http://ws.api.contactlab.com/", "cloneAndSendCampaignResponse");
    private final static QName _GetCampaign_QNAME = new QName("http://ws.api.contactlab.com/", "getCampaign");
    private final static QName _GetSubscriberSourceFilter_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberSourceFilter");
    private final static QName _SendSplitTest_QNAME = new QName("http://ws.api.contactlab.com/", "sendSplitTest");
    private final static QName _SendImmediateMessageResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageResponse");
    private final static QName _GetMessageModelById_QNAME = new QName("http://ws.api.contactlab.com/", "getMessageModelById");
    private final static QName _GetEmptyPushTemplateResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getEmptyPushTemplateResponse");
    private final static QName _BorrowToken_QNAME = new QName("http://ws.api.contactlab.com/", "borrowToken");
    private final static QName _TriggerDeliveryByAliasResponse_QNAME = new QName("http://ws.api.contactlab.com/", "triggerDeliveryByAliasResponse");
    private final static QName _SendImmediateByCampaignIdToSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignIdToSubscriber");
    private final static QName _IsSubscriberSourceLocked_QNAME = new QName("http://ws.api.contactlab.com/", "isSubscriberSourceLocked");
    private final static QName _GetSubscriberSourceFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getSubscriberSourceFilterResponse");
    private final static QName _GetCampaignDeliveryStatus_QNAME = new QName("http://ws.api.contactlab.com/", "getCampaignDeliveryStatus");
    private final static QName _RemoveSubscriber_QNAME = new QName("http://ws.api.contactlab.com/", "removeSubscriber");
    private final static QName _TriggerDeliveryByIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "triggerDeliveryByIdResponse");
    private final static QName _CreateSplitTestResponse_QNAME = new QName("http://ws.api.contactlab.com/", "createSplitTestResponse");
    private final static QName _IsSubscriberSourceLockedResponse_QNAME = new QName("http://ws.api.contactlab.com/", "isSubscriberSourceLockedResponse");
    private final static QName _SendImmediateMessageSIdCDataCAResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSIdCDataCAResponse");
    private final static QName _SendImmediateMessageSDataCDataCAResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSDataCDataCAResponse");
    private final static QName _FindCampaignsBySubscriberSourceFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsBySubscriberSourceFilterResponse");
    private final static QName _SendImmediateMessageSDataCData_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSDataCData");
    private final static QName _FindSubscriberSourcesResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findSubscriberSourcesResponse");
    private final static QName _UnmarshalPushTemplateEnvelopeResponse_QNAME = new QName("http://ws.api.contactlab.com/", "unmarshalPushTemplateEnvelopeResponse");
    private final static QName _CreateSplitTest_QNAME = new QName("http://ws.api.contactlab.com/", "createSplitTest");
    private final static QName _FindCampaignsByStatus_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByStatus");
    private final static QName _FindMessagesInfoByCampaignNameResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesInfoByCampaignNameResponse");
    private final static QName _SendImmediateMessageSDataCIdCAResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSDataCIdCAResponse");
    private final static QName _FindSubscribers_QNAME = new QName("http://ws.api.contactlab.com/", "findSubscribers");
    private final static QName _ReuseSubscriberSourceFilter_QNAME = new QName("http://ws.api.contactlab.com/", "reuseSubscriberSourceFilter");
    private final static QName _CreateCampaignResponse_QNAME = new QName("http://ws.api.contactlab.com/", "createCampaignResponse");
    private final static QName _FindSubscribersIncludedInFilter_QNAME = new QName("http://ws.api.contactlab.com/", "findSubscribersIncludedInFilter");
    private final static QName _FindMessageInfoByCampaignIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findMessageInfoByCampaignIdResponse");
    private final static QName _SendImmediateByCampaignIdToSubscriberIdResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateByCampaignIdToSubscriberIdResponse");
    private final static QName _GetArchivedSubscriberSourceFilterResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getArchivedSubscriberSourceFilterResponse");
    private final static QName _SendImmediateMessageSdataCAlResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSdataCAlResponse");
    private final static QName _SendImmediateMessageSdataCAlCA_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSdataCAlCA");
    private final static QName _GetXMLDeliveryTransitions_QNAME = new QName("http://ws.api.contactlab.com/", "getXMLDeliveryTransitions");
    private final static QName _SendImmediateMessageSidCAlCA_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSidCAlCA");
    private final static QName _SendImmediateMessageSDataCDataResponse_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSDataCDataResponse");
    private final static QName _GetAvailableCommunicationCategoriesResponse_QNAME = new QName("http://ws.api.contactlab.com/", "getAvailableCommunicationCategoriesResponse");
    private final static QName _FindCampaignsByModelResponse_QNAME = new QName("http://ws.api.contactlab.com/", "findCampaignsByModelResponse");
    private final static QName _FindMessagesInfoByChannel_QNAME = new QName("http://ws.api.contactlab.com/", "findMessagesInfoByChannel");
    private final static QName _SendImmediateMessageSDataCIdCA_QNAME = new QName("http://ws.api.contactlab.com/", "sendImmediateMessageSDataCIdCA");
    private final static QName _ModifySubscriberSubscriptionStatusByMailqId_QNAME = new QName("http://ws.api.contactlab.com/", "modifySubscriberSubscriptionStatusByMailqId");
    private final static QName _FindNotesByCampaign_QNAME = new QName("http://ws.api.contactlab.com/", "findNotesByCampaign");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.contactlab.api.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTrackedLinksResponse }
     * 
     */
    public GetTrackedLinksResponse createGetTrackedLinksResponse() {
        return new GetTrackedLinksResponse();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignToSubscriber }
     * 
     */
    public SendImmediateByCampaignToSubscriber createSendImmediateByCampaignToSubscriber() {
        return new SendImmediateByCampaignToSubscriber();
    }

    /**
     * Create an instance of {@link CancelCampaign }
     * 
     */
    public CancelCampaign createCancelCampaign() {
        return new CancelCampaign();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignToSubscriberIdResponse }
     * 
     */
    public SendImmediateByCampaignToSubscriberIdResponse createSendImmediateByCampaignToSubscriberIdResponse() {
        return new SendImmediateByCampaignToSubscriberIdResponse();
    }

    /**
     * Create an instance of {@link AddCampaignNote }
     * 
     */
    public AddCampaignNote createAddCampaignNote() {
        return new AddCampaignNote();
    }

    /**
     * Create an instance of {@link SendSplitTestResponse }
     * 
     */
    public SendSplitTestResponse createSendSplitTestResponse() {
        return new SendSplitTestResponse();
    }

    /**
     * Create an instance of {@link AddSubscriberResponse }
     * 
     */
    public AddSubscriberResponse createAddSubscriberResponse() {
        return new AddSubscriberResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCAlCAResponse }
     * 
     */
    public SendImmediateMessageSidCAlCAResponse createSendImmediateMessageSidCAlCAResponse() {
        return new SendImmediateMessageSidCAlCAResponse();
    }

    /**
     * Create an instance of {@link GetRequestStatus }
     * 
     */
    public GetRequestStatus createGetRequestStatus() {
        return new GetRequestStatus();
    }

    /**
     * Create an instance of {@link GetSubscriber }
     * 
     */
    public GetSubscriber createGetSubscriber() {
        return new GetSubscriber();
    }

    /**
     * Create an instance of {@link GetMessageModelByIdResponse }
     * 
     */
    public GetMessageModelByIdResponse createGetMessageModelByIdResponse() {
        return new GetMessageModelByIdResponse();
    }

    /**
     * Create an instance of {@link UnmarshalPushTemplateEnvelopeResponse }
     * 
     */
    public UnmarshalPushTemplateEnvelopeResponse createUnmarshalPushTemplateEnvelopeResponse() {
        return new UnmarshalPushTemplateEnvelopeResponse();
    }

    /**
     * Create an instance of {@link com.contactlab.api.ws.PushTemplate.CustomData.Entry }
     * 
     */
    public com.contactlab.api.ws.PushTemplate.CustomData.Entry createPushTemplateCustomDataEntry() {
        return new com.contactlab.api.ws.PushTemplate.CustomData.Entry();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignIdToSubscriber }
     * 
     */
    public SendImmediateByCampaignIdToSubscriber createSendImmediateByCampaignIdToSubscriber() {
        return new SendImmediateByCampaignIdToSubscriber();
    }

    /**
     * Create an instance of {@link GetSubscriberDataExchangeStatusResponse }
     * 
     */
    public GetSubscriberDataExchangeStatusResponse createGetSubscriberDataExchangeStatusResponse() {
        return new GetSubscriberDataExchangeStatusResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSDataCDataCAResponse }
     * 
     */
    public SendImmediateMessageSDataCDataCAResponse createSendImmediateMessageSDataCDataCAResponse() {
        return new SendImmediateMessageSDataCDataCAResponse();
    }

    /**
     * Create an instance of {@link FindCampaignsByNameOrSubject }
     * 
     */
    public FindCampaignsByNameOrSubject createFindCampaignsByNameOrSubject() {
        return new FindCampaignsByNameOrSubject();
    }

    /**
     * Create an instance of {@link SendCampaign }
     * 
     */
    public SendCampaign createSendCampaign() {
        return new SendCampaign();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSdataCAlCAResponse }
     * 
     */
    public SendImmediateMessageSdataCAlCAResponse createSendImmediateMessageSdataCAlCAResponse() {
        return new SendImmediateMessageSdataCAlCAResponse();
    }

    /**
     * Create an instance of {@link FindSubscribers }
     * 
     */
    public FindSubscribers createFindSubscribers() {
        return new FindSubscribers();
    }

    /**
     * Create an instance of {@link GetSubscriberSourceResponse }
     * 
     */
    public GetSubscriberSourceResponse createGetSubscriberSourceResponse() {
        return new GetSubscriberSourceResponse();
    }

    /**
     * Create an instance of {@link FindCampaignsSentBetweenResponse }
     * 
     */
    public FindCampaignsSentBetweenResponse createFindCampaignsSentBetweenResponse() {
        return new FindCampaignsSentBetweenResponse();
    }

    /**
     * Create an instance of {@link KeepaliveTokenResponse }
     * 
     */
    public KeepaliveTokenResponse createKeepaliveTokenResponse() {
        return new KeepaliveTokenResponse();
    }

    /**
     * Create an instance of {@link GcMsPushTemplate }
     * 
     */
    public GcMsPushTemplate createGcMsPushTemplate() {
        return new GcMsPushTemplate();
    }

    /**
     * Create an instance of {@link CreateCampaign }
     * 
     */
    public CreateCampaign createCreateCampaign() {
        return new CreateCampaign();
    }

    /**
     * Create an instance of {@link FindPeriodicCampaignsResponse }
     * 
     */
    public FindPeriodicCampaignsResponse createFindPeriodicCampaignsResponse() {
        return new FindPeriodicCampaignsResponse();
    }

    /**
     * Create an instance of {@link GetAvailableCommunicationCategories }
     * 
     */
    public GetAvailableCommunicationCategories createGetAvailableCommunicationCategories() {
        return new GetAvailableCommunicationCategories();
    }

    /**
     * Create an instance of {@link CountSubscribersIncludedInFilterResponse }
     * 
     */
    public CountSubscribersIncludedInFilterResponse createCountSubscribersIncludedInFilterResponse() {
        return new CountSubscribersIncludedInFilterResponse();
    }

    /**
     * Create an instance of {@link ModifySubscriberSubscriptionStatusByMailqId }
     * 
     */
    public ModifySubscriberSubscriptionStatusByMailqId createModifySubscriberSubscriptionStatusByMailqId() {
        return new ModifySubscriberSubscriptionStatusByMailqId();
    }

    /**
     * Create an instance of {@link FindMessagesInfoByChannel }
     * 
     */
    public FindMessagesInfoByChannel createFindMessagesInfoByChannel() {
        return new FindMessagesInfoByChannel();
    }

    /**
     * Create an instance of {@link FindMessagesInfoByCampaignNameResponse }
     * 
     */
    public FindMessagesInfoByCampaignNameResponse createFindMessagesInfoByCampaignNameResponse() {
        return new FindMessagesInfoByCampaignNameResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCidCA }
     * 
     */
    public SendImmediateMessageSidCidCA createSendImmediateMessageSidCidCA() {
        return new SendImmediateMessageSidCidCA();
    }

    /**
     * Create an instance of {@link XmlDeliveryInfo }
     * 
     */
    public XmlDeliveryInfo createXmlDeliveryInfo() {
        return new XmlDeliveryInfo();
    }

    /**
     * Create an instance of {@link GetArchivedSubscriberSourceFilterResponse }
     * 
     */
    public GetArchivedSubscriberSourceFilterResponse createGetArchivedSubscriberSourceFilterResponse() {
        return new GetArchivedSubscriberSourceFilterResponse();
    }

    /**
     * Create an instance of {@link FindMessages }
     * 
     */
    public FindMessages createFindMessages() {
        return new FindMessages();
    }

    /**
     * Create an instance of {@link CountSubscribersResponse }
     * 
     */
    public CountSubscribersResponse createCountSubscribersResponse() {
        return new CountSubscribersResponse();
    }

    /**
     * Create an instance of {@link SendSplitTestWinnerResponse }
     * 
     */
    public SendSplitTestWinnerResponse createSendSplitTestWinnerResponse() {
        return new SendSplitTestWinnerResponse();
    }

    /**
     * Create an instance of {@link SetCampaignRecurrency }
     * 
     */
    public SetCampaignRecurrency createSetCampaignRecurrency() {
        return new SetCampaignRecurrency();
    }

    /**
     * Create an instance of {@link FindTriggerableCampaigns }
     * 
     */
    public FindTriggerableCampaigns createFindTriggerableCampaigns() {
        return new FindTriggerableCampaigns();
    }

    /**
     * Create an instance of {@link FindMessageModelsResponse }
     * 
     */
    public FindMessageModelsResponse createFindMessageModelsResponse() {
        return new FindMessageModelsResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSDataCIdCAResponse }
     * 
     */
    public SendImmediateMessageSDataCIdCAResponse createSendImmediateMessageSDataCIdCAResponse() {
        return new SendImmediateMessageSDataCIdCAResponse();
    }

    /**
     * Create an instance of {@link PublishOnWeb }
     * 
     */
    public PublishOnWeb createPublishOnWeb() {
        return new PublishOnWeb();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSDataCData }
     * 
     */
    public SendImmediateMessageSDataCData createSendImmediateMessageSDataCData() {
        return new SendImmediateMessageSDataCData();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSdataCAlCA }
     * 
     */
    public SendImmediateMessageSdataCAlCA createSendImmediateMessageSdataCAlCA() {
        return new SendImmediateMessageSdataCAlCA();
    }

    /**
     * Create an instance of {@link FindMessageInfoByCampaignIdResponse }
     * 
     */
    public FindMessageInfoByCampaignIdResponse createFindMessageInfoByCampaignIdResponse() {
        return new FindMessageInfoByCampaignIdResponse();
    }

    /**
     * Create an instance of {@link FindMessageInfoByCampaignId }
     * 
     */
    public FindMessageInfoByCampaignId createFindMessageInfoByCampaignId() {
        return new FindMessageInfoByCampaignId();
    }

    /**
     * Create an instance of {@link GetCampaignResponse }
     * 
     */
    public GetCampaignResponse createGetCampaignResponse() {
        return new GetCampaignResponse();
    }

    /**
     * Create an instance of {@link CreateSplitTestResponse }
     * 
     */
    public CreateSplitTestResponse createCreateSplitTestResponse() {
        return new CreateSplitTestResponse();
    }

    /**
     * Create an instance of {@link GetCryptoKey }
     * 
     */
    public GetCryptoKey createGetCryptoKey() {
        return new GetCryptoKey();
    }

    /**
     * Create an instance of {@link SendSplitTestWinner }
     * 
     */
    public SendSplitTestWinner createSendSplitTestWinner() {
        return new SendSplitTestWinner();
    }

    /**
     * Create an instance of {@link FindMessageModels }
     * 
     */
    public FindMessageModels createFindMessageModels() {
        return new FindMessageModels();
    }

    /**
     * Create an instance of {@link TrackableLink }
     * 
     */
    public TrackableLink createTrackableLink() {
        return new TrackableLink();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCAl }
     * 
     */
    public SendImmediateMessageSidCAl createSendImmediateMessageSidCAl() {
        return new SendImmediateMessageSidCAl();
    }

    /**
     * Create an instance of {@link RequestCampaignFeedbackReportResponse }
     * 
     */
    public RequestCampaignFeedbackReportResponse createRequestCampaignFeedbackReportResponse() {
        return new RequestCampaignFeedbackReportResponse();
    }

    /**
     * Create an instance of {@link GetTrackedLinks }
     * 
     */
    public GetTrackedLinks createGetTrackedLinks() {
        return new GetTrackedLinks();
    }

    /**
     * Create an instance of {@link GetCampaignFeedback }
     * 
     */
    public GetCampaignFeedback createGetCampaignFeedback() {
        return new GetCampaignFeedback();
    }

    /**
     * Create an instance of {@link FindCampaignsByModelResponse }
     * 
     */
    public FindCampaignsByModelResponse createFindCampaignsByModelResponse() {
        return new FindCampaignsByModelResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSIdCDataResponse }
     * 
     */
    public SendImmediateMessageSIdCDataResponse createSendImmediateMessageSIdCDataResponse() {
        return new SendImmediateMessageSIdCDataResponse();
    }

    /**
     * Create an instance of {@link AddSubscriber }
     * 
     */
    public AddSubscriber createAddSubscriber() {
        return new AddSubscriber();
    }

    /**
     * Create an instance of {@link GetXMLDeliveryTransitions }
     * 
     */
    public GetXMLDeliveryTransitions createGetXMLDeliveryTransitions() {
        return new GetXMLDeliveryTransitions();
    }

    /**
     * Create an instance of {@link UploadMediaContent }
     * 
     */
    public UploadMediaContent createUploadMediaContent() {
        return new UploadMediaContent();
    }

    /**
     * Create an instance of {@link MobileApplication }
     * 
     */
    public MobileApplication createMobileApplication() {
        return new MobileApplication();
    }

    /**
     * Create an instance of {@link GcMsPushTemplate.Variants }
     * 
     */
    public GcMsPushTemplate.Variants createGcMsPushTemplateVariants() {
        return new GcMsPushTemplate.Variants();
    }

    /**
     * Create an instance of {@link GetCampaignDeliveryStatus }
     * 
     */
    public GetCampaignDeliveryStatus createGetCampaignDeliveryStatus() {
        return new GetCampaignDeliveryStatus();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCid }
     * 
     */
    public SendImmediateMessageSidCid createSendImmediateMessageSidCid() {
        return new SendImmediateMessageSidCid();
    }

    /**
     * Create an instance of {@link GetRequestStatusResponse }
     * 
     */
    public GetRequestStatusResponse createGetRequestStatusResponse() {
        return new GetRequestStatusResponse();
    }

    /**
     * Create an instance of {@link GetXMLDeliveryTransitionsResponse }
     * 
     */
    public GetXMLDeliveryTransitionsResponse createGetXMLDeliveryTransitionsResponse() {
        return new GetXMLDeliveryTransitionsResponse();
    }

    /**
     * Create an instance of {@link com.contactlab.api.ws.PushTemplate.CustomData }
     * 
     */
    public com.contactlab.api.ws.PushTemplate.CustomData createPushTemplateCustomData() {
        return new com.contactlab.api.ws.PushTemplate.CustomData();
    }

    /**
     * Create an instance of {@link ModifySubscriberSubscriptionStatus }
     * 
     */
    public ModifySubscriberSubscriptionStatus createModifySubscriberSubscriptionStatus() {
        return new ModifySubscriberSubscriptionStatus();
    }

    /**
     * Create an instance of {@link RemoveSubscriberResponse }
     * 
     */
    public RemoveSubscriberResponse createRemoveSubscriberResponse() {
        return new RemoveSubscriberResponse();
    }

    /**
     * Create an instance of {@link GetMobileApplicationByCodeResponse }
     * 
     */
    public GetMobileApplicationByCodeResponse createGetMobileApplicationByCodeResponse() {
        return new GetMobileApplicationByCodeResponse();
    }

    /**
     * Create an instance of {@link FindCampaignsResponse }
     * 
     */
    public FindCampaignsResponse createFindCampaignsResponse() {
        return new FindCampaignsResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSdataCAlResponse }
     * 
     */
    public SendImmediateMessageSdataCAlResponse createSendImmediateMessageSdataCAlResponse() {
        return new SendImmediateMessageSdataCAlResponse();
    }

    /**
     * Create an instance of {@link ReuseSubscriberSourceFilter }
     * 
     */
    public ReuseSubscriberSourceFilter createReuseSubscriberSourceFilter() {
        return new ReuseSubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCAlResponse }
     * 
     */
    public SendImmediateMessageSidCAlResponse createSendImmediateMessageSidCAlResponse() {
        return new SendImmediateMessageSidCAlResponse();
    }

    /**
     * Create an instance of {@link FindMessagesInfo }
     * 
     */
    public FindMessagesInfo createFindMessagesInfo() {
        return new FindMessagesInfo();
    }

    /**
     * Create an instance of {@link FindTriggerableCampaignsResponse }
     * 
     */
    public FindTriggerableCampaignsResponse createFindTriggerableCampaignsResponse() {
        return new FindTriggerableCampaignsResponse();
    }

    /**
     * Create an instance of {@link FindCampaigns }
     * 
     */
    public FindCampaigns createFindCampaigns() {
        return new FindCampaigns();
    }

    /**
     * Create an instance of {@link FindMessagesByChannel }
     * 
     */
    public FindMessagesByChannel createFindMessagesByChannel() {
        return new FindMessagesByChannel();
    }

    /**
     * Create an instance of {@link AddSubscriberSourceFilterResponse }
     * 
     */
    public AddSubscriberSourceFilterResponse createAddSubscriberSourceFilterResponse() {
        return new AddSubscriberSourceFilterResponse();
    }

    /**
     * Create an instance of {@link CloneAndSendCampaign }
     * 
     */
    public CloneAndSendCampaign createCloneAndSendCampaign() {
        return new CloneAndSendCampaign();
    }

    /**
     * Create an instance of {@link CountSubscribersIncludedInFilter }
     * 
     */
    public CountSubscribersIncludedInFilter createCountSubscribersIncludedInFilter() {
        return new CountSubscribersIncludedInFilter();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSIdCDataCA }
     * 
     */
    public SendImmediateMessageSIdCDataCA createSendImmediateMessageSIdCDataCA() {
        return new SendImmediateMessageSIdCDataCA();
    }

    /**
     * Create an instance of {@link FindArchivedFiltersBySubscriberSourceResponse }
     * 
     */
    public FindArchivedFiltersBySubscriberSourceResponse createFindArchivedFiltersBySubscriberSourceResponse() {
        return new FindArchivedFiltersBySubscriberSourceResponse();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignAliasToSubscriberIdResponse }
     * 
     */
    public SendImmediateByCampaignAliasToSubscriberIdResponse createSendImmediateByCampaignAliasToSubscriberIdResponse() {
        return new SendImmediateByCampaignAliasToSubscriberIdResponse();
    }

    /**
     * Create an instance of {@link AddSubscriberSource }
     * 
     */
    public AddSubscriberSource createAddSubscriberSource() {
        return new AddSubscriberSource();
    }

    /**
     * Create an instance of {@link GetSubscriberSourceFilter }
     * 
     */
    public GetSubscriberSourceFilter createGetSubscriberSourceFilter() {
        return new GetSubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link PushTemplateEnvelope }
     * 
     */
    public PushTemplateEnvelope createPushTemplateEnvelope() {
        return new PushTemplateEnvelope();
    }

    /**
     * Create an instance of {@link UploadMediaContentResponse }
     * 
     */
    public UploadMediaContentResponse createUploadMediaContentResponse() {
        return new UploadMediaContentResponse();
    }

    /**
     * Create an instance of {@link AddCampaignNoteResponse }
     * 
     */
    public AddCampaignNoteResponse createAddCampaignNoteResponse() {
        return new AddCampaignNoteResponse();
    }

    /**
     * Create an instance of {@link SendSplitTest }
     * 
     */
    public SendSplitTest createSendSplitTest() {
        return new SendSplitTest();
    }

    /**
     * Create an instance of {@link FindSubscriberSourcesResponse }
     * 
     */
    public FindSubscriberSourcesResponse createFindSubscriberSourcesResponse() {
        return new FindSubscriberSourcesResponse();
    }

    /**
     * Create an instance of {@link CreateMessageModelResponse }
     * 
     */
    public CreateMessageModelResponse createCreateMessageModelResponse() {
        return new CreateMessageModelResponse();
    }

    /**
     * Create an instance of {@link FindNotesByCampaignResponse }
     * 
     */
    public FindNotesByCampaignResponse createFindNotesByCampaignResponse() {
        return new FindNotesByCampaignResponse();
    }

    /**
     * Create an instance of {@link GetAvailableCommunicationCategoriesResponse }
     * 
     */
    public GetAvailableCommunicationCategoriesResponse createGetAvailableCommunicationCategoriesResponse() {
        return new GetAvailableCommunicationCategoriesResponse();
    }

    /**
     * Create an instance of {@link FindSubscriberSources }
     * 
     */
    public FindSubscriberSources createFindSubscriberSources() {
        return new FindSubscriberSources();
    }

    /**
     * Create an instance of {@link FindCampaignsBySubscriberSourceFilter }
     * 
     */
    public FindCampaignsBySubscriberSourceFilter createFindCampaignsBySubscriberSourceFilter() {
        return new FindCampaignsBySubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link FindMessageByCampaignId }
     * 
     */
    public FindMessageByCampaignId createFindMessageByCampaignId() {
        return new FindMessageByCampaignId();
    }

    /**
     * Create an instance of {@link ArchiveSubscriberSourceFilter }
     * 
     */
    public ArchiveSubscriberSourceFilter createArchiveSubscriberSourceFilter() {
        return new ArchiveSubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link CloneAndSendCampaignResponse }
     * 
     */
    public CloneAndSendCampaignResponse createCloneAndSendCampaignResponse() {
        return new CloneAndSendCampaignResponse();
    }

    /**
     * Create an instance of {@link FindCampaignsSentBetween }
     * 
     */
    public FindCampaignsSentBetween createFindCampaignsSentBetween() {
        return new FindCampaignsSentBetween();
    }

    /**
     * Create an instance of {@link AddSubscribersResponse }
     * 
     */
    public AddSubscribersResponse createAddSubscribersResponse() {
        return new AddSubscribersResponse();
    }

    /**
     * Create an instance of {@link InvalidateToken }
     * 
     */
    public InvalidateToken createInvalidateToken() {
        return new InvalidateToken();
    }

    /**
     * Create an instance of {@link FindFiltersBySubscriberSourceResponse }
     * 
     */
    public FindFiltersBySubscriberSourceResponse createFindFiltersBySubscriberSourceResponse() {
        return new FindFiltersBySubscriberSourceResponse();
    }

    /**
     * Create an instance of {@link FindSubscribersIncludedInFilterResponse }
     * 
     */
    public FindSubscribersIncludedInFilterResponse createFindSubscribersIncludedInFilterResponse() {
        return new FindSubscribersIncludedInFilterResponse();
    }

    /**
     * Create an instance of {@link XmlDeliveryTransitionInfo }
     * 
     */
    public XmlDeliveryTransitionInfo createXmlDeliveryTransitionInfo() {
        return new XmlDeliveryTransitionInfo();
    }

    /**
     * Create an instance of {@link FindMessagesByCampaignName }
     * 
     */
    public FindMessagesByCampaignName createFindMessagesByCampaignName() {
        return new FindMessagesByCampaignName();
    }

    /**
     * Create an instance of {@link AddSubscribers }
     * 
     */
    public AddSubscribers createAddSubscribers() {
        return new AddSubscribers();
    }

    /**
     * Create an instance of {@link PublishOnWebResponse }
     * 
     */
    public PublishOnWebResponse createPublishOnWebResponse() {
        return new PublishOnWebResponse();
    }

    /**
     * Create an instance of {@link FindNotesByCampaign }
     * 
     */
    public FindNotesByCampaign createFindNotesByCampaign() {
        return new FindNotesByCampaign();
    }

    /**
     * Create an instance of {@link AddAttachment }
     * 
     */
    public AddAttachment createAddAttachment() {
        return new AddAttachment();
    }

    /**
     * Create an instance of {@link StartSubscriberDataExchange }
     * 
     */
    public StartSubscriberDataExchange createStartSubscriberDataExchange() {
        return new StartSubscriberDataExchange();
    }

    /**
     * Create an instance of {@link CreateSplitTest }
     * 
     */
    public CreateSplitTest createCreateSplitTest() {
        return new CreateSplitTest();
    }

    /**
     * Create an instance of {@link CreateCampaignResponse }
     * 
     */
    public CreateCampaignResponse createCreateCampaignResponse() {
        return new CreateCampaignResponse();
    }

    /**
     * Create an instance of {@link AddSubscriberSourceFilter }
     * 
     */
    public AddSubscriberSourceFilter createAddSubscriberSourceFilter() {
        return new AddSubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSIdCData }
     * 
     */
    public SendImmediateMessageSIdCData createSendImmediateMessageSIdCData() {
        return new SendImmediateMessageSIdCData();
    }

    /**
     * Create an instance of {@link GetAttachmentByCampaignIdResponse }
     * 
     */
    public GetAttachmentByCampaignIdResponse createGetAttachmentByCampaignIdResponse() {
        return new GetAttachmentByCampaignIdResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCidCAResponse }
     * 
     */
    public SendImmediateMessageSidCidCAResponse createSendImmediateMessageSidCidCAResponse() {
        return new SendImmediateMessageSidCidCAResponse();
    }

    /**
     * Create an instance of {@link InvalidateTokenResponse }
     * 
     */
    public InvalidateTokenResponse createInvalidateTokenResponse() {
        return new InvalidateTokenResponse();
    }

    /**
     * Create an instance of {@link FindMessageByCampaignIdResponse }
     * 
     */
    public FindMessageByCampaignIdResponse createFindMessageByCampaignIdResponse() {
        return new FindMessageByCampaignIdResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSDataCIdCA }
     * 
     */
    public SendImmediateMessageSDataCIdCA createSendImmediateMessageSDataCIdCA() {
        return new SendImmediateMessageSDataCIdCA();
    }

    /**
     * Create an instance of {@link FindMessagesResponse }
     * 
     */
    public FindMessagesResponse createFindMessagesResponse() {
        return new FindMessagesResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscriber }
     * 
     */
    public UpdateSubscriber createUpdateSubscriber() {
        return new UpdateSubscriber();
    }

    /**
     * Create an instance of {@link GetXMLDeliveriesResponse }
     * 
     */
    public GetXMLDeliveriesResponse createGetXMLDeliveriesResponse() {
        return new GetXMLDeliveriesResponse();
    }

    /**
     * Create an instance of {@link TriggerDeliveryByAliasResponse }
     * 
     */
    public TriggerDeliveryByAliasResponse createTriggerDeliveryByAliasResponse() {
        return new TriggerDeliveryByAliasResponse();
    }

    /**
     * Create an instance of {@link GetAttachmentByCampaignId }
     * 
     */
    public GetAttachmentByCampaignId createGetAttachmentByCampaignId() {
        return new GetAttachmentByCampaignId();
    }

    /**
     * Create an instance of {@link FindMessagesInfoResponse }
     * 
     */
    public FindMessagesInfoResponse createFindMessagesInfoResponse() {
        return new FindMessagesInfoResponse();
    }

    /**
     * Create an instance of {@link CreateMessageModel }
     * 
     */
    public CreateMessageModel createCreateMessageModel() {
        return new CreateMessageModel();
    }

    /**
     * Create an instance of {@link GetSubscriberDataExchangeStatus }
     * 
     */
    public GetSubscriberDataExchangeStatus createGetSubscriberDataExchangeStatus() {
        return new GetSubscriberDataExchangeStatus();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignAliasToSubscriberId }
     * 
     */
    public SendImmediateByCampaignAliasToSubscriberId createSendImmediateByCampaignAliasToSubscriberId() {
        return new SendImmediateByCampaignAliasToSubscriberId();
    }

    /**
     * Create an instance of {@link FindMessagesInfoByChannelResponse }
     * 
     */
    public FindMessagesInfoByChannelResponse createFindMessagesInfoByChannelResponse() {
        return new FindMessagesInfoByChannelResponse();
    }

    /**
     * Create an instance of {@link IsSubscriberSourceLocked }
     * 
     */
    public IsSubscriberSourceLocked createIsSubscriberSourceLocked() {
        return new IsSubscriberSourceLocked();
    }

    /**
     * Create an instance of {@link FindCampaignsByNameOrSubjectResponse }
     * 
     */
    public FindCampaignsByNameOrSubjectResponse createFindCampaignsByNameOrSubjectResponse() {
        return new FindCampaignsByNameOrSubjectResponse();
    }

    /**
     * Create an instance of {@link FindFiltersBySubscriberSource }
     * 
     */
    public FindFiltersBySubscriberSource createFindFiltersBySubscriberSource() {
        return new FindFiltersBySubscriberSource();
    }

    /**
     * Create an instance of {@link GcMsPushTemplate.Variants.Entry }
     * 
     */
    public GcMsPushTemplate.Variants.Entry createGcMsPushTemplateVariantsEntry() {
        return new GcMsPushTemplate.Variants.Entry();
    }

    /**
     * Create an instance of {@link SetCampaignRecurrencyResponse }
     * 
     */
    public SetCampaignRecurrencyResponse createSetCampaignRecurrencyResponse() {
        return new SetCampaignRecurrencyResponse();
    }

    /**
     * Create an instance of {@link GetMobileApplicationByCode }
     * 
     */
    public GetMobileApplicationByCode createGetMobileApplicationByCode() {
        return new GetMobileApplicationByCode();
    }

    /**
     * Create an instance of {@link FindMessagesByChannelResponse }
     * 
     */
    public FindMessagesByChannelResponse createFindMessagesByChannelResponse() {
        return new FindMessagesByChannelResponse();
    }

    /**
     * Create an instance of {@link GetEmptyPushTemplate }
     * 
     */
    public GetEmptyPushTemplate createGetEmptyPushTemplate() {
        return new GetEmptyPushTemplate();
    }

    /**
     * Create an instance of {@link KeepaliveToken }
     * 
     */
    public KeepaliveToken createKeepaliveToken() {
        return new KeepaliveToken();
    }

    /**
     * Create an instance of {@link FindArchivedFiltersBySubscriberSource }
     * 
     */
    public FindArchivedFiltersBySubscriberSource createFindArchivedFiltersBySubscriberSource() {
        return new FindArchivedFiltersBySubscriberSource();
    }

    /**
     * Create an instance of {@link FindCampaignsByModel }
     * 
     */
    public FindCampaignsByModel createFindCampaignsByModel() {
        return new FindCampaignsByModel();
    }

    /**
     * Create an instance of {@link FindCampaignsByStatusResponse }
     * 
     */
    public FindCampaignsByStatusResponse createFindCampaignsByStatusResponse() {
        return new FindCampaignsByStatusResponse();
    }

    /**
     * Create an instance of {@link TriggerDeliveryByIdResponse }
     * 
     */
    public TriggerDeliveryByIdResponse createTriggerDeliveryByIdResponse() {
        return new TriggerDeliveryByIdResponse();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignIdToSubscriberId }
     * 
     */
    public SendImmediateByCampaignIdToSubscriberId createSendImmediateByCampaignIdToSubscriberId() {
        return new SendImmediateByCampaignIdToSubscriberId();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignAliasToSubscriberResponse }
     * 
     */
    public SendImmediateByCampaignAliasToSubscriberResponse createSendImmediateByCampaignAliasToSubscriberResponse() {
        return new SendImmediateByCampaignAliasToSubscriberResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCAlCA }
     * 
     */
    public SendImmediateMessageSidCAlCA createSendImmediateMessageSidCAlCA() {
        return new SendImmediateMessageSidCAlCA();
    }

    /**
     * Create an instance of {@link SendImmediateMessage }
     * 
     */
    public SendImmediateMessage createSendImmediateMessage() {
        return new SendImmediateMessage();
    }

    /**
     * Create an instance of {@link UnmarshalPushTemplateEnvelope }
     * 
     */
    public UnmarshalPushTemplateEnvelope createUnmarshalPushTemplateEnvelope() {
        return new UnmarshalPushTemplateEnvelope();
    }

    /**
     * Create an instance of {@link FindCampaignsByNote }
     * 
     */
    public FindCampaignsByNote createFindCampaignsByNote() {
        return new FindCampaignsByNote();
    }

    /**
     * Create an instance of {@link FindCampaignsByStatus }
     * 
     */
    public FindCampaignsByStatus createFindCampaignsByStatus() {
        return new FindCampaignsByStatus();
    }

    /**
     * Create an instance of {@link ArchiveSubscriberSourceFilterResponse }
     * 
     */
    public ArchiveSubscriberSourceFilterResponse createArchiveSubscriberSourceFilterResponse() {
        return new ArchiveSubscriberSourceFilterResponse();
    }

    /**
     * Create an instance of {@link TriggerDeliveryByAlias }
     * 
     */
    public TriggerDeliveryByAlias createTriggerDeliveryByAlias() {
        return new TriggerDeliveryByAlias();
    }

    /**
     * Create an instance of {@link FindMessageModelsBySubscriberSourceResponse }
     * 
     */
    public FindMessageModelsBySubscriberSourceResponse createFindMessageModelsBySubscriberSourceResponse() {
        return new FindMessageModelsBySubscriberSourceResponse();
    }

    /**
     * Create an instance of {@link GetSubscriberSourceFilterResponse }
     * 
     */
    public GetSubscriberSourceFilterResponse createGetSubscriberSourceFilterResponse() {
        return new GetSubscriberSourceFilterResponse();
    }

    /**
     * Create an instance of {@link GetSubscriberResponse }
     * 
     */
    public GetSubscriberResponse createGetSubscriberResponse() {
        return new GetSubscriberResponse();
    }

    /**
     * Create an instance of {@link FindPeriodicCampaigns }
     * 
     */
    public FindPeriodicCampaigns createFindPeriodicCampaigns() {
        return new FindPeriodicCampaigns();
    }

    /**
     * Create an instance of {@link GetEmptyPushTemplateResponse }
     * 
     */
    public GetEmptyPushTemplateResponse createGetEmptyPushTemplateResponse() {
        return new GetEmptyPushTemplateResponse();
    }

    /**
     * Create an instance of {@link IsSubscriberSourceLockedResponse }
     * 
     */
    public IsSubscriberSourceLockedResponse createIsSubscriberSourceLockedResponse() {
        return new IsSubscriberSourceLockedResponse();
    }

    /**
     * Create an instance of {@link AddSubscriberSourceResponse }
     * 
     */
    public AddSubscriberSourceResponse createAddSubscriberSourceResponse() {
        return new AddSubscriberSourceResponse();
    }

    /**
     * Create an instance of {@link RequestCampaignFeedbackReport }
     * 
     */
    public RequestCampaignFeedbackReport createRequestCampaignFeedbackReport() {
        return new RequestCampaignFeedbackReport();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSdataCAl }
     * 
     */
    public SendImmediateMessageSdataCAl createSendImmediateMessageSdataCAl() {
        return new SendImmediateMessageSdataCAl();
    }

    /**
     * Create an instance of {@link GetCryptoKeyResponse }
     * 
     */
    public GetCryptoKeyResponse createGetCryptoKeyResponse() {
        return new GetCryptoKeyResponse();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignAliasToSubscriber }
     * 
     */
    public SendImmediateByCampaignAliasToSubscriber createSendImmediateByCampaignAliasToSubscriber() {
        return new SendImmediateByCampaignAliasToSubscriber();
    }

    /**
     * Create an instance of {@link ModifySubscriberSubscriptionStatusByMailqIdResponse }
     * 
     */
    public ModifySubscriberSubscriptionStatusByMailqIdResponse createModifySubscriberSubscriptionStatusByMailqIdResponse() {
        return new ModifySubscriberSubscriptionStatusByMailqIdResponse();
    }

    /**
     * Create an instance of {@link FindCampaignsByNoteResponse }
     * 
     */
    public FindCampaignsByNoteResponse createFindCampaignsByNoteResponse() {
        return new FindCampaignsByNoteResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscriberResponse }
     * 
     */
    public UpdateSubscriberResponse createUpdateSubscriberResponse() {
        return new UpdateSubscriberResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscriber }
     * 
     */
    public RemoveSubscriber createRemoveSubscriber() {
        return new RemoveSubscriber();
    }

    /**
     * Create an instance of {@link StartSubscriberDataExchangeResponse }
     * 
     */
    public StartSubscriberDataExchangeResponse createStartSubscriberDataExchangeResponse() {
        return new StartSubscriberDataExchangeResponse();
    }

    /**
     * Create an instance of {@link ModifySubscriberSubscriptionStatusResponse }
     * 
     */
    public ModifySubscriberSubscriptionStatusResponse createModifySubscriberSubscriptionStatusResponse() {
        return new ModifySubscriberSubscriptionStatusResponse();
    }

    /**
     * Create an instance of {@link FindSubscribersIncludedInFilter }
     * 
     */
    public FindSubscribersIncludedInFilter createFindSubscribersIncludedInFilter() {
        return new FindSubscribersIncludedInFilter();
    }

    /**
     * Create an instance of {@link TriggerDeliveryById }
     * 
     */
    public TriggerDeliveryById createTriggerDeliveryById() {
        return new TriggerDeliveryById();
    }

    /**
     * Create an instance of {@link CountSubscribers }
     * 
     */
    public CountSubscribers createCountSubscribers() {
        return new CountSubscribers();
    }

    /**
     * Create an instance of {@link FindMessagesInfoByCampaignName }
     * 
     */
    public FindMessagesInfoByCampaignName createFindMessagesInfoByCampaignName() {
        return new FindMessagesInfoByCampaignName();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignToSubscriberResponse }
     * 
     */
    public SendImmediateByCampaignToSubscriberResponse createSendImmediateByCampaignToSubscriberResponse() {
        return new SendImmediateByCampaignToSubscriberResponse();
    }

    /**
     * Create an instance of {@link FindSubscribersResponse }
     * 
     */
    public FindSubscribersResponse createFindSubscribersResponse() {
        return new FindSubscribersResponse();
    }

    /**
     * Create an instance of {@link FindMessagesByCampaignNameResponse }
     * 
     */
    public FindMessagesByCampaignNameResponse createFindMessagesByCampaignNameResponse() {
        return new FindMessagesByCampaignNameResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSidCidResponse }
     * 
     */
    public SendImmediateMessageSidCidResponse createSendImmediateMessageSidCidResponse() {
        return new SendImmediateMessageSidCidResponse();
    }

    /**
     * Create an instance of {@link GetSubscriberSource }
     * 
     */
    public GetSubscriberSource createGetSubscriberSource() {
        return new GetSubscriberSource();
    }

    /**
     * Create an instance of {@link CancelCampaignResponse }
     * 
     */
    public CancelCampaignResponse createCancelCampaignResponse() {
        return new CancelCampaignResponse();
    }

    /**
     * Create an instance of {@link BorrowTokenResponse }
     * 
     */
    public BorrowTokenResponse createBorrowTokenResponse() {
        return new BorrowTokenResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSIdCDataCAResponse }
     * 
     */
    public SendImmediateMessageSIdCDataCAResponse createSendImmediateMessageSIdCDataCAResponse() {
        return new SendImmediateMessageSIdCDataCAResponse();
    }

    /**
     * Create an instance of {@link GetCampaignDeliveryStatusResponse }
     * 
     */
    public GetCampaignDeliveryStatusResponse createGetCampaignDeliveryStatusResponse() {
        return new GetCampaignDeliveryStatusResponse();
    }

    /**
     * Create an instance of {@link GetCampaign }
     * 
     */
    public GetCampaign createGetCampaign() {
        return new GetCampaign();
    }

    /**
     * Create an instance of {@link AddAttachmentResponse }
     * 
     */
    public AddAttachmentResponse createAddAttachmentResponse() {
        return new AddAttachmentResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageResponse }
     * 
     */
    public SendImmediateMessageResponse createSendImmediateMessageResponse() {
        return new SendImmediateMessageResponse();
    }

    /**
     * Create an instance of {@link ReuseSubscriberSourceFilterResponse }
     * 
     */
    public ReuseSubscriberSourceFilterResponse createReuseSubscriberSourceFilterResponse() {
        return new ReuseSubscriberSourceFilterResponse();
    }

    /**
     * Create an instance of {@link GetMessageModelById }
     * 
     */
    public GetMessageModelById createGetMessageModelById() {
        return new GetMessageModelById();
    }

    /**
     * Create an instance of {@link GetArchivedSubscriberSourceFilter }
     * 
     */
    public GetArchivedSubscriberSourceFilter createGetArchivedSubscriberSourceFilter() {
        return new GetArchivedSubscriberSourceFilter();
    }

    /**
     * Create an instance of {@link BorrowToken }
     * 
     */
    public BorrowToken createBorrowToken() {
        return new BorrowToken();
    }

    /**
     * Create an instance of {@link SendCampaignResponse }
     * 
     */
    public SendCampaignResponse createSendCampaignResponse() {
        return new SendCampaignResponse();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSDataCDataCA }
     * 
     */
    public SendImmediateMessageSDataCDataCA createSendImmediateMessageSDataCDataCA() {
        return new SendImmediateMessageSDataCDataCA();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignIdToSubscriberResponse }
     * 
     */
    public SendImmediateByCampaignIdToSubscriberResponse createSendImmediateByCampaignIdToSubscriberResponse() {
        return new SendImmediateByCampaignIdToSubscriberResponse();
    }

    /**
     * Create an instance of {@link GetXMLDeliveries }
     * 
     */
    public GetXMLDeliveries createGetXMLDeliveries() {
        return new GetXMLDeliveries();
    }

    /**
     * Create an instance of {@link FindCampaignsBySubscriberSourceFilterResponse }
     * 
     */
    public FindCampaignsBySubscriberSourceFilterResponse createFindCampaignsBySubscriberSourceFilterResponse() {
        return new FindCampaignsBySubscriberSourceFilterResponse();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignIdToSubscriberIdResponse }
     * 
     */
    public SendImmediateByCampaignIdToSubscriberIdResponse createSendImmediateByCampaignIdToSubscriberIdResponse() {
        return new SendImmediateByCampaignIdToSubscriberIdResponse();
    }

    /**
     * Create an instance of {@link GetCampaignFeedbackResponse }
     * 
     */
    public GetCampaignFeedbackResponse createGetCampaignFeedbackResponse() {
        return new GetCampaignFeedbackResponse();
    }

    /**
     * Create an instance of {@link FindMessageModelsBySubscriberSource }
     * 
     */
    public FindMessageModelsBySubscriberSource createFindMessageModelsBySubscriberSource() {
        return new FindMessageModelsBySubscriberSource();
    }

    /**
     * Create an instance of {@link SendImmediateMessageSDataCDataResponse }
     * 
     */
    public SendImmediateMessageSDataCDataResponse createSendImmediateMessageSDataCDataResponse() {
        return new SendImmediateMessageSDataCDataResponse();
    }

    /**
     * Create an instance of {@link SendImmediateByCampaignToSubscriberId }
     * 
     */
    public SendImmediateByCampaignToSubscriberId createSendImmediateByCampaignToSubscriberId() {
        return new SendImmediateByCampaignToSubscriberId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesInfoResponse")
    public JAXBElement<FindMessagesInfoResponse> createFindMessagesInfoResponse(FindMessagesInfoResponse value) {
        return new JAXBElement<FindMessagesInfoResponse>(_FindMessagesInfoResponse_QNAME, FindMessagesInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "cancelCampaignResponse")
    public JAXBElement<CancelCampaignResponse> createCancelCampaignResponse(CancelCampaignResponse value) {
        return new JAXBElement<CancelCampaignResponse>(_CancelCampaignResponse_QNAME, CancelCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCampaignRecurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "setCampaignRecurrency")
    public JAXBElement<SetCampaignRecurrency> createSetCampaignRecurrency(SetCampaignRecurrency value) {
        return new JAXBElement<SetCampaignRecurrency>(_SetCampaignRecurrency_QNAME, SetCampaignRecurrency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFiltersBySubscriberSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findFiltersBySubscriberSource")
    public JAXBElement<FindFiltersBySubscriberSource> createFindFiltersBySubscriberSource(FindFiltersBySubscriberSource value) {
        return new JAXBElement<FindFiltersBySubscriberSource>(_FindFiltersBySubscriberSource_QNAME, FindFiltersBySubscriberSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCidCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCidCAResponse")
    public JAXBElement<SendImmediateMessageSidCidCAResponse> createSendImmediateMessageSidCidCAResponse(SendImmediateMessageSidCidCAResponse value) {
        return new JAXBElement<SendImmediateMessageSidCidCAResponse>(_SendImmediateMessageSidCidCAResponse_QNAME, SendImmediateMessageSidCidCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessageModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "createMessageModelResponse")
    public JAXBElement<CreateMessageModelResponse> createCreateMessageModelResponse(CreateMessageModelResponse value) {
        return new JAXBElement<CreateMessageModelResponse>(_CreateMessageModelResponse_QNAME, CreateMessageModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCidCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCidCA")
    public JAXBElement<SendImmediateMessageSidCidCA> createSendImmediateMessageSidCidCA(SendImmediateMessageSidCidCA value) {
        return new JAXBElement<SendImmediateMessageSidCidCA>(_SendImmediateMessageSidCidCA_QNAME, SendImmediateMessageSidCidCA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSubscribersIncludedInFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "countSubscribersIncludedInFilter")
    public JAXBElement<CountSubscribersIncludedInFilter> createCountSubscribersIncludedInFilter(CountSubscribersIncludedInFilter value) {
        return new JAXBElement<CountSubscribersIncludedInFilter>(_CountSubscribersIncludedInFilter_QNAME, CountSubscribersIncludedInFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignToSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignToSubscriberResponse")
    public JAXBElement<SendImmediateByCampaignToSubscriberResponse> createSendImmediateByCampaignToSubscriberResponse(SendImmediateByCampaignToSubscriberResponse value) {
        return new JAXBElement<SendImmediateByCampaignToSubscriberResponse>(_SendImmediateByCampaignToSubscriberResponse_QNAME, SendImmediateByCampaignToSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackedLinksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getTrackedLinksResponse")
    public JAXBElement<GetTrackedLinksResponse> createGetTrackedLinksResponse(GetTrackedLinksResponse value) {
        return new JAXBElement<GetTrackedLinksResponse>(_GetTrackedLinksResponse_QNAME, GetTrackedLinksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberDataExchangeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberDataExchangeStatus")
    public JAXBElement<GetSubscriberDataExchangeStatus> createGetSubscriberDataExchangeStatus(GetSubscriberDataExchangeStatus value) {
        return new JAXBElement<GetSubscriberDataExchangeStatus>(_GetSubscriberDataExchangeStatus_QNAME, GetSubscriberDataExchangeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSubscriberDataExchangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "startSubscriberDataExchangeResponse")
    public JAXBElement<StartSubscriberDataExchangeResponse> createStartSubscriberDataExchangeResponse(StartSubscriberDataExchangeResponse value) {
        return new JAXBElement<StartSubscriberDataExchangeResponse>(_StartSubscriberDataExchangeResponse_QNAME, StartSubscriberDataExchangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByModel")
    public JAXBElement<FindCampaignsByModel> createFindCampaignsByModel(FindCampaignsByModel value) {
        return new JAXBElement<FindCampaignsByModel>(_FindCampaignsByModel_QNAME, FindCampaignsByModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCAl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCAl")
    public JAXBElement<SendImmediateMessageSidCAl> createSendImmediateMessageSidCAl(SendImmediateMessageSidCAl value) {
        return new JAXBElement<SendImmediateMessageSidCAl>(_SendImmediateMessageSidCAl_QNAME, SendImmediateMessageSidCAl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeriodicCampaignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findPeriodicCampaignsResponse")
    public JAXBElement<FindPeriodicCampaignsResponse> createFindPeriodicCampaignsResponse(FindPeriodicCampaignsResponse value) {
        return new JAXBElement<FindPeriodicCampaignsResponse>(_FindPeriodicCampaignsResponse_QNAME, FindPeriodicCampaignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignToSubscriberId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignToSubscriberId")
    public JAXBElement<SendImmediateByCampaignToSubscriberId> createSendImmediateByCampaignToSubscriberId(SendImmediateByCampaignToSubscriberId value) {
        return new JAXBElement<SendImmediateByCampaignToSubscriberId>(_SendImmediateByCampaignToSubscriberId_QNAME, SendImmediateByCampaignToSubscriberId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberSource")
    public JAXBElement<GetSubscriberSource> createGetSubscriberSource(GetSubscriberSource value) {
        return new JAXBElement<GetSubscriberSource>(_GetSubscriberSource_QNAME, GetSubscriberSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignToSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignToSubscriber")
    public JAXBElement<SendImmediateByCampaignToSubscriber> createSendImmediateByCampaignToSubscriber(SendImmediateByCampaignToSubscriber value) {
        return new JAXBElement<SendImmediateByCampaignToSubscriber>(_SendImmediateByCampaignToSubscriber_QNAME, SendImmediateByCampaignToSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByNote")
    public JAXBElement<FindCampaignsByNote> createFindCampaignsByNote(FindCampaignsByNote value) {
        return new JAXBElement<FindCampaignsByNote>(_FindCampaignsByNote_QNAME, FindCampaignsByNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageByCampaignId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageByCampaignId")
    public JAXBElement<FindMessageByCampaignId> createFindMessageByCampaignId(FindMessageByCampaignId value) {
        return new JAXBElement<FindMessageByCampaignId>(_FindMessageByCampaignId_QNAME, FindMessageByCampaignId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSubscribersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findSubscribersResponse")
    public JAXBElement<FindSubscribersResponse> createFindSubscribersResponse(FindSubscribersResponse value) {
        return new JAXBElement<FindSubscribersResponse>(_FindSubscribersResponse_QNAME, FindSubscribersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByStatusResponse")
    public JAXBElement<FindCampaignsByStatusResponse> createFindCampaignsByStatusResponse(FindCampaignsByStatusResponse value) {
        return new JAXBElement<FindCampaignsByStatusResponse>(_FindCampaignsByStatusResponse_QNAME, FindCampaignsByStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByNoteResponse")
    public JAXBElement<FindCampaignsByNoteResponse> createFindCampaignsByNoteResponse(FindCampaignsByNoteResponse value) {
        return new JAXBElement<FindCampaignsByNoteResponse>(_FindCampaignsByNoteResponse_QNAME, FindCampaignsByNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidateToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "invalidateToken")
    public JAXBElement<InvalidateToken> createInvalidateToken(InvalidateToken value) {
        return new JAXBElement<InvalidateToken>(_InvalidateToken_QNAME, InvalidateToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAttachmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addAttachmentResponse")
    public JAXBElement<AddAttachmentResponse> createAddAttachmentResponse(AddAttachmentResponse value) {
        return new JAXBElement<AddAttachmentResponse>(_AddAttachmentResponse_QNAME, AddAttachmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignFeedback }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCampaignFeedback")
    public JAXBElement<GetCampaignFeedback> createGetCampaignFeedback(GetCampaignFeedback value) {
        return new JAXBElement<GetCampaignFeedback>(_GetCampaignFeedback_QNAME, GetCampaignFeedback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackedLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getTrackedLinks")
    public JAXBElement<GetTrackedLinks> createGetTrackedLinks(GetTrackedLinks value) {
        return new JAXBElement<GetTrackedLinks>(_GetTrackedLinks_QNAME, GetTrackedLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "cancelCampaign")
    public JAXBElement<CancelCampaign> createCancelCampaign(CancelCampaign value) {
        return new JAXBElement<CancelCampaign>(_CancelCampaign_QNAME, CancelCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestCampaignFeedbackReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "requestCampaignFeedbackReport")
    public JAXBElement<RequestCampaignFeedbackReport> createRequestCampaignFeedbackReport(RequestCampaignFeedbackReport value) {
        return new JAXBElement<RequestCampaignFeedbackReport>(_RequestCampaignFeedbackReport_QNAME, RequestCampaignFeedbackReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableCommunicationCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getAvailableCommunicationCategories")
    public JAXBElement<GetAvailableCommunicationCategories> createGetAvailableCommunicationCategories(GetAvailableCommunicationCategories value) {
        return new JAXBElement<GetAvailableCommunicationCategories>(_GetAvailableCommunicationCategories_QNAME, GetAvailableCommunicationCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMLDeliveries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getXMLDeliveries")
    public JAXBElement<GetXMLDeliveries> createGetXMLDeliveries(GetXMLDeliveries value) {
        return new JAXBElement<GetXMLDeliveries>(_GetXMLDeliveries_QNAME, GetXMLDeliveries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendCampaign")
    public JAXBElement<SendCampaign> createSendCampaign(SendCampaign value) {
        return new JAXBElement<SendCampaign>(_SendCampaign_QNAME, SendCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmptyPushTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getEmptyPushTemplate")
    public JAXBElement<GetEmptyPushTemplate> createGetEmptyPushTemplate(GetEmptyPushTemplate value) {
        return new JAXBElement<GetEmptyPushTemplate>(_GetEmptyPushTemplate_QNAME, GetEmptyPushTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishOnWebResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "publishOnWebResponse")
    public JAXBElement<PublishOnWebResponse> createPublishOnWebResponse(PublishOnWebResponse value) {
        return new JAXBElement<PublishOnWebResponse>(_PublishOnWebResponse_QNAME, PublishOnWebResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageModelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageModelsResponse")
    public JAXBElement<FindMessageModelsResponse> createFindMessageModelsResponse(FindMessageModelsResponse value) {
        return new JAXBElement<FindMessageModelsResponse>(_FindMessageModelsResponse_QNAME, FindMessageModelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignToSubscriberIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignToSubscriberIdResponse")
    public JAXBElement<SendImmediateByCampaignToSubscriberIdResponse> createSendImmediateByCampaignToSubscriberIdResponse(SendImmediateByCampaignToSubscriberIdResponse value) {
        return new JAXBElement<SendImmediateByCampaignToSubscriberIdResponse>(_SendImmediateByCampaignToSubscriberIdResponse_QNAME, SendImmediateByCampaignToSubscriberIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSubscribersIncludedInFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findSubscribersIncludedInFilterResponse")
    public JAXBElement<FindSubscribersIncludedInFilterResponse> createFindSubscribersIncludedInFilterResponse(FindSubscribersIncludedInFilterResponse value) {
        return new JAXBElement<FindSubscribersIncludedInFilterResponse>(_FindSubscribersIncludedInFilterResponse_QNAME, FindSubscribersIncludedInFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberResponse")
    public JAXBElement<GetSubscriberResponse> createGetSubscriberResponse(GetSubscriberResponse value) {
        return new JAXBElement<GetSubscriberResponse>(_GetSubscriberResponse_QNAME, GetSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscriberResponse")
    public JAXBElement<AddSubscriberResponse> createAddSubscriberResponse(AddSubscriberResponse value) {
        return new JAXBElement<AddSubscriberResponse>(_AddSubscriberResponse_QNAME, AddSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySubscriberSubscriptionStatusByMailqIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "modifySubscriberSubscriptionStatusByMailqIdResponse")
    public JAXBElement<ModifySubscriberSubscriptionStatusByMailqIdResponse> createModifySubscriberSubscriptionStatusByMailqIdResponse(ModifySubscriberSubscriptionStatusByMailqIdResponse value) {
        return new JAXBElement<ModifySubscriberSubscriptionStatusByMailqIdResponse>(_ModifySubscriberSubscriptionStatusByMailqIdResponse_QNAME, ModifySubscriberSubscriptionStatusByMailqIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaigns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaigns")
    public JAXBElement<FindCampaigns> createFindCampaigns(FindCampaigns value) {
        return new JAXBElement<FindCampaigns>(_FindCampaigns_QNAME, FindCampaigns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByNameOrSubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByNameOrSubjectResponse")
    public JAXBElement<FindCampaignsByNameOrSubjectResponse> createFindCampaignsByNameOrSubjectResponse(FindCampaignsByNameOrSubjectResponse value) {
        return new JAXBElement<FindCampaignsByNameOrSubjectResponse>(_FindCampaignsByNameOrSubjectResponse_QNAME, FindCampaignsByNameOrSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscribers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscribers")
    public JAXBElement<AddSubscribers> createAddSubscribers(AddSubscribers value) {
        return new JAXBElement<AddSubscribers>(_AddSubscribers_QNAME, AddSubscribers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesByChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesByChannel")
    public JAXBElement<FindMessagesByChannel> createFindMessagesByChannel(FindMessagesByChannel value) {
        return new JAXBElement<FindMessagesByChannel>(_FindMessagesByChannel_QNAME, FindMessagesByChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesInfo")
    public JAXBElement<FindMessagesInfo> createFindMessagesInfo(FindMessagesInfo value) {
        return new JAXBElement<FindMessagesInfo>(_FindMessagesInfo_QNAME, FindMessagesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCid")
    public JAXBElement<SendImmediateMessageSidCid> createSendImmediateMessageSidCid(SendImmediateMessageSidCid value) {
        return new JAXBElement<SendImmediateMessageSidCid>(_SendImmediateMessageSidCid_QNAME, SendImmediateMessageSidCid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindArchivedFiltersBySubscriberSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findArchivedFiltersBySubscriberSource")
    public JAXBElement<FindArchivedFiltersBySubscriberSource> createFindArchivedFiltersBySubscriberSource(FindArchivedFiltersBySubscriberSource value) {
        return new JAXBElement<FindArchivedFiltersBySubscriberSource>(_FindArchivedFiltersBySubscriberSource_QNAME, FindArchivedFiltersBySubscriberSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignAliasToSubscriberId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignAliasToSubscriberId")
    public JAXBElement<SendImmediateByCampaignAliasToSubscriberId> createSendImmediateByCampaignAliasToSubscriberId(SendImmediateByCampaignAliasToSubscriberId value) {
        return new JAXBElement<SendImmediateByCampaignAliasToSubscriberId>(_SendImmediateByCampaignAliasToSubscriberId_QNAME, SendImmediateByCampaignAliasToSubscriberId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addAttachment")
    public JAXBElement<AddAttachment> createAddAttachment(AddAttachment value) {
        return new JAXBElement<AddAttachment>(_AddAttachment_QNAME, AddAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMediaContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "uploadMediaContentResponse")
    public JAXBElement<UploadMediaContentResponse> createUploadMediaContentResponse(UploadMediaContentResponse value) {
        return new JAXBElement<UploadMediaContentResponse>(_UploadMediaContentResponse_QNAME, UploadMediaContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSubscriberSources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findSubscriberSources")
    public JAXBElement<FindSubscriberSources> createFindSubscriberSources(FindSubscriberSources value) {
        return new JAXBElement<FindSubscriberSources>(_FindSubscriberSources_QNAME, FindSubscriberSources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCampaignResponse")
    public JAXBElement<GetCampaignResponse> createGetCampaignResponse(GetCampaignResponse value) {
        return new JAXBElement<GetCampaignResponse>(_GetCampaignResponse_QNAME, GetCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestCampaignFeedbackReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "requestCampaignFeedbackReportResponse")
    public JAXBElement<RequestCampaignFeedbackReportResponse> createRequestCampaignFeedbackReportResponse(RequestCampaignFeedbackReportResponse value) {
        return new JAXBElement<RequestCampaignFeedbackReportResponse>(_RequestCampaignFeedbackReportResponse_QNAME, RequestCampaignFeedbackReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageModelsBySubscriberSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageModelsBySubscriberSource")
    public JAXBElement<FindMessageModelsBySubscriberSource> createFindMessageModelsBySubscriberSource(FindMessageModelsBySubscriberSource value) {
        return new JAXBElement<FindMessageModelsBySubscriberSource>(_FindMessageModelsBySubscriberSource_QNAME, FindMessageModelsBySubscriberSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriberSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscriberSource")
    public JAXBElement<AddSubscriberSource> createAddSubscriberSource(AddSubscriberSource value) {
        return new JAXBElement<AddSubscriberSource>(_AddSubscriberSource_QNAME, AddSubscriberSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessages")
    public JAXBElement<FindMessages> createFindMessages(FindMessages value) {
        return new JAXBElement<FindMessages>(_FindMessages_QNAME, FindMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSIdCDataCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSIdCDataCA")
    public JAXBElement<SendImmediateMessageSIdCDataCA> createSendImmediateMessageSIdCDataCA(SendImmediateMessageSIdCDataCA value) {
        return new JAXBElement<SendImmediateMessageSIdCDataCA>(_SendImmediateMessageSIdCDataCA_QNAME, SendImmediateMessageSIdCDataCA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSIdCData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSIdCData")
    public JAXBElement<SendImmediateMessageSIdCData> createSendImmediateMessageSIdCData(SendImmediateMessageSIdCData value) {
        return new JAXBElement<SendImmediateMessageSIdCData>(_SendImmediateMessageSIdCData_QNAME, SendImmediateMessageSIdCData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCampaignRecurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "setCampaignRecurrencyResponse")
    public JAXBElement<SetCampaignRecurrencyResponse> createSetCampaignRecurrencyResponse(SetCampaignRecurrencyResponse value) {
        return new JAXBElement<SetCampaignRecurrencyResponse>(_SetCampaignRecurrencyResponse_QNAME, SetCampaignRecurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileApplicationByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getMobileApplicationByCodeResponse")
    public JAXBElement<GetMobileApplicationByCodeResponse> createGetMobileApplicationByCodeResponse(GetMobileApplicationByCodeResponse value) {
        return new JAXBElement<GetMobileApplicationByCodeResponse>(_GetMobileApplicationByCodeResponse_QNAME, GetMobileApplicationByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "removeSubscriberResponse")
    public JAXBElement<RemoveSubscriberResponse> createRemoveSubscriberResponse(RemoveSubscriberResponse value) {
        return new JAXBElement<RemoveSubscriberResponse>(_RemoveSubscriberResponse_QNAME, RemoveSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessageModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "createMessageModel")
    public JAXBElement<CreateMessageModel> createCreateMessageModel(CreateMessageModel value) {
        return new JAXBElement<CreateMessageModel>(_CreateMessageModel_QNAME, CreateMessageModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMLDeliveryTransitionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getXMLDeliveryTransitionsResponse")
    public JAXBElement<GetXMLDeliveryTransitionsResponse> createGetXMLDeliveryTransitionsResponse(GetXMLDeliveryTransitionsResponse value) {
        return new JAXBElement<GetXMLDeliveryTransitionsResponse>(_GetXMLDeliveryTransitionsResponse_QNAME, GetXMLDeliveryTransitionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReuseSubscriberSourceFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "reuseSubscriberSourceFilterResponse")
    public JAXBElement<ReuseSubscriberSourceFilterResponse> createReuseSubscriberSourceFilterResponse(ReuseSubscriberSourceFilterResponse value) {
        return new JAXBElement<ReuseSubscriberSourceFilterResponse>(_ReuseSubscriberSourceFilterResponse_QNAME, ReuseSubscriberSourceFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageInfoByCampaignId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageInfoByCampaignId")
    public JAXBElement<FindMessageInfoByCampaignId> createFindMessageInfoByCampaignId(FindMessageInfoByCampaignId value) {
        return new JAXBElement<FindMessageInfoByCampaignId>(_FindMessageInfoByCampaignId_QNAME, FindMessageInfoByCampaignId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignAliasToSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignAliasToSubscriber")
    public JAXBElement<SendImmediateByCampaignAliasToSubscriber> createSendImmediateByCampaignAliasToSubscriber(SendImmediateByCampaignAliasToSubscriber value) {
        return new JAXBElement<SendImmediateByCampaignAliasToSubscriber>(_SendImmediateByCampaignAliasToSubscriber_QNAME, SendImmediateByCampaignAliasToSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFiltersBySubscriberSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findFiltersBySubscriberSourceResponse")
    public JAXBElement<FindFiltersBySubscriberSourceResponse> createFindFiltersBySubscriberSourceResponse(FindFiltersBySubscriberSourceResponse value) {
        return new JAXBElement<FindFiltersBySubscriberSourceResponse>(_FindFiltersBySubscriberSourceResponse_QNAME, FindFiltersBySubscriberSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriberSourceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscriberSourceFilter")
    public JAXBElement<AddSubscriberSourceFilter> createAddSubscriberSourceFilter(AddSubscriberSourceFilter value) {
        return new JAXBElement<AddSubscriberSourceFilter>(_AddSubscriberSourceFilter_QNAME, AddSubscriberSourceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscribersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscribersResponse")
    public JAXBElement<AddSubscribersResponse> createAddSubscribersResponse(AddSubscribersResponse value) {
        return new JAXBElement<AddSubscribersResponse>(_AddSubscribersResponse_QNAME, AddSubscribersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageByCampaignIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageByCampaignIdResponse")
    public JAXBElement<FindMessageByCampaignIdResponse> createFindMessageByCampaignIdResponse(FindMessageByCampaignIdResponse value) {
        return new JAXBElement<FindMessageByCampaignIdResponse>(_FindMessageByCampaignIdResponse_QNAME, FindMessageByCampaignIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesByChannelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesByChannelResponse")
    public JAXBElement<FindMessagesByChannelResponse> createFindMessagesByChannelResponse(FindMessagesByChannelResponse value) {
        return new JAXBElement<FindMessagesByChannelResponse>(_FindMessagesByChannelResponse_QNAME, FindMessagesByChannelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSubscribers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "countSubscribers")
    public JAXBElement<CountSubscribers> createCountSubscribers(CountSubscribers value) {
        return new JAXBElement<CountSubscribers>(_CountSubscribers_QNAME, CountSubscribers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSplitTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendSplitTestResponse")
    public JAXBElement<SendSplitTestResponse> createSendSplitTestResponse(SendSplitTestResponse value) {
        return new JAXBElement<SendSplitTestResponse>(_SendSplitTestResponse_QNAME, SendSplitTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesResponse")
    public JAXBElement<FindMessagesResponse> createFindMessagesResponse(FindMessagesResponse value) {
        return new JAXBElement<FindMessagesResponse>(_FindMessagesResponse_QNAME, FindMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsSentBetweenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsSentBetweenResponse")
    public JAXBElement<FindCampaignsSentBetweenResponse> createFindCampaignsSentBetweenResponse(FindCampaignsSentBetweenResponse value) {
        return new JAXBElement<FindCampaignsSentBetweenResponse>(_FindCampaignsSentBetweenResponse_QNAME, FindCampaignsSentBetweenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindArchivedFiltersBySubscriberSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findArchivedFiltersBySubscriberSourceResponse")
    public JAXBElement<FindArchivedFiltersBySubscriberSourceResponse> createFindArchivedFiltersBySubscriberSourceResponse(FindArchivedFiltersBySubscriberSourceResponse value) {
        return new JAXBElement<FindArchivedFiltersBySubscriberSourceResponse>(_FindArchivedFiltersBySubscriberSourceResponse_QNAME, FindArchivedFiltersBySubscriberSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCampaignNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addCampaignNote")
    public JAXBElement<AddCampaignNote> createAddCampaignNote(AddCampaignNote value) {
        return new JAXBElement<AddCampaignNote>(_AddCampaignNote_QNAME, AddCampaignNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNotesByCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findNotesByCampaignResponse")
    public JAXBElement<FindNotesByCampaignResponse> createFindNotesByCampaignResponse(FindNotesByCampaignResponse value) {
        return new JAXBElement<FindNotesByCampaignResponse>(_FindNotesByCampaignResponse_QNAME, FindNotesByCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsResponse")
    public JAXBElement<FindCampaignsResponse> createFindCampaignsResponse(FindCampaignsResponse value) {
        return new JAXBElement<FindCampaignsResponse>(_FindCampaignsResponse_QNAME, FindCampaignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignIdToSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignIdToSubscriberResponse")
    public JAXBElement<SendImmediateByCampaignIdToSubscriberResponse> createSendImmediateByCampaignIdToSubscriberResponse(SendImmediateByCampaignIdToSubscriberResponse value) {
        return new JAXBElement<SendImmediateByCampaignIdToSubscriberResponse>(_SendImmediateByCampaignIdToSubscriberResponse_QNAME, SendImmediateByCampaignIdToSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "updateSubscriber")
    public JAXBElement<UpdateSubscriber> createUpdateSubscriber(UpdateSubscriber value) {
        return new JAXBElement<UpdateSubscriber>(_UpdateSubscriber_QNAME, UpdateSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileApplicationByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getMobileApplicationByCode")
    public JAXBElement<GetMobileApplicationByCode> createGetMobileApplicationByCode(GetMobileApplicationByCode value) {
        return new JAXBElement<GetMobileApplicationByCode>(_GetMobileApplicationByCode_QNAME, GetMobileApplicationByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesByCampaignNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesByCampaignNameResponse")
    public JAXBElement<FindMessagesByCampaignNameResponse> createFindMessagesByCampaignNameResponse(FindMessagesByCampaignNameResponse value) {
        return new JAXBElement<FindMessagesByCampaignNameResponse>(_FindMessagesByCampaignNameResponse_QNAME, FindMessagesByCampaignNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSDataCDataCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSDataCDataCA")
    public JAXBElement<SendImmediateMessageSDataCDataCA> createSendImmediateMessageSDataCDataCA(SendImmediateMessageSDataCDataCA value) {
        return new JAXBElement<SendImmediateMessageSDataCDataCA>(_SendImmediateMessageSDataCDataCA_QNAME, SendImmediateMessageSDataCDataCA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageModels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageModels")
    public JAXBElement<FindMessageModels> createFindMessageModels(FindMessageModels value) {
        return new JAXBElement<FindMessageModels>(_FindMessageModels_QNAME, FindMessageModels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveSubscriberSourceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "archiveSubscriberSourceFilter")
    public JAXBElement<ArchiveSubscriberSourceFilter> createArchiveSubscriberSourceFilter(ArchiveSubscriberSourceFilter value) {
        return new JAXBElement<ArchiveSubscriberSourceFilter>(_ArchiveSubscriberSourceFilter_QNAME, ArchiveSubscriberSourceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageModelByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getMessageModelByIdResponse")
    public JAXBElement<GetMessageModelByIdResponse> createGetMessageModelByIdResponse(GetMessageModelByIdResponse value) {
        return new JAXBElement<GetMessageModelByIdResponse>(_GetMessageModelByIdResponse_QNAME, GetMessageModelByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMediaContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "uploadMediaContent")
    public JAXBElement<UploadMediaContent> createUploadMediaContent(UploadMediaContent value) {
        return new JAXBElement<UploadMediaContent>(_UploadMediaContent_QNAME, UploadMediaContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCryptoKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCryptoKey")
    public JAXBElement<GetCryptoKey> createGetCryptoKey(GetCryptoKey value) {
        return new JAXBElement<GetCryptoKey>(_GetCryptoKey_QNAME, GetCryptoKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesInfoByChannelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesInfoByChannelResponse")
    public JAXBElement<FindMessagesInfoByChannelResponse> createFindMessagesInfoByChannelResponse(FindMessagesInfoByChannelResponse value) {
        return new JAXBElement<FindMessagesInfoByChannelResponse>(_FindMessagesInfoByChannelResponse_QNAME, FindMessagesInfoByChannelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getRequestStatusResponse")
    public JAXBElement<GetRequestStatusResponse> createGetRequestStatusResponse(GetRequestStatusResponse value) {
        return new JAXBElement<GetRequestStatusResponse>(_GetRequestStatusResponse_QNAME, GetRequestStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriber")
    public JAXBElement<GetSubscriber> createGetSubscriber(GetSubscriber value) {
        return new JAXBElement<GetSubscriber>(_GetSubscriber_QNAME, GetSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentByCampaignId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getAttachmentByCampaignId")
    public JAXBElement<GetAttachmentByCampaignId> createGetAttachmentByCampaignId(GetAttachmentByCampaignId value) {
        return new JAXBElement<GetAttachmentByCampaignId>(_GetAttachmentByCampaignId_QNAME, GetAttachmentByCampaignId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveSubscriberSourceFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "archiveSubscriberSourceFilterResponse")
    public JAXBElement<ArchiveSubscriberSourceFilterResponse> createArchiveSubscriberSourceFilterResponse(ArchiveSubscriberSourceFilterResponse value) {
        return new JAXBElement<ArchiveSubscriberSourceFilterResponse>(_ArchiveSubscriberSourceFilterResponse_QNAME, ArchiveSubscriberSourceFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySubscriberSubscriptionStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "modifySubscriberSubscriptionStatusResponse")
    public JAXBElement<ModifySubscriberSubscriptionStatusResponse> createModifySubscriberSubscriptionStatusResponse(ModifySubscriberSubscriptionStatusResponse value) {
        return new JAXBElement<ModifySubscriberSubscriptionStatusResponse>(_ModifySubscriberSubscriptionStatusResponse_QNAME, ModifySubscriberSubscriptionStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySubscriberSubscriptionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "modifySubscriberSubscriptionStatus")
    public JAXBElement<ModifySubscriberSubscriptionStatus> createModifySubscriberSubscriptionStatus(ModifySubscriberSubscriptionStatus value) {
        return new JAXBElement<ModifySubscriberSubscriptionStatus>(_ModifySubscriberSubscriptionStatus_QNAME, ModifySubscriberSubscriptionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeriodicCampaigns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findPeriodicCampaigns")
    public JAXBElement<FindPeriodicCampaigns> createFindPeriodicCampaigns(FindPeriodicCampaigns value) {
        return new JAXBElement<FindPeriodicCampaigns>(_FindPeriodicCampaigns_QNAME, FindPeriodicCampaigns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidateTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "invalidateTokenResponse")
    public JAXBElement<InvalidateTokenResponse> createInvalidateTokenResponse(InvalidateTokenResponse value) {
        return new JAXBElement<InvalidateTokenResponse>(_InvalidateTokenResponse_QNAME, InvalidateTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentByCampaignIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getAttachmentByCampaignIdResponse")
    public JAXBElement<GetAttachmentByCampaignIdResponse> createGetAttachmentByCampaignIdResponse(GetAttachmentByCampaignIdResponse value) {
        return new JAXBElement<GetAttachmentByCampaignIdResponse>(_GetAttachmentByCampaignIdResponse_QNAME, GetAttachmentByCampaignIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmarshalPushTemplateEnvelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "unmarshalPushTemplateEnvelope")
    public JAXBElement<UnmarshalPushTemplateEnvelope> createUnmarshalPushTemplateEnvelope(UnmarshalPushTemplateEnvelope value) {
        return new JAXBElement<UnmarshalPushTemplateEnvelope>(_UnmarshalPushTemplateEnvelope_QNAME, UnmarshalPushTemplateEnvelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSplitTestWinner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendSplitTestWinner")
    public JAXBElement<SendSplitTestWinner> createSendSplitTestWinner(SendSplitTestWinner value) {
        return new JAXBElement<SendSplitTestWinner>(_SendSplitTestWinner_QNAME, SendSplitTestWinner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartSubscriberDataExchange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "startSubscriberDataExchange")
    public JAXBElement<StartSubscriberDataExchange> createStartSubscriberDataExchange(StartSubscriberDataExchange value) {
        return new JAXBElement<StartSubscriberDataExchange>(_StartSubscriberDataExchange_QNAME, StartSubscriberDataExchange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignIdToSubscriberId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignIdToSubscriberId")
    public JAXBElement<SendImmediateByCampaignIdToSubscriberId> createSendImmediateByCampaignIdToSubscriberId(SendImmediateByCampaignIdToSubscriberId value) {
        return new JAXBElement<SendImmediateByCampaignIdToSubscriberId>(_SendImmediateByCampaignIdToSubscriberId_QNAME, SendImmediateByCampaignIdToSubscriberId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSplitTestWinnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendSplitTestWinnerResponse")
    public JAXBElement<SendSplitTestWinnerResponse> createSendSplitTestWinnerResponse(SendSplitTestWinnerResponse value) {
        return new JAXBElement<SendSplitTestWinnerResponse>(_SendSplitTestWinnerResponse_QNAME, SendSplitTestWinnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSdataCAlCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSdataCAlCAResponse")
    public JAXBElement<SendImmediateMessageSdataCAlCAResponse> createSendImmediateMessageSdataCAlCAResponse(SendImmediateMessageSdataCAlCAResponse value) {
        return new JAXBElement<SendImmediateMessageSdataCAlCAResponse>(_SendImmediateMessageSdataCAlCAResponse_QNAME, SendImmediateMessageSdataCAlCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriberSourceFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscriberSourceFilterResponse")
    public JAXBElement<AddSubscriberSourceFilterResponse> createAddSubscriberSourceFilterResponse(AddSubscriberSourceFilterResponse value) {
        return new JAXBElement<AddSubscriberSourceFilterResponse>(_AddSubscriberSourceFilterResponse_QNAME, AddSubscriberSourceFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSdataCAl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSdataCAl")
    public JAXBElement<SendImmediateMessageSdataCAl> createSendImmediateMessageSdataCAl(SendImmediateMessageSdataCAl value) {
        return new JAXBElement<SendImmediateMessageSdataCAl>(_SendImmediateMessageSdataCAl_QNAME, SendImmediateMessageSdataCAl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "borrowTokenResponse")
    public JAXBElement<BorrowTokenResponse> createBorrowTokenResponse(BorrowTokenResponse value) {
        return new JAXBElement<BorrowTokenResponse>(_BorrowTokenResponse_QNAME, BorrowTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignAliasToSubscriberIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignAliasToSubscriberIdResponse")
    public JAXBElement<SendImmediateByCampaignAliasToSubscriberIdResponse> createSendImmediateByCampaignAliasToSubscriberIdResponse(SendImmediateByCampaignAliasToSubscriberIdResponse value) {
        return new JAXBElement<SendImmediateByCampaignAliasToSubscriberIdResponse>(_SendImmediateByCampaignAliasToSubscriberIdResponse_QNAME, SendImmediateByCampaignAliasToSubscriberIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesInfoByCampaignName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesInfoByCampaignName")
    public JAXBElement<FindMessagesInfoByCampaignName> createFindMessagesInfoByCampaignName(FindMessagesInfoByCampaignName value) {
        return new JAXBElement<FindMessagesInfoByCampaignName>(_FindMessagesInfoByCampaignName_QNAME, FindMessagesInfoByCampaignName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "updateSubscriberResponse")
    public JAXBElement<UpdateSubscriberResponse> createUpdateSubscriberResponse(UpdateSubscriberResponse value) {
        return new JAXBElement<UpdateSubscriberResponse>(_UpdateSubscriberResponse_QNAME, UpdateSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignDeliveryStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCampaignDeliveryStatusResponse")
    public JAXBElement<GetCampaignDeliveryStatusResponse> createGetCampaignDeliveryStatusResponse(GetCampaignDeliveryStatusResponse value) {
        return new JAXBElement<GetCampaignDeliveryStatusResponse>(_GetCampaignDeliveryStatusResponse_QNAME, GetCampaignDeliveryStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsBySubscriberSourceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsBySubscriberSourceFilter")
    public JAXBElement<FindCampaignsBySubscriberSourceFilter> createFindCampaignsBySubscriberSourceFilter(FindCampaignsBySubscriberSourceFilter value) {
        return new JAXBElement<FindCampaignsBySubscriberSourceFilter>(_FindCampaignsBySubscriberSourceFilter_QNAME, FindCampaignsBySubscriberSourceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriberSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscriberSourceResponse")
    public JAXBElement<AddSubscriberSourceResponse> createAddSubscriberSourceResponse(AddSubscriberSourceResponse value) {
        return new JAXBElement<AddSubscriberSourceResponse>(_AddSubscriberSourceResponse_QNAME, AddSubscriberSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignAliasToSubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignAliasToSubscriberResponse")
    public JAXBElement<SendImmediateByCampaignAliasToSubscriberResponse> createSendImmediateByCampaignAliasToSubscriberResponse(SendImmediateByCampaignAliasToSubscriberResponse value) {
        return new JAXBElement<SendImmediateByCampaignAliasToSubscriberResponse>(_SendImmediateByCampaignAliasToSubscriberResponse_QNAME, SendImmediateByCampaignAliasToSubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSubscribersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "countSubscribersResponse")
    public JAXBElement<CountSubscribersResponse> createCountSubscribersResponse(CountSubscribersResponse value) {
        return new JAXBElement<CountSubscribersResponse>(_CountSubscribersResponse_QNAME, CountSubscribersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTriggerableCampaigns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findTriggerableCampaigns")
    public JAXBElement<FindTriggerableCampaigns> createFindTriggerableCampaigns(FindTriggerableCampaigns value) {
        return new JAXBElement<FindTriggerableCampaigns>(_FindTriggerableCampaigns_QNAME, FindTriggerableCampaigns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "createCampaign")
    public JAXBElement<CreateCampaign> createCreateCampaign(CreateCampaign value) {
        return new JAXBElement<CreateCampaign>(_CreateCampaign_QNAME, CreateCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesByCampaignName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesByCampaignName")
    public JAXBElement<FindMessagesByCampaignName> createFindMessagesByCampaignName(FindMessagesByCampaignName value) {
        return new JAXBElement<FindMessagesByCampaignName>(_FindMessagesByCampaignName_QNAME, FindMessagesByCampaignName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishOnWeb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "publishOnWeb")
    public JAXBElement<PublishOnWeb> createPublishOnWeb(PublishOnWeb value) {
        return new JAXBElement<PublishOnWeb>(_PublishOnWeb_QNAME, PublishOnWeb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeepaliveTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "keepaliveTokenResponse")
    public JAXBElement<KeepaliveTokenResponse> createKeepaliveTokenResponse(KeepaliveTokenResponse value) {
        return new JAXBElement<KeepaliveTokenResponse>(_KeepaliveTokenResponse_QNAME, KeepaliveTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSubscribersIncludedInFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "countSubscribersIncludedInFilterResponse")
    public JAXBElement<CountSubscribersIncludedInFilterResponse> createCountSubscribersIncludedInFilterResponse(CountSubscribersIncludedInFilterResponse value) {
        return new JAXBElement<CountSubscribersIncludedInFilterResponse>(_CountSubscribersIncludedInFilterResponse_QNAME, CountSubscribersIncludedInFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addSubscriber")
    public JAXBElement<AddSubscriber> createAddSubscriber(AddSubscriber value) {
        return new JAXBElement<AddSubscriber>(_AddSubscriber_QNAME, AddSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberSourceResponse")
    public JAXBElement<GetSubscriberSourceResponse> createGetSubscriberSourceResponse(GetSubscriberSourceResponse value) {
        return new JAXBElement<GetSubscriberSourceResponse>(_GetSubscriberSourceResponse_QNAME, GetSubscriberSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerDeliveryByAlias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "triggerDeliveryByAlias")
    public JAXBElement<TriggerDeliveryByAlias> createTriggerDeliveryByAlias(TriggerDeliveryByAlias value) {
        return new JAXBElement<TriggerDeliveryByAlias>(_TriggerDeliveryByAlias_QNAME, TriggerDeliveryByAlias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCidResponse")
    public JAXBElement<SendImmediateMessageSidCidResponse> createSendImmediateMessageSidCidResponse(SendImmediateMessageSidCidResponse value) {
        return new JAXBElement<SendImmediateMessageSidCidResponse>(_SendImmediateMessageSidCidResponse_QNAME, SendImmediateMessageSidCidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTriggerableCampaignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findTriggerableCampaignsResponse")
    public JAXBElement<FindTriggerableCampaignsResponse> createFindTriggerableCampaignsResponse(FindTriggerableCampaignsResponse value) {
        return new JAXBElement<FindTriggerableCampaignsResponse>(_FindTriggerableCampaignsResponse_QNAME, FindTriggerableCampaignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeepaliveToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "keepaliveToken")
    public JAXBElement<KeepaliveToken> createKeepaliveToken(KeepaliveToken value) {
        return new JAXBElement<KeepaliveToken>(_KeepaliveToken_QNAME, KeepaliveToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessage")
    public JAXBElement<SendImmediateMessage> createSendImmediateMessage(SendImmediateMessage value) {
        return new JAXBElement<SendImmediateMessage>(_SendImmediateMessage_QNAME, SendImmediateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchivedSubscriberSourceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getArchivedSubscriberSourceFilter")
    public JAXBElement<GetArchivedSubscriberSourceFilter> createGetArchivedSubscriberSourceFilter(GetArchivedSubscriberSourceFilter value) {
        return new JAXBElement<GetArchivedSubscriberSourceFilter>(_GetArchivedSubscriberSourceFilter_QNAME, GetArchivedSubscriberSourceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCAlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCAlResponse")
    public JAXBElement<SendImmediateMessageSidCAlResponse> createSendImmediateMessageSidCAlResponse(SendImmediateMessageSidCAlResponse value) {
        return new JAXBElement<SendImmediateMessageSidCAlResponse>(_SendImmediateMessageSidCAlResponse_QNAME, SendImmediateMessageSidCAlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMLDeliveriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getXMLDeliveriesResponse")
    public JAXBElement<GetXMLDeliveriesResponse> createGetXMLDeliveriesResponse(GetXMLDeliveriesResponse value) {
        return new JAXBElement<GetXMLDeliveriesResponse>(_GetXMLDeliveriesResponse_QNAME, GetXMLDeliveriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCAlCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCAlCAResponse")
    public JAXBElement<SendImmediateMessageSidCAlCAResponse> createSendImmediateMessageSidCAlCAResponse(SendImmediateMessageSidCAlCAResponse value) {
        return new JAXBElement<SendImmediateMessageSidCAlCAResponse>(_SendImmediateMessageSidCAlCAResponse_QNAME, SendImmediateMessageSidCAlCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageModelsBySubscriberSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageModelsBySubscriberSourceResponse")
    public JAXBElement<FindMessageModelsBySubscriberSourceResponse> createFindMessageModelsBySubscriberSourceResponse(FindMessageModelsBySubscriberSourceResponse value) {
        return new JAXBElement<FindMessageModelsBySubscriberSourceResponse>(_FindMessageModelsBySubscriberSourceResponse_QNAME, FindMessageModelsBySubscriberSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignFeedbackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCampaignFeedbackResponse")
    public JAXBElement<GetCampaignFeedbackResponse> createGetCampaignFeedbackResponse(GetCampaignFeedbackResponse value) {
        return new JAXBElement<GetCampaignFeedbackResponse>(_GetCampaignFeedbackResponse_QNAME, GetCampaignFeedbackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSIdCDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSIdCDataResponse")
    public JAXBElement<SendImmediateMessageSIdCDataResponse> createSendImmediateMessageSIdCDataResponse(SendImmediateMessageSIdCDataResponse value) {
        return new JAXBElement<SendImmediateMessageSIdCDataResponse>(_SendImmediateMessageSIdCDataResponse_QNAME, SendImmediateMessageSIdCDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendCampaignResponse")
    public JAXBElement<SendCampaignResponse> createSendCampaignResponse(SendCampaignResponse value) {
        return new JAXBElement<SendCampaignResponse>(_SendCampaignResponse_QNAME, SendCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsSentBetween }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsSentBetween")
    public JAXBElement<FindCampaignsSentBetween> createFindCampaignsSentBetween(FindCampaignsSentBetween value) {
        return new JAXBElement<FindCampaignsSentBetween>(_FindCampaignsSentBetween_QNAME, FindCampaignsSentBetween.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCryptoKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCryptoKeyResponse")
    public JAXBElement<GetCryptoKeyResponse> createGetCryptoKeyResponse(GetCryptoKeyResponse value) {
        return new JAXBElement<GetCryptoKeyResponse>(_GetCryptoKeyResponse_QNAME, GetCryptoKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByNameOrSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByNameOrSubject")
    public JAXBElement<FindCampaignsByNameOrSubject> createFindCampaignsByNameOrSubject(FindCampaignsByNameOrSubject value) {
        return new JAXBElement<FindCampaignsByNameOrSubject>(_FindCampaignsByNameOrSubject_QNAME, FindCampaignsByNameOrSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerDeliveryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "triggerDeliveryById")
    public JAXBElement<TriggerDeliveryById> createTriggerDeliveryById(TriggerDeliveryById value) {
        return new JAXBElement<TriggerDeliveryById>(_TriggerDeliveryById_QNAME, TriggerDeliveryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getRequestStatus")
    public JAXBElement<GetRequestStatus> createGetRequestStatus(GetRequestStatus value) {
        return new JAXBElement<GetRequestStatus>(_GetRequestStatus_QNAME, GetRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberDataExchangeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberDataExchangeStatusResponse")
    public JAXBElement<GetSubscriberDataExchangeStatusResponse> createGetSubscriberDataExchangeStatusResponse(GetSubscriberDataExchangeStatusResponse value) {
        return new JAXBElement<GetSubscriberDataExchangeStatusResponse>(_GetSubscriberDataExchangeStatusResponse_QNAME, GetSubscriberDataExchangeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneAndSendCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "cloneAndSendCampaign")
    public JAXBElement<CloneAndSendCampaign> createCloneAndSendCampaign(CloneAndSendCampaign value) {
        return new JAXBElement<CloneAndSendCampaign>(_CloneAndSendCampaign_QNAME, CloneAndSendCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCampaignNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "addCampaignNoteResponse")
    public JAXBElement<AddCampaignNoteResponse> createAddCampaignNoteResponse(AddCampaignNoteResponse value) {
        return new JAXBElement<AddCampaignNoteResponse>(_AddCampaignNoteResponse_QNAME, AddCampaignNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloneAndSendCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "cloneAndSendCampaignResponse")
    public JAXBElement<CloneAndSendCampaignResponse> createCloneAndSendCampaignResponse(CloneAndSendCampaignResponse value) {
        return new JAXBElement<CloneAndSendCampaignResponse>(_CloneAndSendCampaignResponse_QNAME, CloneAndSendCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCampaign")
    public JAXBElement<GetCampaign> createGetCampaign(GetCampaign value) {
        return new JAXBElement<GetCampaign>(_GetCampaign_QNAME, GetCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberSourceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberSourceFilter")
    public JAXBElement<GetSubscriberSourceFilter> createGetSubscriberSourceFilter(GetSubscriberSourceFilter value) {
        return new JAXBElement<GetSubscriberSourceFilter>(_GetSubscriberSourceFilter_QNAME, GetSubscriberSourceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSplitTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendSplitTest")
    public JAXBElement<SendSplitTest> createSendSplitTest(SendSplitTest value) {
        return new JAXBElement<SendSplitTest>(_SendSplitTest_QNAME, SendSplitTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageResponse")
    public JAXBElement<SendImmediateMessageResponse> createSendImmediateMessageResponse(SendImmediateMessageResponse value) {
        return new JAXBElement<SendImmediateMessageResponse>(_SendImmediateMessageResponse_QNAME, SendImmediateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageModelById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getMessageModelById")
    public JAXBElement<GetMessageModelById> createGetMessageModelById(GetMessageModelById value) {
        return new JAXBElement<GetMessageModelById>(_GetMessageModelById_QNAME, GetMessageModelById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmptyPushTemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getEmptyPushTemplateResponse")
    public JAXBElement<GetEmptyPushTemplateResponse> createGetEmptyPushTemplateResponse(GetEmptyPushTemplateResponse value) {
        return new JAXBElement<GetEmptyPushTemplateResponse>(_GetEmptyPushTemplateResponse_QNAME, GetEmptyPushTemplateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "borrowToken")
    public JAXBElement<BorrowToken> createBorrowToken(BorrowToken value) {
        return new JAXBElement<BorrowToken>(_BorrowToken_QNAME, BorrowToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerDeliveryByAliasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "triggerDeliveryByAliasResponse")
    public JAXBElement<TriggerDeliveryByAliasResponse> createTriggerDeliveryByAliasResponse(TriggerDeliveryByAliasResponse value) {
        return new JAXBElement<TriggerDeliveryByAliasResponse>(_TriggerDeliveryByAliasResponse_QNAME, TriggerDeliveryByAliasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignIdToSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignIdToSubscriber")
    public JAXBElement<SendImmediateByCampaignIdToSubscriber> createSendImmediateByCampaignIdToSubscriber(SendImmediateByCampaignIdToSubscriber value) {
        return new JAXBElement<SendImmediateByCampaignIdToSubscriber>(_SendImmediateByCampaignIdToSubscriber_QNAME, SendImmediateByCampaignIdToSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsSubscriberSourceLocked }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "isSubscriberSourceLocked")
    public JAXBElement<IsSubscriberSourceLocked> createIsSubscriberSourceLocked(IsSubscriberSourceLocked value) {
        return new JAXBElement<IsSubscriberSourceLocked>(_IsSubscriberSourceLocked_QNAME, IsSubscriberSourceLocked.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriberSourceFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getSubscriberSourceFilterResponse")
    public JAXBElement<GetSubscriberSourceFilterResponse> createGetSubscriberSourceFilterResponse(GetSubscriberSourceFilterResponse value) {
        return new JAXBElement<GetSubscriberSourceFilterResponse>(_GetSubscriberSourceFilterResponse_QNAME, GetSubscriberSourceFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampaignDeliveryStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getCampaignDeliveryStatus")
    public JAXBElement<GetCampaignDeliveryStatus> createGetCampaignDeliveryStatus(GetCampaignDeliveryStatus value) {
        return new JAXBElement<GetCampaignDeliveryStatus>(_GetCampaignDeliveryStatus_QNAME, GetCampaignDeliveryStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "removeSubscriber")
    public JAXBElement<RemoveSubscriber> createRemoveSubscriber(RemoveSubscriber value) {
        return new JAXBElement<RemoveSubscriber>(_RemoveSubscriber_QNAME, RemoveSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerDeliveryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "triggerDeliveryByIdResponse")
    public JAXBElement<TriggerDeliveryByIdResponse> createTriggerDeliveryByIdResponse(TriggerDeliveryByIdResponse value) {
        return new JAXBElement<TriggerDeliveryByIdResponse>(_TriggerDeliveryByIdResponse_QNAME, TriggerDeliveryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSplitTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "createSplitTestResponse")
    public JAXBElement<CreateSplitTestResponse> createCreateSplitTestResponse(CreateSplitTestResponse value) {
        return new JAXBElement<CreateSplitTestResponse>(_CreateSplitTestResponse_QNAME, CreateSplitTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsSubscriberSourceLockedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "isSubscriberSourceLockedResponse")
    public JAXBElement<IsSubscriberSourceLockedResponse> createIsSubscriberSourceLockedResponse(IsSubscriberSourceLockedResponse value) {
        return new JAXBElement<IsSubscriberSourceLockedResponse>(_IsSubscriberSourceLockedResponse_QNAME, IsSubscriberSourceLockedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSIdCDataCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSIdCDataCAResponse")
    public JAXBElement<SendImmediateMessageSIdCDataCAResponse> createSendImmediateMessageSIdCDataCAResponse(SendImmediateMessageSIdCDataCAResponse value) {
        return new JAXBElement<SendImmediateMessageSIdCDataCAResponse>(_SendImmediateMessageSIdCDataCAResponse_QNAME, SendImmediateMessageSIdCDataCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSDataCDataCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSDataCDataCAResponse")
    public JAXBElement<SendImmediateMessageSDataCDataCAResponse> createSendImmediateMessageSDataCDataCAResponse(SendImmediateMessageSDataCDataCAResponse value) {
        return new JAXBElement<SendImmediateMessageSDataCDataCAResponse>(_SendImmediateMessageSDataCDataCAResponse_QNAME, SendImmediateMessageSDataCDataCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsBySubscriberSourceFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsBySubscriberSourceFilterResponse")
    public JAXBElement<FindCampaignsBySubscriberSourceFilterResponse> createFindCampaignsBySubscriberSourceFilterResponse(FindCampaignsBySubscriberSourceFilterResponse value) {
        return new JAXBElement<FindCampaignsBySubscriberSourceFilterResponse>(_FindCampaignsBySubscriberSourceFilterResponse_QNAME, FindCampaignsBySubscriberSourceFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSDataCData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSDataCData")
    public JAXBElement<SendImmediateMessageSDataCData> createSendImmediateMessageSDataCData(SendImmediateMessageSDataCData value) {
        return new JAXBElement<SendImmediateMessageSDataCData>(_SendImmediateMessageSDataCData_QNAME, SendImmediateMessageSDataCData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSubscriberSourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findSubscriberSourcesResponse")
    public JAXBElement<FindSubscriberSourcesResponse> createFindSubscriberSourcesResponse(FindSubscriberSourcesResponse value) {
        return new JAXBElement<FindSubscriberSourcesResponse>(_FindSubscriberSourcesResponse_QNAME, FindSubscriberSourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmarshalPushTemplateEnvelopeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "unmarshalPushTemplateEnvelopeResponse")
    public JAXBElement<UnmarshalPushTemplateEnvelopeResponse> createUnmarshalPushTemplateEnvelopeResponse(UnmarshalPushTemplateEnvelopeResponse value) {
        return new JAXBElement<UnmarshalPushTemplateEnvelopeResponse>(_UnmarshalPushTemplateEnvelopeResponse_QNAME, UnmarshalPushTemplateEnvelopeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSplitTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "createSplitTest")
    public JAXBElement<CreateSplitTest> createCreateSplitTest(CreateSplitTest value) {
        return new JAXBElement<CreateSplitTest>(_CreateSplitTest_QNAME, CreateSplitTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByStatus")
    public JAXBElement<FindCampaignsByStatus> createFindCampaignsByStatus(FindCampaignsByStatus value) {
        return new JAXBElement<FindCampaignsByStatus>(_FindCampaignsByStatus_QNAME, FindCampaignsByStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesInfoByCampaignNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesInfoByCampaignNameResponse")
    public JAXBElement<FindMessagesInfoByCampaignNameResponse> createFindMessagesInfoByCampaignNameResponse(FindMessagesInfoByCampaignNameResponse value) {
        return new JAXBElement<FindMessagesInfoByCampaignNameResponse>(_FindMessagesInfoByCampaignNameResponse_QNAME, FindMessagesInfoByCampaignNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSDataCIdCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSDataCIdCAResponse")
    public JAXBElement<SendImmediateMessageSDataCIdCAResponse> createSendImmediateMessageSDataCIdCAResponse(SendImmediateMessageSDataCIdCAResponse value) {
        return new JAXBElement<SendImmediateMessageSDataCIdCAResponse>(_SendImmediateMessageSDataCIdCAResponse_QNAME, SendImmediateMessageSDataCIdCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSubscribers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findSubscribers")
    public JAXBElement<FindSubscribers> createFindSubscribers(FindSubscribers value) {
        return new JAXBElement<FindSubscribers>(_FindSubscribers_QNAME, FindSubscribers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReuseSubscriberSourceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "reuseSubscriberSourceFilter")
    public JAXBElement<ReuseSubscriberSourceFilter> createReuseSubscriberSourceFilter(ReuseSubscriberSourceFilter value) {
        return new JAXBElement<ReuseSubscriberSourceFilter>(_ReuseSubscriberSourceFilter_QNAME, ReuseSubscriberSourceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampaignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "createCampaignResponse")
    public JAXBElement<CreateCampaignResponse> createCreateCampaignResponse(CreateCampaignResponse value) {
        return new JAXBElement<CreateCampaignResponse>(_CreateCampaignResponse_QNAME, CreateCampaignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSubscribersIncludedInFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findSubscribersIncludedInFilter")
    public JAXBElement<FindSubscribersIncludedInFilter> createFindSubscribersIncludedInFilter(FindSubscribersIncludedInFilter value) {
        return new JAXBElement<FindSubscribersIncludedInFilter>(_FindSubscribersIncludedInFilter_QNAME, FindSubscribersIncludedInFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessageInfoByCampaignIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessageInfoByCampaignIdResponse")
    public JAXBElement<FindMessageInfoByCampaignIdResponse> createFindMessageInfoByCampaignIdResponse(FindMessageInfoByCampaignIdResponse value) {
        return new JAXBElement<FindMessageInfoByCampaignIdResponse>(_FindMessageInfoByCampaignIdResponse_QNAME, FindMessageInfoByCampaignIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateByCampaignIdToSubscriberIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateByCampaignIdToSubscriberIdResponse")
    public JAXBElement<SendImmediateByCampaignIdToSubscriberIdResponse> createSendImmediateByCampaignIdToSubscriberIdResponse(SendImmediateByCampaignIdToSubscriberIdResponse value) {
        return new JAXBElement<SendImmediateByCampaignIdToSubscriberIdResponse>(_SendImmediateByCampaignIdToSubscriberIdResponse_QNAME, SendImmediateByCampaignIdToSubscriberIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchivedSubscriberSourceFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getArchivedSubscriberSourceFilterResponse")
    public JAXBElement<GetArchivedSubscriberSourceFilterResponse> createGetArchivedSubscriberSourceFilterResponse(GetArchivedSubscriberSourceFilterResponse value) {
        return new JAXBElement<GetArchivedSubscriberSourceFilterResponse>(_GetArchivedSubscriberSourceFilterResponse_QNAME, GetArchivedSubscriberSourceFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSdataCAlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSdataCAlResponse")
    public JAXBElement<SendImmediateMessageSdataCAlResponse> createSendImmediateMessageSdataCAlResponse(SendImmediateMessageSdataCAlResponse value) {
        return new JAXBElement<SendImmediateMessageSdataCAlResponse>(_SendImmediateMessageSdataCAlResponse_QNAME, SendImmediateMessageSdataCAlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSdataCAlCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSdataCAlCA")
    public JAXBElement<SendImmediateMessageSdataCAlCA> createSendImmediateMessageSdataCAlCA(SendImmediateMessageSdataCAlCA value) {
        return new JAXBElement<SendImmediateMessageSdataCAlCA>(_SendImmediateMessageSdataCAlCA_QNAME, SendImmediateMessageSdataCAlCA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMLDeliveryTransitions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getXMLDeliveryTransitions")
    public JAXBElement<GetXMLDeliveryTransitions> createGetXMLDeliveryTransitions(GetXMLDeliveryTransitions value) {
        return new JAXBElement<GetXMLDeliveryTransitions>(_GetXMLDeliveryTransitions_QNAME, GetXMLDeliveryTransitions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSidCAlCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSidCAlCA")
    public JAXBElement<SendImmediateMessageSidCAlCA> createSendImmediateMessageSidCAlCA(SendImmediateMessageSidCAlCA value) {
        return new JAXBElement<SendImmediateMessageSidCAlCA>(_SendImmediateMessageSidCAlCA_QNAME, SendImmediateMessageSidCAlCA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSDataCDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSDataCDataResponse")
    public JAXBElement<SendImmediateMessageSDataCDataResponse> createSendImmediateMessageSDataCDataResponse(SendImmediateMessageSDataCDataResponse value) {
        return new JAXBElement<SendImmediateMessageSDataCDataResponse>(_SendImmediateMessageSDataCDataResponse_QNAME, SendImmediateMessageSDataCDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableCommunicationCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "getAvailableCommunicationCategoriesResponse")
    public JAXBElement<GetAvailableCommunicationCategoriesResponse> createGetAvailableCommunicationCategoriesResponse(GetAvailableCommunicationCategoriesResponse value) {
        return new JAXBElement<GetAvailableCommunicationCategoriesResponse>(_GetAvailableCommunicationCategoriesResponse_QNAME, GetAvailableCommunicationCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampaignsByModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findCampaignsByModelResponse")
    public JAXBElement<FindCampaignsByModelResponse> createFindCampaignsByModelResponse(FindCampaignsByModelResponse value) {
        return new JAXBElement<FindCampaignsByModelResponse>(_FindCampaignsByModelResponse_QNAME, FindCampaignsByModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMessagesInfoByChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findMessagesInfoByChannel")
    public JAXBElement<FindMessagesInfoByChannel> createFindMessagesInfoByChannel(FindMessagesInfoByChannel value) {
        return new JAXBElement<FindMessagesInfoByChannel>(_FindMessagesInfoByChannel_QNAME, FindMessagesInfoByChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImmediateMessageSDataCIdCA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "sendImmediateMessageSDataCIdCA")
    public JAXBElement<SendImmediateMessageSDataCIdCA> createSendImmediateMessageSDataCIdCA(SendImmediateMessageSDataCIdCA value) {
        return new JAXBElement<SendImmediateMessageSDataCIdCA>(_SendImmediateMessageSDataCIdCA_QNAME, SendImmediateMessageSDataCIdCA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySubscriberSubscriptionStatusByMailqId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "modifySubscriberSubscriptionStatusByMailqId")
    public JAXBElement<ModifySubscriberSubscriptionStatusByMailqId> createModifySubscriberSubscriptionStatusByMailqId(ModifySubscriberSubscriptionStatusByMailqId value) {
        return new JAXBElement<ModifySubscriberSubscriptionStatusByMailqId>(_ModifySubscriberSubscriptionStatusByMailqId_QNAME, ModifySubscriberSubscriptionStatusByMailqId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNotesByCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.api.contactlab.com/", name = "findNotesByCampaign")
    public JAXBElement<FindNotesByCampaign> createFindNotesByCampaign(FindNotesByCampaign value) {
        return new JAXBElement<FindNotesByCampaign>(_FindNotesByCampaign_QNAME, FindNotesByCampaign.class, null, value);
    }

}
