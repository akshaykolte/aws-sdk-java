/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ResetDBParameterGroupRequest Marshaller
 */

public class ResetDBParameterGroupRequestMarshaller
        implements
        Marshaller<Request<ResetDBParameterGroupRequest>, ResetDBParameterGroupRequest> {

    public Request<ResetDBParameterGroupRequest> marshall(
            ResetDBParameterGroupRequest resetDBParameterGroupRequest) {

        if (resetDBParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ResetDBParameterGroupRequest> request = new DefaultRequest<ResetDBParameterGroupRequest>(
                resetDBParameterGroupRequest, "AmazonRDS");
        request.addParameter("Action", "ResetDBParameterGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (resetDBParameterGroupRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils
                    .fromString(resetDBParameterGroupRequest
                            .getDBParameterGroupName()));
        }

        if (resetDBParameterGroupRequest.getResetAllParameters() != null) {
            request.addParameter("ResetAllParameters", StringUtils
                    .fromBoolean(resetDBParameterGroupRequest
                            .getResetAllParameters()));
        }

        com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) resetDBParameterGroupRequest
                .getParameters();
        if (!parametersList.isEmpty() || !parametersList.isAutoConstruct()) {
            int parametersListIndex = 1;

            for (Parameter parametersListValue : parametersList) {

                if (parametersListValue.getParameterName() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".ParameterName",
                            StringUtils.fromString(parametersListValue
                                    .getParameterName()));
                }

                if (parametersListValue.getParameterValue() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".ParameterValue",
                            StringUtils.fromString(parametersListValue
                                    .getParameterValue()));
                }

                if (parametersListValue.getDescription() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".Description", StringUtils
                            .fromString(parametersListValue.getDescription()));
                }

                if (parametersListValue.getSource() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".Source", StringUtils
                            .fromString(parametersListValue.getSource()));
                }

                if (parametersListValue.getApplyType() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".ApplyType", StringUtils
                            .fromString(parametersListValue.getApplyType()));
                }

                if (parametersListValue.getDataType() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".DataType", StringUtils
                            .fromString(parametersListValue.getDataType()));
                }

                if (parametersListValue.getAllowedValues() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".AllowedValues",
                            StringUtils.fromString(parametersListValue
                                    .getAllowedValues()));
                }

                if (parametersListValue.getIsModifiable() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".IsModifiable",
                            StringUtils.fromBoolean(parametersListValue
                                    .getIsModifiable()));
                }

                if (parametersListValue.getMinimumEngineVersion() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".MinimumEngineVersion",
                            StringUtils.fromString(parametersListValue
                                    .getMinimumEngineVersion()));
                }

                if (parametersListValue.getApplyMethod() != null) {
                    request.addParameter("Parameters.Parameter."
                            + parametersListIndex + ".ApplyMethod", StringUtils
                            .fromString(parametersListValue.getApplyMethod()));
                }
                parametersListIndex++;
            }
        }

        return request;
    }

}
