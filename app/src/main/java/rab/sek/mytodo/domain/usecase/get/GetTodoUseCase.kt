package rab.sek.mytodo.domain.usecase.get

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo

interface GetTodoUseCase {
    fun getAll(): Flow<List<Todo>>
}