package com.example.collection

import java.util.Collections


fun main(){
    // create an immutable list
    val cars:MutableList<String> = mutableListOf("Tesla","Honda","BMW","Benz");
    println("an Immutable list")
cars.add("porche")
    println(cars)
    Collections.sort(cars)
    println(cars)

    // Immutable Set
    val subjects:Set<String> = setOf("English","Mathematics","Physics","Computer Science","English")
    println(subjects)

    val trackGoals = mapOf("Balo" to  4,"Bolaji" to 2, "Samuel" to 3)
    println(trackGoals)
    // Get the score of Balo
    println(trackGoals.get("Balo"))
    println(trackGoals.get("Samuel"))
    // loop through and print out the
    for (track in trackGoals){
        println(track)
    }

    //The main difference between List and Set is that Set is unordered and
    // contains different elements, whereas the list is ordered and can contain the same elements in it.

}