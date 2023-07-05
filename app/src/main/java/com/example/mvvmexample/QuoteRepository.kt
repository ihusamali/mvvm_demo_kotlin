package com.example.mvvmexample

import androidx.lifecycle.LiveData

class QuoteRepository(private val quoteDao : QuoteDao) {

    fun getQuotes() : LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }

    suspend fun insertQuote(quote: Quote) {
        quoteDao.insertQuote(quote)
    }

}