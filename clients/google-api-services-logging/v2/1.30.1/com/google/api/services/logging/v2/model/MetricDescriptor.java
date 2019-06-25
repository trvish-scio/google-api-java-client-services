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

package com.google.api.services.logging.v2.model;

/**
 * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering
 * it stops data collection and makes the metric type's existing data unusable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Logging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * A detailed description of the metric, which can be used in documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
   * without an ending period, for example "Request count". This field is optional but it is
   * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The set of labels that can be used to describe a specific instance of this metric type. For
   * example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
   * for the HTTP response code, response_code, so you can look at latencies for successful
   * responses or just for responses that failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelDescriptor> labels;

  static {
    // hack to force ProGuard to consider LabelDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelDescriptor.class);
  }

  /**
   * Optional. The launch stage of the metric definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * Optional. Metadata which can be used to guide usage of the metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricDescriptorMetadata metadata;

  /**
   * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of
   * metric_kind and value_type might not be supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricKind;

  /**
   * The resource name of the metric descriptor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined
   * metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types
   * should use a natural hierarchical grouping. For example:
   * "custom.googleapis.com/invoice/paid/amount" "external.googleapis.com/prometheus/up"
   * "appengine.googleapis.com/http/server/response_latencies"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The unit in which the metric value is reported. It is only applicable if the value_type is
   * INT64, DOUBLE, or DISTRIBUTION. The supported units are a subset of The Unified Code for Units
   * of Measure (http://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s
   * second min minute h hour d dayPrefixes (PREFIX) k kilo (10**3) M mega (10**6) G giga (10**9) T
   * tera (10**12) P peta (10**15) E exa (10**18) Z zetta (10**21) Y yotta (10**24) m milli (10**-3)
   * u micro (10**-6) n nano (10**-9) p pico (10**-12) f femto (10**-15) a atto (10**-18) z zepto
   * (10**-21) y yocto (10**-24) Ki kibi (2**10) Mi mebi (2**20) Gi gibi (2**30) Ti tebi
   * (2**40)GrammarThe grammar also includes these connectors: / division (as an infix operator,
   * e.g. 1/s). . multiplication (as an infix operator, e.g. GBy.d)The grammar for a unit is as
   * follows: Expression = Component { "." Component } { "/" Component } ;
   *
   * Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]           | Annotation           | "1"
   * ;
   *
   * Annotation = "{" NAME "}" ; Notes: Annotation is just a comment if it follows a UNIT and is
   * equivalent to 1 if it is used alone. For examples,  {requests}/s == 1/s, By{transmitted}/s ==
   * By/s. NAME is a sequence of non-blank printable ASCII characters not  containing '{' or '}'. 1
   * represents dimensionless value 1, such as in 1/s. % represents dimensionless value 1/100, and
   * annotates values giving  a percentage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Whether the measurement is an integer, a floating-point number, etc. Some combinations of
   * metric_kind and value_type might not be supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * A detailed description of the metric, which can be used in documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A detailed description of the metric, which can be used in documentation.
   * @param description description or {@code null} for none
   */
  public MetricDescriptor setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
   * without an ending period, for example "Request count". This field is optional but it is
   * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
   * without an ending period, for example "Request count". This field is optional but it is
   * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
   * @param displayName displayName or {@code null} for none
   */
  public MetricDescriptor setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The set of labels that can be used to describe a specific instance of this metric type. For
   * example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
   * for the HTTP response code, response_code, so you can look at latencies for successful
   * responses or just for responses that failed.
   * @return value or {@code null} for none
   */
  public java.util.List<LabelDescriptor> getLabels() {
    return labels;
  }

  /**
   * The set of labels that can be used to describe a specific instance of this metric type. For
   * example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
   * for the HTTP response code, response_code, so you can look at latencies for successful
   * responses or just for responses that failed.
   * @param labels labels or {@code null} for none
   */
  public MetricDescriptor setLabels(java.util.List<LabelDescriptor> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The launch stage of the metric definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * Optional. The launch stage of the metric definition.
   * @param launchStage launchStage or {@code null} for none
   */
  public MetricDescriptor setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * Optional. Metadata which can be used to guide usage of the metric.
   * @return value or {@code null} for none
   */
  public MetricDescriptorMetadata getMetadata() {
    return metadata;
  }

  /**
   * Optional. Metadata which can be used to guide usage of the metric.
   * @param metadata metadata or {@code null} for none
   */
  public MetricDescriptor setMetadata(MetricDescriptorMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of
   * metric_kind and value_type might not be supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricKind() {
    return metricKind;
  }

  /**
   * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of
   * metric_kind and value_type might not be supported.
   * @param metricKind metricKind or {@code null} for none
   */
  public MetricDescriptor setMetricKind(java.lang.String metricKind) {
    this.metricKind = metricKind;
    return this;
  }

  /**
   * The resource name of the metric descriptor.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the metric descriptor.
   * @param name name or {@code null} for none
   */
  public MetricDescriptor setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined
   * metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types
   * should use a natural hierarchical grouping. For example:
   * "custom.googleapis.com/invoice/paid/amount" "external.googleapis.com/prometheus/up"
   * "appengine.googleapis.com/http/server/response_latencies"
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined
   * metric types have the DNS name custom.googleapis.com or external.googleapis.com. Metric types
   * should use a natural hierarchical grouping. For example:
   * "custom.googleapis.com/invoice/paid/amount" "external.googleapis.com/prometheus/up"
   * "appengine.googleapis.com/http/server/response_latencies"
   * @param type type or {@code null} for none
   */
  public MetricDescriptor setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The unit in which the metric value is reported. It is only applicable if the value_type is
   * INT64, DOUBLE, or DISTRIBUTION. The supported units are a subset of The Unified Code for Units
   * of Measure (http://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s
   * second min minute h hour d dayPrefixes (PREFIX) k kilo (10**3) M mega (10**6) G giga (10**9) T
   * tera (10**12) P peta (10**15) E exa (10**18) Z zetta (10**21) Y yotta (10**24) m milli (10**-3)
   * u micro (10**-6) n nano (10**-9) p pico (10**-12) f femto (10**-15) a atto (10**-18) z zepto
   * (10**-21) y yocto (10**-24) Ki kibi (2**10) Mi mebi (2**20) Gi gibi (2**30) Ti tebi
   * (2**40)GrammarThe grammar also includes these connectors: / division (as an infix operator,
   * e.g. 1/s). . multiplication (as an infix operator, e.g. GBy.d)The grammar for a unit is as
   * follows: Expression = Component { "." Component } { "/" Component } ;
   *
   * Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]           | Annotation           | "1"
   * ;
   *
   * Annotation = "{" NAME "}" ; Notes: Annotation is just a comment if it follows a UNIT and is
   * equivalent to 1 if it is used alone. For examples,  {requests}/s == 1/s, By{transmitted}/s ==
   * By/s. NAME is a sequence of non-blank printable ASCII characters not  containing '{' or '}'. 1
   * represents dimensionless value 1, such as in 1/s. % represents dimensionless value 1/100, and
   * annotates values giving  a percentage.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The unit in which the metric value is reported. It is only applicable if the value_type is
   * INT64, DOUBLE, or DISTRIBUTION. The supported units are a subset of The Unified Code for Units
   * of Measure (http://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit By byte s
   * second min minute h hour d dayPrefixes (PREFIX) k kilo (10**3) M mega (10**6) G giga (10**9) T
   * tera (10**12) P peta (10**15) E exa (10**18) Z zetta (10**21) Y yotta (10**24) m milli (10**-3)
   * u micro (10**-6) n nano (10**-9) p pico (10**-12) f femto (10**-15) a atto (10**-18) z zepto
   * (10**-21) y yocto (10**-24) Ki kibi (2**10) Mi mebi (2**20) Gi gibi (2**30) Ti tebi
   * (2**40)GrammarThe grammar also includes these connectors: / division (as an infix operator,
   * e.g. 1/s). . multiplication (as an infix operator, e.g. GBy.d)The grammar for a unit is as
   * follows: Expression = Component { "." Component } { "/" Component } ;
   *
   * Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]           | Annotation           | "1"
   * ;
   *
   * Annotation = "{" NAME "}" ; Notes: Annotation is just a comment if it follows a UNIT and is
   * equivalent to 1 if it is used alone. For examples,  {requests}/s == 1/s, By{transmitted}/s ==
   * By/s. NAME is a sequence of non-blank printable ASCII characters not  containing '{' or '}'. 1
   * represents dimensionless value 1, such as in 1/s. % represents dimensionless value 1/100, and
   * annotates values giving  a percentage.
   * @param unit unit or {@code null} for none
   */
  public MetricDescriptor setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Whether the measurement is an integer, a floating-point number, etc. Some combinations of
   * metric_kind and value_type might not be supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * Whether the measurement is an integer, a floating-point number, etc. Some combinations of
   * metric_kind and value_type might not be supported.
   * @param valueType valueType or {@code null} for none
   */
  public MetricDescriptor setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public MetricDescriptor set(String fieldName, Object value) {
    return (MetricDescriptor) super.set(fieldName, value);
  }

  @Override
  public MetricDescriptor clone() {
    return (MetricDescriptor) super.clone();
  }

}
