package com.example.demo.config;

/**
 * Application constants.
 */
public final class Constants {

    // Regex for acceptable logins
    public static final String LOGIN_REGEX = "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String ANONYMOUS_USER = "anonymoususer";

    public static final String TENANT_FILTER_NAME = "tenantFilter";
    public static final String TENANT_PARAMETER_NAME = "tenantId";
    public static final String TENANT_PARAMETER_TYPE = "int";
    public static final String TENANT_COLUMN_NAME = "tenant_id";

    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_SCHEMA = "Bearer ";
    public static final String TENANT_ID_CLAIM = "tenantId";

    private Constants() {
    }
}
