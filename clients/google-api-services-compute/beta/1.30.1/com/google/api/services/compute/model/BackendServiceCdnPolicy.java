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

package com.google.api.services.compute.model;

/**
 * Message containing Cloud CDN configuration for a backend service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendServiceCdnPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization
   * headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode
   * settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BackendServiceCdnPolicyBypassCacheOnRequestHeader> bypassCacheOnRequestHeaders;

  /**
   * The CacheKeyPolicy for this CdnPolicy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CacheKeyPolicy cacheKeyPolicy;

  /**
   * Specifies the cache setting for all responses from this backend. The possible values are:
   *
   * USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses
   * without these headers will not be cached at Google's edge, and will require a full trip to the
   * origin on every request, potentially impacting performance and increasing load on the origin
   * server.
   *
   * FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives
   * in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-
   * user (user identifiable) content.
   *
   * CACHE_ALL_STATIC Automatically cache static content, including common image formats, media
   * (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked
   * as uncacheable, as well as dynamic content (including HTML), will not be cached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheMode;

  /**
   * Specifies a separate client (e.g. browser client) TTL, separate from the TTL for Cloud CDN's
   * edge caches. Leaving this empty will use the same cache TTL for both Cloud CDN and the client-
   * facing response. The maximum allowed value is 86400s (1 day).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer clientTtl;

  /**
   * Specifies the default TTL for cached content served by this origin for responses that do not
   * have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always
   * revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but
   * can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the
   * TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that
   * infrequently accessed objects may be evicted from the cache before the defined TTL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultTtl;

  /**
   * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives
   * that attempt to set a max-age or s-maxage higher than this, or an Expires header more than
   * maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of
   * an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a
   * TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting
   * that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxTtl;

  /**
   * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching
   * for common errors or redirects. This can reduce the load on your origin and improve end-user
   * experience by reducing response latency. By default, Cloud CDN will apply the following default
   * TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
   * HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method
   * Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s These defaults can be
   * overridden in negative_caching_policy
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean negativeCaching;

  /**
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to
   * configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled
   * will use Cloud CDN's default cache TTLs. Note that when specifying an explicit
   * negative_caching_policy, you should take care to specify a cache TTL for all response codes
   * that you wish to cache. Cloud CDN will not apply any default negative caching when a policy
   * exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicy;

  /**
   * Serve existing content from the cache (if available) when revalidating content with the origin,
   * or when an error is encountered when refreshing the cache. This setting defines the default
   * "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale
   * responses that exceed the TTL configured here will not be served. The default limit (max-stale)
   * is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-
   * age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this
   * to zero (0) to disable serve-while-stale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer serveWhileStale;

  /**
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After
   * this time period, the response will be revalidated before being served. Defaults to 1hr
   * (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   * though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header,
   * regardless of any existing Cache-Control header. The actual headers served in responses will
   * not be altered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long signedUrlCacheMaxAgeSec;

  /**
   * [Output Only] Names of the keys for signing request URLs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> signedUrlKeyNames;

  /**
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization
   * headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode
   * settings.
   * @return value or {@code null} for none
   */
  public java.util.List<BackendServiceCdnPolicyBypassCacheOnRequestHeader> getBypassCacheOnRequestHeaders() {
    return bypassCacheOnRequestHeaders;
  }

  /**
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization
   * headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode
   * settings.
   * @param bypassCacheOnRequestHeaders bypassCacheOnRequestHeaders or {@code null} for none
   */
  public BackendServiceCdnPolicy setBypassCacheOnRequestHeaders(java.util.List<BackendServiceCdnPolicyBypassCacheOnRequestHeader> bypassCacheOnRequestHeaders) {
    this.bypassCacheOnRequestHeaders = bypassCacheOnRequestHeaders;
    return this;
  }

  /**
   * The CacheKeyPolicy for this CdnPolicy.
   * @return value or {@code null} for none
   */
  public CacheKeyPolicy getCacheKeyPolicy() {
    return cacheKeyPolicy;
  }

  /**
   * The CacheKeyPolicy for this CdnPolicy.
   * @param cacheKeyPolicy cacheKeyPolicy or {@code null} for none
   */
  public BackendServiceCdnPolicy setCacheKeyPolicy(CacheKeyPolicy cacheKeyPolicy) {
    this.cacheKeyPolicy = cacheKeyPolicy;
    return this;
  }

  /**
   * Specifies the cache setting for all responses from this backend. The possible values are:
   *
   * USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses
   * without these headers will not be cached at Google's edge, and will require a full trip to the
   * origin on every request, potentially impacting performance and increasing load on the origin
   * server.
   *
   * FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives
   * in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-
   * user (user identifiable) content.
   *
   * CACHE_ALL_STATIC Automatically cache static content, including common image formats, media
   * (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked
   * as uncacheable, as well as dynamic content (including HTML), will not be cached.
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheMode() {
    return cacheMode;
  }

  /**
   * Specifies the cache setting for all responses from this backend. The possible values are:
   *
   * USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses
   * without these headers will not be cached at Google's edge, and will require a full trip to the
   * origin on every request, potentially impacting performance and increasing load on the origin
   * server.
   *
   * FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives
   * in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-
   * user (user identifiable) content.
   *
   * CACHE_ALL_STATIC Automatically cache static content, including common image formats, media
   * (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked
   * as uncacheable, as well as dynamic content (including HTML), will not be cached.
   * @param cacheMode cacheMode or {@code null} for none
   */
  public BackendServiceCdnPolicy setCacheMode(java.lang.String cacheMode) {
    this.cacheMode = cacheMode;
    return this;
  }

  /**
   * Specifies a separate client (e.g. browser client) TTL, separate from the TTL for Cloud CDN's
   * edge caches. Leaving this empty will use the same cache TTL for both Cloud CDN and the client-
   * facing response. The maximum allowed value is 86400s (1 day).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getClientTtl() {
    return clientTtl;
  }

  /**
   * Specifies a separate client (e.g. browser client) TTL, separate from the TTL for Cloud CDN's
   * edge caches. Leaving this empty will use the same cache TTL for both Cloud CDN and the client-
   * facing response. The maximum allowed value is 86400s (1 day).
   * @param clientTtl clientTtl or {@code null} for none
   */
  public BackendServiceCdnPolicy setClientTtl(java.lang.Integer clientTtl) {
    this.clientTtl = clientTtl;
    return this;
  }

  /**
   * Specifies the default TTL for cached content served by this origin for responses that do not
   * have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always
   * revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but
   * can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the
   * TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that
   * infrequently accessed objects may be evicted from the cache before the defined TTL.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultTtl() {
    return defaultTtl;
  }

  /**
   * Specifies the default TTL for cached content served by this origin for responses that do not
   * have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always
   * revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but
   * can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the
   * TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that
   * infrequently accessed objects may be evicted from the cache before the defined TTL.
   * @param defaultTtl defaultTtl or {@code null} for none
   */
  public BackendServiceCdnPolicy setDefaultTtl(java.lang.Integer defaultTtl) {
    this.defaultTtl = defaultTtl;
    return this;
  }

  /**
   * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives
   * that attempt to set a max-age or s-maxage higher than this, or an Expires header more than
   * maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of
   * an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a
   * TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting
   * that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxTtl() {
    return maxTtl;
  }

  /**
   * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives
   * that attempt to set a max-age or s-maxage higher than this, or an Expires header more than
   * maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of
   * an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a
   * TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting
   * that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * @param maxTtl maxTtl or {@code null} for none
   */
  public BackendServiceCdnPolicy setMaxTtl(java.lang.Integer maxTtl) {
    this.maxTtl = maxTtl;
    return this;
  }

  /**
   * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching
   * for common errors or redirects. This can reduce the load on your origin and improve end-user
   * experience by reducing response latency. By default, Cloud CDN will apply the following default
   * TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
   * HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method
   * Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s These defaults can be
   * overridden in negative_caching_policy
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNegativeCaching() {
    return negativeCaching;
  }

  /**
   * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching
   * for common errors or redirects. This can reduce the load on your origin and improve end-user
   * experience by reducing response latency. By default, Cloud CDN will apply the following default
   * TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
   * HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method
   * Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s These defaults can be
   * overridden in negative_caching_policy
   * @param negativeCaching negativeCaching or {@code null} for none
   */
  public BackendServiceCdnPolicy setNegativeCaching(java.lang.Boolean negativeCaching) {
    this.negativeCaching = negativeCaching;
    return this;
  }

  /**
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to
   * configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled
   * will use Cloud CDN's default cache TTLs. Note that when specifying an explicit
   * negative_caching_policy, you should take care to specify a cache TTL for all response codes
   * that you wish to cache. Cloud CDN will not apply any default negative caching when a policy
   * exists.
   * @return value or {@code null} for none
   */
  public java.util.List<BackendServiceCdnPolicyNegativeCachingPolicy> getNegativeCachingPolicy() {
    return negativeCachingPolicy;
  }

  /**
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to
   * configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled
   * will use Cloud CDN's default cache TTLs. Note that when specifying an explicit
   * negative_caching_policy, you should take care to specify a cache TTL for all response codes
   * that you wish to cache. Cloud CDN will not apply any default negative caching when a policy
   * exists.
   * @param negativeCachingPolicy negativeCachingPolicy or {@code null} for none
   */
  public BackendServiceCdnPolicy setNegativeCachingPolicy(java.util.List<BackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicy) {
    this.negativeCachingPolicy = negativeCachingPolicy;
    return this;
  }

  /**
   * Serve existing content from the cache (if available) when revalidating content with the origin,
   * or when an error is encountered when refreshing the cache. This setting defines the default
   * "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale
   * responses that exceed the TTL configured here will not be served. The default limit (max-stale)
   * is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-
   * age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this
   * to zero (0) to disable serve-while-stale.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getServeWhileStale() {
    return serveWhileStale;
  }

  /**
   * Serve existing content from the cache (if available) when revalidating content with the origin,
   * or when an error is encountered when refreshing the cache. This setting defines the default
   * "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale
   * responses that exceed the TTL configured here will not be served. The default limit (max-stale)
   * is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-
   * age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this
   * to zero (0) to disable serve-while-stale.
   * @param serveWhileStale serveWhileStale or {@code null} for none
   */
  public BackendServiceCdnPolicy setServeWhileStale(java.lang.Integer serveWhileStale) {
    this.serveWhileStale = serveWhileStale;
    return this;
  }

  /**
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After
   * this time period, the response will be revalidated before being served. Defaults to 1hr
   * (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   * though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header,
   * regardless of any existing Cache-Control header. The actual headers served in responses will
   * not be altered.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSignedUrlCacheMaxAgeSec() {
    return signedUrlCacheMaxAgeSec;
  }

  /**
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After
   * this time period, the response will be revalidated before being served. Defaults to 1hr
   * (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   * though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header,
   * regardless of any existing Cache-Control header. The actual headers served in responses will
   * not be altered.
   * @param signedUrlCacheMaxAgeSec signedUrlCacheMaxAgeSec or {@code null} for none
   */
  public BackendServiceCdnPolicy setSignedUrlCacheMaxAgeSec(java.lang.Long signedUrlCacheMaxAgeSec) {
    this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    return this;
  }

  /**
   * [Output Only] Names of the keys for signing request URLs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSignedUrlKeyNames() {
    return signedUrlKeyNames;
  }

  /**
   * [Output Only] Names of the keys for signing request URLs.
   * @param signedUrlKeyNames signedUrlKeyNames or {@code null} for none
   */
  public BackendServiceCdnPolicy setSignedUrlKeyNames(java.util.List<java.lang.String> signedUrlKeyNames) {
    this.signedUrlKeyNames = signedUrlKeyNames;
    return this;
  }

  @Override
  public BackendServiceCdnPolicy set(String fieldName, Object value) {
    return (BackendServiceCdnPolicy) super.set(fieldName, value);
  }

  @Override
  public BackendServiceCdnPolicy clone() {
    return (BackendServiceCdnPolicy) super.clone();
  }

}
