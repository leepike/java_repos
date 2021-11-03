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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWirelessGatewayTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the WirelessGatewayTaskDefinition.
     * </p>
     */
    private String wirelessGatewayTaskDefinitionId;

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @return The ID of the resource to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessGatewayTaskRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the WirelessGatewayTaskDefinition.
     * </p>
     * 
     * @param wirelessGatewayTaskDefinitionId
     *        The ID of the WirelessGatewayTaskDefinition.
     */

    public void setWirelessGatewayTaskDefinitionId(String wirelessGatewayTaskDefinitionId) {
        this.wirelessGatewayTaskDefinitionId = wirelessGatewayTaskDefinitionId;
    }

    /**
     * <p>
     * The ID of the WirelessGatewayTaskDefinition.
     * </p>
     * 
     * @return The ID of the WirelessGatewayTaskDefinition.
     */

    public String getWirelessGatewayTaskDefinitionId() {
        return this.wirelessGatewayTaskDefinitionId;
    }

    /**
     * <p>
     * The ID of the WirelessGatewayTaskDefinition.
     * </p>
     * 
     * @param wirelessGatewayTaskDefinitionId
     *        The ID of the WirelessGatewayTaskDefinition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessGatewayTaskRequest withWirelessGatewayTaskDefinitionId(String wirelessGatewayTaskDefinitionId) {
        setWirelessGatewayTaskDefinitionId(wirelessGatewayTaskDefinitionId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getWirelessGatewayTaskDefinitionId() != null)
            sb.append("WirelessGatewayTaskDefinitionId: ").append(getWirelessGatewayTaskDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWirelessGatewayTaskRequest == false)
            return false;
        CreateWirelessGatewayTaskRequest other = (CreateWirelessGatewayTaskRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getWirelessGatewayTaskDefinitionId() == null ^ this.getWirelessGatewayTaskDefinitionId() == null)
            return false;
        if (other.getWirelessGatewayTaskDefinitionId() != null
                && other.getWirelessGatewayTaskDefinitionId().equals(this.getWirelessGatewayTaskDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getWirelessGatewayTaskDefinitionId() == null) ? 0 : getWirelessGatewayTaskDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWirelessGatewayTaskRequest clone() {
        return (CreateWirelessGatewayTaskRequest) super.clone();
    }

}