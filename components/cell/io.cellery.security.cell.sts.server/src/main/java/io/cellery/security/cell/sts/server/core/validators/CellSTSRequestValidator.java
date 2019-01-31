/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package io.cellery.security.cell.sts.server.core.validators;

import io.cellery.security.cell.sts.server.core.exception.CellSTSRequestValidationFailedException;
import io.cellery.security.cell.sts.server.core.model.CellStsRequest;

/**
 * Used to validate incoming STS request
 */
public interface CellSTSRequestValidator {

    /**
     * Validate the incoming request.
     * @param cellStsRequest Incoming request towards cell STS.
     * @throws CellSTSRequestValidationFailedException CellSTSRequestValidationFailedException.
     */
    public void validate(CellStsRequest cellStsRequest) throws CellSTSRequestValidationFailedException;

    /**
     * Checks whether the incoming request needs to be authenticated.
     * @param cellStsRequest Incoming Cell STS request.
     * @return Whether the incoming request needs to be authenticated or not.
     * @throws CellSTSRequestValidationFailedException CellSTSRequestValidationFailedException.
     */
    public boolean isAuthenticationRequired (CellStsRequest cellStsRequest) throws
            CellSTSRequestValidationFailedException;

}
