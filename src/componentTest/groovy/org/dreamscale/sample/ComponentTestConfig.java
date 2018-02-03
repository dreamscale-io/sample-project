package org.dreamscale.sample;

import org.dreamscale.feign.JacksonFeignBuilder;
import org.dreamscale.test.BaseTestConfig;
import org.springframework.context.annotation.Bean;
import org.dreamscale.sample.client.GreetClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Sample.class})
public class ComponentTestConfig extends BaseTestConfig {
    @Autowired
    JacksonFeignBuilder feignBuilder;

    @Bean
    public GreetClient greetClient() {
        return feignBuilder.target(GreetClient.class, baseUrl);
    }

}
