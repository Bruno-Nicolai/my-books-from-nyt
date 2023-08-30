package com.example.nyBooks.data.response

import com.google.gson.annotations.SerializedName

data class BooksResponse (
    @SerializedName("book_details")
    val bookDetails: List<BookDetails>
)