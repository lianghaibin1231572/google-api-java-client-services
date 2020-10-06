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
 * Representation for transformation matrix, intended to be compatible and used with OpenCV format
 * for image manipulation.
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
public final class GoogleCloudDocumentaiV1beta1DocumentPageMatrix extends com.google.api.client.json.GenericJson {

  /**
   * Number of columns in the matrix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cols;

  /**
   * The matrix data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * Number of rows in the matrix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rows;

  /**
   * This encodes information about what data type the matrix uses. For example, 0 (CV_8U) is an
   * unsigned 8-bit image. For the full list of OpenCV primitive data types, please refer to
   * https://docs.opencv.org/4.3.0/d1/d1b/group__core__hal__interface.html
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer type;

  /**
   * Number of columns in the matrix.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCols() {
    return cols;
  }

  /**
   * Number of columns in the matrix.
   * @param cols cols or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix setCols(java.lang.Integer cols) {
    this.cols = cols;
    return this;
  }

  /**
   * The matrix data.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The matrix data.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * The matrix data.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The matrix data.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * Number of rows in the matrix.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRows() {
    return rows;
  }

  /**
   * Number of rows in the matrix.
   * @param rows rows or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix setRows(java.lang.Integer rows) {
    this.rows = rows;
    return this;
  }

  /**
   * This encodes information about what data type the matrix uses. For example, 0 (CV_8U) is an
   * unsigned 8-bit image. For the full list of OpenCV primitive data types, please refer to
   * https://docs.opencv.org/4.3.0/d1/d1b/group__core__hal__interface.html
   * @return value or {@code null} for none
   */
  public java.lang.Integer getType() {
    return type;
  }

  /**
   * This encodes information about what data type the matrix uses. For example, 0 (CV_8U) is an
   * unsigned 8-bit image. For the full list of OpenCV primitive data types, please refer to
   * https://docs.opencv.org/4.3.0/d1/d1b/group__core__hal__interface.html
   * @param type type or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix setType(java.lang.Integer type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta1DocumentPageMatrix) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentPageMatrix clone() {
    return (GoogleCloudDocumentaiV1beta1DocumentPageMatrix) super.clone();
  }

}
