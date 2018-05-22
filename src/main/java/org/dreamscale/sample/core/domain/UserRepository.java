package org.dreamscale.sample.core.domain;

import org.dreamscale.sample.core.security.UserIdResolver;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {

    UserEntity findById(UUID id);

    UserEntity findByApiKey(String apiKey);
}
