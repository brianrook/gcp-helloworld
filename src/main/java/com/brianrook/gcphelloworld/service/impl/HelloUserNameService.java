package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloUserNameService implements HelloWorldService
{

   @Override
   public String helloWorld(String userName)
   {
      return "Hello, " + userName;
   }
}
