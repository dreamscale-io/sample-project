package org.dreamscale.sample;

import org.dreamscale.sample.core.domain.UserEntity;
import org.dreamscale.sample.core.security.UserIdResolver;

import java.util.UUID;

public class StubUserIdResolver implements UserIdResolver {

    private UserEntity user;

    public StubUserIdResolver(UserEntity user) {
        this.user = user;
    }

    @Override
    public UUID findUserIdByApiKey(String apiKey) {
        return user.getApiKey().equals(apiKey) ? user.getId() : null;
    }

}