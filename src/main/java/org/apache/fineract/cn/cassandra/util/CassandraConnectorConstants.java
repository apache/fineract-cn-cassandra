/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.cassandra.util;

public interface CassandraConnectorConstants {

  String LOGGER_NAME = "cassandra-logger";

  String CLUSTER_NAME_PROP = "cassandra.clusterName";
  String CLUSTER_NAME_PROP_DEFAULT = "staging_cluster";

  String CLUSTER_USER_PROP = "cassandra.cluster.user";
  String CLUSTER_PASSWORD_PROP = "cassandra.cluster.pwd";

  String CONTACT_POINTS_PROP = "cassandra.contactPoints";
  String CONTACT_POINTS_PROP_DEFAULT = "127.0.0.1:9042,127.0.0.2:9042,127.0.0.3:9042";

  String KEYSPACE_PROP = "cassandra.keyspace";
  String KEYSPACE_PROP_DEFAULT = "seshat";

  String SSL_ENABLED_PROP = "cassandra.sslEnabled";

  String CONSISTENCY_LEVEL_READ_PROP = "cassandra.cl.read";
  String CONSISTENCY_LEVEL_WRITE_PROP = "cassandra.cl.write";
  String CONSISTENCY_LEVEL_DELETE_PROP = "cassandra.cl.delete";
  String CONSISTENCY_LEVEL_PROP_DEFAULT = "LOCAL_QUORUM";

  String DEFAULT_REPLICATION_TYPE = "cassandra.default.replication.type";
  String DEFAULT_REPLICATION_REPLICAS = "cassandra.default.replication.replicas";

  String DEFAULT_REPLICATION_TYPE_DEFAULT = "Simple";
  String DEFAULT_REPLICATION_REPLICAS_DEFAULT = "1";
}
