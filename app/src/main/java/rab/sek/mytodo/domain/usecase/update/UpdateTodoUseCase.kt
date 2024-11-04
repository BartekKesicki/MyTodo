package rab.sek.mytodo.domain.usecase.update

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity

interface UpdateTodoUseCase {
    fun update(todoEntity: TodoEntity): Flow<Boolean>
}