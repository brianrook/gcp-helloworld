package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("default")
public class HelloDefaultService implements HelloWorldService
{

   @Override
   public String helloWorld(String userName)
   {
      return "Hello, world!";
   }
}
