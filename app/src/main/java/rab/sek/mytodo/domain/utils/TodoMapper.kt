package rab.sek.mytodo.domain.utils

import rab.sek.mytodo.data.db.TodoEntity
import rab.sek.mytodo.presentation.model.Todo

fun List<TodoEntity>.toTodos(): List<Todo> {
    return map { it.toTodo() }
}

fun TodoEntity.toTodo(): Todo {
    return Todo(id, isChecked, content)
}

fun Todo.toEntity(): TodoEntity {
    return TodoEntity(id, isChecked, content)
}