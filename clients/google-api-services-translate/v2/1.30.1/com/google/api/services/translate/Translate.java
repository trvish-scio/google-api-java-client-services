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

package com.google.api.services.translate;

/**
 * Service definition for Translate (v2).
 *
 * <p>
 * The Google Cloud Translation API lets websites and programs integrate with
    Google Translate programmatically.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://code.google.com/apis/language/translate/v2/getting_started.html" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TranslateRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Translate extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.9 of the Google Cloud Translation API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://translation.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "language/translate/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/translate";

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
  public Translate(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Translate(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Detections collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Translate translate = new Translate(...);}
   *   {@code Translate.Detections.List request = translate.detections().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Detections detections() {
    return new Detections();
  }

  /**
   * The "detections" collection of methods.
   */
  public class Detections {

    /**
     * Detects the language of text within a request.
     *
     * Create a request for the method "detections.detect".
     *
     * This request holds the parameters needed by the translate server.  After setting any optional
     * parameters, call the {@link Detect#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.translate.model.DetectLanguageRequest}
     * @return the request
     */
    public Detect detect(com.google.api.services.translate.model.DetectLanguageRequest content) throws java.io.IOException {
      Detect result = new Detect(content);
      initialize(result);
      return result;
    }

    public class Detect extends TranslateRequest<com.google.api.services.translate.model.DetectionsListResponse> {

      private static final String REST_PATH = "v2/detect";

      /**
       * Detects the language of text within a request.
       *
       * Create a request for the method "detections.detect".
       *
       * This request holds the parameters needed by the the translate server.  After setting any
       * optional parameters, call the {@link Detect#execute()} method to invoke the remote operation.
       * <p> {@link
       * Detect#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.translate.model.DetectLanguageRequest}
       * @since 1.13
       */
      protected Detect(com.google.api.services.translate.model.DetectLanguageRequest content) {
        super(Translate.this, "POST", REST_PATH, content, com.google.api.services.translate.model.DetectionsListResponse.class);
      }

      @Override
      public Detect set$Xgafv(java.lang.String $Xgafv) {
        return (Detect) super.set$Xgafv($Xgafv);
      }

      @Override
      public Detect setAccessToken(java.lang.String accessToken) {
        return (Detect) super.setAccessToken(accessToken);
      }

      @Override
      public Detect setAlt(java.lang.String alt) {
        return (Detect) super.setAlt(alt);
      }

      @Override
      public Detect setBearerToken(java.lang.String bearerToken) {
        return (Detect) super.setBearerToken(bearerToken);
      }

      @Override
      public Detect setCallback(java.lang.String callback) {
        return (Detect) super.setCallback(callback);
      }

      @Override
      public Detect setFields(java.lang.String fields) {
        return (Detect) super.setFields(fields);
      }

      @Override
      public Detect setKey(java.lang.String key) {
        return (Detect) super.setKey(key);
      }

      @Override
      public Detect setOauthToken(java.lang.String oauthToken) {
        return (Detect) super.setOauthToken(oauthToken);
      }

      @Override
      public Detect setPp(java.lang.Boolean pp) {
        return (Detect) super.setPp(pp);
      }

      @Override
      public Detect setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Detect) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Detect setQuotaUser(java.lang.String quotaUser) {
        return (Detect) super.setQuotaUser(quotaUser);
      }

      @Override
      public Detect setUploadType(java.lang.String uploadType) {
        return (Detect) super.setUploadType(uploadType);
      }

      @Override
      public Detect setUploadProtocol(java.lang.String uploadProtocol) {
        return (Detect) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Detect set(String parameterName, Object value) {
        return (Detect) super.set(parameterName, value);
      }
    }
    /**
     * Detects the language of text within a request.
     *
     * Create a request for the method "detections.list".
     *
     * This request holds the parameters needed by the translate server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @param q The input text upon which to perform language detection. Repeat this
    parameter to perform language
     *        detection on multiple text inputs.
     * @return the request
     */
    public List list(java.util.List<java.lang.String> q) throws java.io.IOException {
      List result = new List(q);
      initialize(result);
      return result;
    }

    public class List extends TranslateRequest<com.google.api.services.translate.model.DetectionsListResponse> {

      private static final String REST_PATH = "v2/detect";

      /**
       * Detects the language of text within a request.
       *
       * Create a request for the method "detections.list".
       *
       * This request holds the parameters needed by the the translate server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param q The input text upon which to perform language detection. Repeat this
    parameter to perform language
     *        detection on multiple text inputs.
       * @since 1.13
       */
      protected List(java.util.List<java.lang.String> q) {
        super(Translate.this, "GET", REST_PATH, null, com.google.api.services.translate.model.DetectionsListResponse.class);
        this.q = com.google.api.client.util.Preconditions.checkNotNull(q, "Required parameter q must be specified.");
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
      public List set$Xgafv(java.lang.String $Xgafv) {
        return (List) super.set$Xgafv($Xgafv);
      }

      @Override
      public List setAccessToken(java.lang.String accessToken) {
        return (List) super.setAccessToken(accessToken);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setBearerToken(java.lang.String bearerToken) {
        return (List) super.setBearerToken(bearerToken);
      }

      @Override
      public List setCallback(java.lang.String callback) {
        return (List) super.setCallback(callback);
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
      public List setPp(java.lang.Boolean pp) {
        return (List) super.setPp(pp);
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
      public List setUploadType(java.lang.String uploadType) {
        return (List) super.setUploadType(uploadType);
      }

      @Override
      public List setUploadProtocol(java.lang.String uploadProtocol) {
        return (List) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * The input text upon which to perform language detection. Repeat this parameter to perform
       * language detection on multiple text inputs.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> q;

      /** The input text upon which to perform language detection. Repeat this parameter to perform language
     detection on multiple text inputs.
       */
      public java.util.List<java.lang.String> getQ() {
        return q;
      }

      /**
       * The input text upon which to perform language detection. Repeat this parameter to perform
       * language detection on multiple text inputs.
       */
      public List setQ(java.util.List<java.lang.String> q) {
        this.q = q;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Languages collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Translate translate = new Translate(...);}
   *   {@code Translate.Languages.List request = translate.languages().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Languages languages() {
    return new Languages();
  }

  /**
   * The "languages" collection of methods.
   */
  public class Languages {

    /**
     * Returns a list of supported languages for translation.
     *
     * Create a request for the method "languages.list".
     *
     * This request holds the parameters needed by the translate server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends TranslateRequest<com.google.api.services.translate.model.LanguagesListResponse> {

      private static final String REST_PATH = "v2/languages";

      /**
       * Returns a list of supported languages for translation.
       *
       * Create a request for the method "languages.list".
       *
       * This request holds the parameters needed by the the translate server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(Translate.this, "GET", REST_PATH, null, com.google.api.services.translate.model.LanguagesListResponse.class);
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
      public List set$Xgafv(java.lang.String $Xgafv) {
        return (List) super.set$Xgafv($Xgafv);
      }

      @Override
      public List setAccessToken(java.lang.String accessToken) {
        return (List) super.setAccessToken(accessToken);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setBearerToken(java.lang.String bearerToken) {
        return (List) super.setBearerToken(bearerToken);
      }

      @Override
      public List setCallback(java.lang.String callback) {
        return (List) super.setCallback(callback);
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
      public List setPp(java.lang.Boolean pp) {
        return (List) super.setPp(pp);
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
      public List setUploadType(java.lang.String uploadType) {
        return (List) super.setUploadType(uploadType);
      }

      @Override
      public List setUploadProtocol(java.lang.String uploadProtocol) {
        return (List) super.setUploadProtocol(uploadProtocol);
      }

      /** The model type for which supported languages should be returned. */
      @com.google.api.client.util.Key
      private java.lang.String model;

      /** The model type for which supported languages should be returned.
       */
      public java.lang.String getModel() {
        return model;
      }

      /** The model type for which supported languages should be returned. */
      public List setModel(java.lang.String model) {
        this.model = model;
        return this;
      }

      /**
       * The language to use to return localized, human readable names of supported languages.
       */
      @com.google.api.client.util.Key
      private java.lang.String target;

      /** The language to use to return localized, human readable names of supported languages.
       */
      public java.lang.String getTarget() {
        return target;
      }

      /**
       * The language to use to return localized, human readable names of supported languages.
       */
      public List setTarget(java.lang.String target) {
        this.target = target;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Translations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Translate translate = new Translate(...);}
   *   {@code Translate.Translations.List request = translate.translations().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Translations translations() {
    return new Translations();
  }

  /**
   * The "translations" collection of methods.
   */
  public class Translations {

    /**
     * Translates input text, returning translated text.
     *
     * Create a request for the method "translations.list".
     *
     * This request holds the parameters needed by the translate server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @param q The input text to translate. Repeat this parameter to perform translation
    operations on multiple
     *        text inputs.
     * @param target The language to use for translation of the input text, set to one of the
    language codes listed in
     *        Language Support.
     * @return the request
     */
    public List list(java.util.List<java.lang.String> q, java.lang.String target) throws java.io.IOException {
      List result = new List(q, target);
      initialize(result);
      return result;
    }

    public class List extends TranslateRequest<com.google.api.services.translate.model.TranslationsListResponse> {

      private static final String REST_PATH = "v2";

      /**
       * Translates input text, returning translated text.
       *
       * Create a request for the method "translations.list".
       *
       * This request holds the parameters needed by the the translate server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param q The input text to translate. Repeat this parameter to perform translation
    operations on multiple
     *        text inputs.
       * @param target The language to use for translation of the input text, set to one of the
    language codes listed in
     *        Language Support.
       * @since 1.13
       */
      protected List(java.util.List<java.lang.String> q, java.lang.String target) {
        super(Translate.this, "GET", REST_PATH, null, com.google.api.services.translate.model.TranslationsListResponse.class);
        this.q = com.google.api.client.util.Preconditions.checkNotNull(q, "Required parameter q must be specified.");
        this.target = com.google.api.client.util.Preconditions.checkNotNull(target, "Required parameter target must be specified.");
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
      public List set$Xgafv(java.lang.String $Xgafv) {
        return (List) super.set$Xgafv($Xgafv);
      }

      @Override
      public List setAccessToken(java.lang.String accessToken) {
        return (List) super.setAccessToken(accessToken);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setBearerToken(java.lang.String bearerToken) {
        return (List) super.setBearerToken(bearerToken);
      }

      @Override
      public List setCallback(java.lang.String callback) {
        return (List) super.setCallback(callback);
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
      public List setPp(java.lang.Boolean pp) {
        return (List) super.setPp(pp);
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
      public List setUploadType(java.lang.String uploadType) {
        return (List) super.setUploadType(uploadType);
      }

      @Override
      public List setUploadProtocol(java.lang.String uploadProtocol) {
        return (List) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * The input text to translate. Repeat this parameter to perform translation operations on
       * multiple text inputs.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> q;

      /** The input text to translate. Repeat this parameter to perform translation operations on multiple
     text inputs.
       */
      public java.util.List<java.lang.String> getQ() {
        return q;
      }

      /**
       * The input text to translate. Repeat this parameter to perform translation operations on
       * multiple text inputs.
       */
      public List setQ(java.util.List<java.lang.String> q) {
        this.q = q;
        return this;
      }

      /**
       * The language to use for translation of the input text, set to one of the language codes
       * listed in Language Support.
       */
      @com.google.api.client.util.Key
      private java.lang.String target;

      /** The language to use for translation of the input text, set to one of the language codes listed in
     Language Support.
       */
      public java.lang.String getTarget() {
        return target;
      }

      /**
       * The language to use for translation of the input text, set to one of the language codes
       * listed in Language Support.
       */
      public List setTarget(java.lang.String target) {
        this.target = target;
        return this;
      }

      /** The customization id for translate */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> cid;

      /** The customization id for translate
       */
      public java.util.List<java.lang.String> getCid() {
        return cid;
      }

      /** The customization id for translate */
      public List setCid(java.util.List<java.lang.String> cid) {
        this.cid = cid;
        return this;
      }

      /**
       * The format of the source text, in either HTML (default) or plain-text. A value of "html"
       * indicates HTML and a value of "text" indicates plain-text.
       */
      @com.google.api.client.util.Key
      private java.lang.String format;

      /** The format of the source text, in either HTML (default) or plain-text. A value of "html" indicates
     HTML and a value of "text" indicates plain-text.
       */
      public java.lang.String getFormat() {
        return format;
      }

      /**
       * The format of the source text, in either HTML (default) or plain-text. A value of "html"
       * indicates HTML and a value of "text" indicates plain-text.
       */
      public List setFormat(java.lang.String format) {
        this.format = format;
        return this;
      }

      /**
       * The `model` type requested for this translation. Valid values are listed in public
       * documentation.
       */
      @com.google.api.client.util.Key
      private java.lang.String model;

      /** The `model` type requested for this translation. Valid values are listed in public documentation.
       */
      public java.lang.String getModel() {
        return model;
      }

      /**
       * The `model` type requested for this translation. Valid values are listed in public
       * documentation.
       */
      public List setModel(java.lang.String model) {
        this.model = model;
        return this;
      }

      /**
       * The language of the source text, set to one of the language codes listed in Language
       * Support. If the source language is not specified, the API will attempt to identify the
       * source language automatically and return it within the response.
       */
      @com.google.api.client.util.Key
      private java.lang.String source;

      /** The language of the source text, set to one of the language codes listed in Language Support. If
     the source language is not specified, the API will attempt to identify the source language
     automatically and return it within the response.
       */
      public java.lang.String getSource() {
        return source;
      }

      /**
       * The language of the source text, set to one of the language codes listed in Language
       * Support. If the source language is not specified, the API will attempt to identify the
       * source language automatically and return it within the response.
       */
      public List setSource(java.lang.String source) {
        this.source = source;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }
    /**
     * Translates input text, returning translated text.
     *
     * Create a request for the method "translations.translate".
     *
     * This request holds the parameters needed by the translate server.  After setting any optional
     * parameters, call the {@link TranslateOperation#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.translate.model.TranslateTextRequest}
     * @return the request
     */
    public TranslateOperation translate(com.google.api.services.translate.model.TranslateTextRequest content) throws java.io.IOException {
      TranslateOperation result = new TranslateOperation(content);
      initialize(result);
      return result;
    }

    public class TranslateOperation extends TranslateRequest<com.google.api.services.translate.model.TranslationsListResponse> {

      private static final String REST_PATH = "v2";

      /**
       * Translates input text, returning translated text.
       *
       * Create a request for the method "translations.translate".
       *
       * This request holds the parameters needed by the the translate server.  After setting any
       * optional parameters, call the {@link TranslateOperation#execute()} method to invoke the remote
       * operation. <p> {@link TranslateOperation#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.translate.model.TranslateTextRequest}
       * @since 1.13
       */
      protected TranslateOperation(com.google.api.services.translate.model.TranslateTextRequest content) {
        super(Translate.this, "POST", REST_PATH, content, com.google.api.services.translate.model.TranslationsListResponse.class);
      }

      @Override
      public TranslateOperation set$Xgafv(java.lang.String $Xgafv) {
        return (TranslateOperation) super.set$Xgafv($Xgafv);
      }

      @Override
      public TranslateOperation setAccessToken(java.lang.String accessToken) {
        return (TranslateOperation) super.setAccessToken(accessToken);
      }

      @Override
      public TranslateOperation setAlt(java.lang.String alt) {
        return (TranslateOperation) super.setAlt(alt);
      }

      @Override
      public TranslateOperation setBearerToken(java.lang.String bearerToken) {
        return (TranslateOperation) super.setBearerToken(bearerToken);
      }

      @Override
      public TranslateOperation setCallback(java.lang.String callback) {
        return (TranslateOperation) super.setCallback(callback);
      }

      @Override
      public TranslateOperation setFields(java.lang.String fields) {
        return (TranslateOperation) super.setFields(fields);
      }

      @Override
      public TranslateOperation setKey(java.lang.String key) {
        return (TranslateOperation) super.setKey(key);
      }

      @Override
      public TranslateOperation setOauthToken(java.lang.String oauthToken) {
        return (TranslateOperation) super.setOauthToken(oauthToken);
      }

      @Override
      public TranslateOperation setPp(java.lang.Boolean pp) {
        return (TranslateOperation) super.setPp(pp);
      }

      @Override
      public TranslateOperation setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (TranslateOperation) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public TranslateOperation setQuotaUser(java.lang.String quotaUser) {
        return (TranslateOperation) super.setQuotaUser(quotaUser);
      }

      @Override
      public TranslateOperation setUploadType(java.lang.String uploadType) {
        return (TranslateOperation) super.setUploadType(uploadType);
      }

      @Override
      public TranslateOperation setUploadProtocol(java.lang.String uploadProtocol) {
        return (TranslateOperation) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public TranslateOperation set(String parameterName, Object value) {
        return (TranslateOperation) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Translate}.
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
          true);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Translate}. */
    @Override
    public Translate build() {
      return new Translate(this);
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
     * Set the {@link TranslateRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTranslateRequestInitializer(
        TranslateRequestInitializer translateRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(translateRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
