package org.dreamscale.sample.resources;

import org.dreamscale.sample.api.Crud;
import org.dreamscale.sample.api.ResourcePaths;
import org.dreamscale.sample.core.domain.CrudEntity;
import org.dreamscale.sample.core.domain.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(path = ResourcePaths.CRUD_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class CrudResource {

    @Autowired
    private CrudRepository crudRepository;

    private CrudEntity toEntity(Crud dto) {
        return CrudEntity.builder()
                .id(dto.getId())
                .value(dto.getValue())
                .build();
    }

    private Crud toDto(CrudEntity entity) {
        return Crud.builder()
                .id(entity.getId())
                .value(entity.getValue())
                .build();
    }

    @GetMapping("/{id}")
    public Crud find(@PathVariable("id") UUID id) {
        CrudEntity entity = crudRepository.findOne(id);
        return toDto(entity);
    }

    @PostMapping
    public Crud create(@Valid @RequestBody Crud crud) {
        CrudEntity entity = crudRepository.save(toEntity(crud));
        return toDto(entity);
    }

    @PutMapping
    public Crud update(@Valid @RequestBody Crud crud) {
        CrudEntity entity = crudRepository.save(toEntity(crud));
        return toDto(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id) {
        crudRepository.delete(id);
    }

}
