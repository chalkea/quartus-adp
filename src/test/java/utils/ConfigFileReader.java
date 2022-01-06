package utils;

import core.Configuration;

public class ConfigFileReader {
    public String getReportConfigPath() {
        String reportConfigPath= Configuration.get("reportConfigPath");
        if (reportConfigPath != null) return reportConfigPath;
        else throw new RuntimeException(
                "Report Config Path not spefiied config.properties " +
                "file for the key:reportConfigPath");
    }
}
