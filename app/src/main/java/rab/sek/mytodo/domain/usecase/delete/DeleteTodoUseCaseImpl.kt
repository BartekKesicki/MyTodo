package rab.sek.mytodo.domain.usecase.delete

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class DeleteTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): DeleteTodoUseCase {
    override fun delete(todo: Todo): Flow<Boolean> {
        return todoRepository.delete(todo)
    }
}