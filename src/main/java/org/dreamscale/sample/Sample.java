package org.dreamscale.sample;

import org.dreamscale.feign.DefaultFeignConfig;
import org.dreamscale.sample.core.security.AuthorizationFilter;
import org.dreamscale.sample.core.security.RequestContext;
import org.dreamscale.springboot.config.CommonSpringBootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("org.dreamscale.sample")
@Import({
        DefaultFeignConfig.class,
        CommonSpringBootConfig.class
})
public class Sample {

    public static void main(String[] args) {
        SpringApplication.run(Sample.class, args);
    }

    @Bean
    public AuthorizationFilter authorizationFilter() {
        return new AuthorizationFilter();
    }

    @Bean
    public RequestContext requestContext() {
        return new RequestContext();
    }

}
