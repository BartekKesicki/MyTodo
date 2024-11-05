package rab.sek.mytodo.domain.usecase.delete

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.presentation.model.Todo

interface DeleteTodoUseCase {
    suspend fun delete(todo: Todo)
}