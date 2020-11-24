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

package com.google.api.services.pubsub.model;

/**
 * Request for the ModifyPushConfig method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyPushConfigRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The push configuration for future deliveries. An empty `pushConfig` indicates that
   * the Pub/Sub system should stop pushing messages from the given subscription and allow messages
   * to be pulled and acknowledged - effectively pausing the subscription if `Pull` or
   * `StreamingPull` is not called.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PushConfig pushConfig;

  /**
   * Required. The push configuration for future deliveries. An empty `pushConfig` indicates that
   * the Pub/Sub system should stop pushing messages from the given subscription and allow messages
   * to be pulled and acknowledged - effectively pausing the subscription if `Pull` or
   * `StreamingPull` is not called.
   * @return value or {@code null} for none
   */
  public PushConfig getPushConfig() {
    return pushConfig;
  }

  /**
   * Required. The push configuration for future deliveries. An empty `pushConfig` indicates that
   * the Pub/Sub system should stop pushing messages from the given subscription and allow messages
   * to be pulled and acknowledged - effectively pausing the subscription if `Pull` or
   * `StreamingPull` is not called.
   * @param pushConfig pushConfig or {@code null} for none
   */
  public ModifyPushConfigRequest setPushConfig(PushConfig pushConfig) {
    this.pushConfig = pushConfig;
    return this;
  }

  @Override
  public ModifyPushConfigRequest set(String fieldName, Object value) {
    return (ModifyPushConfigRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyPushConfigRequest clone() {
    return (ModifyPushConfigRequest) super.clone();
  }

}
