package rab.sek.mytodo.domain.repository

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity

interface TodoRepository {
    fun getAll(): Flow<List<TodoEntity>>
    fun insert(todoEntity: TodoEntity): Flow<Boolean>
    fun update(todoEntity: TodoEntity): Flow<Boolean>
    fun delete(todoEntity: TodoEntity): Flow<Boolean>
}