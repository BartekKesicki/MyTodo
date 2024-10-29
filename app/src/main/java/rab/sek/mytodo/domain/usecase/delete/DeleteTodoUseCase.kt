package rab.sek.mytodo.domain.usecase.delete

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo

interface DeleteTodoUseCase {
    fun delete(todo: Todo): Flow<Boolean>
}