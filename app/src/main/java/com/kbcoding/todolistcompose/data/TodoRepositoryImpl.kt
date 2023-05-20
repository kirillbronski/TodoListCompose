package com.kbcoding.todolistcompose.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
) : TodoRepository {

    override suspend fun insertTodo(todoEntity: TodoEntity) {
        dao.insertTodo(todoEntity)
    }

    override suspend fun deleteTodo(todoEntity: TodoEntity) {
        dao.deleteTodo(todoEntity)
    }

    override suspend fun getTodoById(id: Int): TodoEntity? =
        dao.getTodoById(id)

    override fun getTodos(): Flow<List<TodoEntity>> =
        dao.getTodos()
}