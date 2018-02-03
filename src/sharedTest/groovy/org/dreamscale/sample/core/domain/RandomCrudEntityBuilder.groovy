package org.dreamscale.sample.core.domain;

import static org.dreamscale.sample.core.CoreARandom.aRandom

class RandomCrudEntityBuilder extends CrudEntity.CrudEntityBuilder {

    RandomCrudEntityBuilder() {
        id(aRandom.uuid())
                .value(aRandom.text(10))
    }

}
