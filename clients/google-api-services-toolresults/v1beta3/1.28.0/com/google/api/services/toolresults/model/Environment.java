/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.toolresults.model;

/**
 * An Environment represents the set of test runs (Steps) from the parent Execution that are
 * configured with the same set of dimensions (Model, Version, Locale, and Orientation). Multiple
 * such runs occur particularly because of features like sharding (splitting up a test suite to run
 * in parallel across devices) and reruns (running a test multiple times to check for different
 * outcomes).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Environment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the Environment status was set to complete.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Timestamp completionTime;

  /**
   * Output only. The time when the Environment was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Timestamp creationTime;

  /**
   * Dimension values describing the environment. Dimension values always consist of "Model",
   * "Version", "Locale", and "Orientation".
   *
   * - In response: always set - In create request: always set - In update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnvironmentDimensionValueEntry> dimensionValue;

  /**
   * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Nexus
   * 5, API 27.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. An Environment id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environmentId;

  /**
   * Merged result of the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MergedResult environmentResult;

  /**
   * Output only. An Execution id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionId;

  /**
   * Output only. A History id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String historyId;

  /**
   * Output only. A Project id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The location where output files are stored in the user bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResultsStorage resultsStorage;

  /**
   * Output only. Summaries of shards.
   *
   * Only one shard will present unless sharding feature is enabled in TestExecutionService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ShardSummary> shardSummaries;

  /**
   * Output only. The time when the Environment status was set to complete.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   * @return value or {@code null} for none
   */
  public Timestamp getCompletionTime() {
    return completionTime;
  }

  /**
   * Output only. The time when the Environment status was set to complete.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   * @param completionTime completionTime or {@code null} for none
   */
  public Environment setCompletionTime(Timestamp completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * Output only. The time when the Environment was created.
   * @return value or {@code null} for none
   */
  public Timestamp getCreationTime() {
    return creationTime;
  }

  /**
   * Output only. The time when the Environment was created.
   * @param creationTime creationTime or {@code null} for none
   */
  public Environment setCreationTime(Timestamp creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Dimension values describing the environment. Dimension values always consist of "Model",
   * "Version", "Locale", and "Orientation".
   *
   * - In response: always set - In create request: always set - In update request: never set
   * @return value or {@code null} for none
   */
  public java.util.List<EnvironmentDimensionValueEntry> getDimensionValue() {
    return dimensionValue;
  }

  /**
   * Dimension values describing the environment. Dimension values always consist of "Model",
   * "Version", "Locale", and "Orientation".
   *
   * - In response: always set - In create request: always set - In update request: never set
   * @param dimensionValue dimensionValue or {@code null} for none
   */
  public Environment setDimensionValue(java.util.List<EnvironmentDimensionValueEntry> dimensionValue) {
    this.dimensionValue = dimensionValue;
    return this;
  }

  /**
   * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Nexus
   * 5, API 27.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Nexus
   * 5, API 27.
   * @param displayName displayName or {@code null} for none
   */
  public Environment setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. An Environment id.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironmentId() {
    return environmentId;
  }

  /**
   * Output only. An Environment id.
   * @param environmentId environmentId or {@code null} for none
   */
  public Environment setEnvironmentId(java.lang.String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * Merged result of the environment.
   * @return value or {@code null} for none
   */
  public MergedResult getEnvironmentResult() {
    return environmentResult;
  }

  /**
   * Merged result of the environment.
   * @param environmentResult environmentResult or {@code null} for none
   */
  public Environment setEnvironmentResult(MergedResult environmentResult) {
    this.environmentResult = environmentResult;
    return this;
  }

  /**
   * Output only. An Execution id.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionId() {
    return executionId;
  }

  /**
   * Output only. An Execution id.
   * @param executionId executionId or {@code null} for none
   */
  public Environment setExecutionId(java.lang.String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Output only. A History id.
   * @return value or {@code null} for none
   */
  public java.lang.String getHistoryId() {
    return historyId;
  }

  /**
   * Output only. A History id.
   * @param historyId historyId or {@code null} for none
   */
  public Environment setHistoryId(java.lang.String historyId) {
    this.historyId = historyId;
    return this;
  }

  /**
   * Output only. A Project id.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Output only. A Project id.
   * @param projectId projectId or {@code null} for none
   */
  public Environment setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The location where output files are stored in the user bucket.
   * @return value or {@code null} for none
   */
  public ResultsStorage getResultsStorage() {
    return resultsStorage;
  }

  /**
   * The location where output files are stored in the user bucket.
   * @param resultsStorage resultsStorage or {@code null} for none
   */
  public Environment setResultsStorage(ResultsStorage resultsStorage) {
    this.resultsStorage = resultsStorage;
    return this;
  }

  /**
   * Output only. Summaries of shards.
   *
   * Only one shard will present unless sharding feature is enabled in TestExecutionService.
   * @return value or {@code null} for none
   */
  public java.util.List<ShardSummary> getShardSummaries() {
    return shardSummaries;
  }

  /**
   * Output only. Summaries of shards.
   *
   * Only one shard will present unless sharding feature is enabled in TestExecutionService.
   * @param shardSummaries shardSummaries or {@code null} for none
   */
  public Environment setShardSummaries(java.util.List<ShardSummary> shardSummaries) {
    this.shardSummaries = shardSummaries;
    return this;
  }

  @Override
  public Environment set(String fieldName, Object value) {
    return (Environment) super.set(fieldName, value);
  }

  @Override
  public Environment clone() {
    return (Environment) super.clone();
  }

}