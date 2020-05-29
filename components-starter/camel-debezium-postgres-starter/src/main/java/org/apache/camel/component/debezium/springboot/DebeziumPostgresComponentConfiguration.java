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
package org.apache.camel.component.debezium.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Capture changes from a PostgresSQL database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.debezium-postgres")
public class DebeziumPostgresComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the debezium-postgres component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Additional properties for debezium components in case they can't be set
     * directly on the camel configurations (e.g: setting Kafka Connect
     * properties needed by Debezium engine, for example setting
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
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
     * Allow pre-configured Configurations to be set. The option is a
     * org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration type.
     */
    private String configuration;
    /**
     * The Converter class that should be used to serialize and deserialize key
     * data for offsets. The default is JSON converter.
     */
    private String internalKeyConverter = "org.apache.kafka.connect.json.JsonConverter";
    /**
     * The Converter class that should be used to serialize and deserialize
     * value data for offsets. The default is JSON converter.
     */
    private String internalValueConverter = "org.apache.kafka.connect.json.JsonConverter";
    /**
     * The name of the Java class of the commit policy. It defines when offsets
     * commit has to be triggered based on the number of events processed and
     * the time elapsed since the last commit. This class must implement the
     * interface 'OffsetCommitPolicy'. The default is a periodic commit policy
     * based upon time intervals.
     */
    private String offsetCommitPolicy = "io.debezium.embedded.spi.OffsetCommitPolicy.PeriodicCommitOffsetPolicy";
    /**
     * Maximum number of milliseconds to wait for records to flush and partition
     * offset data to be committed to offset storage before cancelling the
     * process and restoring the offset data to be committed in a future
     * attempt. The default is 5 seconds. The option is a long type.
     */
    private String offsetCommitTimeoutMs = "5s";
    /**
     * Interval at which to try committing offsets. The default is 1 minute. The
     * option is a long type.
     */
    private String offsetFlushIntervalMs = "60s";
    /**
     * The name of the Java class that is responsible for persistence of
     * connector offsets.
     */
    private String offsetStorage = "org.apache.kafka.connect.storage.FileOffsetBackingStore";
    /**
     * Path to file where offsets are to be stored. Required when offset.storage
     * is set to the FileOffsetBackingStore.
     */
    private String offsetStorageFileName;
    /**
     * The number of partitions used when creating the offset storage topic.
     * Required when offset.storage is set to the 'KafkaOffsetBackingStore'.
     */
    private Integer offsetStoragePartitions;
    /**
     * Replication factor used when creating the offset storage topic. Required
     * when offset.storage is set to the KafkaOffsetBackingStore
     */
    private Integer offsetStorageReplicationFactor;
    /**
     * The name of the Kafka topic where offsets are to be stored. Required when
     * offset.storage is set to the KafkaOffsetBackingStore.
     */
    private String offsetStorageTopic;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Description is not available here, please check Debezium website for
     * corresponding key 'column.blacklist' description.
     */
    private String columnBlacklist;
    /**
     * The name of the database the connector should be monitoring
     */
    private String databaseDbname;
    /**
     * The path to the file that will be used to record the database history
     */
    private String databaseHistoryFileFilename;
    /**
     * Resolvable hostname or IP address of the Postgres database server.
     */
    private String databaseHostname;
    /**
     * A semicolon separated list of SQL statements to be executed when a JDBC
     * connection to the database is established. Note that the connector may
     * establish JDBC connections at its own discretion, so this should
     * typically be used for configurationof session parameters only, but not
     * for executing DML statements. Use doubled semicolon (';;') to use a
     * semicolon as a character and not as a delimiter.
     */
    private String databaseInitialStatements;
    /**
     * Password of the Postgres database user to be used when connecting to the
     * database.
     */
    private String databasePassword;
    /**
     * Port of the Postgres database server.
     */
    private Integer databasePort = 5432;
    /**
     * Unique name that identifies the database server and all recorded offsets,
     * and that is used as a prefix for all schemas and topics. Each distinct
     * installation should have a separate namespace and be monitored by at most
     * one Debezium connector.
     */
    private String databaseServerName;
    /**
     * File containing the SSL Certificate for the client. See the Postgres SSL
     * docs for further information
     */
    private String databaseSslcert;
    /**
     * A name of class to that creates SSL Sockets. Use
     * org.postgresql.ssl.NonValidatingFactory to disable SSL validation in
     * development environments
     */
    private String databaseSslfactory;
    /**
     * File containing the SSL private key for the client. See the Postgres SSL
     * docs for further information
     */
    private String databaseSslkey;
    /**
     * Whether to use an encrypted connection to Postgres. Options
     * include'disable' (the default) to use an unencrypted connection;
     * 'require' to use a secure (encrypted) connection, and fail if one cannot
     * be established; 'verify-ca' like 'required' but additionally verify the
     * server TLS certificate against the configured Certificate Authority (CA)
     * certificates, or fail if no valid matching CA certificates are found;
     * or'verify-full' like 'verify-ca' but additionally verify that the server
     * certificate matches the host to which the connection is attempted.
     */
    private String databaseSslmode = "disable";
    /**
     * Password to access the client private key from the file specified by
     * 'database.sslkey'. See the Postgres SSL docs for further information
     */
    private String databaseSslpassword;
    /**
     * File containing the root certificate(s) against which the server is
     * validated. See the Postgres JDBC SSL docs for further information
     */
    private String databaseSslrootcert;
    /**
     * Enable or disable TCP keep-alive probe to avoid dropping TCP connection
     */
    private Boolean databaseTcpkeepalive = true;
    /**
     * Name of the Postgres database user to be used when connecting to the
     * database.
     */
    private String databaseUser;
    /**
     * Specify how DECIMAL and NUMERIC columns should be represented in change
     * events, including:'precise' (the default) uses java.math.BigDecimal to
     * represent values, which are encoded in the change events using a binary
     * representation and Kafka Connect's
     * 'org.apache.kafka.connect.data.Decimal' type; 'string' uses string to
     * represent values; 'double' represents values using Java's 'double', which
     * may not offer the precision but will be far easier to use in consumers.
     */
    private String decimalHandlingMode = "precise";
    /**
     * Specify how failures during processing of events (i.e. when encountering
     * a corrupted event) should be handled, including:'fail' (the default) an
     * exception indicating the problematic event and its position is raised,
     * causing the connector to be stopped; 'warn' the problematic event and its
     * position will be logged and the event will be skipped;'ignore' the
     * problematic event will be skipped.
     */
    private String eventProcessingFailureHandlingMode = "fail";
    /**
     * The query executed with every heartbeat. Defaults to an empty string.
     */
    private String heartbeatActionQuery;
    /**
     * Length of an interval in milli-seconds in in which the connector
     * periodically sends heartbeat messages to a heartbeat topic. Use 0 to
     * disable heartbeat messages. Disabled by default.
     */
    private Integer heartbeatIntervalMs = 0;
    /**
     * The prefix that is used to name heartbeat topics.Defaults to
     * __debezium-heartbeat.
     */
    private String heartbeatTopicsPrefix = "__debezium-heartbeat";
    /**
     * Specify how HSTORE columns should be represented in change events,
     * including:'json' represents values as string-ified JSON (default)'map'
     * represents values as a key/value map
     */
    private String hstoreHandlingMode = "json";
    /**
     * Specify whether the fields of data type not supported by Debezium should
     * be processed:'false' (the default) omits the fields; 'true' converts the
     * field into an implementation dependent binary representation.
     */
    private Boolean includeUnknownDatatypes = false;
    /**
     * Specify how INTERVAL columns should be represented in change events,
     * including:'string' represents values as an exact ISO formatted
     * string'numeric' (default) represents values using the inexact conversion
     * into microseconds
     */
    private String intervalHandlingMode = "numeric";
    /**
     * Maximum size of each batch of source records. Defaults to 2048.
     */
    private Integer maxBatchSize = 2048;
    /**
     * Maximum size of the queue for change events read from the database log
     * but not yet recorded or forwarded. Defaults to 8192, and should always be
     * larger than the maximum batch size.
     */
    private Integer maxQueueSize = 8192;
    /**
     * A semicolon-separated list of expressions that match fully-qualified
     * tables and column(s) to be used as message key. Each expression must
     * match the pattern ':',where the table names could be defined as
     * (DB_NAME.TABLE_NAME) or (SCHEMA_NAME.TABLE_NAME), depending on the
     * specific connector,and the key columns are a comma-separated list of
     * columns representing the custom key. For any table without an explicit
     * key configuration the table's primary key column(s) will be used as
     * message key.Example:
     * dbserver1.inventory.orderlines:orderId,orderLineId;dbserver1.inventory.orders:id
     */
    private String messageKeyColumns;
    /**
     * The name of the Postgres logical decoding plugin installed on the server.
     * Supported values are 'decoderbufs' and 'wal2json'. Defaults to
     * 'decoderbufs'.
     */
    private String pluginName = "decoderbufs";
    /**
     * Frequency in milliseconds to wait for new change events to appear after
     * receiving no events. Defaults to 500ms.
     */
    private Long pollIntervalMs = 500L;
    /**
     * Enables transaction metadata extraction together with event counting
     */
    private Boolean provideTransactionMetadata = false;
    /**
     * The name of the Postgres 10 publication used for streaming changes from a
     * plugin.Defaults to 'dbz_publication'
     */
    private String publicationName = "dbz_publication";
    /**
     * The schemas for which events must not be captured
     */
    private String schemaBlacklist;
    /**
     * Specify the conditions that trigger a refresh of the in-memory schema for
     * a table. 'columns_diff' (the default) is the safest mode, ensuring the
     * in-memory schema stays in-sync with the database table's schema at all
     * times. 'columns_diff_exclude_unchanged_toast' instructs the connector to
     * refresh the in-memory schema cache if there is a discrepancy between it
     * and the schema derived from the incoming message, unless unchanged
     * TOASTable data fully accounts for the discrepancy. This setting can
     * improve connector performance significantly if there are
     * frequently-updated tables that have TOASTed data that are rarely part of
     * these updates. However, it is possible for the in-memory schema to become
     * outdated if TOASTable columns are dropped from the table.
     */
    private String schemaRefreshMode = "columns_diff";
    /**
     * The schemas for which events should be captured
     */
    private String schemaWhitelist;
    /**
     * Whether or not to drop the logical replication slot when the connector
     * finishes orderlyBy default the replication is kept so that on restart
     * progress can resume from the last recorded location
     */
    private Boolean slotDropOnStop = false;
    /**
     * How many times to retry connecting to a replication slot when an attempt
     * fails.
     */
    private Integer slotMaxRetries = 6;
    /**
     * The name of the Postgres logical decoding slot created for streaming
     * changes from a plugin.Defaults to 'debezium
     */
    private String slotName = "debezium";
    /**
     * The number of milli-seconds to wait between retry attempts when the
     * connector fails to connect to a replication slot.
     */
    private Long slotRetryDelayMs = 10000L;
    /**
     * Any optional parameters used by logical decoding plugin. Semi-colon
     * separated. E.g. 'add-tables=public.table,public.table2;include-lsn=true'
     */
    private String slotStreamParams;
    /**
     * When 'snapshot.mode' is set as custom, this setting must be set to
     * specify a fully qualified class name to load (via the default class
     * loader).This class must implement the 'Snapshotter' interface and is
     * called on each app boot to determine whether to do a snapshot and how to
     * build queries.
     */
    private String snapshotCustomClass;
    /**
     * The number of milliseconds to delay before a snapshot will begin.
     */
    private Long snapshotDelayMs = 0L;
    /**
     * The maximum number of records that should be loaded into memory while
     * performing a snapshot
     */
    private Integer snapshotFetchSize;
    /**
     * The maximum number of millis to wait for table locks at the beginning of
     * a snapshot. If locks cannot be acquired in this time frame, the snapshot
     * will be aborted. Defaults to 10 seconds
     */
    private Long snapshotLockTimeoutMs = 10000L;
    /**
     * The criteria for running a snapshot upon startup of the connector.
     * Options include: 'always' to specify that the connector run a snapshot
     * each time it starts up; 'initial' (the default) to specify the connector
     * can run a snapshot only when no offsets are available for the logical
     * server name; 'initial_only' same as 'initial' except the connector should
     * stop after completing the snapshot and before it would normally start
     * emitting changes;'never' to specify the connector should never run a
     * snapshot and that upon first startup the connector should read from the
     * last position (LSN) recorded by the server; and'exported' to specify the
     * connector should run a snapshot based on the position when the
     * replication slot was created; 'custom' to specify a custom class with
     * 'snapshot.custom_class' which will be loaded and used to determine the
     * snapshot, see docs for more details.
     */
    private String snapshotMode = "initial";
    /**
     * This property contains a comma-separated list of fully-qualified tables
     * (DB_NAME.TABLE_NAME) or (SCHEMA_NAME.TABLE_NAME), depending on
     * thespecific connectors . Select statements for the individual tables are
     * specified in further configuration properties, one for each table,
     * identified by the id
     * 'snapshot.select.statement.overrides.DB_NAME.TABLE_NAME' or
     * 'snapshot.select.statement.overrides.SCHEMA_NAME.TABLE_NAME',
     * respectively. The value of those properties is the select statement to
     * use when retrieving data from the specific table during snapshotting. A
     * possible use case for large append-only tables is setting a specific
     * point where to start (resume) snapshotting, in case a previous
     * snapshotting was interrupted.
     */
    private String snapshotSelectStatementOverrides;
    /**
     * A version of the format of the publicly visible source part in the
     * message
     */
    private String sourceStructVersion = "v2";
    /**
     * Frequency in milliseconds for sending replication connection status
     * updates to the server. Defaults to 10 seconds (10000 ms).
     */
    private Integer statusUpdateIntervalMs = 10000;
    /**
     * Description is not available here, please check Debezium website for
     * corresponding key 'table.blacklist' description.
     */
    private String tableBlacklist;
    /**
     * The tables for which changes are to be captured
     */
    private String tableWhitelist;
    /**
     * Time, date, and timestamps can be represented with different kinds of
     * precisions, including:'adaptive' (the default) bases the precision of
     * time, date, and timestamp values on the database column's precision;
     * 'adaptive_time_microseconds' like 'adaptive' mode, but TIME fields always
     * use microseconds precision;'connect' always represents time, date, and
     * timestamp values using Kafka Connect's built-in representations for Time,
     * Date, and Timestamp, which uses millisecond precision regardless of the
     * database columns' precision .
     */
    private String timePrecisionMode = "adaptive";
    /**
     * Specify the constant that will be provided by Debezium to indicate that
     * the original value is a toasted value not provided by the database.If
     * starts with 'hex:' prefix it is expected that the rest of the string
     * repesents hexadecimally encoded octets.
     */
    private String toastedValuePlaceholder = "__debezium_unavailable_value";
    /**
     * Whether delete operations should be represented by a delete event and a
     * subsquenttombstone event (true) or only by a delete event (false).
     * Emitting the tombstone event (the default behavior) allows Kafka to
     * completely delete all events pertaining to the given key once the source
     * record got deleted.
     */
    private Boolean tombstonesOnDelete = false;
    /**
     * Specify how often (in ms) the xmin will be fetched from the replication
     * slot. This xmin value is exposed by the slot which gives a lower bound of
     * where a new replication slot could start from. The lower the value, the
     * more likely this value is to be the current 'true' value, but the bigger
     * the performance cost. The bigger the value, the less likely this value is
     * to be the current 'true' value, but the lower the performance penalty.
     * The default is set to 0 ms, which disables tracking xmin.
     */
    private Long xminFetchIntervalMs = 0L;

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getInternalKeyConverter() {
        return internalKeyConverter;
    }

    public void setInternalKeyConverter(String internalKeyConverter) {
        this.internalKeyConverter = internalKeyConverter;
    }

    public String getInternalValueConverter() {
        return internalValueConverter;
    }

    public void setInternalValueConverter(String internalValueConverter) {
        this.internalValueConverter = internalValueConverter;
    }

    public String getOffsetCommitPolicy() {
        return offsetCommitPolicy;
    }

    public void setOffsetCommitPolicy(String offsetCommitPolicy) {
        this.offsetCommitPolicy = offsetCommitPolicy;
    }

    public String getOffsetCommitTimeoutMs() {
        return offsetCommitTimeoutMs;
    }

    public void setOffsetCommitTimeoutMs(String offsetCommitTimeoutMs) {
        this.offsetCommitTimeoutMs = offsetCommitTimeoutMs;
    }

    public String getOffsetFlushIntervalMs() {
        return offsetFlushIntervalMs;
    }

    public void setOffsetFlushIntervalMs(String offsetFlushIntervalMs) {
        this.offsetFlushIntervalMs = offsetFlushIntervalMs;
    }

    public String getOffsetStorage() {
        return offsetStorage;
    }

    public void setOffsetStorage(String offsetStorage) {
        this.offsetStorage = offsetStorage;
    }

    public String getOffsetStorageFileName() {
        return offsetStorageFileName;
    }

    public void setOffsetStorageFileName(String offsetStorageFileName) {
        this.offsetStorageFileName = offsetStorageFileName;
    }

    public Integer getOffsetStoragePartitions() {
        return offsetStoragePartitions;
    }

    public void setOffsetStoragePartitions(Integer offsetStoragePartitions) {
        this.offsetStoragePartitions = offsetStoragePartitions;
    }

    public Integer getOffsetStorageReplicationFactor() {
        return offsetStorageReplicationFactor;
    }

    public void setOffsetStorageReplicationFactor(
            Integer offsetStorageReplicationFactor) {
        this.offsetStorageReplicationFactor = offsetStorageReplicationFactor;
    }

    public String getOffsetStorageTopic() {
        return offsetStorageTopic;
    }

    public void setOffsetStorageTopic(String offsetStorageTopic) {
        this.offsetStorageTopic = offsetStorageTopic;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getColumnBlacklist() {
        return columnBlacklist;
    }

    public void setColumnBlacklist(String columnBlacklist) {
        this.columnBlacklist = columnBlacklist;
    }

    public String getDatabaseDbname() {
        return databaseDbname;
    }

    public void setDatabaseDbname(String databaseDbname) {
        this.databaseDbname = databaseDbname;
    }

    public String getDatabaseHistoryFileFilename() {
        return databaseHistoryFileFilename;
    }

    public void setDatabaseHistoryFileFilename(
            String databaseHistoryFileFilename) {
        this.databaseHistoryFileFilename = databaseHistoryFileFilename;
    }

    public String getDatabaseHostname() {
        return databaseHostname;
    }

    public void setDatabaseHostname(String databaseHostname) {
        this.databaseHostname = databaseHostname;
    }

    public String getDatabaseInitialStatements() {
        return databaseInitialStatements;
    }

    public void setDatabaseInitialStatements(String databaseInitialStatements) {
        this.databaseInitialStatements = databaseInitialStatements;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public Integer getDatabasePort() {
        return databasePort;
    }

    public void setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
    }

    public String getDatabaseServerName() {
        return databaseServerName;
    }

    public void setDatabaseServerName(String databaseServerName) {
        this.databaseServerName = databaseServerName;
    }

    public String getDatabaseSslcert() {
        return databaseSslcert;
    }

    public void setDatabaseSslcert(String databaseSslcert) {
        this.databaseSslcert = databaseSslcert;
    }

    public String getDatabaseSslfactory() {
        return databaseSslfactory;
    }

    public void setDatabaseSslfactory(String databaseSslfactory) {
        this.databaseSslfactory = databaseSslfactory;
    }

    public String getDatabaseSslkey() {
        return databaseSslkey;
    }

    public void setDatabaseSslkey(String databaseSslkey) {
        this.databaseSslkey = databaseSslkey;
    }

    public String getDatabaseSslmode() {
        return databaseSslmode;
    }

    public void setDatabaseSslmode(String databaseSslmode) {
        this.databaseSslmode = databaseSslmode;
    }

    public String getDatabaseSslpassword() {
        return databaseSslpassword;
    }

    public void setDatabaseSslpassword(String databaseSslpassword) {
        this.databaseSslpassword = databaseSslpassword;
    }

    public String getDatabaseSslrootcert() {
        return databaseSslrootcert;
    }

    public void setDatabaseSslrootcert(String databaseSslrootcert) {
        this.databaseSslrootcert = databaseSslrootcert;
    }

    public Boolean getDatabaseTcpkeepalive() {
        return databaseTcpkeepalive;
    }

    public void setDatabaseTcpkeepalive(Boolean databaseTcpkeepalive) {
        this.databaseTcpkeepalive = databaseTcpkeepalive;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    public String getDecimalHandlingMode() {
        return decimalHandlingMode;
    }

    public void setDecimalHandlingMode(String decimalHandlingMode) {
        this.decimalHandlingMode = decimalHandlingMode;
    }

    public String getEventProcessingFailureHandlingMode() {
        return eventProcessingFailureHandlingMode;
    }

    public void setEventProcessingFailureHandlingMode(
            String eventProcessingFailureHandlingMode) {
        this.eventProcessingFailureHandlingMode = eventProcessingFailureHandlingMode;
    }

    public String getHeartbeatActionQuery() {
        return heartbeatActionQuery;
    }

    public void setHeartbeatActionQuery(String heartbeatActionQuery) {
        this.heartbeatActionQuery = heartbeatActionQuery;
    }

    public Integer getHeartbeatIntervalMs() {
        return heartbeatIntervalMs;
    }

    public void setHeartbeatIntervalMs(Integer heartbeatIntervalMs) {
        this.heartbeatIntervalMs = heartbeatIntervalMs;
    }

    public String getHeartbeatTopicsPrefix() {
        return heartbeatTopicsPrefix;
    }

    public void setHeartbeatTopicsPrefix(String heartbeatTopicsPrefix) {
        this.heartbeatTopicsPrefix = heartbeatTopicsPrefix;
    }

    public String getHstoreHandlingMode() {
        return hstoreHandlingMode;
    }

    public void setHstoreHandlingMode(String hstoreHandlingMode) {
        this.hstoreHandlingMode = hstoreHandlingMode;
    }

    public Boolean getIncludeUnknownDatatypes() {
        return includeUnknownDatatypes;
    }

    public void setIncludeUnknownDatatypes(Boolean includeUnknownDatatypes) {
        this.includeUnknownDatatypes = includeUnknownDatatypes;
    }

    public String getIntervalHandlingMode() {
        return intervalHandlingMode;
    }

    public void setIntervalHandlingMode(String intervalHandlingMode) {
        this.intervalHandlingMode = intervalHandlingMode;
    }

    public Integer getMaxBatchSize() {
        return maxBatchSize;
    }

    public void setMaxBatchSize(Integer maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    public Integer getMaxQueueSize() {
        return maxQueueSize;
    }

    public void setMaxQueueSize(Integer maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public String getMessageKeyColumns() {
        return messageKeyColumns;
    }

    public void setMessageKeyColumns(String messageKeyColumns) {
        this.messageKeyColumns = messageKeyColumns;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public Long getPollIntervalMs() {
        return pollIntervalMs;
    }

    public void setPollIntervalMs(Long pollIntervalMs) {
        this.pollIntervalMs = pollIntervalMs;
    }

    public Boolean getProvideTransactionMetadata() {
        return provideTransactionMetadata;
    }

    public void setProvideTransactionMetadata(Boolean provideTransactionMetadata) {
        this.provideTransactionMetadata = provideTransactionMetadata;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public String getSchemaBlacklist() {
        return schemaBlacklist;
    }

    public void setSchemaBlacklist(String schemaBlacklist) {
        this.schemaBlacklist = schemaBlacklist;
    }

    public String getSchemaRefreshMode() {
        return schemaRefreshMode;
    }

    public void setSchemaRefreshMode(String schemaRefreshMode) {
        this.schemaRefreshMode = schemaRefreshMode;
    }

    public String getSchemaWhitelist() {
        return schemaWhitelist;
    }

    public void setSchemaWhitelist(String schemaWhitelist) {
        this.schemaWhitelist = schemaWhitelist;
    }

    public Boolean getSlotDropOnStop() {
        return slotDropOnStop;
    }

    public void setSlotDropOnStop(Boolean slotDropOnStop) {
        this.slotDropOnStop = slotDropOnStop;
    }

    public Integer getSlotMaxRetries() {
        return slotMaxRetries;
    }

    public void setSlotMaxRetries(Integer slotMaxRetries) {
        this.slotMaxRetries = slotMaxRetries;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public Long getSlotRetryDelayMs() {
        return slotRetryDelayMs;
    }

    public void setSlotRetryDelayMs(Long slotRetryDelayMs) {
        this.slotRetryDelayMs = slotRetryDelayMs;
    }

    public String getSlotStreamParams() {
        return slotStreamParams;
    }

    public void setSlotStreamParams(String slotStreamParams) {
        this.slotStreamParams = slotStreamParams;
    }

    public String getSnapshotCustomClass() {
        return snapshotCustomClass;
    }

    public void setSnapshotCustomClass(String snapshotCustomClass) {
        this.snapshotCustomClass = snapshotCustomClass;
    }

    public Long getSnapshotDelayMs() {
        return snapshotDelayMs;
    }

    public void setSnapshotDelayMs(Long snapshotDelayMs) {
        this.snapshotDelayMs = snapshotDelayMs;
    }

    public Integer getSnapshotFetchSize() {
        return snapshotFetchSize;
    }

    public void setSnapshotFetchSize(Integer snapshotFetchSize) {
        this.snapshotFetchSize = snapshotFetchSize;
    }

    public Long getSnapshotLockTimeoutMs() {
        return snapshotLockTimeoutMs;
    }

    public void setSnapshotLockTimeoutMs(Long snapshotLockTimeoutMs) {
        this.snapshotLockTimeoutMs = snapshotLockTimeoutMs;
    }

    public String getSnapshotMode() {
        return snapshotMode;
    }

    public void setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
    }

    public String getSnapshotSelectStatementOverrides() {
        return snapshotSelectStatementOverrides;
    }

    public void setSnapshotSelectStatementOverrides(
            String snapshotSelectStatementOverrides) {
        this.snapshotSelectStatementOverrides = snapshotSelectStatementOverrides;
    }

    public String getSourceStructVersion() {
        return sourceStructVersion;
    }

    public void setSourceStructVersion(String sourceStructVersion) {
        this.sourceStructVersion = sourceStructVersion;
    }

    public Integer getStatusUpdateIntervalMs() {
        return statusUpdateIntervalMs;
    }

    public void setStatusUpdateIntervalMs(Integer statusUpdateIntervalMs) {
        this.statusUpdateIntervalMs = statusUpdateIntervalMs;
    }

    public String getTableBlacklist() {
        return tableBlacklist;
    }

    public void setTableBlacklist(String tableBlacklist) {
        this.tableBlacklist = tableBlacklist;
    }

    public String getTableWhitelist() {
        return tableWhitelist;
    }

    public void setTableWhitelist(String tableWhitelist) {
        this.tableWhitelist = tableWhitelist;
    }

    public String getTimePrecisionMode() {
        return timePrecisionMode;
    }

    public void setTimePrecisionMode(String timePrecisionMode) {
        this.timePrecisionMode = timePrecisionMode;
    }

    public String getToastedValuePlaceholder() {
        return toastedValuePlaceholder;
    }

    public void setToastedValuePlaceholder(String toastedValuePlaceholder) {
        this.toastedValuePlaceholder = toastedValuePlaceholder;
    }

    public Boolean getTombstonesOnDelete() {
        return tombstonesOnDelete;
    }

    public void setTombstonesOnDelete(Boolean tombstonesOnDelete) {
        this.tombstonesOnDelete = tombstonesOnDelete;
    }

    public Long getXminFetchIntervalMs() {
        return xminFetchIntervalMs;
    }

    public void setXminFetchIntervalMs(Long xminFetchIntervalMs) {
        this.xminFetchIntervalMs = xminFetchIntervalMs;
    }
}