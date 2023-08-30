package com.example.nyBooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nyBooks.R
import com.example.nyBooks.data.model.Book

class BooksAdapter(
    private val books: List<Book>,
    private val onItemClickListener: ((book: Book) -> Unit)
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.books_item, parent, false)
        return BooksViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(books[position])
    }

    override fun getItemCount(): Int { /*= books.count()*/
        return books.count()
    }

    class BooksViewHolder(
        view: View,
        private val onItemClickListener: ((book: Book) -> Unit)
    ) : RecyclerView.ViewHolder(view) {

        private val title = view.findViewById<TextView>(R.id.books_tv_title)
//        private val description = view.findViewById<TextView>(R.id.books_tv_desc)
        private val author = view.findViewById<TextView>(R.id.books_tv_author)

        fun bind(book: Book) {

            title.text = book.title
//            description.text = book.description
            author.text = book.author

            itemView.setOnClickListener {
                onItemClickListener/*.invoke*/(book)
            }

        }

    }

}