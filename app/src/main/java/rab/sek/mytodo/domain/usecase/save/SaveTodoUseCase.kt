package rab.sek.mytodo.domain.usecase.save

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.presentation.model.Todo

interface SaveTodoUseCase {
    suspend fun insert(todo: Todo)
}