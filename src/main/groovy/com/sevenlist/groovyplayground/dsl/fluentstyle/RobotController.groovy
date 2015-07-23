package com.sevenlist.groovyplayground.dsl.fluentstyle

import com.sevenlist.groovyplayground.dsl.model.Direction
import com.sevenlist.groovyplayground.dsl.model.DistanceCategory
import com.sevenlist.groovyplayground.dsl.model.Duration

def robot = new Robot()

def binding = new Binding([
        move: robot.&move,
        *   : Direction.values().collectEntries { [(it.name()): it] },
        h   : Duration.hour
])

def shell = new GroovyShell(this.class.classLoader, binding)

use(DistanceCategory) {
    shell.evaluate 'robot-commands' as File
}
