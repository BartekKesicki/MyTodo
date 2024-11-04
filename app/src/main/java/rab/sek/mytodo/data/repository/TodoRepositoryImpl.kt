package rab.sek.mytodo.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.data.db.TodoDao
import rab.sek.mytodo.domain.repository.TodoRepository
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(
    private val todoDao: TodoDao
): TodoRepository {

    override fun getAll(): Flow<List<TodoEntity>> = flow {
        emit(todoDao.getAll())
    }

    override fun insert(todoEntity: TodoEntity): Flow<Boolean> = flow {
        val id = todoDao.insert(todoEntity)
        emit(id > 0)
    }

    override fun update(todoEntity: TodoEntity): Flow<Boolean> = flow {
        val rows = todoDao.updateTodo(todoEntity)
        emit(rows > 0)
    }

    override fun delete(todoEntity: TodoEntity): Flow<Boolean> = flow {
        val rows = todoDao.deleteTodo(todoEntity)
        emit(rows > 0)
    }
}