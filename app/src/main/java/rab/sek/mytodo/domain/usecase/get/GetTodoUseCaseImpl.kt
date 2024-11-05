package rab.sek.mytodo.domain.usecase.get

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import rab.sek.mytodo.domain.utils.toTodos
import rab.sek.mytodo.presentation.model.Todo
import javax.inject.Inject

class GetTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): GetTodoUseCase {
    override fun getAll(): Flow<List<Todo>> {
        val todosEntity = todoRepository.getAll()
        return todosEntity.map {
            it.toTodos()
        }
    }
}