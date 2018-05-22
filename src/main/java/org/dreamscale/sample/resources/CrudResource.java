package org.dreamscale.sample.resources;

import org.dreamscale.sample.api.CrudInputDto;
import org.dreamscale.sample.api.CrudOutputDto;
import org.dreamscale.sample.api.ResourcePaths;
import org.dreamscale.sample.core.domain.CrudEntity;
import org.dreamscale.sample.core.domain.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(path = ResourcePaths.CRUD_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class CrudResource {

    @Autowired
    private CrudRepository crudRepository;

    private CrudEntity toEntity(CrudInputDto dto) {
        return CrudEntity.builder()
                .id(UUID.randomUUID())
                .value(dto.getValue())
                .build();
    }

    private CrudOutputDto toDto(CrudEntity entity) {
        return CrudOutputDto.builder()
                .id(entity.getId())
                .value(entity.getValue())
                .build();
    }

    @GetMapping("/{id}")
    public CrudOutputDto find(@PathVariable("id") UUID id) {
        CrudEntity entity = crudRepository.findOne(id);
        return toDto(entity);
    }

    @PostMapping
    public CrudOutputDto create(@Valid @RequestBody CrudInputDto crud) {
        CrudEntity entity = crudRepository.save(toEntity(crud));
        return toDto(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id) {
        crudRepository.delete(id);
    }

}
