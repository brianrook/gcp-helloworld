package com.brianrook.gcphelloworld.controller;

import com.brianrook.gcphelloworld.configuration.HelloWorldToggles;
import com.brianrook.gcphelloworld.service.HelloWorldService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController
{

   @Autowired
   @Qualifier("test")
   HelloWorldService helloWorldService;


   @GetMapping("/")
   @ApiOperation(value = "Gives Hello World Response",
         notes = "if a username is provided, it will return hello world for that user",
         response = String.class)
   @ApiResponses(value = {
         @ApiResponse(code = 500, message = "System Error")
   })
   public String helloWorld(
         @ApiParam(value="the username to say hello to")
               @RequestParam(name = "userName", required = false) String userName)
   {

      return helloWorldService.helloWorld(userName);
      
   }
}
