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
 * Export folder destination of the data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1p1alpha1GcsFolderDestination extends com.google.api.client.json.GenericJson {

  /**
   * Required. Cloud Storage directory to export data to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputFolderUri;

  /**
   * Required. Cloud Storage directory to export data to.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputFolderUri() {
    return outputFolderUri;
  }

  /**
   * Required. Cloud Storage directory to export data to.
   * @param outputFolderUri outputFolderUri or {@code null} for none
   */
  public GoogleCloudDatalabelingV1p1alpha1GcsFolderDestination setOutputFolderUri(java.lang.String outputFolderUri) {
    this.outputFolderUri = outputFolderUri;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1p1alpha1GcsFolderDestination set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1p1alpha1GcsFolderDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1p1alpha1GcsFolderDestination clone() {
    return (GoogleCloudDatalabelingV1p1alpha1GcsFolderDestination) super.clone();
  }

}
