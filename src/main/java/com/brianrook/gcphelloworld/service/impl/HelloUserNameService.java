package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("username")
public class HelloUserNameService implements HelloWorldService
{
   private final static Logger LOG = LoggerFactory.getLogger(HelloUserNameService.class);


   @Override
   public String helloWorld(String userName)
   {
      String responseString = new String();
      if (StringUtils.isNotBlank(userName))
      {
         responseString = "Hello, " + userName;
      }
      else
      {
         responseString = "Hello, unknown user";
      }

      LOG.info("returning helloWorld response: {}", responseString);
      return responseString;
   }
}
