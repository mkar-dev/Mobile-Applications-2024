package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    open class Parent(val age: Int) {
        open fun presentSelf(): String {
            println("Parent running")

            return "I am a parent aged $age"
        }
    }

    class Child(val childAge: Int) : Parent(childAge) {
        override fun presentSelf(): String {
            super.presentSelf()
            println("Kid running")
            return "I just a kid"
        }
    }


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun createObjectInstance() {
        println(Child(2))
    }

    @Test
    fun methodCallOnObject() {
        println(
            Child(2).presentSelf()
        )
    }

    @Test
    fun valTest() {
        val immutableValue = 4

        // immutableValue = 1 - will throw an error in IDE

        println(immutableValue)
    }

    @Test
    fun varTest() {
        var mutableValue: Int = 1

        println(mutableValue)

        mutableValue = 8
        println(mutableValue)
    }
}