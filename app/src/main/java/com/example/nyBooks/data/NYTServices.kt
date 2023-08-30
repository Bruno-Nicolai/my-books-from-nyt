package com.example.nyBooks.data

import com.example.nyBooks.data.response.BooksBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "flR2WY0783Alvx4v8scneNKNiiwG3s8g",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BooksBodyResponse>
}