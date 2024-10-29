package rab.sek.mytodo.domain.usecase.update

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class UpdateTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): UpdateTodoUseCase {

    override fun update(todo: Todo): Flow<Boolean> {
        return todoRepository.update(todo)
    }
}