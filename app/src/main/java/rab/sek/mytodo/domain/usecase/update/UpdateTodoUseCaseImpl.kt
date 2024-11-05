package rab.sek.mytodo.domain.usecase.update

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import rab.sek.mytodo.domain.utils.toEntity
import rab.sek.mytodo.presentation.model.Todo
import javax.inject.Inject

class UpdateTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): UpdateTodoUseCase {

    override suspend fun update(todo: Todo) {
        val todoEntity = todo.toEntity()
        todoRepository.update(todoEntity)
    }
}