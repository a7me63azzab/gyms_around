package com.azzab.gymsaround

import com.google.gson.annotations.SerializedName

//val listOfGyms = listOf<Gym>(
//    Gym(id = 1, name = "Fitness Gym", place = "Cairo, Egypt 123 address street"),
//    Gym(id = 2, name = "Hulk Gym", place = "Cairo, Egypt 123 address street"),
//    Gym(id = 3, name = "Vampire Gym", place = "Cairo, Egypt 123 address street"),
//    Gym(id = 4, name = "The Rock Gym", place = "Cairo, Egypt 123 address street"),
//)

data class Gym(
    val id: Int,
    @SerializedName("gym_name")
    val name: String,
    @SerializedName("gym_location")
    val place: String,
    var isFavourite: Boolean = false
)