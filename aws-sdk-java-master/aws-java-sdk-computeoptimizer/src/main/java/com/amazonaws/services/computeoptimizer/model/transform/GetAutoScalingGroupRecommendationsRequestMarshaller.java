/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetAutoScalingGroupRecommendationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetAutoScalingGroupRecommendationsRequestMarshaller {

    private static final MarshallingInfo<List> ACCOUNTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountIds").build();
    private static final MarshallingInfo<List> AUTOSCALINGGROUPARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingGroupArns").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<List> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filters").build();
    private static final MarshallingInfo<StructuredPojo> RECOMMENDATIONPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationPreferences").build();

    private static final GetAutoScalingGroupRecommendationsRequestMarshaller instance = new GetAutoScalingGroupRecommendationsRequestMarshaller();

    public static GetAutoScalingGroupRecommendationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getAutoScalingGroupRecommendationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getAutoScalingGroupRecommendationsRequest.getAccountIds(), ACCOUNTIDS_BINDING);
            protocolMarshaller.marshall(getAutoScalingGroupRecommendationsRequest.getAutoScalingGroupArns(), AUTOSCALINGGROUPARNS_BINDING);
            protocolMarshaller.marshall(getAutoScalingGroupRecommendationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getAutoScalingGroupRecommendationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getAutoScalingGroupRecommendationsRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(getAutoScalingGroupRecommendationsRequest.getRecommendationPreferences(), RECOMMENDATIONPREFERENCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}