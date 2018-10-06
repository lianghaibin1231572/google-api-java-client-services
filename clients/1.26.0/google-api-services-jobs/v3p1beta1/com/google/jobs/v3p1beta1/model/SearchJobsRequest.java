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

package com.google.jobs.v3p1beta1.model;

/**
 * Input only.
 *
 * The Request body of the `SearchJobs` call.
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
public final class SearchJobsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * Controls over how job documents get ranked on top of existing relevance score (determined by
   * API algorithm).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomRankingInfo customRankingInfo;

  /**
   * Optional.
   *
   * Controls whether to disable exact keyword match on Job.job_title, Job.description,
   * Job.company_display_name, Job.locations, Job.qualifications. When disable keyword match is
   * turned off, a keyword match returns jobs that do not match given category filters when there
   * are matching keywords. For example, the query "program manager," a result is returned even if
   * the job posting has the title "software developer," which does not fall into "program manager"
   * ontology, but does have "program manager" appearing in its description.
   *
   * For queries like "cloud" that does not contain title or location specific ontology, jobs with
   * "cloud" keyword matches are returned regardless of this flag's value.
   *
   * Please use Company.keyword_searchable_custom_fields or
   * Company.keyword_searchable_custom_attributes if company specific globally matched custom
   * field/attribute string values is needed. Enabling keyword match improves recall of subsequent
   * search requests.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableKeywordMatch;

  /**
   * Optional.
   *
   * Controls whether highly similar jobs are returned next to each other in the search results.
   * Jobs are determined to be highly similar based on their titles, job categories, and locations.
   * Highly similar results will be clustered so that only one representative job of the cluster
   * will be displayed to the job seeker higher up in the results, with the other jobs being
   * displayed lower down in the results.
   *
   * Defaults to DiversificationLevel.SIMPLE if no value is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diversificationLevel;

  /**
   * Optional.
   *
   * Controls whether to broaden the search when it produces sparse results. Broadened queries
   * append results to the end of the matching results list.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableBroadening;

  /**
   * Optional.
   *
   * Histogram requests for jobs matching JobQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HistogramFacets histogramFacets;

  /**
   * Optional.
   *
   * Expression based histogram requests for jobs matching JobQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistogramQuery> histogramQueries;

  /**
   * Optional.
   *
   * Query used to search against jobs, such as keyword, location filters, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobQuery jobQuery;

  /**
   * Optional.
   *
   * The desired job attributes returned for jobs in the search response. Defaults to JobView.SMALL
   * if no value is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobView;

  /**
   * Optional.
   *
   * An integer that specifies the current offset (that is, starting result location, amongst the
   * jobs deemed by the API as relevant) in search results. This field is only considered if
   * page_token is unset.
   *
   * For example, 0 means to  return results starting from the first matching job, and 10 means to
   * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and
   * offset = 10 means to return from the second page).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer offset;

  /**
   * Optional.
   *
   * The criteria determining how search results are sorted. Default is "relevance desc".
   *
   * Supported options are:
   *
   * * "relevance desc": By relevance descending, as determined by the API algorithms. Relevance
   * thresholding of query results is only available with this ordering. * "posting`_`publish`_`time
   * desc": By Job.posting_publish_time descending. * "posting`_`update`_`time desc": By
   * Job.posting_update_time descending. * "title": By Job.title ascending. * "title desc": By
   * Job.title descending. * "annualized`_`base`_`compensation": By job's
   * CompensationInfo.annualized_base_compensation_range ascending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`base`_`compensation desc": By job's
   * CompensationInfo.annualized_base_compensation_range descending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`total`_`compensation": By job's
   * CompensationInfo.annualized_total_compensation_range ascending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`total`_`compensation desc": By job's
   * CompensationInfo.annualized_total_compensation_range descending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. * "custom`_`ranking desc": By
   * the relevance score adjusted to the SearchJobsRequest.custom_ranking_info.ranking_expression
   * with weight factor assigned by SearchJobsRequest.custom_ranking_info.importance_level in
   * descending order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderBy;

  /**
   * Optional.
   *
   * A limit on the number of jobs returned in the search results. Increasing this value above the
   * default value of 10 can increase search response time. The value can be between 1 and 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional.
   *
   * The token specifying the current offset within search results. See
   * SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Required.
   *
   * The meta information collected about the job searcher, used to improve the search quality of
   * the service.. The identifiers, (such as `user_id`) are provided by users, and must be unique
   * and consistent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * Optional.
   *
   * Controls if the search job request requires the return of a precise count of the first 300
   * results. Setting this to `true` ensures consistency in the number of results per page. Best
   * practice is to set this value to true if a client allows users to jump directly to a non-
   * sequential search results page.
   *
   * Enabling this flag may adversely impact performance.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requirePreciseResultSize;

  /**
   * Optional.
   *
   * Mode of a search.
   *
   * Defaults to SearchMode.JOB_SEARCH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchMode;

  /**
   * Optional.
   *
   * Controls over how job documents get ranked on top of existing relevance score (determined by
   * API algorithm).
   * @return value or {@code null} for none
   */
  public CustomRankingInfo getCustomRankingInfo() {
    return customRankingInfo;
  }

  /**
   * Optional.
   *
   * Controls over how job documents get ranked on top of existing relevance score (determined by
   * API algorithm).
   * @param customRankingInfo customRankingInfo or {@code null} for none
   */
  public SearchJobsRequest setCustomRankingInfo(CustomRankingInfo customRankingInfo) {
    this.customRankingInfo = customRankingInfo;
    return this;
  }

  /**
   * Optional.
   *
   * Controls whether to disable exact keyword match on Job.job_title, Job.description,
   * Job.company_display_name, Job.locations, Job.qualifications. When disable keyword match is
   * turned off, a keyword match returns jobs that do not match given category filters when there
   * are matching keywords. For example, the query "program manager," a result is returned even if
   * the job posting has the title "software developer," which does not fall into "program manager"
   * ontology, but does have "program manager" appearing in its description.
   *
   * For queries like "cloud" that does not contain title or location specific ontology, jobs with
   * "cloud" keyword matches are returned regardless of this flag's value.
   *
   * Please use Company.keyword_searchable_custom_fields or
   * Company.keyword_searchable_custom_attributes if company specific globally matched custom
   * field/attribute string values is needed. Enabling keyword match improves recall of subsequent
   * search requests.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableKeywordMatch() {
    return disableKeywordMatch;
  }

  /**
   * Optional.
   *
   * Controls whether to disable exact keyword match on Job.job_title, Job.description,
   * Job.company_display_name, Job.locations, Job.qualifications. When disable keyword match is
   * turned off, a keyword match returns jobs that do not match given category filters when there
   * are matching keywords. For example, the query "program manager," a result is returned even if
   * the job posting has the title "software developer," which does not fall into "program manager"
   * ontology, but does have "program manager" appearing in its description.
   *
   * For queries like "cloud" that does not contain title or location specific ontology, jobs with
   * "cloud" keyword matches are returned regardless of this flag's value.
   *
   * Please use Company.keyword_searchable_custom_fields or
   * Company.keyword_searchable_custom_attributes if company specific globally matched custom
   * field/attribute string values is needed. Enabling keyword match improves recall of subsequent
   * search requests.
   *
   * Defaults to false.
   * @param disableKeywordMatch disableKeywordMatch or {@code null} for none
   */
  public SearchJobsRequest setDisableKeywordMatch(java.lang.Boolean disableKeywordMatch) {
    this.disableKeywordMatch = disableKeywordMatch;
    return this;
  }

  /**
   * Optional.
   *
   * Controls whether highly similar jobs are returned next to each other in the search results.
   * Jobs are determined to be highly similar based on their titles, job categories, and locations.
   * Highly similar results will be clustered so that only one representative job of the cluster
   * will be displayed to the job seeker higher up in the results, with the other jobs being
   * displayed lower down in the results.
   *
   * Defaults to DiversificationLevel.SIMPLE if no value is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiversificationLevel() {
    return diversificationLevel;
  }

  /**
   * Optional.
   *
   * Controls whether highly similar jobs are returned next to each other in the search results.
   * Jobs are determined to be highly similar based on their titles, job categories, and locations.
   * Highly similar results will be clustered so that only one representative job of the cluster
   * will be displayed to the job seeker higher up in the results, with the other jobs being
   * displayed lower down in the results.
   *
   * Defaults to DiversificationLevel.SIMPLE if no value is specified.
   * @param diversificationLevel diversificationLevel or {@code null} for none
   */
  public SearchJobsRequest setDiversificationLevel(java.lang.String diversificationLevel) {
    this.diversificationLevel = diversificationLevel;
    return this;
  }

  /**
   * Optional.
   *
   * Controls whether to broaden the search when it produces sparse results. Broadened queries
   * append results to the end of the matching results list.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableBroadening() {
    return enableBroadening;
  }

  /**
   * Optional.
   *
   * Controls whether to broaden the search when it produces sparse results. Broadened queries
   * append results to the end of the matching results list.
   *
   * Defaults to false.
   * @param enableBroadening enableBroadening or {@code null} for none
   */
  public SearchJobsRequest setEnableBroadening(java.lang.Boolean enableBroadening) {
    this.enableBroadening = enableBroadening;
    return this;
  }

  /**
   * Optional.
   *
   * Histogram requests for jobs matching JobQuery.
   * @return value or {@code null} for none
   */
  public HistogramFacets getHistogramFacets() {
    return histogramFacets;
  }

  /**
   * Optional.
   *
   * Histogram requests for jobs matching JobQuery.
   * @param histogramFacets histogramFacets or {@code null} for none
   */
  public SearchJobsRequest setHistogramFacets(HistogramFacets histogramFacets) {
    this.histogramFacets = histogramFacets;
    return this;
  }

  /**
   * Optional.
   *
   * Expression based histogram requests for jobs matching JobQuery.
   * @return value or {@code null} for none
   */
  public java.util.List<HistogramQuery> getHistogramQueries() {
    return histogramQueries;
  }

  /**
   * Optional.
   *
   * Expression based histogram requests for jobs matching JobQuery.
   * @param histogramQueries histogramQueries or {@code null} for none
   */
  public SearchJobsRequest setHistogramQueries(java.util.List<HistogramQuery> histogramQueries) {
    this.histogramQueries = histogramQueries;
    return this;
  }

  /**
   * Optional.
   *
   * Query used to search against jobs, such as keyword, location filters, etc.
   * @return value or {@code null} for none
   */
  public JobQuery getJobQuery() {
    return jobQuery;
  }

  /**
   * Optional.
   *
   * Query used to search against jobs, such as keyword, location filters, etc.
   * @param jobQuery jobQuery or {@code null} for none
   */
  public SearchJobsRequest setJobQuery(JobQuery jobQuery) {
    this.jobQuery = jobQuery;
    return this;
  }

  /**
   * Optional.
   *
   * The desired job attributes returned for jobs in the search response. Defaults to JobView.SMALL
   * if no value is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobView() {
    return jobView;
  }

  /**
   * Optional.
   *
   * The desired job attributes returned for jobs in the search response. Defaults to JobView.SMALL
   * if no value is specified.
   * @param jobView jobView or {@code null} for none
   */
  public SearchJobsRequest setJobView(java.lang.String jobView) {
    this.jobView = jobView;
    return this;
  }

  /**
   * Optional.
   *
   * An integer that specifies the current offset (that is, starting result location, amongst the
   * jobs deemed by the API as relevant) in search results. This field is only considered if
   * page_token is unset.
   *
   * For example, 0 means to  return results starting from the first matching job, and 10 means to
   * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and
   * offset = 10 means to return from the second page).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffset() {
    return offset;
  }

  /**
   * Optional.
   *
   * An integer that specifies the current offset (that is, starting result location, amongst the
   * jobs deemed by the API as relevant) in search results. This field is only considered if
   * page_token is unset.
   *
   * For example, 0 means to  return results starting from the first matching job, and 10 means to
   * return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and
   * offset = 10 means to return from the second page).
   * @param offset offset or {@code null} for none
   */
  public SearchJobsRequest setOffset(java.lang.Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Optional.
   *
   * The criteria determining how search results are sorted. Default is "relevance desc".
   *
   * Supported options are:
   *
   * * "relevance desc": By relevance descending, as determined by the API algorithms. Relevance
   * thresholding of query results is only available with this ordering. * "posting`_`publish`_`time
   * desc": By Job.posting_publish_time descending. * "posting`_`update`_`time desc": By
   * Job.posting_update_time descending. * "title": By Job.title ascending. * "title desc": By
   * Job.title descending. * "annualized`_`base`_`compensation": By job's
   * CompensationInfo.annualized_base_compensation_range ascending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`base`_`compensation desc": By job's
   * CompensationInfo.annualized_base_compensation_range descending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`total`_`compensation": By job's
   * CompensationInfo.annualized_total_compensation_range ascending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`total`_`compensation desc": By job's
   * CompensationInfo.annualized_total_compensation_range descending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. * "custom`_`ranking desc": By
   * the relevance score adjusted to the SearchJobsRequest.custom_ranking_info.ranking_expression
   * with weight factor assigned by SearchJobsRequest.custom_ranking_info.importance_level in
   * descending order.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderBy() {
    return orderBy;
  }

  /**
   * Optional.
   *
   * The criteria determining how search results are sorted. Default is "relevance desc".
   *
   * Supported options are:
   *
   * * "relevance desc": By relevance descending, as determined by the API algorithms. Relevance
   * thresholding of query results is only available with this ordering. * "posting`_`publish`_`time
   * desc": By Job.posting_publish_time descending. * "posting`_`update`_`time desc": By
   * Job.posting_update_time descending. * "title": By Job.title ascending. * "title desc": By
   * Job.title descending. * "annualized`_`base`_`compensation": By job's
   * CompensationInfo.annualized_base_compensation_range ascending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`base`_`compensation desc": By job's
   * CompensationInfo.annualized_base_compensation_range descending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`total`_`compensation": By job's
   * CompensationInfo.annualized_total_compensation_range ascending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. *
   * "annualized`_`total`_`compensation desc": By job's
   * CompensationInfo.annualized_total_compensation_range descending. Jobs whose annualized base
   * compensation is unspecified are put at the end of search results. * "custom`_`ranking desc": By
   * the relevance score adjusted to the SearchJobsRequest.custom_ranking_info.ranking_expression
   * with weight factor assigned by SearchJobsRequest.custom_ranking_info.importance_level in
   * descending order.
   * @param orderBy orderBy or {@code null} for none
   */
  public SearchJobsRequest setOrderBy(java.lang.String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Optional.
   *
   * A limit on the number of jobs returned in the search results. Increasing this value above the
   * default value of 10 can increase search response time. The value can be between 1 and 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional.
   *
   * A limit on the number of jobs returned in the search results. Increasing this value above the
   * default value of 10 can increase search response time. The value can be between 1 and 100.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchJobsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional.
   *
   * The token specifying the current offset within search results. See
   * SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional.
   *
   * The token specifying the current offset within search results. See
   * SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query
   * results.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchJobsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Required.
   *
   * The meta information collected about the job searcher, used to improve the search quality of
   * the service.. The identifiers, (such as `user_id`) are provided by users, and must be unique
   * and consistent.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Required.
   *
   * The meta information collected about the job searcher, used to improve the search quality of
   * the service.. The identifiers, (such as `user_id`) are provided by users, and must be unique
   * and consistent.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public SearchJobsRequest setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  /**
   * Optional.
   *
   * Controls if the search job request requires the return of a precise count of the first 300
   * results. Setting this to `true` ensures consistency in the number of results per page. Best
   * practice is to set this value to true if a client allows users to jump directly to a non-
   * sequential search results page.
   *
   * Enabling this flag may adversely impact performance.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequirePreciseResultSize() {
    return requirePreciseResultSize;
  }

  /**
   * Optional.
   *
   * Controls if the search job request requires the return of a precise count of the first 300
   * results. Setting this to `true` ensures consistency in the number of results per page. Best
   * practice is to set this value to true if a client allows users to jump directly to a non-
   * sequential search results page.
   *
   * Enabling this flag may adversely impact performance.
   *
   * Defaults to false.
   * @param requirePreciseResultSize requirePreciseResultSize or {@code null} for none
   */
  public SearchJobsRequest setRequirePreciseResultSize(java.lang.Boolean requirePreciseResultSize) {
    this.requirePreciseResultSize = requirePreciseResultSize;
    return this;
  }

  /**
   * Optional.
   *
   * Mode of a search.
   *
   * Defaults to SearchMode.JOB_SEARCH.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchMode() {
    return searchMode;
  }

  /**
   * Optional.
   *
   * Mode of a search.
   *
   * Defaults to SearchMode.JOB_SEARCH.
   * @param searchMode searchMode or {@code null} for none
   */
  public SearchJobsRequest setSearchMode(java.lang.String searchMode) {
    this.searchMode = searchMode;
    return this;
  }

  @Override
  public SearchJobsRequest set(String fieldName, Object value) {
    return (SearchJobsRequest) super.set(fieldName, value);
  }

  @Override
  public SearchJobsRequest clone() {
    return (SearchJobsRequest) super.clone();
  }

}
