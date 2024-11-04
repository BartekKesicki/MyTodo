package rab.sek.mytodo.domain.usecase.save

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity

interface SaveTodoUseCase {
    fun insert(todoEntity: TodoEntity): Flow<Boolean>
}