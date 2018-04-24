package com.chen.kotlin

/**
 * Created by chen on 2017/6/26.
 */
/**
 * 三个不同的list 变量输出
 */
fun main(args:Array<String>){
    /*args.map{
        println(it)
    }

    for (arg in args){
        println(arg)
    }

    args.map(::println)*/

    //对于mutableList的用法 可变List
//    val l = mutableListOf(1, 2, 3)
//    l.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'l'

    printFoo(D())

//    H().foo(1);

    S().caller(F())
}


fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
    print("tmp:${tmp} index1:${index1} index2:${index2}")

    print("list1: ${this[index1]} ")
}


open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

/*  ============*/
class H {
    fun foo() { println("member") }
}

fun H.foo(i:Int) { println("extension") }


class F {
    fun bar() { print("F")}
}

class S {
    fun baz() {
        print("S") }

    fun F.foo() {
        bar()   // calls D.bar
        baz()   // calls C.baz
    }

    fun caller(f: F) {
        f.foo()   // call the extension function
    }
}

