package com.ossipeeriver.ravenawarenesskit.model

import java.util.Date

data class Gotwa(
    val user: String,
    val timeOfDeploy: Date,
    val timeExpected: Double,
    val ifNoReturn: String,
    val contactActions: String
)