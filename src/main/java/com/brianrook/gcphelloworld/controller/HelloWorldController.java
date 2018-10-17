package com.brianrook.gcphelloworld.controller;

import com.brianrook.gcphelloworld.configuration.HelloWorldToggles;
import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{

   @Autowired
         @Qualifier("username")
   HelloWorldService helloWorldService;

   @Autowired
   @Qualifier("default")
   HelloWorldService defaultHelloWorldService;

   @RequestMapping("/hello")
   public String helloWorld(@RequestParam(name = "userName") String userName)
   {
      if (HelloWorldToggles.HELLO_WORLD_USERNAME.isActive())
      {
         return helloWorldService.helloWorld(userName);
      }
      else
      {
         return defaultHelloWorldService.helloWorld(null);
      }
   }
}
