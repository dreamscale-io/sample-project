package org.dreamscale.sample.resources;

import org.dreamscale.sample.api.ResourcePaths;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.GREET_PATH, produces = MediaType.TEXT_PLAIN_VALUE)
public class GreetResource {

    @GetMapping
    public String greet(@RequestParam("name") String name) {
        return "Hello " + name;
    }

}
