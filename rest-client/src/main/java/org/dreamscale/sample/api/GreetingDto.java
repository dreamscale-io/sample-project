package org.dreamscale.sample.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GreetingDto {

    private UUID id;
    private String greeting;
    private String greetingWithName;

}
