package com.sevenlist.groovyplayground.dsl.model

import groovy.transform.TupleConstructor

@TupleConstructor
class Speed {

    Number amount
    DistanceUnit unit

    String toString() {
        "$amount $unit/h"
    }
}
