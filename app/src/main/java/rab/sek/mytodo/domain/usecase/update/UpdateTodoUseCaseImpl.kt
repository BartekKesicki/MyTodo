package rab.sek.mytodo.domain.usecase.update

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class UpdateTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): UpdateTodoUseCase {

    override fun update(todoEntity: TodoEntity): Flow<Boolean> {
        return todoRepository.update(todoEntity)
    }
}