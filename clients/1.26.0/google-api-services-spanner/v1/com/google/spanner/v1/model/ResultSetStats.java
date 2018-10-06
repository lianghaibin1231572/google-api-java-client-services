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

package com.google.spanner.v1.model;

/**
 * Additional statistics about a ResultSet or PartialResultSet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResultSetStats extends com.google.api.client.json.GenericJson {

  /**
   * QueryPlan for the query associated with this result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryPlan queryPlan;

  /**
   * Aggregated statistics from the execution of the query. Only present when the query is profiled.
   * For example, a query could return the statistics as follows:
   *
   *     {       "rows_returned": "3",       "elapsed_time": "1.22 secs",       "cpu_time": "1.19
   * secs"     }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> queryStats;

  /**
   * Standard DML returns an exact count of rows that were modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rowCountExact;

  /**
   * Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows
   * modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rowCountLowerBound;

  /**
   * QueryPlan for the query associated with this result.
   * @return value or {@code null} for none
   */
  public QueryPlan getQueryPlan() {
    return queryPlan;
  }

  /**
   * QueryPlan for the query associated with this result.
   * @param queryPlan queryPlan or {@code null} for none
   */
  public ResultSetStats setQueryPlan(QueryPlan queryPlan) {
    this.queryPlan = queryPlan;
    return this;
  }

  /**
   * Aggregated statistics from the execution of the query. Only present when the query is profiled.
   * For example, a query could return the statistics as follows:
   *
   *     {       "rows_returned": "3",       "elapsed_time": "1.22 secs",       "cpu_time": "1.19
   * secs"     }
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getQueryStats() {
    return queryStats;
  }

  /**
   * Aggregated statistics from the execution of the query. Only present when the query is profiled.
   * For example, a query could return the statistics as follows:
   *
   *     {       "rows_returned": "3",       "elapsed_time": "1.22 secs",       "cpu_time": "1.19
   * secs"     }
   * @param queryStats queryStats or {@code null} for none
   */
  public ResultSetStats setQueryStats(java.util.Map<String, java.lang.Object> queryStats) {
    this.queryStats = queryStats;
    return this;
  }

  /**
   * Standard DML returns an exact count of rows that were modified.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRowCountExact() {
    return rowCountExact;
  }

  /**
   * Standard DML returns an exact count of rows that were modified.
   * @param rowCountExact rowCountExact or {@code null} for none
   */
  public ResultSetStats setRowCountExact(java.lang.Long rowCountExact) {
    this.rowCountExact = rowCountExact;
    return this;
  }

  /**
   * Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows
   * modified.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRowCountLowerBound() {
    return rowCountLowerBound;
  }

  /**
   * Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows
   * modified.
   * @param rowCountLowerBound rowCountLowerBound or {@code null} for none
   */
  public ResultSetStats setRowCountLowerBound(java.lang.Long rowCountLowerBound) {
    this.rowCountLowerBound = rowCountLowerBound;
    return this;
  }

  @Override
  public ResultSetStats set(String fieldName, Object value) {
    return (ResultSetStats) super.set(fieldName, value);
  }

  @Override
  public ResultSetStats clone() {
    return (ResultSetStats) super.clone();
  }

}
