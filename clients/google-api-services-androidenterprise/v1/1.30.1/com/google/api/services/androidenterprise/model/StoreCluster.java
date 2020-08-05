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

package com.google.api.services.androidenterprise.model;

/**
 * Definition of a managed Google Play store cluster, a list of products displayed as part of a
 * store page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StoreCluster extends com.google.api.client.json.GenericJson {

  /**
   * Unique ID of this cluster. Assigned by the server. Immutable once assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Ordered list of localized strings giving the name of this page. The text displayed is the one
   * that best matches the user locale, or the first entry if there is no good match. There needs to
   * be at least one entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocalizedText> name;

  static {
    // hack to force ProGuard to consider LocalizedText used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LocalizedText.class);
  }

  /**
   * String (US-ASCII only) used to determine order of this cluster within the parent page's
   * elements. Page elements are sorted in lexicographic order of this field. Duplicated values are
   * allowed, but ordering between elements with duplicate order is undefined. The value of this
   * field is never visible to a user, it is used solely for the purpose of defining an ordering.
   * Maximum length is 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderInPage;

  /**
   * List of products in the order they are displayed in the cluster. There should not be duplicates
   * within a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productId;

  /**
   * Unique ID of this cluster. Assigned by the server. Immutable once assigned.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique ID of this cluster. Assigned by the server. Immutable once assigned.
   * @param id id or {@code null} for none
   */
  public StoreCluster setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Ordered list of localized strings giving the name of this page. The text displayed is the one
   * that best matches the user locale, or the first entry if there is no good match. There needs to
   * be at least one entry.
   * @return value or {@code null} for none
   */
  public java.util.List<LocalizedText> getName() {
    return name;
  }

  /**
   * Ordered list of localized strings giving the name of this page. The text displayed is the one
   * that best matches the user locale, or the first entry if there is no good match. There needs to
   * be at least one entry.
   * @param name name or {@code null} for none
   */
  public StoreCluster setName(java.util.List<LocalizedText> name) {
    this.name = name;
    return this;
  }

  /**
   * String (US-ASCII only) used to determine order of this cluster within the parent page's
   * elements. Page elements are sorted in lexicographic order of this field. Duplicated values are
   * allowed, but ordering between elements with duplicate order is undefined. The value of this
   * field is never visible to a user, it is used solely for the purpose of defining an ordering.
   * Maximum length is 256 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderInPage() {
    return orderInPage;
  }

  /**
   * String (US-ASCII only) used to determine order of this cluster within the parent page's
   * elements. Page elements are sorted in lexicographic order of this field. Duplicated values are
   * allowed, but ordering between elements with duplicate order is undefined. The value of this
   * field is never visible to a user, it is used solely for the purpose of defining an ordering.
   * Maximum length is 256 characters.
   * @param orderInPage orderInPage or {@code null} for none
   */
  public StoreCluster setOrderInPage(java.lang.String orderInPage) {
    this.orderInPage = orderInPage;
    return this;
  }

  /**
   * List of products in the order they are displayed in the cluster. There should not be duplicates
   * within a cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductId() {
    return productId;
  }

  /**
   * List of products in the order they are displayed in the cluster. There should not be duplicates
   * within a cluster.
   * @param productId productId or {@code null} for none
   */
  public StoreCluster setProductId(java.util.List<java.lang.String> productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public StoreCluster set(String fieldName, Object value) {
    return (StoreCluster) super.set(fieldName, value);
  }

  @Override
  public StoreCluster clone() {
    return (StoreCluster) super.clone();
  }

}
