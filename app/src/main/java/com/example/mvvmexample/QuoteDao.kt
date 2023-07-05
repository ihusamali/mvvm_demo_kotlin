package com.example.mvvmexample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface QuoteDao {

    @Upsert
    suspend fun insertQuote (quote:Quote)

    @Query("SELECT * FROM quote")
    fun getQuotes () : LiveData<List<Quote>>

}