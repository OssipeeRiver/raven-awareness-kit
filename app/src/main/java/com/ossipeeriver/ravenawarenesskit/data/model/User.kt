package com.ossipeeriver.ravenawarenesskit.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey val id: Int,
    val userName: String,
    val age: Int,
    val bloodType: String,
    val callSign: String,
)