package com.neo.detector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.neo.detector.config.FeignConfig;

@SpringBootApplication
@Import(FeignConfig.class)
public class NeoServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(NeoServiceApplication.class, args);
  }
  
}
