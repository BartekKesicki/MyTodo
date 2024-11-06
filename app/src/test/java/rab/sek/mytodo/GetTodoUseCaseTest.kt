package rab.sek.mytodo

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.whenever
import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.domain.repository.TodoRepository
import rab.sek.mytodo.domain.usecase.get.GetTodoUseCase
import rab.sek.mytodo.domain.usecase.get.GetTodoUseCaseImpl
import rab.sek.mytodo.presentation.model.Todo

@RunWith(MockitoJUnitRunner::class)
class GetTodoUseCaseTest {

    private val firstTodoId = 1
    private val firstTodoChecked = true
    private val firstTodoContent = "content1"

    private val secondTodoId = 2
    private val secondTodoChecked = false
    private val secondTodoContent = "content2"

    @Mock
    private lateinit var todoRepository: TodoRepository

    private lateinit var getTodoUseCase: GetTodoUseCase

    @Before
    fun setup() {
        getTodoUseCase = GetTodoUseCaseImpl(todoRepository)
    }

    @Test
    fun `should return todos`() = runTest {

        val todoEntities = listOf(
            TodoEntity(firstTodoId, firstTodoChecked, firstTodoContent),
            TodoEntity(secondTodoId, secondTodoChecked, secondTodoContent)
        )
        val expectedTodos = listOf(
            Todo(firstTodoId, firstTodoChecked, firstTodoContent),
            Todo(secondTodoId, secondTodoChecked, secondTodoContent)
        )

        whenever(todoRepository.getAll()).thenReturn(flowOf(todoEntities))

        val todos = getTodoUseCase.getAll().single()

        assertEquals(expectedTodos, todos)
    }

    @Test
    fun `should return not empty list`() = runTest {

        val todoEntities = listOf(
            TodoEntity(firstTodoId, firstTodoChecked, firstTodoContent),
            TodoEntity(secondTodoId, secondTodoChecked, secondTodoContent)
        )

        whenever(todoRepository.getAll()).thenReturn(flowOf(todoEntities))

        val todos = getTodoUseCase.getAll().single()

        assertEquals(todos.size, todoEntities.size)
    }
}