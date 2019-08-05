package com.brianrook.gcphelloworld.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class HelloWorldSpringConfig
{

   @Bean
   public MethodValidationPostProcessor methodValidationPostProcessor() {
      return new MethodValidationPostProcessor();
   }
}
