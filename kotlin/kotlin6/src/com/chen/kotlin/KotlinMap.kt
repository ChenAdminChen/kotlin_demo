package com.chen.kotlin

/**
 * Created by chen on 2017/6/27.
 */
/**
 * vararg 可平化参数
 */
fun main(vararg args:String) {
    args.flatMap{
        it.split("_")
    }.map{
        print("${it} ,${it.length}")
    }
}