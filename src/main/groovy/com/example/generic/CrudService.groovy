package com.example.generic

import groovy.transform.CompileStatic

@CompileStatic
interface CrudService<T> {

    List<T> findAllByName(String name)

}
