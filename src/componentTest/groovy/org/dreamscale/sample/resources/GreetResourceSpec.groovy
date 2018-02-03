package org.dreamscale.sample.resources

import org.dreamscale.sample.ComponentTest
import org.dreamscale.sample.client.GreetClient
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

import static org.dreamscale.sample.core.CoreARandom.aRandom

@ComponentTest
class GreetResourceSpec extends Specification {

    @Autowired
    GreetClient greetClient

    def "should respond with greeting"() {
        expect:
        assert greetClient.greet("World") == "Hello World"
    }

}
