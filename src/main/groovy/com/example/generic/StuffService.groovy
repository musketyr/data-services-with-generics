package com.example.generic

import grails.gorm.services.Service
import groovy.transform.CompileStatic

@Service(Stuff)
@CompileStatic
interface StuffService extends CrudService<Stuff> {

}
