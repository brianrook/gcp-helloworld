package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("default")
public class HelloDefaultService implements HelloWorldService
{

   private final static Logger LOG = LoggerFactory.getLogger(HelloDefaultService.class);

   @Override
   public String helloWorld(String userName)
   {
      String responseString = "Hello, world!";
      LOG.info("returning helloWorld response: {}", responseString);
      return responseString;
   }
}
