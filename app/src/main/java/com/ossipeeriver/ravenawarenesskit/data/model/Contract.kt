package com.ossipeeriver.ravenawarenesskit.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "contract")
data class Contract(
    @PrimaryKey(autoGenerate = true) val id: String,
    val location: String,
    val payRate: String,
    val employmentType: String,
    val dutiesAndResponsibilities: String,
    val minimumQualifications: String,
    val preferredQualifications: String
)
// TODO @SerialName("employment_type") for example might be needed if database fields are filed this way

/*

    {
      "id": "12345",
      "employment_type": "https://example.com/employment"
    }

    Example: Without @SerialName, the serializer would expect the field to be "imgSrc" in the JSON,
    which wouldn't match "img_src". With @SerialName("img_src"), the serializer knows that "img_src"
    in the JSON corresponds to imgSrc.

 */