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

package com.google.api.services.sqladmin.model;

/**
 * A Cloud SQL instance resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabaseInstance extends com.google.api.client.json.GenericJson {

  /**
   * FIRST_GEN: First Generation instance. MySQL only. SECOND_GEN: Second Generation instance or
   * PostgreSQL instance. EXTERNAL: A database server that is not managed by Google. This property
   * is read-only; use the tier property in the settings object to determine the database type and
   * Second or First Generation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backendType;

  /**
   * Connection name of the Cloud SQL instance used in connection strings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionName;

  /**
   * The current disk usage of the instance in bytes. This property has been deprecated. Users
   * should use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring
   * API instead. Please see this announcement for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long currentDiskSize;

  /**
   * The database engine type and version. The databaseVersion field can not be changed after
   * instance creation. MySQL Second Generation instances: MYSQL_5_7 (default) or MYSQL_5_6.
   * PostgreSQL instances: POSTGRES_9_6 MySQL First Generation instances: MYSQL_5_6 (default) or
   * MYSQL_5_5
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseVersion;

  /**
   * Disk encryption configuration specific to an instance. Applies only to Second Generation
   * instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskEncryptionConfiguration diskEncryptionConfiguration;

  /**
   * Disk encryption status specific to an instance. Applies only to Second Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskEncryptionStatus diskEncryptionStatus;

  /**
   * This field is deprecated and will be removed from a future version of the API. Use the
   * settings.settingsVersion field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The name and status of the failover replica. This property is applicable only to Second
   * Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FailoverReplica failoverReplica;

  /**
   * The Compute Engine zone that the instance is currently serving from. This value could be
   * different from the zone that was specified when the instance was created if the instance has
   * failed over to its secondary zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gceZone;

  /**
   * The instance type. This can be one of the following. CLOUD_SQL_INSTANCE: A Cloud SQL instance
   * that is not replicating from a master. ON_PREMISES_INSTANCE: An instance running on the
   * customer's premises. READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceType;

  /**
   * The assigned IP addresses for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IpMapping> ipAddresses;

  /**
   * The IPv6 address assigned to the instance. This property is applicable only to First Generation
   * instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6Address;

  /**
   * This is always sql#instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the instance which will act as master in the replication setup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterInstanceName;

  /**
   * The maximum disk size of the instance in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxDiskSize;

  /**
   * Name of the Cloud SQL instance. This does not include the project ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Configuration specific to on-premises instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnPremisesConfiguration onPremisesConfiguration;

  /**
   * The project ID of the project containing the Cloud SQL instance. The Google apps domain is
   * prefixed if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * The geographical region. Can be us-central (FIRST_GEN instances only), us-central1 (SECOND_GEN
   * instances only), asia-east1 or europe-west1. Defaults to us-central or us-central1 depending on
   * the instance type (First Generation or Second Generation). The region can not be changed after
   * instance creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Configuration specific to failover replicas and read replicas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReplicaConfiguration replicaConfiguration;

  /**
   * The replicas of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> replicaNames;

  /**
   * The URI of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * SSL configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslCert serverCaCert;

  /**
   * The service account email address assigned to the instance. This property is applicable only to
   * Second Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmailAddress;

  /**
   * The user settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Settings settings;

  /**
   * The current serving state of the Cloud SQL instance. This can be one of the following.
   * RUNNABLE: The instance is running, or is ready to run when accessed. SUSPENDED: The instance is
   * not available, for example due to problems with billing. PENDING_CREATE: The instance is being
   * created. MAINTENANCE: The instance is down for maintenance. FAILED: The instance creation
   * failed. UNKNOWN_STATE: The state of the instance is unknown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * If the instance state is SUSPENDED, the reason for the suspension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suspensionReason;

  /**
   * FIRST_GEN: First Generation instance. MySQL only. SECOND_GEN: Second Generation instance or
   * PostgreSQL instance. EXTERNAL: A database server that is not managed by Google. This property
   * is read-only; use the tier property in the settings object to determine the database type and
   * Second or First Generation.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackendType() {
    return backendType;
  }

  /**
   * FIRST_GEN: First Generation instance. MySQL only. SECOND_GEN: Second Generation instance or
   * PostgreSQL instance. EXTERNAL: A database server that is not managed by Google. This property
   * is read-only; use the tier property in the settings object to determine the database type and
   * Second or First Generation.
   * @param backendType backendType or {@code null} for none
   */
  public DatabaseInstance setBackendType(java.lang.String backendType) {
    this.backendType = backendType;
    return this;
  }

  /**
   * Connection name of the Cloud SQL instance used in connection strings.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionName() {
    return connectionName;
  }

  /**
   * Connection name of the Cloud SQL instance used in connection strings.
   * @param connectionName connectionName or {@code null} for none
   */
  public DatabaseInstance setConnectionName(java.lang.String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  /**
   * The current disk usage of the instance in bytes. This property has been deprecated. Users
   * should use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring
   * API instead. Please see this announcement for details.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCurrentDiskSize() {
    return currentDiskSize;
  }

  /**
   * The current disk usage of the instance in bytes. This property has been deprecated. Users
   * should use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring
   * API instead. Please see this announcement for details.
   * @param currentDiskSize currentDiskSize or {@code null} for none
   */
  public DatabaseInstance setCurrentDiskSize(java.lang.Long currentDiskSize) {
    this.currentDiskSize = currentDiskSize;
    return this;
  }

  /**
   * The database engine type and version. The databaseVersion field can not be changed after
   * instance creation. MySQL Second Generation instances: MYSQL_5_7 (default) or MYSQL_5_6.
   * PostgreSQL instances: POSTGRES_9_6 MySQL First Generation instances: MYSQL_5_6 (default) or
   * MYSQL_5_5
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseVersion() {
    return databaseVersion;
  }

  /**
   * The database engine type and version. The databaseVersion field can not be changed after
   * instance creation. MySQL Second Generation instances: MYSQL_5_7 (default) or MYSQL_5_6.
   * PostgreSQL instances: POSTGRES_9_6 MySQL First Generation instances: MYSQL_5_6 (default) or
   * MYSQL_5_5
   * @param databaseVersion databaseVersion or {@code null} for none
   */
  public DatabaseInstance setDatabaseVersion(java.lang.String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

  /**
   * Disk encryption configuration specific to an instance. Applies only to Second Generation
   * instances.
   * @return value or {@code null} for none
   */
  public DiskEncryptionConfiguration getDiskEncryptionConfiguration() {
    return diskEncryptionConfiguration;
  }

  /**
   * Disk encryption configuration specific to an instance. Applies only to Second Generation
   * instances.
   * @param diskEncryptionConfiguration diskEncryptionConfiguration or {@code null} for none
   */
  public DatabaseInstance setDiskEncryptionConfiguration(DiskEncryptionConfiguration diskEncryptionConfiguration) {
    this.diskEncryptionConfiguration = diskEncryptionConfiguration;
    return this;
  }

  /**
   * Disk encryption status specific to an instance. Applies only to Second Generation instances.
   * @return value or {@code null} for none
   */
  public DiskEncryptionStatus getDiskEncryptionStatus() {
    return diskEncryptionStatus;
  }

  /**
   * Disk encryption status specific to an instance. Applies only to Second Generation instances.
   * @param diskEncryptionStatus diskEncryptionStatus or {@code null} for none
   */
  public DatabaseInstance setDiskEncryptionStatus(DiskEncryptionStatus diskEncryptionStatus) {
    this.diskEncryptionStatus = diskEncryptionStatus;
    return this;
  }

  /**
   * This field is deprecated and will be removed from a future version of the API. Use the
   * settings.settingsVersion field instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * This field is deprecated and will be removed from a future version of the API. Use the
   * settings.settingsVersion field instead.
   * @param etag etag or {@code null} for none
   */
  public DatabaseInstance setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The name and status of the failover replica. This property is applicable only to Second
   * Generation instances.
   * @return value or {@code null} for none
   */
  public FailoverReplica getFailoverReplica() {
    return failoverReplica;
  }

  /**
   * The name and status of the failover replica. This property is applicable only to Second
   * Generation instances.
   * @param failoverReplica failoverReplica or {@code null} for none
   */
  public DatabaseInstance setFailoverReplica(FailoverReplica failoverReplica) {
    this.failoverReplica = failoverReplica;
    return this;
  }

  /**
   * The Compute Engine zone that the instance is currently serving from. This value could be
   * different from the zone that was specified when the instance was created if the instance has
   * failed over to its secondary zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getGceZone() {
    return gceZone;
  }

  /**
   * The Compute Engine zone that the instance is currently serving from. This value could be
   * different from the zone that was specified when the instance was created if the instance has
   * failed over to its secondary zone.
   * @param gceZone gceZone or {@code null} for none
   */
  public DatabaseInstance setGceZone(java.lang.String gceZone) {
    this.gceZone = gceZone;
    return this;
  }

  /**
   * The instance type. This can be one of the following. CLOUD_SQL_INSTANCE: A Cloud SQL instance
   * that is not replicating from a master. ON_PREMISES_INSTANCE: An instance running on the
   * customer's premises. READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceType() {
    return instanceType;
  }

  /**
   * The instance type. This can be one of the following. CLOUD_SQL_INSTANCE: A Cloud SQL instance
   * that is not replicating from a master. ON_PREMISES_INSTANCE: An instance running on the
   * customer's premises. READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
   * @param instanceType instanceType or {@code null} for none
   */
  public DatabaseInstance setInstanceType(java.lang.String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * The assigned IP addresses for the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<IpMapping> getIpAddresses() {
    return ipAddresses;
  }

  /**
   * The assigned IP addresses for the instance.
   * @param ipAddresses ipAddresses or {@code null} for none
   */
  public DatabaseInstance setIpAddresses(java.util.List<IpMapping> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * The IPv6 address assigned to the instance. This property is applicable only to First Generation
   * instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6Address() {
    return ipv6Address;
  }

  /**
   * The IPv6 address assigned to the instance. This property is applicable only to First Generation
   * instances.
   * @param ipv6Address ipv6Address or {@code null} for none
   */
  public DatabaseInstance setIpv6Address(java.lang.String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * This is always sql#instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#instance.
   * @param kind kind or {@code null} for none
   */
  public DatabaseInstance setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the instance which will act as master in the replication setup.
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterInstanceName() {
    return masterInstanceName;
  }

  /**
   * The name of the instance which will act as master in the replication setup.
   * @param masterInstanceName masterInstanceName or {@code null} for none
   */
  public DatabaseInstance setMasterInstanceName(java.lang.String masterInstanceName) {
    this.masterInstanceName = masterInstanceName;
    return this;
  }

  /**
   * The maximum disk size of the instance in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxDiskSize() {
    return maxDiskSize;
  }

  /**
   * The maximum disk size of the instance in bytes.
   * @param maxDiskSize maxDiskSize or {@code null} for none
   */
  public DatabaseInstance setMaxDiskSize(java.lang.Long maxDiskSize) {
    this.maxDiskSize = maxDiskSize;
    return this;
  }

  /**
   * Name of the Cloud SQL instance. This does not include the project ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the Cloud SQL instance. This does not include the project ID.
   * @param name name or {@code null} for none
   */
  public DatabaseInstance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Configuration specific to on-premises instances.
   * @return value or {@code null} for none
   */
  public OnPremisesConfiguration getOnPremisesConfiguration() {
    return onPremisesConfiguration;
  }

  /**
   * Configuration specific to on-premises instances.
   * @param onPremisesConfiguration onPremisesConfiguration or {@code null} for none
   */
  public DatabaseInstance setOnPremisesConfiguration(OnPremisesConfiguration onPremisesConfiguration) {
    this.onPremisesConfiguration = onPremisesConfiguration;
    return this;
  }

  /**
   * The project ID of the project containing the Cloud SQL instance. The Google apps domain is
   * prefixed if applicable.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * The project ID of the project containing the Cloud SQL instance. The Google apps domain is
   * prefixed if applicable.
   * @param project project or {@code null} for none
   */
  public DatabaseInstance setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * The geographical region. Can be us-central (FIRST_GEN instances only), us-central1 (SECOND_GEN
   * instances only), asia-east1 or europe-west1. Defaults to us-central or us-central1 depending on
   * the instance type (First Generation or Second Generation). The region can not be changed after
   * instance creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The geographical region. Can be us-central (FIRST_GEN instances only), us-central1 (SECOND_GEN
   * instances only), asia-east1 or europe-west1. Defaults to us-central or us-central1 depending on
   * the instance type (First Generation or Second Generation). The region can not be changed after
   * instance creation.
   * @param region region or {@code null} for none
   */
  public DatabaseInstance setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Configuration specific to failover replicas and read replicas.
   * @return value or {@code null} for none
   */
  public ReplicaConfiguration getReplicaConfiguration() {
    return replicaConfiguration;
  }

  /**
   * Configuration specific to failover replicas and read replicas.
   * @param replicaConfiguration replicaConfiguration or {@code null} for none
   */
  public DatabaseInstance setReplicaConfiguration(ReplicaConfiguration replicaConfiguration) {
    this.replicaConfiguration = replicaConfiguration;
    return this;
  }

  /**
   * The replicas of the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReplicaNames() {
    return replicaNames;
  }

  /**
   * The replicas of the instance.
   * @param replicaNames replicaNames or {@code null} for none
   */
  public DatabaseInstance setReplicaNames(java.util.List<java.lang.String> replicaNames) {
    this.replicaNames = replicaNames;
    return this;
  }

  /**
   * The URI of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The URI of this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public DatabaseInstance setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * SSL configuration.
   * @return value or {@code null} for none
   */
  public SslCert getServerCaCert() {
    return serverCaCert;
  }

  /**
   * SSL configuration.
   * @param serverCaCert serverCaCert or {@code null} for none
   */
  public DatabaseInstance setServerCaCert(SslCert serverCaCert) {
    this.serverCaCert = serverCaCert;
    return this;
  }

  /**
   * The service account email address assigned to the instance. This property is applicable only to
   * Second Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmailAddress() {
    return serviceAccountEmailAddress;
  }

  /**
   * The service account email address assigned to the instance. This property is applicable only to
   * Second Generation instances.
   * @param serviceAccountEmailAddress serviceAccountEmailAddress or {@code null} for none
   */
  public DatabaseInstance setServiceAccountEmailAddress(java.lang.String serviceAccountEmailAddress) {
    this.serviceAccountEmailAddress = serviceAccountEmailAddress;
    return this;
  }

  /**
   * The user settings.
   * @return value or {@code null} for none
   */
  public Settings getSettings() {
    return settings;
  }

  /**
   * The user settings.
   * @param settings settings or {@code null} for none
   */
  public DatabaseInstance setSettings(Settings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * The current serving state of the Cloud SQL instance. This can be one of the following.
   * RUNNABLE: The instance is running, or is ready to run when accessed. SUSPENDED: The instance is
   * not available, for example due to problems with billing. PENDING_CREATE: The instance is being
   * created. MAINTENANCE: The instance is down for maintenance. FAILED: The instance creation
   * failed. UNKNOWN_STATE: The state of the instance is unknown.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current serving state of the Cloud SQL instance. This can be one of the following.
   * RUNNABLE: The instance is running, or is ready to run when accessed. SUSPENDED: The instance is
   * not available, for example due to problems with billing. PENDING_CREATE: The instance is being
   * created. MAINTENANCE: The instance is down for maintenance. FAILED: The instance creation
   * failed. UNKNOWN_STATE: The state of the instance is unknown.
   * @param state state or {@code null} for none
   */
  public DatabaseInstance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * If the instance state is SUSPENDED, the reason for the suspension.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuspensionReason() {
    return suspensionReason;
  }

  /**
   * If the instance state is SUSPENDED, the reason for the suspension.
   * @param suspensionReason suspensionReason or {@code null} for none
   */
  public DatabaseInstance setSuspensionReason(java.util.List<java.lang.String> suspensionReason) {
    this.suspensionReason = suspensionReason;
    return this;
  }

  @Override
  public DatabaseInstance set(String fieldName, Object value) {
    return (DatabaseInstance) super.set(fieldName, value);
  }

  @Override
  public DatabaseInstance clone() {
    return (DatabaseInstance) super.clone();
  }

  /**
   * The name and status of the failover replica. This property is applicable only to Second
   * Generation instances.
   */
  public static final class FailoverReplica extends com.google.api.client.json.GenericJson {

    /**
     * The availability status of the failover replica. A false status indicates that the failover
     * replica is out of sync. The master can only failover to the falover replica when the status is
     * true.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean available;

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is
     * created for the instance. The name doesn't include the project ID. This property is applicable
     * only to Second Generation instances.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The availability status of the failover replica. A false status indicates that the failover
     * replica is out of sync. The master can only failover to the falover replica when the status is
     * true.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAvailable() {
      return available;
    }

    /**
     * The availability status of the failover replica. A false status indicates that the failover
     * replica is out of sync. The master can only failover to the falover replica when the status is
     * true.
     * @param available available or {@code null} for none
     */
    public FailoverReplica setAvailable(java.lang.Boolean available) {
      this.available = available;
      return this;
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is
     * created for the instance. The name doesn't include the project ID. This property is applicable
     * only to Second Generation instances.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is
     * created for the instance. The name doesn't include the project ID. This property is applicable
     * only to Second Generation instances.
     * @param name name or {@code null} for none
     */
    public FailoverReplica setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public FailoverReplica set(String fieldName, Object value) {
      return (FailoverReplica) super.set(fieldName, value);
    }

    @Override
    public FailoverReplica clone() {
      return (FailoverReplica) super.clone();
    }

  }

}
