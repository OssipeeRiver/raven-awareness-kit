package com.ossipeeriver.ravenawarenesskit.model

import kotlinx.serialization.Serializable

@Serializable
data class Contract(
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