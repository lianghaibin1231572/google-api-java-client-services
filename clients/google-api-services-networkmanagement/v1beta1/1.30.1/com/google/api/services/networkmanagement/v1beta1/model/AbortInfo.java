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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * Details of the final state "abort" and associated resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AbortInfo extends com.google.api.client.json.GenericJson {

  /**
   * Causes that the analysis is aborted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cause;

  /**
   * URI of the resource that caused the abort.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUri;

  /**
   * Causes that the analysis is aborted.
   * @return value or {@code null} for none
   */
  public java.lang.String getCause() {
    return cause;
  }

  /**
   * Causes that the analysis is aborted.
   * @param cause cause or {@code null} for none
   */
  public AbortInfo setCause(java.lang.String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * URI of the resource that caused the abort.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUri() {
    return resourceUri;
  }

  /**
   * URI of the resource that caused the abort.
   * @param resourceUri resourceUri or {@code null} for none
   */
  public AbortInfo setResourceUri(java.lang.String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  @Override
  public AbortInfo set(String fieldName, Object value) {
    return (AbortInfo) super.set(fieldName, value);
  }

  @Override
  public AbortInfo clone() {
    return (AbortInfo) super.clone();
  }

}