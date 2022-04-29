package com.atillaeren.newsapp.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Source(
    @SerializedName("id")
    val id: Any? = null, // null
    @SerializedName("name")
    val name: String // New York Post
)