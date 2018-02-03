package org.dreamscale.sample.client;

import org.dreamscale.sample.api.ResourcePaths;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({
        "Content-Type: application/json",
        "Accept: application/json",
})
public interface CrudClient {

    @RequestLine("GET " + ResourcePaths.CRUD_PATH + "/{id}")
    Crud find(@Param("id") UUID id);

    @RequestLine("POST " + ResourcePaths.CRUD_PATH)
    Crud create(Crud crud);

    @RequestLine("PUT " + ResourcePaths.CRUD_PATH)
    Crud update(Crud crud);

    @RequestLine("DELETE " + ResourcePaths.CRUD_PATH + "/{id}")
    void delete(@Param("id") UUID id);

}
