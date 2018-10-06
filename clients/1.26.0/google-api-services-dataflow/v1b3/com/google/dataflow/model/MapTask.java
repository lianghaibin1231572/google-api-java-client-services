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

package com.google.dataflow.model;

/**
 * MapTask consists of an ordered set of instructions, each of which describes one particular low-
 * level operation for the worker to perform in order to accomplish the MapTask's WorkItem.
 *
 * Each instruction must appear in the list before any instructions which depends on its output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MapTask extends com.google.api.client.json.GenericJson {

  /**
   * Counter prefix that can be used to prefix counters. Not currently used in Dataflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String counterPrefix;

  /**
   * The instructions in the MapTask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ParallelInstruction> instructions;

  static {
    // hack to force ProGuard to consider ParallelInstruction used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ParallelInstruction.class);
  }

  /**
   * System-defined name of the stage containing this MapTask. Unique across the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stageName;

  /**
   * System-defined name of this MapTask. Unique across the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String systemName;

  /**
   * Counter prefix that can be used to prefix counters. Not currently used in Dataflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getCounterPrefix() {
    return counterPrefix;
  }

  /**
   * Counter prefix that can be used to prefix counters. Not currently used in Dataflow.
   * @param counterPrefix counterPrefix or {@code null} for none
   */
  public MapTask setCounterPrefix(java.lang.String counterPrefix) {
    this.counterPrefix = counterPrefix;
    return this;
  }

  /**
   * The instructions in the MapTask.
   * @return value or {@code null} for none
   */
  public java.util.List<ParallelInstruction> getInstructions() {
    return instructions;
  }

  /**
   * The instructions in the MapTask.
   * @param instructions instructions or {@code null} for none
   */
  public MapTask setInstructions(java.util.List<ParallelInstruction> instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * System-defined name of the stage containing this MapTask. Unique across the workflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getStageName() {
    return stageName;
  }

  /**
   * System-defined name of the stage containing this MapTask. Unique across the workflow.
   * @param stageName stageName or {@code null} for none
   */
  public MapTask setStageName(java.lang.String stageName) {
    this.stageName = stageName;
    return this;
  }

  /**
   * System-defined name of this MapTask. Unique across the workflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getSystemName() {
    return systemName;
  }

  /**
   * System-defined name of this MapTask. Unique across the workflow.
   * @param systemName systemName or {@code null} for none
   */
  public MapTask setSystemName(java.lang.String systemName) {
    this.systemName = systemName;
    return this;
  }

  @Override
  public MapTask set(String fieldName, Object value) {
    return (MapTask) super.set(fieldName, value);
  }

  @Override
  public MapTask clone() {
    return (MapTask) super.clone();
  }

}
