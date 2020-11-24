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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * Metadata of a CreateInstruction operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when create instruction request was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The name of the created Instruction. projects/{project_id}/instructions/{instruction_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instruction;

  /**
   * Partial failures encountered. E.g. single files that couldn't be read. Status details field
   * will contain standard GCP error details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> partialFailures;

  /**
   * Timestamp when create instruction request was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Timestamp when create instruction request was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The name of the created Instruction. projects/{project_id}/instructions/{instruction_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getInstruction() {
    return instruction;
  }

  /**
   * The name of the created Instruction. projects/{project_id}/instructions/{instruction_id}
   * @param instruction instruction or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata setInstruction(java.lang.String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Partial failures encountered. E.g. single files that couldn't be read. Status details field
   * will contain standard GCP error details.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getPartialFailures() {
    return partialFailures;
  }

  /**
   * Partial failures encountered. E.g. single files that couldn't be read. Status details field
   * will contain standard GCP error details.
   * @param partialFailures partialFailures or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata setPartialFailures(java.util.List<GoogleRpcStatus> partialFailures) {
    this.partialFailures = partialFailures;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata clone() {
    return (GoogleCloudDatalabelingV1p1alpha1CreateInstructionMetadata) super.clone();
  }

}
