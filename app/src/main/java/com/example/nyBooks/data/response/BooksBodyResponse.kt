package com.example.nyBooks.data.response

import com.google.gson.annotations.SerializedName

class BooksBodyResponse (
    @SerializedName("results")
    val results: List<BooksResponse>
)