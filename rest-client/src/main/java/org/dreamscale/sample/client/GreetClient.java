package org.dreamscale.sample.client;

import org.dreamscale.sample.api.ResourcePaths;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({
        "Content-Type: application/json",
        "Accept: application/json",
})
public interface GreetClient {

}
