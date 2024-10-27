package rab.sek.mytodo.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoDao {

    @Query("SELECT * FROM Todo")
    fun getAll(): List<Todo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(todo: Todo)

    @Update
    fun updateTodo(todo: Todo)

    @Delete
    fun deleteTodo(todo: Todo)
}