package rab.sek.mytodo.domain.repository

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity

interface TodoRepository {
    fun getAll(): Flow<List<TodoEntity>>
    suspend fun insert(todoEntity: TodoEntity)
    suspend fun update(todoEntity: TodoEntity)
    fun delete(todoEntity: TodoEntity): Flow<Boolean>
}