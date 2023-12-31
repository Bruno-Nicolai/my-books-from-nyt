package com.example.nyBooks.data.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("title")
    val title: String,
    @SerializedName("author")
    val author: String,
    @SerializedName("description")
    val description: String
)
