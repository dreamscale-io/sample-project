package org.dreamscale.sample.api;

import org.dreamscale.testsupport.RandomGenerator;
import lombok.experimental.Delegate;

public class RestClientARandom {

    public static final RestClientARandom aRandom = new RestClientARandom();

    @Delegate
    private RestClientRandomBuilderSupport randomClientBuilderSupport = new RestClientRandomBuilderSupport();
    @Delegate
    private RandomGenerator randomGenerator = new RandomGenerator();

}
