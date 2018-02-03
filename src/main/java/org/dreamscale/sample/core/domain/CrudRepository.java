package org.dreamscale.sample.core.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CrudRepository extends PagingAndSortingRepository<CrudEntity, UUID> {
}
