package com.kbcoding.todolistcompose.di

import android.content.Context
import androidx.room.Room
import com.kbcoding.todolistcompose.data.TodoDatabase
import com.kbcoding.todolistcompose.data.TodoRepository
import com.kbcoding.todolistcompose.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(@ApplicationContext context: Context): TodoDatabase =
        Room.databaseBuilder(
            context,
            TodoDatabase::class.java,
            "todo_db"
        ).build()

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository =
        TodoRepositoryImpl(db.dao)
}