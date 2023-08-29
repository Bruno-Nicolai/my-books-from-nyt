package com.example.nyBooks.presentation.details

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nyBooks.R

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)


    }

/*
companion object {
        private const val EXTRA_TITLE = 'EXTRA_DESCRIPTION'
        private const val EXTRA_DESCRIPTION = 'EXTRA_TITLE'

        fun getStartIntent(context: Context, title: String, description: String, author: String): Intent {
            return Intent(context, BookDetailsActivity::class.java.apply {
                putExtra("", title)
                putExtra("", description)
            })
        }
    }
*/

}