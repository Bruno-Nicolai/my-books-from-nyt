package com.example.nyBooks.data.response

import com.google.gson.annotations.SerializedName

data class BookDetails (
    @SerializedName("title")
    val title: String,
    @SerializedName("author")
    val author: String,
    @SerializedName("description")
    val description: String,
)