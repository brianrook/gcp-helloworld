package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("default")
@Slf4j
public class HelloDefaultService implements HelloWorldService
{

   @Override
   public String helloWorld(String userName)
   {
      String responseString = "Hello, world!";
      log.info("returning helloWorld response: {}", responseString);
      return responseString;
   }
}
