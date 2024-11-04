package rab.sek.mytodo.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoDao {

    @Query("SELECT * FROM TodoEntity")
    fun getAll(): List<TodoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(todoEntity: TodoEntity): Long

    @Update
    fun updateTodo(todoEntity: TodoEntity): Int

    @Delete
    fun deleteTodo(todoEntity: TodoEntity): Int
}