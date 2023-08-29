package com.example.nyBooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nyBooks.data.model.Book

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        booksLiveData.value = createFakeBooks()
    }

    private fun createFakeBooks(): List<Book> {
        return listOf(
            Book("Proud and Prejudice", "Jane Austin"),
            Book("Wuthering Heights", "Emilly Bronte"),
            Book("The Fault in Our Stars", "John Green"),
            Book("Five Feet Apart", "Tobias Laconis and Rachel Lippincott"),
            Book("If I Stay", "Gayle Forman")
        )
    }

}