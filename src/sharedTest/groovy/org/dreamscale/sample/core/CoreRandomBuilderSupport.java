package org.dreamscale.sample.core;
import org.dreamscale.sample.core.domain.RandomCrudEntityBuilder;

public class CoreRandomBuilderSupport {

    public RandomCrudEntityBuilder crudEntity() {
        return new RandomCrudEntityBuilder();
    }

}
