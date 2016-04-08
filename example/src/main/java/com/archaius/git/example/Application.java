package com.archaius.git.example;

import com.netflix.config.ConfigurationManager;
import com.netflix.config.DynamicConfiguration;
import com.netflix.config.FixedDelayPollingScheduler;
import com.netflix.config.PolledConfigurationSource;
import com.netflix.config.sources.URLConfigurationSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acuro on 3/31/16.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        new ClassPathXmlApplicationContext("propertiesContext.xml");

        PolledConfigurationSource source = new URLConfigurationSource();
        DynamicConfiguration configuration = new DynamicConfiguration(source, new FixedDelayPollingScheduler(100, 1000, true));
        ConfigurationManager.install(configuration);

        SpringApplication.run(Application.class, args);

    }

}
