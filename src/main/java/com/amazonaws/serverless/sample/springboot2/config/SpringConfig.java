package com.amazonaws.serverless.sample.springboot2.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Phincon on 22/08/2019.
 */
@Configuration
public class SpringConfig {
    public SpringConfig() {
        System.out.println("construct spring");
    }
}
