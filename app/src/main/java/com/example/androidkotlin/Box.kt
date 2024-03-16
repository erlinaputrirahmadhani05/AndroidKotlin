package com.example.androidkotlin

class Box(var width: Int, var height: Int, var length: Int) {
    var volume: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }
}

fun main() {
    val box = Box(10, 5, 3)

    // cetak
    println("Volume sebelum perubahan: ${box.volume}")

    // ada beberapa perubahan pada nilai width, height, dan length
    box.width = 15
    box.height = 8
    box.length = 4

    //cetak setelah ada perubahan
    println("Volume setelah perubahan: ${box.volume}")
}
