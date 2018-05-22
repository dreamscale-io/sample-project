package org.dreamscale.sample;

import org.dreamscale.sample.core.domain.GreetingEntity;
import org.dreamscale.sample.core.domain.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
public class BootstrapInitializer {

    @Autowired
    private GreetingRepository greetingRepository;

    @PostConstruct
    private void bootstrap() {
        GreetingEntity greetingEntity = GreetingEntity.builder()
                .id(UUID.randomUUID())
                .greeting("Hello there, ").build();

        greetingRepository.save(greetingEntity);
    }

}
