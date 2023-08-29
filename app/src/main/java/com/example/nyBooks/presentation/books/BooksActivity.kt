package com.example.nyBooks.presentation.books

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nyBooks.R
import com.example.nyBooks.data.model.Book
import com.example.nyBooks.presentation.details.BookDetailsActivity

class BooksActivity : AppCompatActivity() {

    private lateinit var rvBooks: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val toolbar = findViewById<Toolbar>(R.id.tb_main)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.app_name)

        rvBooks = findViewById(R.id.rv_books)
        with(rvBooks) {
            layoutManager = LinearLayoutManager(
                this@BooksActivity, RecyclerView.VERTICAL, false
            )
            setHasFixedSize(true)
            adapter = BooksAdapter(example())
        }
//        rvBooks.layoutManager = LinearLayoutManager(
//            this@BooksActivity, RecyclerView.VERTICAL, false
//        )
//        rvBooks.setHasFixedSize(true)

        /*
        val booksItems = mutableListOf<BooksItem>()
        booksItems.add(
            BooksItem(
                id = 1,
                title_txt = "Orgulho e Preconceito",
                description_txt = "-",
                author_txt = "Jane Austin"
            )
        )
        booksItems.add(
            BooksItem(
                id = 2,
                title_txt = "Memórias Póstumas de Brás Cubas",
                description_txt = "-",
                author_txt = "Machado de Assis"
            )
        )
        booksItems.add(
            BooksItem(
                id = 3,
                title_txt = "O Morro dos Ventos Uivantes",
                description_txt = "-",
                author_txt = "Emily Brontë"
            )
        )
        booksItems.add(
            BooksItem(
                id = 4,
                title_txt = "O Continente",
                description_txt = "-",
                author_txt = "Érico Veríssimo"
            )
        )
        */
        /*
        val adapter = BooksAdapter(booksItems) { id ->
            when (id) {
                1 -> {
                    val intent = Intent(this@BooksActivity, BookDetailsActivity::class.java)
                    startActivity(intent)
                }

                2 -> {
                    val intent = Intent(this@BooksActivity, BookDetailsActivity::class.java)
                    startActivity(intent)
                }

                3 -> {
                    val intent = Intent(this@BooksActivity, BookDetailsActivity::class.java)
                    startActivity(intent)
                }

                4 -> {
                    val intent = Intent(this@BooksActivity, BookDetailsActivity::class.java)
                    startActivity(intent)
                }
            }
            Log.i("Teste", "$id clicou")
*/

    }

    fun example(): List<Book> {
        return listOf(
            Book("Proud and Prejudice", "Jane Austin")
            , Book("Wuthering Heights", "Emilly Bronte")
            , Book("The Fault in Our Stars", "John Green")
            , Book("Five Feet Apart", "Tobias Laconis and Rachel Lippincott")
            , Book("If I Stay", "Gayle Forman")
        )
    }

}