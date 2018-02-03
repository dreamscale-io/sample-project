package org.dreamscale.sample.core;

import org.dreamscale.testsupport.RandomGenerator;
import org.dreamscale.sample.api.RestClientRandomBuilderSupport;
import lombok.experimental.Delegate;

public class CoreARandom {

    public static final CoreARandom aRandom = new CoreARandom();

    @Delegate
    private CoreRandomBuilderSupport coreRandomBuilderSupport = new CoreRandomBuilderSupport();
    @Delegate
    private RestClientRandomBuilderSupport restClientRandomBuilderSupport = new RestClientRandomBuilderSupport();
    @Delegate
    private RandomGenerator randomGenerator = new RandomGenerator();

}
