package com.brianrook.gcphelloworld.service.impl

import com.brianrook.gcphelloworld.service.HelloWorldService
import spock.lang.Specification
import spock.lang.Unroll

class HelloDefaultServiceTest extends Specification {

    @Unroll
    def 'test default hello world implementation with #testName' ()
    {
        given:
        HelloWorldService svc = new HelloDefaultService()

        when:
        String responseTxt = svc.helloWorld(username)

        then:
        assert responseTxt == 'Hello, world!'

        where:
        testName                |username
        'null username'         |null
        'populated username'    |'testtest'
    }
}
