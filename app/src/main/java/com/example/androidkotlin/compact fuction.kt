package com.example.androidkotlin

fun main() {
    println("-- Default Function --")
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed = "turtle-like")   // named parameter

    println("\n")
    println("-- Required Parameter")
    feedTheFish()

    println("\n")
    println("-- Compact Function --")
    feedTheFishs()
}

//  default function
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

// untuk required parameter dan compact function
fun randomDay(): String {
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return days.random()
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "Pellets"
        "Tuesday" -> "Flakes"
        "Wednesday" -> "Worms"
        "Thursday" -> "Granules"
        "Friday" -> "Mosquitoes"
        "Saturday" -> "Brine shrimp"
        "Sunday" -> "Plankton"
        else -> "Nothing"
    }
}

// required parameter
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${ shouldChangeWater(day)}")
}

// compact function
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWaters (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}
fun feedTheFishs() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWaters(day)}")
}