package org.dreamscale.sample.core.service;

import lombok.extern.slf4j.Slf4j;
import org.dreamscale.sample.api.GreetingDto;
import org.dreamscale.sample.core.domain.GreetingEntity;
import org.dreamscale.sample.core.domain.GreetingRepository;
import org.dreamscale.sample.core.domain.UserEntity;
import org.dreamscale.sample.core.domain.UserRepository;
import org.dreamscale.sample.core.mapper.DtoEntityMapper;
import org.dreamscale.sample.core.mapper.MapperFactory;
import org.dreamscale.sample.core.security.UserIdResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class UserService implements UserIdResolver {

    @Autowired
    UserRepository userRepository;

    @Override
    public UUID findUserIdByApiKey(String apiKey) {

        UserEntity userEntity = userRepository.findByApiKey(apiKey);

        UUID userId = null;

        if (userEntity != null) {
            userId = userEntity.getId();
        }

        return userId;
    }
}
