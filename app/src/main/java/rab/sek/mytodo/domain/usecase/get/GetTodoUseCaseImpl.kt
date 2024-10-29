package rab.sek.mytodo.domain.usecase.get

import kotlinx.coroutines.flow.Flow
import rab.sek.mytodo.data.db.Todo
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class GetTodoUseCaseImpl @Inject constructor(
    private val todoRepository: TodoRepository
): GetTodoUseCase {
    override fun getAll(): Flow<List<Todo>> {
        return todoRepository.getAll()
    }
}