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

package com.google.api.services.appsactivity;

/**
 * Service definition for Appsactivity (v1).
 *
 * <p>
 * Provides a historical view of activity.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/google-apps/activity/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AppsactivityRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Appsactivity extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.28.0 of the Drive Activity API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "appsactivity/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/appsactivity/v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Appsactivity(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Appsactivity(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Activities collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Appsactivity appsactivity = new Appsactivity(...);}
   *   {@code Appsactivity.Activities.List request = appsactivity.activities().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Activities activities() {
    return new Activities();
  }

  /**
   * The "activities" collection of methods.
   */
  public class Activities {

    /**
     * Returns a list of activities visible to the current logged in user. Visible activities are
     * determined by the visibility settings of the object that was acted on, e.g. Drive files a user
     * can see. An activity is a record of past events. Multiple events may be merged if they are
     * similar. A request is scoped to activities from a given Google service using the source
     * parameter.
     *
     * Create a request for the method "activities.list".
     *
     * This request holds the parameters needed by the appsactivity server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends AppsactivityRequest<com.google.api.services.appsactivity.model.ListActivitiesResponse> {

      private static final String REST_PATH = "activities";

      /**
       * Returns a list of activities visible to the current logged in user. Visible activities are
       * determined by the visibility settings of the object that was acted on, e.g. Drive files a user
       * can see. An activity is a record of past events. Multiple events may be merged if they are
       * similar. A request is scoped to activities from a given Google service using the source
       * parameter.
       *
       * Create a request for the method "activities.list".
       *
       * This request holds the parameters needed by the the appsactivity server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(Appsactivity.this, "GET", REST_PATH, null, com.google.api.services.appsactivity.model.ListActivitiesResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      /** Identifies the Drive folder containing the items for which to return activities. */
      @com.google.api.client.util.Key("drive.ancestorId")
      private java.lang.String driveAncestorId;

      /** Identifies the Drive folder containing the items for which to return activities.
       */
      public java.lang.String getDriveAncestorId() {
        return driveAncestorId;
      }

      /** Identifies the Drive folder containing the items for which to return activities. */
      public List setDriveAncestorId(java.lang.String driveAncestorId) {
        this.driveAncestorId = driveAncestorId;
        return this;
      }

      /** Identifies the Drive item to return activities for. */
      @com.google.api.client.util.Key("drive.fileId")
      private java.lang.String driveFileId;

      /** Identifies the Drive item to return activities for.
       */
      public java.lang.String getDriveFileId() {
        return driveFileId;
      }

      /** Identifies the Drive item to return activities for. */
      public List setDriveFileId(java.lang.String driveFileId) {
        this.driveFileId = driveFileId;
        return this;
      }

      /**
       * Indicates the strategy to use when grouping singleEvents items in the associated
       * combinedEvent object.
       */
      @com.google.api.client.util.Key
      private java.lang.String groupingStrategy;

      /** Indicates the strategy to use when grouping singleEvents items in the associated combinedEvent
     object. [default: driveUi]
       */
      public java.lang.String getGroupingStrategy() {
        return groupingStrategy;
      }

      /**
       * Indicates the strategy to use when grouping singleEvents items in the associated
       * combinedEvent object.
       */
      public List setGroupingStrategy(java.lang.String groupingStrategy) {
        this.groupingStrategy = groupingStrategy;
        return this;
      }

      /**
       * The maximum number of events to return on a page. The response includes a continuation
       * token if there are more events.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** The maximum number of events to return on a page. The response includes a continuation token if
     there are more events. [default: 50]
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /**
       * The maximum number of events to return on a page. The response includes a continuation
       * token if there are more events.
       */
      public List setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /** A token to retrieve a specific page of results. */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** A token to retrieve a specific page of results.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /** A token to retrieve a specific page of results. */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /**
       * The Google service from which to return activities. Possible values of source are: -
       * drive.google.com
       */
      @com.google.api.client.util.Key
      private java.lang.String source;

      /** The Google service from which to return activities. Possible values of source are: -
     drive.google.com
       */
      public java.lang.String getSource() {
        return source;
      }

      /**
       * The Google service from which to return activities. Possible values of source are: -
       * drive.google.com
       */
      public List setSource(java.lang.String source) {
        this.source = source;
        return this;
      }

      /**
       * The ID used for ACL checks (does not filter the resulting event list by the assigned
       * value). Use the special value me to indicate the currently authenticated user.
       */
      @com.google.api.client.util.Key
      private java.lang.String userId;

      /** The ID used for ACL checks (does not filter the resulting event list by the assigned value). Use
     the special value me to indicate the currently authenticated user. [default: me]
       */
      public java.lang.String getUserId() {
        return userId;
      }

      /**
       * The ID used for ACL checks (does not filter the resulting event list by the assigned
       * value). Use the special value me to indicate the currently authenticated user.
       */
      public List setUserId(java.lang.String userId) {
        this.userId = userId;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Appsactivity}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Appsactivity}. */
    @Override
    public Appsactivity build() {
      return new Appsactivity(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AppsactivityRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAppsactivityRequestInitializer(
        AppsactivityRequestInitializer appsactivityRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(appsactivityRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
