package com.example.androidkotlin

class Biodata(
    val nama: String,
    val TTL: String,
    val umur: Int,
    val alamat: String,
    val hobi: List<String>
) {
    fun displayBiodata() {
        println("===== BIODATA PRIBADI =====")
        println("Nama: $nama")
        println("TTL: $TTL")
        println("Umur: $umur tahun")
        println("Alamat: $alamat")
        println("Hobi: ")
        hobi.forEach { println("- $it") }
    }
}

fun main() {
    val biodata = Biodata(
        nama = "Erlina Putri Rahmadhani",
        TTL = "Madiun, 05 Oktober 2005",
        umur = 18,
        alamat = "Ds. Ngengor, Kec.Pilangkenceng, Kab.Madiun",
        hobi = listOf("mendengarkan musik", "bersepeda")
    )

    biodata.displayBiodata()
}