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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListResponseHeadersPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResponseHeadersPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of response headers policies.
     * </p>
     */
    private ResponseHeadersPolicyList responseHeadersPolicyList;

    /**
     * <p>
     * A list of response headers policies.
     * </p>
     * 
     * @param responseHeadersPolicyList
     *        A list of response headers policies.
     */

    public void setResponseHeadersPolicyList(ResponseHeadersPolicyList responseHeadersPolicyList) {
        this.responseHeadersPolicyList = responseHeadersPolicyList;
    }

    /**
     * <p>
     * A list of response headers policies.
     * </p>
     * 
     * @return A list of response headers policies.
     */

    public ResponseHeadersPolicyList getResponseHeadersPolicyList() {
        return this.responseHeadersPolicyList;
    }

    /**
     * <p>
     * A list of response headers policies.
     * </p>
     * 
     * @param responseHeadersPolicyList
     *        A list of response headers policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResponseHeadersPoliciesResult withResponseHeadersPolicyList(ResponseHeadersPolicyList responseHeadersPolicyList) {
        setResponseHeadersPolicyList(responseHeadersPolicyList);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResponseHeadersPolicyList() != null)
            sb.append("ResponseHeadersPolicyList: ").append(getResponseHeadersPolicyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResponseHeadersPoliciesResult == false)
            return false;
        ListResponseHeadersPoliciesResult other = (ListResponseHeadersPoliciesResult) obj;
        if (other.getResponseHeadersPolicyList() == null ^ this.getResponseHeadersPolicyList() == null)
            return false;
        if (other.getResponseHeadersPolicyList() != null && other.getResponseHeadersPolicyList().equals(this.getResponseHeadersPolicyList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseHeadersPolicyList() == null) ? 0 : getResponseHeadersPolicyList().hashCode());
        return hashCode;
    }

    @Override
    public ListResponseHeadersPoliciesResult clone() {
        try {
            return (ListResponseHeadersPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}