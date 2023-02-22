package saihe.practice.kotlin

import java.util.*

fun main(args: Array<String>) {
  println(MyClass().returnString("Hello Kotlin."))
  Arrays.stream(args).forEach { arg -> println(arg) }
}
