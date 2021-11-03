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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecoveryGroupReadinessSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** A token that can be used to resume pagination from the end of the collection. */
    private String nextToken;
    /** The readiness at RecoveryGroup level. */
    private String readiness;
    /** Summaries for the ReadinessChecks making up the RecoveryGroup */
    private java.util.List<ReadinessCheckSummary> readinessChecks;

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @return A token that can be used to resume pagination from the end of the collection.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupReadinessSummaryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The readiness at RecoveryGroup level.
     * 
     * @param readiness
     *        The readiness at RecoveryGroup level.
     * @see Readiness
     */

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

    /**
     * The readiness at RecoveryGroup level.
     * 
     * @return The readiness at RecoveryGroup level.
     * @see Readiness
     */

    public String getReadiness() {
        return this.readiness;
    }

    /**
     * The readiness at RecoveryGroup level.
     * 
     * @param readiness
     *        The readiness at RecoveryGroup level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public GetRecoveryGroupReadinessSummaryResult withReadiness(String readiness) {
        setReadiness(readiness);
        return this;
    }

    /**
     * The readiness at RecoveryGroup level.
     * 
     * @param readiness
     *        The readiness at RecoveryGroup level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public GetRecoveryGroupReadinessSummaryResult withReadiness(Readiness readiness) {
        this.readiness = readiness.toString();
        return this;
    }

    /**
     * Summaries for the ReadinessChecks making up the RecoveryGroup
     * 
     * @return Summaries for the ReadinessChecks making up the RecoveryGroup
     */

    public java.util.List<ReadinessCheckSummary> getReadinessChecks() {
        return readinessChecks;
    }

    /**
     * Summaries for the ReadinessChecks making up the RecoveryGroup
     * 
     * @param readinessChecks
     *        Summaries for the ReadinessChecks making up the RecoveryGroup
     */

    public void setReadinessChecks(java.util.Collection<ReadinessCheckSummary> readinessChecks) {
        if (readinessChecks == null) {
            this.readinessChecks = null;
            return;
        }

        this.readinessChecks = new java.util.ArrayList<ReadinessCheckSummary>(readinessChecks);
    }

    /**
     * Summaries for the ReadinessChecks making up the RecoveryGroup
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadinessChecks(java.util.Collection)} or {@link #withReadinessChecks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param readinessChecks
     *        Summaries for the ReadinessChecks making up the RecoveryGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupReadinessSummaryResult withReadinessChecks(ReadinessCheckSummary... readinessChecks) {
        if (this.readinessChecks == null) {
            setReadinessChecks(new java.util.ArrayList<ReadinessCheckSummary>(readinessChecks.length));
        }
        for (ReadinessCheckSummary ele : readinessChecks) {
            this.readinessChecks.add(ele);
        }
        return this;
    }

    /**
     * Summaries for the ReadinessChecks making up the RecoveryGroup
     * 
     * @param readinessChecks
     *        Summaries for the ReadinessChecks making up the RecoveryGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupReadinessSummaryResult withReadinessChecks(java.util.Collection<ReadinessCheckSummary> readinessChecks) {
        setReadinessChecks(readinessChecks);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReadiness() != null)
            sb.append("Readiness: ").append(getReadiness()).append(",");
        if (getReadinessChecks() != null)
            sb.append("ReadinessChecks: ").append(getReadinessChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecoveryGroupReadinessSummaryResult == false)
            return false;
        GetRecoveryGroupReadinessSummaryResult other = (GetRecoveryGroupReadinessSummaryResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReadiness() == null ^ this.getReadiness() == null)
            return false;
        if (other.getReadiness() != null && other.getReadiness().equals(this.getReadiness()) == false)
            return false;
        if (other.getReadinessChecks() == null ^ this.getReadinessChecks() == null)
            return false;
        if (other.getReadinessChecks() != null && other.getReadinessChecks().equals(this.getReadinessChecks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReadiness() == null) ? 0 : getReadiness().hashCode());
        hashCode = prime * hashCode + ((getReadinessChecks() == null) ? 0 : getReadinessChecks().hashCode());
        return hashCode;
    }

    @Override
    public GetRecoveryGroupReadinessSummaryResult clone() {
        try {
            return (GetRecoveryGroupReadinessSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}