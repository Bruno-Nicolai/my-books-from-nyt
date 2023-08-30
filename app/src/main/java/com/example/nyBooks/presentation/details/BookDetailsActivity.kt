package com.example.nyBooks.presentation.details

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.nyBooks.R

class BookDetailsActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val toolbar = findViewById<Toolbar>(R.id.tb_details)
        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tvTitle = findViewById(R.id.details_tv_title)
        tvDescription = findViewById(R.id.details_tv_desc)

        val title = intent.getStringExtra(EXTRA_TITLE)
        tvTitle.text = title

        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        tvDescription.text = description
    }

    companion object {

        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"

        fun getStartActivityIntent(
            context: Context,
            title: String,
            description: String,
        ): Intent {
            return Intent(context, BookDetailsActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_DESCRIPTION, description)
            }
        }
    }

}