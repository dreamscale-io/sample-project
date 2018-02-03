package org.dreamscale.sample.core.domain;

import static org.dreamscale.sample.core.CoreARandom.aRandom

class RandomCrudEntityBuilder extends CrudEntity.CrudEntityBuilder {

    public RandomCrudEntityBuilder() {
        throw new RuntimeException("add some stuff")
    }

}
