package com.chen.kotlin

/**
 * Created by chen on 2017/6/26.
 */
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun sum1(a:Int,b:Int):Int =a+b

//Unit 返回的类型为 Kotlin Unit ，此处的Unit可以不写
fun sum2(a:Int,b:Int):Unit{
    println("Tist is sum2 a+b =${-a+b}")
}

fun main(args: Array<String>) {
   /* println("This is sum  a +b = ${ sum(5,8)}")
    println("This is sum1 a +b = ${ sum1(5,8)}")

    println("This is sum2 a +b = ${sum2(3 , 2)}")*/

   /* var a:Int=9
    var b:Long=a.toLong()   //类型的转换
    println(a.equals(b))

    print(b.toString()+"\t\t"+a.toString());
*/
    foo()
}

fun foo(){
    var list= listOf<Int>(66,90,675,44,35,0)

   list.forEach lit@ {
       if(it==0)
           return@lit
       println(it)
   }

}
