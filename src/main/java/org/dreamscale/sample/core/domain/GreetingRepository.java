package org.dreamscale.sample.core.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface GreetingRepository extends CrudRepository<GreetingEntity, UUID> {

    GreetingEntity findById(UUID id);
}
