package com.kbcoding.todolistcompose.presentation

import androidx.lifecycle.ViewModel
import com.kbcoding.todolistcompose.data.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {


}