package com.sevenlist.groovyplayground.dsl.model

import groovy.transform.TupleConstructor

@TupleConstructor
class Distance {
    Number amount
    DistanceUnit unit

    Speed div(Duration duration) {
        new Speed(amount, unit)
    }

    String toString() {
        "$amount$unit"
    }
}
