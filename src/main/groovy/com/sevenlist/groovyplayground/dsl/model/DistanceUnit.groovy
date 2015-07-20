package com.sevenlist.groovyplayground.dsl.model

import groovy.transform.TupleConstructor

@TupleConstructor
enum DistanceUnit {
    centimeter('cm', 0.01),
    meter('m', 1),
    kilometer('km', 1000)

    String abbreviation
    double multiplier

    String toString() {
        abbreviation
    }
}
