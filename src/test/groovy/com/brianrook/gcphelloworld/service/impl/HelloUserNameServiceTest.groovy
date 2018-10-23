package com.brianrook.gcphelloworld.service.impl

import com.brianrook.gcphelloworld.service.HelloWorldService
import spock.lang.Specification
import spock.lang.Unroll

class HelloUserNameServiceTest extends Specification {

    @Unroll
    def 'test username hello world implementation with #testName' ()
    {
        given:
        HelloWorldService svc = new HelloUserNameService()

        when:
        String responseTxt = svc.helloWorld(username)

        then:
        assert responseTxt == response

        where:
        testName                |username               |response
        'null username'         |null                   |'Hello, unknown user'
        'populated username'    |'brian'                |'Hello, brian'
        'empty username'        |''                     |'Hello, unknown user'
    }
}
