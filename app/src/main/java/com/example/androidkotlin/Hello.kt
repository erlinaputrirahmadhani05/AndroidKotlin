package com.example.androidkotlin

fun main(args: Array<String>) {
    biodata("Erlina Putri Rahmadhani", "Madiun" 19)
    hobby(nama1="Mendengarkan Musik"
        desc1="Dengan mendengarkan musik bisa mengurangi stress dan membuat pikiran menjadi rileks")
}
fun biodata(name=String, alamat=String, age=Int) {// minimal 2 parameter/args
    println("===================================")
    println("\t\tBIODATA")
    println("===================================")
    println("Nama\t:$name")
    println("Usia\t:$age")
    println("Alamat\t:$alamat")
    println("===================================")
}
fun hobby(nama1:String, desc1:String){
    println("\t\tHOBI SAYA")
    println("===================================")
    println("Saya memiliki hoby$nama1")
    println("Alasan saya suka $nama1 adalah $desc1")
}