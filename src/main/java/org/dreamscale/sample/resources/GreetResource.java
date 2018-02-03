package org.dreamscale.sample.resources;

import org.dreamscale.sample.api.ResourcePaths;
import javax.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = ResourcePaths.GREET_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class GreetResource {

}
