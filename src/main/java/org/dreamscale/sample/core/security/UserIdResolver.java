package org.dreamscale.sample.core.security;

import java.util.UUID;

public interface UserIdResolver {

	UUID findUserIdByApiKey(String apiKey);

}
