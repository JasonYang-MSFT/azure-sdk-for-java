/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.store.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of the request or operation.
 */
public class FileOperationResult {
    /**
     * Gets the result of the operation or request.
     */
    @JsonProperty(value = "boolean", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean operationResult;

    /**
     * Get the operationResult value.
     *
     * @return the operationResult value
     */
    public Boolean getOperationResult() {
        return this.operationResult;
    }

}