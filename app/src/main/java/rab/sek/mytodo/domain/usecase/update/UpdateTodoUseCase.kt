package rab.sek.mytodo.domain.usecase.update

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.presentation.model.Todo

interface UpdateTodoUseCase {
    suspend fun update(todo: Todo)
}