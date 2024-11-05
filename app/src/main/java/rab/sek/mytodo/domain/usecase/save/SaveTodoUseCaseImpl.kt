package rab.sek.mytodo.domain.usecase.save

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import rab.sek.mytodo.domain.utils.toEntity
import rab.sek.mytodo.presentation.model.Todo
import javax.inject.Inject

class SaveTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): SaveTodoUseCase {
    override suspend fun insert(todo: Todo) {
        val todoEntity = todo.toEntity()
        todoRepository.insert(todoEntity)
    }
}