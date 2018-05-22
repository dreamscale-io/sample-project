package org.dreamscale.sample.core.domain;

import java.util.UUID;

public interface CrudRepository extends org.springframework.data.repository.CrudRepository<CrudEntity, UUID> {

    GreetingEntity findById(UUID id);
}
