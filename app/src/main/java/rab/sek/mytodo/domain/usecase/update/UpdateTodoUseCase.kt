package rab.sek.mytodo.domain.usecase.update

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo

interface UpdateTodoUseCase {
    fun update(todo: Todo): Flow<Boolean>
}