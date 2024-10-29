package rab.sek.mytodo.domain.usecase.save

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo

interface SaveTodoUseCase {
    fun insert(todo: Todo): Flow<Boolean>
}