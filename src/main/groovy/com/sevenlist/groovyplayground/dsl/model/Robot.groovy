package com.sevenlist.groovyplayground.dsl.model

class Robot {
    void move(Map map, Direction direction) {
        println "robot moved $direction by $map.by at ${map.at ?: '1 km/h'}"
    }
}
