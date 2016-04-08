package com.archaius.git.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import Model.Properties;

import com.netflix.config.*;
import com.netflix.config.sources.URLConfigurationSource;

/**
 * Created by acuro on 3/31/16.
 */

@Component
//@Qualifier("appConfig")
public class AppConfig {

    public static String getStringProperty(String key, String defaultValue) {
        final DynamicStringProperty property = DynamicPropertyFactory.getInstance().getStringProperty(key, defaultValue);
        return property.get();
    }

    public static boolean getBooleanProperty(String key, boolean defaultValue) {
        final DynamicBooleanProperty property = DynamicPropertyFactory.getInstance().getBooleanProperty(key, defaultValue);
        return property.get();
    }

    public static void main(String[] args) {

        new ClassPathXmlApplicationContext("propertiesContext.xml");

        PolledConfigurationSource source = new URLConfigurationSource();
        DynamicConfiguration configuration = new DynamicConfiguration(source, new FixedDelayPollingScheduler(100, 1000, true));
        ConfigurationManager.install(configuration);

        Boolean DEBUG = getBooleanProperty("DEBUG", false);
        String logLevel = getStringProperty("logLevel", "");

        Properties properties = new Properties(DEBUG, logLevel);
        System.out.printf("Debug: %s,\n logLevel: %s", properties.isDEBUG(), properties.getLogLevel());

    }

}
