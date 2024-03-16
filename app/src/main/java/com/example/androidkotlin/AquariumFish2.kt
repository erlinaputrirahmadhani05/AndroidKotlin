package com.example.androidkotlin

interface FishAction2  {
    fun eat()
}
interface FishColor {
    val color: String
}
class Sharks(fishColor: FishColor = GreyColor):
    FishAction by PrintingFishAction("Other Fish"),
    FishColor by fishColor {
}


class Plecostomuss(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("Eat Algae"),
    FishColor by fishColor {
}


object GoldColor : FishColor {
    override val color = "gold"
}
object GreyColor : FishColor {
    override val color = "grey"
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}