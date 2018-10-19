package com.brianrook.gcphelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class HelloWorldSpringConfig
{

   @Bean
   public MethodValidationPostProcessor methodValidationPostProcessor() {
      return new MethodValidationPostProcessor();
   }
}
