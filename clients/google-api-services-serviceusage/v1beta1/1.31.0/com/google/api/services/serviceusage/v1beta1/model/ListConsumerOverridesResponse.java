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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * Response message for ListConsumerOverrides.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListConsumerOverridesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token identifying which result to start with; returned by a previous list call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Consumer overrides on this limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QuotaOverride> overrides;

  /**
   * Token identifying which result to start with; returned by a previous list call.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token identifying which result to start with; returned by a previous list call.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListConsumerOverridesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Consumer overrides on this limit.
   * @return value or {@code null} for none
   */
  public java.util.List<QuotaOverride> getOverrides() {
    return overrides;
  }

  /**
   * Consumer overrides on this limit.
   * @param overrides overrides or {@code null} for none
   */
  public ListConsumerOverridesResponse setOverrides(java.util.List<QuotaOverride> overrides) {
    this.overrides = overrides;
    return this;
  }

  @Override
  public ListConsumerOverridesResponse set(String fieldName, Object value) {
    return (ListConsumerOverridesResponse) super.set(fieldName, value);
  }

  @Override
  public ListConsumerOverridesResponse clone() {
    return (ListConsumerOverridesResponse) super.clone();
  }

}
