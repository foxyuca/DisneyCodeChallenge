package com.neo.detector.config;

import feign.Logger;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign configuration.
 */
@Configuration
@EnableFeignClients(basePackages = "com.neo.detector.client")
public class FeignConfig {
  @Bean
  public Logger.Level logLevel() {
    return Logger.Level.FULL;
  }

}