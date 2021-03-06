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

package com.google.api.services.realtimebidding.v1.model;

/**
 * A request to stop targeting the provided apps in a specific pretargeting configuration. The
 * pretargeting configuration itself specifies how these apps are targeted. in
 * PretargetingConfig.appTargeting.mobileAppTargeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RemoveTargetedAppsRequest extends com.google.api.client.json.GenericJson {

  /**
   * A list of app IDs to stop targeting in the pretargeting configuration. These values will be
   * removed from the list of targeted app IDs in
   * PretargetingConfig.appTargeting.mobileAppTargeting.values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> appIds;

  /**
   * A list of app IDs to stop targeting in the pretargeting configuration. These values will be
   * removed from the list of targeted app IDs in
   * PretargetingConfig.appTargeting.mobileAppTargeting.values.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAppIds() {
    return appIds;
  }

  /**
   * A list of app IDs to stop targeting in the pretargeting configuration. These values will be
   * removed from the list of targeted app IDs in
   * PretargetingConfig.appTargeting.mobileAppTargeting.values.
   * @param appIds appIds or {@code null} for none
   */
  public RemoveTargetedAppsRequest setAppIds(java.util.List<java.lang.String> appIds) {
    this.appIds = appIds;
    return this;
  }

  @Override
  public RemoveTargetedAppsRequest set(String fieldName, Object value) {
    return (RemoveTargetedAppsRequest) super.set(fieldName, value);
  }

  @Override
  public RemoveTargetedAppsRequest clone() {
    return (RemoveTargetedAppsRequest) super.clone();
  }

}
