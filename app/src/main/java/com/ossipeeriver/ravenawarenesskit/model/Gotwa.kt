package com.ossipeeriver.ravenawarenesskit.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "gotwa")
data class Gotwa(
    @PrimaryKey val plan: String,
    val currentLocation: String,
    val whereLeadersGoing: String,
    val othersTakingWith: String,
    val timeOfDeploy: Date,
    val expectedTimeOfReturn: Double,
    val ifNoReturn: String,
    val ifContactActions: String
)