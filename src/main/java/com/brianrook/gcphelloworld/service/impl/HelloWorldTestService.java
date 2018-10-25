package com.brianrook.gcphelloworld.service.impl;

import com.brianrook.gcphelloworld.configuration.HelloWorldToggles;
import com.brianrook.gcphelloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("test")
public class HelloWorldTestService implements HelloWorldService {


    @Autowired
    @Qualifier("username")
    HelloWorldService helloWorldService;

    @Autowired
    @Qualifier("default")
    HelloWorldService defaultHelloWorldService;


    @Override
    public String helloWorld(String userName) {
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
