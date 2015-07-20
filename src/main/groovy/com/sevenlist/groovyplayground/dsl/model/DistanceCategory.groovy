package com.sevenlist.groovyplayground.dsl.model

class DistanceCategory {
    static Distance getCm(Number amount) {
        getCentimeters(amount)
    }

    static Distance getCentimeters(Number amount) {
        new Distance(amount, DistanceUnit.centimeter)
    }

    static Distance getM(Number amount) {
        getMeters(amount)
    }

    static Distance getMeters(Number amount) {
        new Distance(amount, DistanceUnit.meter)
    }

    static Distance getKm(Number amount) {
        getKilometers(amount)
    }

    static Distance getKilometers(Number amount) {
        new Distance(amount, DistanceUnit.kilometer)
    }
}
