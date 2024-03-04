package com.example.androidkotlin

fun main () {
    println("-- Lambdas Function")
    val dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    println("-- Higher Order Function")
    println(updateDirty(30, waterFilter))
    println(updateDirty(15) { dirtyLevels -> dirtyLevels + 1 })

    var dirtyLevels = 19
    dirtyLevels = updateDirty(dirtyLevels) { dirtyLevels -> dirtyLevels + 23 }
    println(dirtyLevels)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun increaseDirty( start: Int ) = start + 1