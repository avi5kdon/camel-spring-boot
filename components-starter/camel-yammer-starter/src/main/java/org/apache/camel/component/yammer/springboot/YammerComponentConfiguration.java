/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.yammer.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Interact with the Yammer enterprise social network.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.yammer")
public class YammerComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the yammer component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Set to true if you want to use raw JSON rather than converting to POJOs.
     */
    private Boolean useJson = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Delay between polling in millis. The option is a long type.
     */
    private String delay = "5000";
    /**
     * Return only the specified number of messages. Works for threaded set to
     * true and threaded set to extended.
     */
    private Integer limit = -1;
    /**
     * Returns messages newer than the message ID specified as a numeric string.
     * This should be used when polling for new messages. If you're looking at
     * messages, and the most recent message returned is 3516, you can make a
     * request with the parameter newerThan equals to 3516 to ensure that you do
     * not get duplicate copies of messages already on your page.
     */
    private Long newerThan = -1L;
    /**
     * Returns messages older than the message ID specified as a numeric string.
     * This is useful for paginating messages. For example, if you're currently
     * viewing 20 messages and the oldest is number 2912, you could append
     * olderThan equals to 2912 to your request to get the 20 messages prior to
     * those you're seeing.
     */
    private Long olderThan = -1L;
    /**
     * threaded equals to true will only return the first message in each
     * thread. This parameter is intended for apps which display message threads
     * collapsed. threaded equals to extended will return the thread starter
     * messages in order of most recently active as well as the two most recent
     * messages, as they are viewed in the default view on the Yammer web
     * interface.
     */
    private String threaded;
    /**
     * The user id
     */
    private String userId;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Component configuration. The option is a
     * org.apache.camel.component.yammer.YammerConfiguration type.
     */
    private String configuration;
    /**
     * To use a specific requester to communicate with Yammer. The option is a
     * org.apache.camel.component.yammer.ApiRequestor type.
     */
    private String requestor;
    /**
     * The access token
     */
    private String accessToken;
    /**
     * The consumer key
     */
    private String consumerKey;
    /**
     * The consumer secret
     */
    private String consumerSecret;

    public Boolean getUseJson() {
        return useJson;
    }

    public void setUseJson(Boolean useJson) {
        this.useJson = useJson;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Long getNewerThan() {
        return newerThan;
    }

    public void setNewerThan(Long newerThan) {
        this.newerThan = newerThan;
    }

    public Long getOlderThan() {
        return olderThan;
    }

    public void setOlderThan(Long olderThan) {
        this.olderThan = olderThan;
    }

    public String getThreaded() {
        return threaded;
    }

    public void setThreaded(String threaded) {
        this.threaded = threaded;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }
}