package org.dreamscale.sample.core.security;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.dreamscale.sample.core.domain.UserEntity;

public class AuthorizationRequestInterceptor implements RequestInterceptor {

    private final UserEntity activeUser;

    public AuthorizationRequestInterceptor(UserEntity activeUser) {
        this.activeUser = activeUser;
    }

    @Override
    public void apply(RequestTemplate template) {
        template.header(AuthHeaders.AUTHORIZATION, activeUser.getApiKey());
    }
}