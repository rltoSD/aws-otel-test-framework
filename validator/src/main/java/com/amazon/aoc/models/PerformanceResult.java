/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.aoc.models;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class PerformanceResult implements Serializable {
  @NonNull private String testcase;
  @NonNull private String instanceType;
  @NonNull private String[] receivers;
  @NonNull private String[] processors;
  @NonNull private String[] exporters;

  @NonNull private String dataType;
  @NonNull private String dataMode;
  @NonNull private Integer dataRate;

  // Calculated average statistics
  @NonNull private Double avgCpu;
  @NonNull private Double avgMem;

  // Max statistics
  @NonNull private Double maxCpu;
  @NonNull private Double maxMem;

  // Metadata
  @NonNull private String commitId;
  @NonNull private Integer collectionPeriod;
  @NonNull private String testingAmi;
}
