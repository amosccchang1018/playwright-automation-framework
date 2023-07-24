package com.constants;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class DomainConstant{

    private static Properties properties = new Properties();

    static {
        try {
            InputStream input = DomainConstant.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load properties", ex);
        }
    }

    public static String getStage() {
        return properties.getProperty("stage");
    }
}
