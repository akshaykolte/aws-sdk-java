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
package com.amazonaws.services.simpleemail.model;

/**
 * <p>
 * Indicates that the provided AWS Lambda function is invalid, or that Amazon
 * SES could not execute the provided function, possibly due to permissions
 * issues. For information about giving permissions, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class InvalidLambdaFunctionException
        extends
        com.amazonaws.services.simpleemail.model.AmazonSimpleEmailServiceException {
    private static final long serialVersionUID = 1L;

    private String functionArn;

    /**
     * Constructs a new InvalidLambdaFunctionException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidLambdaFunctionException(String message) {
        super(message);
    }

    /**
     * @param functionArn
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * @return
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * @param functionArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidLambdaFunctionException withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

}
