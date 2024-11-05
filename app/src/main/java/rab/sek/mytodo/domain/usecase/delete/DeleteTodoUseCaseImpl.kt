package rab.sek.mytodo.domain.usecase.delete

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import rab.sek.mytodo.domain.utils.toEntity
import rab.sek.mytodo.presentation.model.Todo
import javax.inject.Inject

class DeleteTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): DeleteTodoUseCase {
    override suspend fun delete(todo: Todo) {
        val todoEntity = todo.toEntity()
        todoRepository.delete(todoEntity)
    }
}