package com.tasks.bnn.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PowerBiConfig {
    public static final String RESOURCE = "https://analysis.windows.net/powerbi/api";

    @Value("${azure.activedirectory.apps.powerbi.client-id}")
    private String clientId;

    @Value("${azure.activedirectory.apps.powerbi.client-secret}")
    private String clientSecret;

    @Value("${azure.activedirectory.apps.powerbi.username}")
    private String adminUsername;

    @Value("${azure.activedirectory.apps.powerbi.password}")
    private String adminPassword;

    @Value("${api.powerbi.default-group-id}")
    private String defaultGroupId;

    @Value("${api.powerbi.default-dashboard-id}")
    private String defaultDashboardId;

    @Value("${api.powerbi.default-dataset-id}")
    private String defaultDatasetId;

    @Value("${api.powerbi.default-role}")
    private String defaultRole;
}
