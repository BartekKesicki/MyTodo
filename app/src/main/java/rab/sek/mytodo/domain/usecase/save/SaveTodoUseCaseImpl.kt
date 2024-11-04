package rab.sek.mytodo.domain.usecase.save

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class SaveTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): SaveTodoUseCase {
    override fun insert(todoEntity: TodoEntity): Flow<Boolean> {
        return todoRepository.insert(todoEntity)
    }
}