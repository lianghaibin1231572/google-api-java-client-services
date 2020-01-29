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

package com.google.api.services.bigqueryreservation.v1beta1.model;

/**
 * Capacity commitment is a way to purchase compute capacity for BigQuery jobs (in the form of
 * slots) with some minimum committed period of usage. Capacity commitment is immutable and cannot
 * be deleted until the end of the commitment period. After the end of the commitment period, slots
 * are still available but can be freely removed any time. Annual commitments will automatically be
 * downgraded to monthly after the commitment ends.
 *
 * A capacity commitment resource exists as a child resource of the admin project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Reservation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CapacityCommitment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The end of the commitment period. Capacity commitment cannot be removed before
   * commitment_end_time. It is applicable only for ACTIVE capacity commitments and is computed as a
   * combination of the plan and the time when the capacity commitment became ACTIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String commitmentEndTime;

  /**
   * Output only. For FAILED commitment plan, provides the reason of failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status failureStatus;

  /**
   * Output only. The resource name of the capacity commitment, e.g.,
   * projects/myproject/locations/US/capacityCommitments/123
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Capacity commitment commitment plan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plan;

  /**
   * Number of slots in this commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long slotCount;

  /**
   * Output only. State of the commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The end of the commitment period. Capacity commitment cannot be removed before
   * commitment_end_time. It is applicable only for ACTIVE capacity commitments and is computed as a
   * combination of the plan and the time when the capacity commitment became ACTIVE.
   * @return value or {@code null} for none
   */
  public String getCommitmentEndTime() {
    return commitmentEndTime;
  }

  /**
   * Output only. The end of the commitment period. Capacity commitment cannot be removed before
   * commitment_end_time. It is applicable only for ACTIVE capacity commitments and is computed as a
   * combination of the plan and the time when the capacity commitment became ACTIVE.
   * @param commitmentEndTime commitmentEndTime or {@code null} for none
   */
  public CapacityCommitment setCommitmentEndTime(String commitmentEndTime) {
    this.commitmentEndTime = commitmentEndTime;
    return this;
  }

  /**
   * Output only. For FAILED commitment plan, provides the reason of failure.
   * @return value or {@code null} for none
   */
  public Status getFailureStatus() {
    return failureStatus;
  }

  /**
   * Output only. For FAILED commitment plan, provides the reason of failure.
   * @param failureStatus failureStatus or {@code null} for none
   */
  public CapacityCommitment setFailureStatus(Status failureStatus) {
    this.failureStatus = failureStatus;
    return this;
  }

  /**
   * Output only. The resource name of the capacity commitment, e.g.,
   * projects/myproject/locations/US/capacityCommitments/123
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the capacity commitment, e.g.,
   * projects/myproject/locations/US/capacityCommitments/123
   * @param name name or {@code null} for none
   */
  public CapacityCommitment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Capacity commitment commitment plan.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlan() {
    return plan;
  }

  /**
   * Capacity commitment commitment plan.
   * @param plan plan or {@code null} for none
   */
  public CapacityCommitment setPlan(java.lang.String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Number of slots in this commitment.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSlotCount() {
    return slotCount;
  }

  /**
   * Number of slots in this commitment.
   * @param slotCount slotCount or {@code null} for none
   */
  public CapacityCommitment setSlotCount(java.lang.Long slotCount) {
    this.slotCount = slotCount;
    return this;
  }

  /**
   * Output only. State of the commitment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the commitment.
   * @param state state or {@code null} for none
   */
  public CapacityCommitment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public CapacityCommitment set(String fieldName, Object value) {
    return (CapacityCommitment) super.set(fieldName, value);
  }

  @Override
  public CapacityCommitment clone() {
    return (CapacityCommitment) super.clone();
  }

}