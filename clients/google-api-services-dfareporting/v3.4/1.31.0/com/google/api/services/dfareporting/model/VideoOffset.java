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

package com.google.api.services.dfareporting.model;

/**
 * Video Offset
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoOffset extends com.google.api.client.json.GenericJson {

  /**
   * Duration, as a percentage of video duration. Do not set when offsetSeconds is set. Acceptable
   * values are 0 to 100, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer offsetPercentage;

  /**
   * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable values are 0 to
   * 86399, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer offsetSeconds;

  /**
   * Duration, as a percentage of video duration. Do not set when offsetSeconds is set. Acceptable
   * values are 0 to 100, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffsetPercentage() {
    return offsetPercentage;
  }

  /**
   * Duration, as a percentage of video duration. Do not set when offsetSeconds is set. Acceptable
   * values are 0 to 100, inclusive.
   * @param offsetPercentage offsetPercentage or {@code null} for none
   */
  public VideoOffset setOffsetPercentage(java.lang.Integer offsetPercentage) {
    this.offsetPercentage = offsetPercentage;
    return this;
  }

  /**
   * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable values are 0 to
   * 86399, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffsetSeconds() {
    return offsetSeconds;
  }

  /**
   * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable values are 0 to
   * 86399, inclusive.
   * @param offsetSeconds offsetSeconds or {@code null} for none
   */
  public VideoOffset setOffsetSeconds(java.lang.Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
    return this;
  }

  @Override
  public VideoOffset set(String fieldName, Object value) {
    return (VideoOffset) super.set(fieldName, value);
  }

  @Override
  public VideoOffset clone() {
    return (VideoOffset) super.clone();
  }

}
