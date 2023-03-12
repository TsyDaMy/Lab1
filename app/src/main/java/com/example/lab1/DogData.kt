package com.example.lab1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DogData(
    val name: String,
    val age: Int,
    val color: String,
    val sex: String,
    val weight: Int,
    val description: String
): Parcelable

val dogs = arrayOf(
    DogData("Баффі", 4, "Чорний", "Самка", 12, "Дуже спокійна"),
    DogData("Барбос", 7, "Сірий", "Самець", 23, "Дружелюбний"),
    DogData("Рекс", 5, "Коричневий", "Самець", 18, "Любить гратися"),
)