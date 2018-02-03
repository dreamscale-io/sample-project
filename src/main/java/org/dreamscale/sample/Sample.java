package org.dreamscale.sample;

import org.dreamscale.feign.DefaultFeignConfig;
import org.dreamscale.springboot.config.CommonSpringBootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({
        DefaultFeignConfig.class,
        CommonSpringBootConfig.class
})
@SpringBootApplication
@ComponentScan("org.dreamscale.sample")
public class Sample {

    public static void main(String[] args) {
        SpringApplication.run(Sample.class, args);
    }

}
