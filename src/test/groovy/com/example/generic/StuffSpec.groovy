package com.example.generic

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class StuffSpec extends Specification implements DomainUnitTest<Stuff> {

    StuffService stuffService

    void setup() {
        new Stuff(name: 'Stuff').save(failOnError: true)
        stuffService = dataStore.getService(StuffService)
    }

    void 'test something'() {
        expect:
            stuffService.findAllByName('Stuff').size() == 0
    }
}
