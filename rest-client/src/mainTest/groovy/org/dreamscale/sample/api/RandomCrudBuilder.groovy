package org.dreamscale.sample.api;

import static org.dreamscale.sample.api.RestClientARandom.aRandom

class RandomCrudBuilder extends CrudInputDto.CrudInputDtoBuilder {

	RandomCrudBuilder() {
		value(aRandom.text(10))
	}

}
