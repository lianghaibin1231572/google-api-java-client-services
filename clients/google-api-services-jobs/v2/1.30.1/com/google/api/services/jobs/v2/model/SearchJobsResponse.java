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

package com.google.api.services.jobs.v2.model;

/**
 * Output only. Response for SearchJob method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The commute filter the service applied to the specified query. This information is only
   * available when query has a valid CommutePreference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommutePreference appliedCommuteFilter;

  /**
   * The location filters that the service applied to the specified query. If any filters are lat-
   * lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JobLocation> appliedJobLocationFilters;

  static {
    // hack to force ProGuard to consider JobLocation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(JobLocation.class);
  }

  /**
   * An estimation of the number of jobs that match the specified query. This number is not
   * guaranteed to be accurate. For accurate results, seenenable_precise_result_size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long estimatedTotalSize;

  /**
   * The histogram results that match specified SearchJobsRequest.HistogramFacets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HistogramResults histogramResults;

  /**
   * Corresponds to SearchJobsRequest.job_view.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobView;

  /**
   * The Job entities that match the specified SearchJobsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MatchingJob> matchingJobs;

  static {
    // hack to force ProGuard to consider MatchingJob used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MatchingJob.class);
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata metadata;

  /**
   * The token that specifies the starting position of the next page of results. This field is empty
   * if there are no more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * If query broadening is enabled, we may append additional results from the broadened query. This
   * number indicates how many of the jobs returned in the jobs field are from the broadened query.
   * These results are always at the end of the jobs list. In particular, a value of 0 means all the
   * jobs in the jobs list are from the original (without broadening) query. If this field is non-
   * zero, subsequent requests with offset after this result set should contain all broadened
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numJobsFromBroadenedQuery;

  /**
   * The spell checking result, and correction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SpellingCorrection spellResult;

  /**
   * The precise result count, which is available only if the client set enable_precise_result_size
   * to `true` or if the response is the last page of results. Otherwise, the value will be `-1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalSize;

  /**
   * The commute filter the service applied to the specified query. This information is only
   * available when query has a valid CommutePreference.
   * @return value or {@code null} for none
   */
  public CommutePreference getAppliedCommuteFilter() {
    return appliedCommuteFilter;
  }

  /**
   * The commute filter the service applied to the specified query. This information is only
   * available when query has a valid CommutePreference.
   * @param appliedCommuteFilter appliedCommuteFilter or {@code null} for none
   */
  public SearchJobsResponse setAppliedCommuteFilter(CommutePreference appliedCommuteFilter) {
    this.appliedCommuteFilter = appliedCommuteFilter;
    return this;
  }

  /**
   * The location filters that the service applied to the specified query. If any filters are lat-
   * lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
   * @return value or {@code null} for none
   */
  public java.util.List<JobLocation> getAppliedJobLocationFilters() {
    return appliedJobLocationFilters;
  }

  /**
   * The location filters that the service applied to the specified query. If any filters are lat-
   * lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
   * @param appliedJobLocationFilters appliedJobLocationFilters or {@code null} for none
   */
  public SearchJobsResponse setAppliedJobLocationFilters(java.util.List<JobLocation> appliedJobLocationFilters) {
    this.appliedJobLocationFilters = appliedJobLocationFilters;
    return this;
  }

  /**
   * An estimation of the number of jobs that match the specified query. This number is not
   * guaranteed to be accurate. For accurate results, seenenable_precise_result_size.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEstimatedTotalSize() {
    return estimatedTotalSize;
  }

  /**
   * An estimation of the number of jobs that match the specified query. This number is not
   * guaranteed to be accurate. For accurate results, seenenable_precise_result_size.
   * @param estimatedTotalSize estimatedTotalSize or {@code null} for none
   */
  public SearchJobsResponse setEstimatedTotalSize(java.lang.Long estimatedTotalSize) {
    this.estimatedTotalSize = estimatedTotalSize;
    return this;
  }

  /**
   * The histogram results that match specified SearchJobsRequest.HistogramFacets.
   * @return value or {@code null} for none
   */
  public HistogramResults getHistogramResults() {
    return histogramResults;
  }

  /**
   * The histogram results that match specified SearchJobsRequest.HistogramFacets.
   * @param histogramResults histogramResults or {@code null} for none
   */
  public SearchJobsResponse setHistogramResults(HistogramResults histogramResults) {
    this.histogramResults = histogramResults;
    return this;
  }

  /**
   * Corresponds to SearchJobsRequest.job_view.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobView() {
    return jobView;
  }

  /**
   * Corresponds to SearchJobsRequest.job_view.
   * @param jobView jobView or {@code null} for none
   */
  public SearchJobsResponse setJobView(java.lang.String jobView) {
    this.jobView = jobView;
    return this;
  }

  /**
   * The Job entities that match the specified SearchJobsRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<MatchingJob> getMatchingJobs() {
    return matchingJobs;
  }

  /**
   * The Job entities that match the specified SearchJobsRequest.
   * @param matchingJobs matchingJobs or {@code null} for none
   */
  public SearchJobsResponse setMatchingJobs(java.util.List<MatchingJob> matchingJobs) {
    this.matchingJobs = matchingJobs;
    return this;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public SearchJobsResponse setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The token that specifies the starting position of the next page of results. This field is empty
   * if there are no more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that specifies the starting position of the next page of results. This field is empty
   * if there are no more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchJobsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * If query broadening is enabled, we may append additional results from the broadened query. This
   * number indicates how many of the jobs returned in the jobs field are from the broadened query.
   * These results are always at the end of the jobs list. In particular, a value of 0 means all the
   * jobs in the jobs list are from the original (without broadening) query. If this field is non-
   * zero, subsequent requests with offset after this result set should contain all broadened
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumJobsFromBroadenedQuery() {
    return numJobsFromBroadenedQuery;
  }

  /**
   * If query broadening is enabled, we may append additional results from the broadened query. This
   * number indicates how many of the jobs returned in the jobs field are from the broadened query.
   * These results are always at the end of the jobs list. In particular, a value of 0 means all the
   * jobs in the jobs list are from the original (without broadening) query. If this field is non-
   * zero, subsequent requests with offset after this result set should contain all broadened
   * results.
   * @param numJobsFromBroadenedQuery numJobsFromBroadenedQuery or {@code null} for none
   */
  public SearchJobsResponse setNumJobsFromBroadenedQuery(java.lang.Integer numJobsFromBroadenedQuery) {
    this.numJobsFromBroadenedQuery = numJobsFromBroadenedQuery;
    return this;
  }

  /**
   * The spell checking result, and correction.
   * @return value or {@code null} for none
   */
  public SpellingCorrection getSpellResult() {
    return spellResult;
  }

  /**
   * The spell checking result, and correction.
   * @param spellResult spellResult or {@code null} for none
   */
  public SearchJobsResponse setSpellResult(SpellingCorrection spellResult) {
    this.spellResult = spellResult;
    return this;
  }

  /**
   * The precise result count, which is available only if the client set enable_precise_result_size
   * to `true` or if the response is the last page of results. Otherwise, the value will be `-1`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalSize() {
    return totalSize;
  }

  /**
   * The precise result count, which is available only if the client set enable_precise_result_size
   * to `true` or if the response is the last page of results. Otherwise, the value will be `-1`.
   * @param totalSize totalSize or {@code null} for none
   */
  public SearchJobsResponse setTotalSize(java.lang.Long totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public SearchJobsResponse set(String fieldName, Object value) {
    return (SearchJobsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchJobsResponse clone() {
    return (SearchJobsResponse) super.clone();
  }

}
