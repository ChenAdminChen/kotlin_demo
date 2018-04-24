package com.chen.kotlin

/**
 * Created by chen on 2017/8/23.
 */
class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

fun main(args: Array<String>) {
    print(Outer().Inner().foo())
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}