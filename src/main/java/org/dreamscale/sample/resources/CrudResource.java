package org.dreamscale.sample.resources;

import org.dreamscale.sample.api.ResourcePaths;
import javax.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = ResourcePaths.CRUD_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class CrudResource {

    @GetMapping("/{id}")
    public Crud find(@PathVariable("id") UUID id) {
        throw new IllegalStateException("implement");
    }

    @PostMapping
    public Crud create(@Valid @RequestBody Crud crud) {
        throw new IllegalStateException("implement");
    }

    @PutMapping
    public Crud update(@Valid @RequestBody Crud crud) {
        throw new IllegalStateException("implement");
    }

    @DeleteMapping("/{id}")
    public Crud delete(@PathVariable("id") UUID id) {
        throw new IllegalStateException("implement");
    }

}
