package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("username")
public class HelloUserNameService implements HelloWorldService
{

   @Override
   public String helloWorld(String userName)
   {
      if (StringUtils.isNotBlank(userName))
      {
         return "Hello, " + userName;
      }
      else
      {
         return "Hello, unknown user";
      }
   }
}
