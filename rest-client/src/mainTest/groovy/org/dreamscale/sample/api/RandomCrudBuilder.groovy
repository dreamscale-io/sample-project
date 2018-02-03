package org.dreamscale.sample.api;

import static org.dreamscale.sample.api.RestClientARandom.aRandom

class RandomCrudBuilder extends Crud.CrudBuilder {

    RandomCrudBuilder() {
        id(aRandom.uuid())
                .value(aRandom.text(10))
    }

}
