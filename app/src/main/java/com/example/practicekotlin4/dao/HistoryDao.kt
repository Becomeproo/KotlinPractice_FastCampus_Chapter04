package com.example.practicekotlin4.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.practicekotlin4.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM History")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM History")
    fun deleteAll()
}