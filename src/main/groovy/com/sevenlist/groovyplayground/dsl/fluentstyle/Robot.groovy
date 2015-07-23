package com.sevenlist.groovyplayground.dsl.fluentstyle

import com.sevenlist.groovyplayground.dsl.model.Direction
import com.sevenlist.groovyplayground.dsl.model.Distance
import com.sevenlist.groovyplayground.dsl.model.Speed

class Robot {
    def move(Direction direction) {
        [by: { Distance distance ->
            [at: { Speed speed ->
                println "robot moved $direction by $distance at ${speed ?: '1 km/h'}"
            }]
        }]
    }
}
