package com.adobe.aem.medeea.config;

/**
 * App config with intentional syntax error for testing Cloud Manager pipeline
 */
public class AppConfig {

    private final String defaultGreeting;

    public AppConfig() {
        this.defaultGreeting = "world"
        // Missing semicolon above will cause compilation to fail
    }

    public String getDefaultGreeting() {
        return defaultGreeting;
    }
}
