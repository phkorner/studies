package com.example.helloworld

import org.junit.Test
import kotlin.random.*

import kotlin.random.Random.Default.nextInt

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun gameoflife2() {
        var gamefield: MutableList<MutableList<Int>> = mutableListOf(mutableListOf())
        for (i in 0..6) {
            var rows: MutableList<Int> = mutableListOf()
            for (j in 0..12) {
                rows.add(Random.nextInt(0, 2))
            }
            gamefield.add(rows)

            for (rows in gamefield) {
                println()
            }
            //for (i in 0..6){
              //  println(gamefield[i])
               // for (j in 0..12){
                 //   print(gamefield[j])
                }
                }
            }


