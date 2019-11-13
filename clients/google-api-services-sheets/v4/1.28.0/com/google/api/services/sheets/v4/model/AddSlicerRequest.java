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

package com.google.api.services.sheets.v4.model;

/**
 * Adds a slicer to a sheet in the spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddSlicerRequest extends com.google.api.client.json.GenericJson {

  /**
   * The slicer that should be added to the spreadsheet, including the position where it should be
   * placed. The slicerId field is optional; if one is not set, an id will be randomly generated.
   * (It is an error to specify the ID of a slicer that already exists.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Slicer slicer;

  /**
   * The slicer that should be added to the spreadsheet, including the position where it should be
   * placed. The slicerId field is optional; if one is not set, an id will be randomly generated.
   * (It is an error to specify the ID of a slicer that already exists.)
   * @return value or {@code null} for none
   */
  public Slicer getSlicer() {
    return slicer;
  }

  /**
   * The slicer that should be added to the spreadsheet, including the position where it should be
   * placed. The slicerId field is optional; if one is not set, an id will be randomly generated.
   * (It is an error to specify the ID of a slicer that already exists.)
   * @param slicer slicer or {@code null} for none
   */
  public AddSlicerRequest setSlicer(Slicer slicer) {
    this.slicer = slicer;
    return this;
  }

  @Override
  public AddSlicerRequest set(String fieldName, Object value) {
    return (AddSlicerRequest) super.set(fieldName, value);
  }

  @Override
  public AddSlicerRequest clone() {
    return (AddSlicerRequest) super.clone();
  }

}