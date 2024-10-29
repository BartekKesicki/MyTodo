package rab.sek.mytodo.domain.repository

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo

interface TodoRepository {
    fun getAll(): Flow<List<Todo>>
    fun insert(todo: Todo): Flow<Boolean>
    fun update(todo: Todo): Flow<Boolean>
    fun delete(todo: Todo): Flow<Boolean>
}