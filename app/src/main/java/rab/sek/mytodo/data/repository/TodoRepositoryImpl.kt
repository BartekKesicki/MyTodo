package rab.sek.mytodo.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import rab.sek.mytodo.data.db.Todo
import rab.sek.mytodo.data.db.TodoDao
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoDao: TodoDao
): TodoRepository {

    override fun getAll(): Flow<List<Todo>> = flow {
        emit(todoDao.getAll())
    }

    override fun insert(todo: Todo): Flow<Boolean> = flow {
        val id = todoDao.insert(todo)
        emit(id > 0)
    }

    override fun update(todo: Todo): Flow<Boolean> = flow {
        val rows = todoDao.updateTodo(todo)
        emit(rows > 0)
    }

    override fun delete(todo: Todo): Flow<Boolean> = flow {
        val rows = todoDao.deleteTodo(todo)
        emit(rows > 0)
    }
}