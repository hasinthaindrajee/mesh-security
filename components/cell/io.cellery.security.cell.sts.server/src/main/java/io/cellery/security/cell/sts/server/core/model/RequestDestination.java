/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package io.cellery.security.cell.sts.server.core.model;

import io.cellery.security.cell.sts.server.core.CellStsUtils;

import java.util.HashMap;
import java.util.Map;

public class RequestDestination {

    private String cellName;
    private String workload;
    private boolean isExternalToCellery;

    private RequestDestination() {
    }

    public String getCellName() {
        return cellName;
    }

    public String getWorkload() {
        return workload;
    }

    public boolean isExternalToCellery() {
        return isExternalToCellery;
    }

    @Override
    public String toString() {
        Map<String, String> configJson = new HashMap<>();
        configJson.put("Cell Name", cellName);
        configJson.put("Workload", workload);

        return CellStsUtils.getPrettyPrintJson(configJson);
    }

    public static class RequestDestinationBuilder {
        private String cellName;
        private String workload;
        private boolean isExternalToCellery;

        public RequestDestinationBuilder setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }

        public RequestDestinationBuilder setWorkload(String workload) {
            this.workload = workload;
            return this;
        }

        public RequestDestinationBuilder setExternalToCellery(boolean externalToCellery) {
            isExternalToCellery = externalToCellery;
            return this;
        }

        public RequestDestination build() {
            RequestDestination destination = new RequestDestination();
            destination.cellName = cellName;
            destination.workload = workload;
            destination.isExternalToCellery = isExternalToCellery;

            return destination;
        }
    }
}
