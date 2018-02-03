package org.dreamscale.sample.resources

import org.dreamscale.sample.ComponentTest
import org.dreamscale.sample.api.Crud
import org.dreamscale.sample.client.CrudClient
import org.dreamscale.sample.core.domain.CrudEntity
import org.dreamscale.sample.core.domain.CrudRepository
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

import static org.dreamscale.sample.core.CoreARandom.aRandom

@ComponentTest
class CrudResourceSpec extends Specification {

    @Autowired
    CrudClient crudClient
    @Autowired
    CrudRepository crudRepository

    def "should find"() {
        given:
        CrudEntity crudEntity = crudRepository.save(aRandom.crudEntity().build())

        expect:
        crudClient.find(crudEntity.id).value == crudEntity.value
    }

    def "should create"() {
        given:
        Crud crud = aRandom.crud().build()

        when:
        crudClient.create(crud)

        then:
        assert crudRepository.findOne(crud.id).value == crud.value
    }
    
    def "should delete"() {
        given:
        CrudEntity crudEntity = crudRepository.save(aRandom.crudEntity().build())

        when:
        crudClient.delete(crudEntity.id)

        then:
        crudRepository.findOne(crudEntity.id) == null
    }

}
