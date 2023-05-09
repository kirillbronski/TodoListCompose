package com.kbcoding.todolistcompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TodoEntity(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val description: String?,
    val isDone: Boolean
)
