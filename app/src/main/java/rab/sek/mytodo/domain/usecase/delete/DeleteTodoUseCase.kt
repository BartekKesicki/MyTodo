package rab.sek.mytodo.domain.usecase.delete

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity

interface DeleteTodoUseCase {
    fun delete(todoEntity: TodoEntity): Flow<Boolean>
}