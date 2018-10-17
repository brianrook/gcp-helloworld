package com.brianrook.gcphelloworld.controller;

import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{

   @Autowired
   HelloWorldService helloWorldService;

   @RequestMapping("/hello")
   public String helloWorld(@RequestParam(name = "userName") String userName)
   {
      return helloWorldService.helloWorld(userName);
   }
}
