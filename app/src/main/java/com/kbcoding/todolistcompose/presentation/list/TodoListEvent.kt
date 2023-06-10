package com.kbcoding.todolistcompose.presentation.list

import com.kbcoding.todolistcompose.data.TodoEntity

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todoEntity: TodoEntity) : TodoListEvent()
    data class OnDoneChange(val todoEntity: TodoEntity, val isDone: Boolean) : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todoEntity: TodoEntity) : TodoListEvent()
    object OnAddTodoClick : TodoListEvent()
}
