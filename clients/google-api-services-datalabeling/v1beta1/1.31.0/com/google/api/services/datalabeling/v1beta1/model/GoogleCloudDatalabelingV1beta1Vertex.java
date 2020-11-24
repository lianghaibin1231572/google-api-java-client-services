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
 * A vertex represents a 2D point in the image. NOTE: the vertex coordinates are in the same scale
 * as the original image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1Vertex extends com.google.api.client.json.GenericJson {

  /**
   * X coordinate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer x;

  /**
   * Y coordinate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer y;

  /**
   * X coordinate.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getX() {
    return x;
  }

  /**
   * X coordinate.
   * @param x x or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Vertex setX(java.lang.Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Y coordinate.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getY() {
    return y;
  }

  /**
   * Y coordinate.
   * @param y y or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1Vertex setY(java.lang.Integer y) {
    this.y = y;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Vertex set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1Vertex) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1Vertex clone() {
    return (GoogleCloudDatalabelingV1beta1Vertex) super.clone();
  }

}
