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

package com.google.api.services.documentai.v1beta3.model;

/**
 * The status of a each individual document in the batch process.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus extends com.google.api.client.json.GenericJson {

  /**
   * The name of the operation triggered by the processed document. If the human review process is
   * not triggered, this field will be empty. It has the same response type and metadata as the long
   * running operation returned by ReviewDocument method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String humanReviewOperation;

  /**
   * The source of the document, same as the [input_gcs_source] field in the request when the batch
   * process started. The batch process is started by take snapshot of that document, since a user
   * can move or change that document during the process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputGcsSource;

  /**
   * The output_gcs_destination (in the request as 'output_gcs_destination') of the processed
   * document if it was successful, otherwise empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputGcsDestination;

  /**
   * The status of the processing of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * The name of the operation triggered by the processed document. If the human review process is
   * not triggered, this field will be empty. It has the same response type and metadata as the long
   * running operation returned by ReviewDocument method.
   * @return value or {@code null} for none
   */
  public java.lang.String getHumanReviewOperation() {
    return humanReviewOperation;
  }

  /**
   * The name of the operation triggered by the processed document. If the human review process is
   * not triggered, this field will be empty. It has the same response type and metadata as the long
   * running operation returned by ReviewDocument method.
   * @param humanReviewOperation humanReviewOperation or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus setHumanReviewOperation(java.lang.String humanReviewOperation) {
    this.humanReviewOperation = humanReviewOperation;
    return this;
  }

  /**
   * The source of the document, same as the [input_gcs_source] field in the request when the batch
   * process started. The batch process is started by take snapshot of that document, since a user
   * can move or change that document during the process.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputGcsSource() {
    return inputGcsSource;
  }

  /**
   * The source of the document, same as the [input_gcs_source] field in the request when the batch
   * process started. The batch process is started by take snapshot of that document, since a user
   * can move or change that document during the process.
   * @param inputGcsSource inputGcsSource or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus setInputGcsSource(java.lang.String inputGcsSource) {
    this.inputGcsSource = inputGcsSource;
    return this;
  }

  /**
   * The output_gcs_destination (in the request as 'output_gcs_destination') of the processed
   * document if it was successful, otherwise empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputGcsDestination() {
    return outputGcsDestination;
  }

  /**
   * The output_gcs_destination (in the request as 'output_gcs_destination') of the processed
   * document if it was successful, otherwise empty.
   * @param outputGcsDestination outputGcsDestination or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus setOutputGcsDestination(java.lang.String outputGcsDestination) {
    this.outputGcsDestination = outputGcsDestination;
    return this;
  }

  /**
   * The status of the processing of the document.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * The status of the processing of the document.
   * @param status status or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus clone() {
    return (GoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus) super.clone();
  }

}
