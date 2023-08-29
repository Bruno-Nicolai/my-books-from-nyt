package com.example.nyBooks.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nyBooks.R

class BooksActivity : AppCompatActivity() {

    private lateinit var rvBooks: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val toolbar = findViewById<Toolbar>(R.id.tb_main)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.app_name)

        rvBooks = findViewById(R.id.rv_books)

        //get BooksVM.kt
        val viewModel: BooksViewModel = ViewModelProvider(this)[BooksViewModel::class.java]
        viewModel.booksLiveData.observe(this, Observer {
            it?.let {books ->
                //this shortcut above means "if(List<Book> != null)"
                with(rvBooks) {
                    layoutManager = LinearLayoutManager(
                        this@BooksActivity, RecyclerView.VERTICAL, false
                    )
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books)
                }
            }
        })
        viewModel.getBooks()

    }

}