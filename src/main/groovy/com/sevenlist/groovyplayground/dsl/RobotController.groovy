package com.sevenlist.groovyplayground.dsl

import com.sevenlist.groovyplayground.dsl.model.Direction
import com.sevenlist.groovyplayground.dsl.model.DistanceCategory
import com.sevenlist.groovyplayground.dsl.model.Duration
import com.sevenlist.groovyplayground.dsl.model.Robot

def robot = new Robot()

def binding = new Binding([
	robot: robot,
        move : robot.&move,
        *    : Direction.values().collectEntries { [(it.name()): it] },
        h    : Duration.hour
])

def shell = new GroovyShell(this.class.classLoader, binding)

use(DistanceCategory) {
    shell.evaluate 'robot-commands' as File
}
