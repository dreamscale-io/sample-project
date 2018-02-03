package org.dreamscale.sample.client;

import org.dreamscale.sample.api.ResourcePaths;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({
        "Content-Type: text/plain",
        "Accept: text/plain",
})
public interface GreetClient {

    @RequestLine("GET " + ResourcePaths.GREET_PATH + "?name={name}")
    String greet(@Param("name") String name);

}
