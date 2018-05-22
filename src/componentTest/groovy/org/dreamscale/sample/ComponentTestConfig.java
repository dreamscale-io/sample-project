package org.dreamscale.sample;

import org.dreamscale.feign.JacksonFeignBuilder;
import org.dreamscale.sample.client.CrudClient;
import org.dreamscale.sample.client.GreetClient;
import org.dreamscale.sample.core.domain.UserEntity;
import org.dreamscale.sample.core.security.AuthorizationRequestInterceptor;
import org.dreamscale.sample.core.security.UserIdResolver;
import org.dreamscale.test.BaseTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import java.util.UUID;

@Configuration
@Import({Sample.class})
public class ComponentTestConfig extends BaseTestConfig {
    @Autowired
    JacksonFeignBuilder jacksonFeignBuilder;

    @Bean
    public GreetClient greetClient() {
        return createClientWithStaticApiKey(jacksonFeignBuilder, GreetClient.class);
    }

    @Bean
    public CrudClient crudClient() {
        return createClientWithStaticApiKey(jacksonFeignBuilder, CrudClient.class);
    }

    public <T> T createClientWithStaticApiKey(JacksonFeignBuilder builder, Class<T> clazz) {
        return builder.requestInterceptor(new AuthorizationRequestInterceptor(testUser()))
                .target(clazz, baseUrl);
    }

    @Bean
    public UserEntity testUser() {
        return UserEntity.builder()
                .id(UUID.randomUUID())
                .apiKey(UUID.randomUUID().toString())
                .build();
    }

    @Bean
    @Primary
    public UserIdResolver userIdResolver() {
        return new StubUserIdResolver(testUser());
    }

}
