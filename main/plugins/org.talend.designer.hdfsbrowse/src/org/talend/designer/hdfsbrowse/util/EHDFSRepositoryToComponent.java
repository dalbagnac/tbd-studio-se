// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================

package org.talend.designer.hdfsbrowse.util;

/**
 * DOC ycbai class global comment. Detailled comment
 */
public enum EHDFSRepositoryToComponent {

    SCHEME("SCHEME", "SCHEME"), //$NON-NLS-1$ //$NON-NLS-2$

    DISTRIBUTION("DISTRIBUTION", "DISTRIBUTION"), //$NON-NLS-1$ //$NON-NLS-2$

    DB_VERSION("DB_VERSION", "DB_VERSION"), //$NON-NLS-1$ //$NON-NLS-2$

    HADOOP_CUSTOM_JARS("HADOOP_CUSTOM_JARS", "HADOOP_CUSTOM_JARS"), //$NON-NLS-1$ //$NON-NLS-2$

    HADOOP_CUSTOM_JARS_FOR_SPARK("HADOOP_CUSTOM_JARS_FOR_SPARK", "HADOOP_CUSTOM_JARS_FOR_SPARK"), //$NON-NLS-1$ //$NON-NLS-2$

    HADOOP_CUSTOM_JARS_FOR_SPARKSTREAMING("HADOOP_CUSTOM_JARS_FOR_SPARKSTREAMING", "HADOOP_CUSTOM_JARS_FOR_SPARKSTREAMING"), //$NON-NLS-1$ //$NON-NLS-2$

    USE_YARN("USE_YARN", "USE_YARN"), //$NON-NLS-1$//$NON-NLS-2$

    AUTHENTICATION_MODE("AUTHENTICATION_MODE", "AUTHENTICATION_MODE"), //$NON-NLS-1$ //$NON-NLS-2$

    FS_DEFAULT_NAME("FS_DEFAULT_NAME", "FS_DEFAULT_NAME"), //$NON-NLS-1$ //$NON-NLS-2$

    SET_SCHEDULER_ADDRESS("SET_SCHEDULER_ADDRESS", "SET_SCHEDULER_ADDRESS"), //$NON-NLS-1$//$NON-NLS-2$

    RESOURCEMANAGER_SCHEDULER_ADDRESS("RESOURCEMANAGER_SCHEDULER_ADDRESS", "RESOURCEMANAGER_SCHEDULER_ADDRESS"), //$NON-NLS-1$//$NON-NLS-2$

    SET_JOBHISTORY_ADDRESS("SET_JOBHISTORY_ADDRESS", "SET_JOBHISTORY_ADDRESS"), //$NON-NLS-1$//$NON-NLS-2$

    JOBHISTORY_ADDRESS("JOBHISTORY_ADDRESS", "JOBHISTORY_ADDRESS"), //$NON-NLS-1$//$NON-NLS-2$

    SET_STAGING_DIRECTORY("SET_STAGING_DIRECTORY", "SET_STAGING_DIRECTORY"), //$NON-NLS-1$//$NON-NLS-2$

    STAGING_DIRECTORY("STAGING_DIRECTORY", "STAGING_DIRECTORY"), //$NON-NLS-1$//$NON-NLS-2$

    USE_DATANODE_HOSTNAME("USE_DATANODE_HOSTNAME", "USE_DATANODE_HOSTNAME"), //$NON-NLS-1$//$NON-NLS-2$

    USE_KRB("USE_KRB", "USE_KRB"), //$NON-NLS-1$ //$NON-NLS-2$

    NAMENODE_PRINCIPAL("NAMENODE_PRINCIPAL", "NAMENODE_PRINCIPAL"), //$NON-NLS-1$ //$NON-NLS-2$

    JOBTRACKER_PRINCIPAL("JOBTRACKER_PRINCIPAL", "JOBTRACKER_PRINCIPAL"), //$NON-NLS-1$ //$NON-NLS-2$

    RESOURCEMANAGER_PRINCIPAL("RESOURCEMANAGER_PRINCIPAL", "RESOURCEMANAGER_PRINCIPAL"), //$NON-NLS-1$ //$NON-NLS-2$

    JOBHISTORY_PRINCIPAL("JOBHISTORY_PRINCIPAL", "JOBHISTORY_PRINCIPAL"), //$NON-NLS-1$ //$NON-NLS-2$

    USE_KEYTAB("USE_KEYTAB", "USE_KEYTAB"), //$NON-NLS-1$//$NON-NLS-2$

    KEYTAB_PRINCIPAL("KEYTAB_PRINCIPAL", "PRINCIPAL"), //$NON-NLS-1$//$NON-NLS-2$

    KEYTAB_PATH("KEYTAB_PATH", "KEYTAB_PATH"), //$NON-NLS-1$//$NON-NLS-2$

    USE_MAPRTICKET("USE_MAPRTICKET", "USE_MAPRTICKET"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPRTICKET_PASSWORD("MAPRTICKET_PASSWORD", "MAPRTICKET_PASSWORD"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPRTICKET_CLUSTER("MAPRTICKET_CLUSTER", "MAPRTICKET_CLUSTER"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPRTICKET_DURATION("MAPRTICKET_DURATION", "MAPRTICKET_DURATION"), //$NON-NLS-1$ //$NON-NLS-2$

    SET_MAPR_HOME_DIR("SET_MAPR_HOME_DIR", "SET_MAPR_HOME_DIR"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPR_HOME_DIR("MAPR_HOME_DIR", "MAPR_HOME_DIR"), //$NON-NLS-1$ //$NON-NLS-2$

    SET_HADOOP_LOGIN("SET_HADOOP_LOGIN", "SET_HADOOP_LOGIN"), //$NON-NLS-1$ //$NON-NLS-2$

    HADOOP_LOGIN("HADOOP_LOGIN", "HADOOP_LOGIN"), //$NON-NLS-1$ //$NON-NLS-2$

    PRELOAD_AUTHENTIFICATION("PRELOAD_AUTHENTIFICATION", "PRELOAD_AUTHENTIFICATION"), //$NON-NLS-1$ //$NON-NLS-2$

    USERNAME("USERNAME", "USERNAME"), //$NON-NLS-1$ //$NON-NLS-2$

    GROUP("GROUP", "GROUP"), //$NON-NLS-1$ //$NON-NLS-2$

    FILENAME("FILENAME", "FILENAME"), //$NON-NLS-1$ //$NON-NLS-2$

    FILETYPE("FILETYPE", "TYPEFILE"), //$NON-NLS-1$//$NON-NLS-2$

    KEYCOLUMN("KEYCOLUMN", "KEYCOLUMN"), //$NON-NLS-1$ //$NON-NLS-2$

    VALUECOLUMN("VALUECOLUMN", "VALUECOLUMN"), //$NON-NLS-1$ //$NON-NLS-2$

    ROWSEPARATOR("ROWSEPARATOR", "ROWSEPARATOR"), //$NON-NLS-1$ //$NON-NLS-2$

    FIELDSEPARATOR("FIELDSEPARATOR", "FIELDSEPARATOR"), //$NON-NLS-1$ //$NON-NLS-2$

    HEADER("HEADER", "HEADER"), //$NON-NLS-1$ //$NON-NLS-2$

    LOCAL("LOCAL", "LOCAL"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPREDUCE("MAPREDUCE", "MAPREDUCE"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPRED_JOB_TRACKER("MAPRED_JOB_TRACKER", "JOBTRACKER"), //$NON-NLS-1$ //$NON-NLS-2$

    RESOURCE_MANAGER("RESOURCE_MANAGER", "RESOURCE_MANAGER"), //$NON-NLS-1$ //$NON-NLS-2$

    MAPRED_RESOURCE_MANAGER("MAPRED_RESOURCE_MANAGER", "RESOURCE_MANAGER"), //$NON-NLS-1$ //$NON-NLS-2$

    FIELD_SEPARATOR_CHAR("FIELD_SEPARATOR_CHAR", "FIELD_SEPARATOR_CHAR"), //$NON-NLS-1$ //$NON-NLS-2$

    LOAD("LOAD", "LOAD"), //$NON-NLS-1$ //$NON-NLS-2$

    INPUT_FILENAME("INPUT_FILENAME", "INPUT_FILENAME"), //$NON-NLS-1$ //$NON-NLS-2$

    HADOOP_ADVANCED_PROPERTIES("HADOOP_ADVANCED_PROPERTIES", "HADOOP_ADVANCED_PROPERTIES"), //$NON-NLS-1$ //$NON-NLS-2$

    SPARK_ADVANCED_PROPERTIES("SPARK_ADVANCED_PROPERTIES", "SPARK_ADVANCED_PROPERTIES"), //$NON-NLS-1$ //$NON-NLS-2$

    USE_CLOUDERA_NAVIGATOR("USE_CLOUDERA_NAVIGATOR", "USE_CLOUDERA_NAVIGATOR"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_USERNAME("CLOUDERA_NAVIGATOR_USERNAME", "CLOUDERA_NAVIGATOR_USERNAME"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_PASSWORD("CLOUDERA_NAVIGATOR_PASSWORD", "CLOUDERA_NAVIGATOR_PASSWORD"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_URL("CLOUDERA_NAVIGATOR_URL", "CLOUDERA_NAVIGATOR_URL"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_METADATA_URL("CLOUDERA_NAVIGATOR_METADATA_URL", "CLOUDERA_NAVIGATOR_METADATA_URL"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_CLIENT_URL("CLOUDERA_NAVIGATOR_CLIENT_URL", "CLOUDERA_NAVIGATOR_CLIENT_URL"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_AUTOCOMMIT("CLOUDERA_NAVIGATOR_AUTOCOMMIT", "CLOUDERA_NAVIGATOR_AUTOCOMMIT"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_DISABLE_SSL_VALIDATION("CLOUDERA_NAVIGATOR_DISABLE_SSL_VALIDATION", "CLOUDERA_NAVIGATOR_DISABLE_SSL_VALIDATION"), //$NON-NLS-1$ //$NON-NLS-2$

    CLOUDERA_NAVIGATOR_DIE_ON_ERROR("CLOUDERA_NAVIGATOR_DIE_ON_ERROR", "CLOUDERA_NAVIGATOR_DIE_ON_ERROR"), //$NON-NLS-1$ //$NON-NLS-2$

    GOOGLE_PROJECT_ID("GOOGLE_PROJECT_ID", "GOOGLE_PROJECT_ID"), //$NON-NLS-1$ //$NON-NLS-2$

    GOOGLE_CLUSTER_ID("GOOGLE_CLUSTER_ID", "GOOGLE_CLUSTER_ID"), //$NON-NLS-1$ //$NON-NLS-2$

    GOOGLE_REGION("GOOGLE_REGION", "GOOGLE_REGION"), //$NON-NLS-1$ //$NON-NLS-2$

    GOOGLE_JARS_BUCKET("GOOGLE_JARS_BUCKET", "GOOGLE_JARS_BUCKET"), //$NON-NLS-1$ //$NON-NLS-2$

    DEFINE_GOOGLE_CREDENTIALS("DEFINE_GOOGLE_CREDENTIALS", "DEFINE_GOOGLE_CREDENTIALS"), //$NON-NLS-1$ //$NON-NLS-2$
    
    AUTH_MODE("AUTH_MODE", "AUTH_MODE"), 
    
    PATH_TO_GOOGLE_CREDENTIALS("PATH_TO_GOOGLE_CREDENTIALS", "PATH_TO_GOOGLE_CREDENTIALS"),//$NON-NLS-1$ //$NON-NLS-2$
    
    OAUTH_ACCESS_TOKEN("OAUTH_ACCESS_TOKEN", "OAUTH_ACCESS_TOKEN"),

    SET_HADOOP_CONF("SET_HADOOP_CONF", "SET_HADOOP_CONF"), //$NON-NLS-1$ //$NON-NLS-2$

    HADOOP_CONF_SPECIFIC_JAR("HADOOP_CONF_SPECIFIC_JAR", "HADOOP_CONF_SPECIFIC_JAR"), //$NON-NLS-1$ //$NON-NLS-2$

    DATABRICKS_ENDPOINT("DATABRICKS_ENDPOINT", "DATABRICKS_ENDPOINT"), //$NON-NLS-1$ //$NON-NLS-2$
    
    DATABRICKS_CLOUD_PROVIDER("DATABRICKS_CLOUD_PROVIDER", "DATABRICKS_CLOUD_PROVIDER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    DATABRICKS_RUN_MODE("DATABRICKS_RUN_MODE", "DATABRICKS_RUN_MODE"), //$NON-NLS-1$ //$NON-NLS-2$

    DATABRICKS_CLUSTER_ID("DATABRICKS_CLUSTER_ID", "DATABRICKS_CLUSTER_ID"), //$NON-NLS-1$ //$NON-NLS-2$

    DATABRICKS_TOKEN("DATABRICKS_TOKEN", "DATABRICKS_TOKEN"), //$NON-NLS-1$ //$NON-NLS-2$

    DATABRICKS_DBFS_DEP_FOLDER("DATABRICKS_DBFS_DEP_FOLDER", "DATABRICKS_DBFS_DEP_FOLDER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_SUBMIT_MODE("K8S_SUBMIT_MODE", "K8S_SUBMIT_MODE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_MASTER("K8S_MASTER", "K8S_MASTER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_INSTANCES("K8S_INSTANCES", "K8S_INSTANCES"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_REGISTRYSECRET_CHECK("K8S_REGISTRYSECRET_CHECK", "K8S_REGISTRYSECRET_CHECK"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_REGISTRYSECRET("K8S_REGISTRYSECRET", "K8S_REGISTRYSECRET"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_IMAGE("K8S_IMAGE", "K8S_IMAGE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_NAMESPACE("K8S_NAMESPACE", "K8S_NAMESPACE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_SERVICEACCOUNT("K8S_SERVICEACCOUNT", "K8S_SERVICEACCOUNT"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_DISTUPLOAD("K8S_DISTUPLOAD", "K8S_DISTUPLOAD"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_S3BUCKET("K8S_S3BUCKET", "K8S_S3BUCKET"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_S3FOLDER("K8S_S3FOLDER", "K8S_S3FOLDER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_S3CREDENTIALS("K8S_S3CREDENTIALS", "K8S_S3CREDENTIALS"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_S3ACCESSKEY("K8S_S3ACCESSKEY", "K8S_S3ACCESSKEY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_S3SECRETKEY("K8S_S3SECRETKEY", "K8S_S3SECRETKEY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_BLOBACCOUNT("K8S_BLOBACCOUNT", "K8S_BLOBACCOUNT"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_BLOBCONTAINER("K8S_BLOBCONTAINER", "K8S_BLOBCONTAINER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_BLOBSECRETKEY("K8S_BLOBSECRETKEY", "K8S_BLOBSECRETKEY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZUREACCOUNT("K8S_AZUREACCOUNT", "K8S_AZUREACCOUNT"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZURECREDENTIALS("K8S_AZURECREDENTIALS", "K8S_AZURECREDENTIALS"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZURECONTAINER("K8S_AZURECONTAINER", "K8S_AZURECONTAINER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZURESECRETKEY("K8S_AZURESECRETKEY", "K8S_AZURESECRETKEY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZUREAADKEY("K8S_AZUREAADKEY", "K8S_AZUREAADKEY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZUREAADCLIENTID("K8S_AZUREAADCLIENTID", "K8S_AZUREAADCLIENTID"), //$NON-NLS-1$ //$NON-NLS-2$
    
    K8S_AZUREAADDIRECTORYID("K8S_AZUREAADDIRECTORYID", "K8S_AZUREAADDIRECTORYID"), //$NON-NLS-1$ //$NON-NLS-2$
    
    DATABRICKS_NODE_TYPE("DATABRICKS_NODE_TYPE", "DATABRICKS_NODE_TYPE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    DATABRICKS_DRIVER_NODE_TYPE("DATABRICKS_DRIVER_NODE_TYPE", "DATABRICKS_DRIVER_NODE_TYPE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    DATABRICKS_RUNTIME_VERSION("DATABRICKS_RUNTIME_VERSION", "DATABRICKS_RUNTIME_VERSION"), //$NON-NLS-1$ //$NON-NLS-2$
    
    DATABRICKS_CLUSTER_TYPE("DATABRICKS_CLUSTER_TYPE", "DATABRICKS_CLUSTER_TYPE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SPARK_MODE("SPARK_MODE", "SPARK_MODE"), //$NON-NLS-1$ //$NON-NLS-2$
    
    USE_KNOX("USE_KNOX", "USE_KNOX"), //$NON-NLS-1$ //$NON-NLS-2$
    
    KNOX_URL("KNOX_URL", "KNOX_URL"), //$NON-NLS-1$ //$NON-NLS-2$
    
    KNOX_USERNAME("KNOX_USERNAME", "KNOX_USERNAME"), //$NON-NLS-1$ //$NON-NLS-2$
    
    KNOX_PASSWORD("KNOX_PASSWORD", "KNOX_PASSWORD"), //$NON-NLS-1$ //$NON-NLS-2$
    
    KNOX_DIRECTORY("WEBHDFS_FOLDER", "WEBHDFS_FOLDER"), //$NON-NLS-1$ //$NON-NLS-2$

    KNOX_TIMEOUT("KNOX_TIMEOUT", "KNOX_TIMEOUT"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SYNAPSE_ENDPOINT("SYNAPSE_ENDPOINT", "SYNAPSE_ENDPOINT"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SYNAPSE_TOKEN("SYNAPSE_TOKEN", "SYNAPSE_TOKEN"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SPARK_POOL_NAME("SPARK_POOL_NAME", "SPARK_POOL_NAME"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SYNAPSE_STORAGE_HOST("SYNAPSE_STORAGE_HOST", "SYNAPSE_STORAGE_HOST"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SYNAPSE_STORAGE_CONTAINER("SYNAPSE_STORAGE_CONTAINER", "SYNAPSE_STORAGE_CONTAINER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    ADLSGEN2AUTH("ADLSGEN2AUTH", "ADLSGEN2AUTH"),
    
    SYNAPSE_STORAGE_USERNAME("SYNAPSE_STORAGE_USERNAME", "SYNAPSE_STORAGE_USERNAME"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SYNAPSE_STORAGE_PASSWORD("SYNAPSE_STORAGE_PASSWORD", "SYNAPSE_STORAGE_PASSWORD"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SYNAPSE_APPLICATION_ID("SYNAPSE_APPLICATION_ID", "SYNAPSE_APPLICATION_ID"),
    
    SYNAPSE_DIRECTORY_ID("SYNAPSE_DIRECTORY_ID", "SYNAPSE_DIRECTORY_ID"),
    
    SYNAPSE_CLIENT_KEY("SYNAPSE_CLIENT_KEY", "SYNAPSE_CLIENT_KEY"),
    
    SYNAPSE_USE_CERTIFICATE("SYNAPSE_USE_CERTIFICATE", "SYNAPSE_USE_CERTIFICATE"),
    
    SYNAPSE_CLIENT_CERTIFICATE("SYNAPSE_CLIENT_CERTIFICATE", "SYNAPSE_CLIENT_CERTIFICATE"),
    
    DEPLOY_FOLDER("DEPLOY_FOLDER", "DEPLOY_FOLDER"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SPARK_DRIVER_MEMORY("SPARK_DRIVER_MEMORY", "SPARK_DRIVER_MEMORY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SPARK_DRIVER_CORES("SPARK_DRIVER_CORES", "SPARK_DRIVER_CORES"), //$NON-NLS-1$ //$NON-NLS-2$
    
    SPARK_EXECUTOR_MEMORY("SPARK_EXECUTOR_MEMORY", "SPARK_EXECUTOR_MEMORY"), //$NON-NLS-1$ //$NON-NLS-2$
    
    ADVANCED_SETTINGS_CHECK("ADVANCED_SETTINGS_CHECK", "ADVANCED_SETTINGS_CHECK"), 
    
    CDE_API_ENDPOINT("CDE_API_ENDPOINT", "CDE_API_ENDPOINT"), //$NON-NLS-2$
    
    CDE_TOKEN("CDE_TOKEN", "CDE_TOKEN"), //$NON-NLS-2$
    
    CDE_AUTO_GENERATE_TOKEN("CDE_AUTO_GENERATE_TOKEN", "CDE_AUTO_GENERATE_TOKEN"), //$NON-NLS-2$
    
    CDE_TOKEN_ENDPOINT("CDE_TOKEN_ENDPOINT", "CDE_TOKEN_ENDPOINT"), //$NON-NLS-2$
    
    CDE_WORKLOAD_USER("CDE_WORKLOAD_USER", "CDE_WORKLOAD_USER"), //$NON-NLS-2$
    
    CDE_WORKLOAD_PASSWORD("CDE_WORKLOAD_PASSWORD", "CDE_WORKLOAD_PASSWORD"),
    
    UNIV_STANDALONE_MASTER("UNIV_STANDALONE_MASTER", "UNIV_STANDALONE_MASTER"), //$NON-NLS-2$
    
    UNIV_STANDALONE_CONFIGURE_EXEC("UNIV_STANDALONE_CONFIGURE_EXEC", "UNIV_STANDALONE_CONFIGURE_EXEC"), //$NON-NLS-2$
    
    UNIV_STANDALONE_EXEC_MEMORY("UNIV_STANDALONE_EXEC_MEMORY", "UNIV_STANDALONE_EXEC_MEMORY"), //$NON-NLS-2$
    
    UNIV_STANDALONE_EXEC_CORE("UNIV_STANDALONE_EXEC_CORE", "UNIV_STANDALONE_EXEC_CORE");

    public final String repositoryValue;

    public final String parameterName;

    EHDFSRepositoryToComponent(String repositoryValue, String parameterName) {
        this.repositoryValue = repositoryValue;
        this.parameterName = parameterName;
    }

    public String getRepositoryValue() {
        return repositoryValue;
    }

    public String getParameterName() {
        return parameterName;
    }

}
