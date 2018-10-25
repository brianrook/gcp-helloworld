package com.brianrook.gcphelloworld.service.impl

import com.brianrook.gcphelloworld.configuration.HelloWorldToggles
import org.junit.Rule
import org.togglz.junit.TogglzRule
import spock.lang.Specification

class HelloWorldTestServiceTest extends Specification {

    //Class to be tested
    private HelloWorldTestService svc

    //Dependencies (will be mocked)
    private HelloDefaultService defaultService
    private HelloUserNameService userService

    @Rule
    private TogglzRule toggleRule = TogglzRule.allEnabled(HelloWorldToggles.class)


    def setup() {
        svc = new HelloWorldTestService()

        defaultService = Mock(HelloDefaultService.class)
        userService = Mock(HelloUserNameService.class)

        svc.helloWorldService = userService
        svc.defaultHelloWorldService = defaultService

    }

    def 'confirm that username implementation is called when toggle is on' ()
    {
        given: 'the application toggle is active'
        toggleRule.enable(HelloWorldToggles.HELLO_WORLD_USERNAME)
        String username = 'test'

        when: 'the service is called'
        def response = svc.helloWorld(username)

        then: 'we should expect that the HelloUserNameService was called'
        1 * userService.helloWorld(username)
        0 * defaultService.helloWorld(username)
    }

    def 'confirm that default implementation is called when toggle is off' ()
    {
        given: 'the application toggle is disabled'
        toggleRule.disable(HelloWorldToggles.HELLO_WORLD_USERNAME)
        String username = 'test'

        when: 'the service is called'
        def response = svc.helloWorld(username)

        then: 'we should expect that the HelloDefaultService was called'
        0 * userService.helloWorld(username)
        1 * defaultService.helloWorld(null)
    }
}
