package com.example.nyBooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nyBooks.data.APIService
import com.example.nyBooks.data.model.Book
import com.example.nyBooks.data.response.BooksBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
//        booksLiveData.value = createFakeBooks()
        APIService.service.getBooks().enqueue(object : Callback<BooksBodyResponse> {
            override fun onResponse(
                call: Call<BooksBodyResponse>,
                response: Response<BooksBodyResponse>
            ) {
                if (response.isSuccessful) {
                    val books: MutableList<Book> = mutableListOf()

                    response.body()?.let { booksBodyResponse ->
                        for (result in booksBodyResponse.results) {
                            val book: Book = Book(
                                title = result.bookDetails[0].title,
                                author = result.bookDetails[0].author,
                                description = result.bookDetails[0].description
                            )
                            books.add(book)
                        }
                    }
                    booksLiveData.value = books
                }
            }

            override fun onFailure(call: Call<BooksBodyResponse>, t: Throwable) {

            }
        })
    }

    private fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Proud and Prejudice", "Jane Austin", "LaLaLa"),
            Book("Wuthering Heights", "Emily Bronte", "LaLaLa"),
            Book("The Fault in Our Stars", "John Green", "LaLaLa"),
            Book("Five Feet Apart", "Tobias Laconis and Rachel Lippincott", "LaLaLa"),
            Book("If I Stay", "Gayle Forman", "LaLaLa")
        )
    }

}